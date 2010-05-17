// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g 2010-05-18 03:17:12

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
			"PP_ERROR", "COLON", "MINUS_BIGGER", "VOID", "INT", "FLOAT",
			"BOOLEAN", "LT", "GT", "GTGT", "NEW", "IF", "ELSE", "FOR", "IN",
			"WHILE", "DO", "TRY", "SWITCH", "LBRACE", "RBRACE", "RETURN",
			"THROW", "BREAK", "CONTINUE", "CASE", "DEFAULT", "CATCH",
			"ELLIPSIS", "BARBAR", "AMPAMP", "EQEQ", "BANGEQ", "GTEQ", "LTEQ",
			"BAR", "AMP", "CARET", "LTLT", "GTGTGT", "PLUS", "SUB", "STAR",
			"SLASH", "PERCENT", "SUBSUB", "PLUSPLUS", "TILDE", "NULL", "CAST",
			"ENUM", "VAR", "EXTERN", "CLASS", "INTERFACE", "EXTENDS",
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
			"HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "ESC_SEQ" };
	public static final int CAST = 93;
	public static final int FUNCTION = 34;
	public static final int PACKAGE = 15;
	public static final int EXPONENT = 152;
	public static final int LT = 51;
	public static final int STAR = 86;
	public static final int WHILE = 59;
	public static final int FLOATNUM = 106;
	public static final int CONST = 119;
	public static final int OCTAL_ESC = 156;
	public static final int CASE = 69;
	public static final int CHAR = 118;
	public static final int NEW = 54;
	public static final int EXTERN = 96;
	public static final int DO = 60;
	public static final int EOF = -1;
	public static final int GTGT = 53;
	public static final int BREAK = 67;
	public static final int LBRACKET = 37;
	public static final int FINAL = 121;
	public static final int RPAREN = 36;
	public static final int IMPORT = 19;
	public static final int SUBSUB = 89;
	public static final int STAREQ = 135;
	public static final int CARET = 81;
	public static final int THIS = 131;
	public static final int RETURN = 65;
	public static final int DOUBLE = 120;
	public static final int MONKEYS_AT = 144;
	public static final int BARBAR = 73;
	public static final int VAR = 95;
	public static final int VOID = 47;
	public static final int SUPER = 130;
	public static final int GOTO = 123;
	public static final int EQ = 28;
	public static final int COMMENT = 153;
	public static final int AMPAMP = 74;
	public static final int VAR_INIT = 13;
	public static final int LTLTEQ = 148;
	public static final int QUES = 27;
	public static final int EQEQ = 75;
	public static final int HexPrefix = 112;
	public static final int PP_IF = 39;
	public static final int PERCENTDBBQ = 140;
	public static final int RBRACE = 64;
	public static final int STATIC = 22;
	public static final int PRIVATE = 21;
	public static final int BLOCK_SCOPE = 7;
	public static final int SWITCH = 62;
	public static final int NULL = 92;
	public static final int GTGTEQ = 149;
	public static final int STRICTFP = 129;
	public static final int ELSE = 56;
	public static final int NATIVE = 126;
	public static final int ELLIPSIS = 72;
	public static final int THROWS = 132;
	public static final int INT = 48;
	public static final int SLASHEQ = 31;
	public static final int INTLITERAL = 103;
	public static final int PERCENTBB = 146;
	public static final int TRY = 61;
	public static final int LongSuffix = 111;
	public static final int LONGLITERAL = 102;
	public static final int PERCENTLL = 145;
	public static final int BANGEQQ = 143;
	public static final int WS = 109;
	public static final int PERCENTDLQ = 138;
	public static final int INHERIT_LIST_OPT = 11;
	public static final int CHARLITERAL = 105;
	public static final int GT = 52;
	public static final int INLINE = 23;
	public static final int CATCH = 71;
	public static final int FALSE = 108;
	public static final int EscapeSequence = 115;
	public static final int THROW = 66;
	public static final int DYNAMIC = 24;
	public static final int PROTECTED = 127;
	public static final int CLASS = 97;
	public static final int PP_ELSEIF = 41;
	public static final int BAREQ = 136;
	public static final int PP_ELSE = 42;
	public static final int IntegerNumber = 110;
	public static final int AMP = 80;
	public static final int PLUSPLUS = 90;
	public static final int LBRACE = 63;
	public static final int TYPE_PARAM_OPT = 10;
	public static final int LTEQ = 78;
	public static final int SUBEQ = 30;
	public static final int GTGTGT = 83;
	public static final int Exponent = 114;
	public static final int FOR = 57;
	public static final int SUFFIX_EXPR = 6;
	public static final int SUB = 85;
	public static final int FLOAT = 49;
	public static final int ABSTRACT = 116;
	public static final int MINUS_BIGGER = 46;
	public static final int PERCENTDBQ = 139;
	public static final int HexDigit = 113;
	public static final int PLUSEQ = 29;
	public static final int LPAREN = 35;
	public static final int IF = 55;
	public static final int INTNUM = 151;
	public static final int ESC_SEQ = 157;
	public static final int PP_END = 43;
	public static final int BOOLEAN = 50;
	public static final int SLASH = 87;
	public static final int IN = 58;
	public static final int GTGTGTEQ = 150;
	public static final int IMPLEMENTS = 100;
	public static final int CONTINUE = 68;
	public static final int COMMA = 26;
	public static final int AMPEQ = 33;
	public static final int TRANSIENT = 133;
	public static final int IDENTIFIER = 17;
	public static final int TILDE = 91;
	public static final int BANGEQ = 76;
	public static final int PLUS = 84;
	public static final int RBRACKET = 38;
	public static final int DOT = 18;
	public static final int LTLT = 82;
	public static final int BYTE = 117;
	public static final int PERCENT = 88;
	public static final int VOLATILE = 134;
	public static final int DECL_ATTR_LIST = 12;
	public static final int ASSIGN_OPERATOR = 14;
	public static final int TYPEDEF = 101;
	public static final int UNICODE_ESC = 155;
	public static final int EQEQEQ = 141;
	public static final int DEFAULT = 70;
	public static final int HEX_DIGIT = 154;
	public static final int SHORT = 128;
	public static final int BANG = 40;
	public static final int INSTANCEOF = 124;
	public static final int PP_ERROR = 44;
	public static final int GTEQ = 77;
	public static final int MODULE = 5;
	public static final int TRUE = 107;
	public static final int SEMI = 16;
	public static final int COLON = 45;
	public static final int PARAM_LIST = 8;
	public static final int PERCENTLESQ = 142;
	public static final int ENUM = 94;
	public static final int FINALLY = 122;
	public static final int PERCENTEQ = 32;
	public static final int PROPERTY_DECL = 4;
	public static final int OVERRIDE = 25;
	public static final int STRINGLITERAL = 104;
	public static final int CARETEQ = 137;
	public static final int PERCENTBBB = 147;
	public static final int INTERFACE = 98;
	public static final int LONG = 125;
	public static final int EXTENDS = 99;
	public static final int PUBLIC = 20;
	public static final int TYPE_TAG = 9;
	public static final int BAR = 79;

	// delegates
	// delegators

	public TinyHaxeTry1Parser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}

	public TinyHaxeTry1Parser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
		this.state.ruleMemo = new HashMap[250 + 1];

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
		return "C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g";
	}

	public static class module_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "module"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:46:1:
	// module : ( myPackage )? topLevelList -> ^( MODULE[\"MODULE\",true] (
	// myPackage )? ( topLevelList )? ) ;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:46:19:
			// ( ( myPackage )? topLevelList -> ^( MODULE[\"MODULE\",true] (
			// myPackage )? ( topLevelList )? ) )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:46:21:
			// ( myPackage )? topLevelList
			{
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:46:21:
				// ( myPackage )?
				int alt1 = 2;
				int LA1_0 = input.LA(1);

				if ((LA1_0 == PACKAGE)) {
					alt1 = 1;
				}
				switch (alt1) {
				case 1:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:0:0:
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
					// 46:45: -> ^( MODULE[\"MODULE\",true] ( myPackage )? (
					// topLevelList )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:46:47:
						// ^( MODULE[\"MODULE\",true] ( myPackage )? (
						// topLevelList )? )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(
									new ExtendedCommonTree(MODULE, "MODULE",
											true), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:46:91:
							// ( myPackage )?
							if (stream_myPackage.hasNext()) {
								adaptor.addChild(root_1, stream_myPackage
										.nextTree());

							}
							stream_myPackage.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:46:102:
							// ( topLevelList )?
							if (stream_topLevelList.hasNext()) {
								adaptor.addChild(root_1, stream_topLevelList
										.nextTree());

							}
							stream_topLevelList.reset();

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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:49:1:
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:49:19:
			// ( ( topLevel )* )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:49:22:
			// ( topLevel )*
			{
				root_0 = (Object) adaptor.nil();

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:49:22:
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
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:49:23:
						// topLevel
					{
						pushFollow(FOLLOW_topLevel_in_topLevelList157);
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:51:1:
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:51:19:
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
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:51:21:
				// myImport
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_myImport_in_topLevel176);
				myImport4 = myImport();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, myImport4.getTree());

			}
				break;
			case 2:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:52:25:
				// pp
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_pp_in_topLevel202);
				pp5 = pp();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, pp5.getTree());

			}
				break;
			case 3:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:53:25:
				// topLevelDecl
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_topLevelDecl_in_topLevel228);
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:55:1:
	// myPackage : PACKAGE dotIdent SEMI -> ^( PACKAGE ( dotIdent )? ) ;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:55:21:
			// ( PACKAGE dotIdent SEMI -> ^( PACKAGE ( dotIdent )? ) )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:55:23:
			// PACKAGE dotIdent SEMI
			{
				PACKAGE7 = (Token) match(input, PACKAGE,
						FOLLOW_PACKAGE_in_myPackage247);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_PACKAGE.add(PACKAGE7);

				pushFollow(FOLLOW_dotIdent_in_myPackage249);
				dotIdent8 = dotIdent();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_dotIdent.add(dotIdent8.getTree());
				SEMI9 = (Token) match(input, SEMI, FOLLOW_SEMI_in_myPackage251);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_SEMI.add(SEMI9);

				// AST REWRITE
				// elements: dotIdent, PACKAGE
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
					// 55:45: -> ^( PACKAGE ( dotIdent )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:55:48:
						// ^( PACKAGE ( dotIdent )? )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(stream_PACKAGE
									.nextNode(), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:55:58:
							// ( dotIdent )?
							if (stream_dotIdent.hasNext()) {
								adaptor.addChild(root_1, stream_dotIdent
										.nextTree());

							}
							stream_dotIdent.reset();

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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:58:1:
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
					a = (Token) match(input, IDENTIFIER,
							FOLLOW_IDENTIFIER_in_qualifiedIdentifier283);
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
						// 59:27: -> $a
						{
							adaptor.addChild(root_0, stream_a.nextNode());

						}

						retval.tree = root_0;
					}
				}

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:59:37:
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
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:59:41:
						// DOT ident= IDENTIFIER
					{
						DOT10 = (Token) match(input, DOT,
								FOLLOW_DOT_in_qualifiedIdentifier299);
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							stream_DOT.add(DOT10);

						ident = (Token) match(input, IDENTIFIER,
								FOLLOW_IDENTIFIER_in_qualifiedIdentifier303);
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							stream_IDENTIFIER.add(ident);

						// AST REWRITE
						// elements: ident, qualifiedIdentifier, DOT
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
							// 59:63: -> ^( DOT $qualifiedIdentifier $ident)
							{
								// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:59:67:
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:62:1:
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:62:21:
			// ( IMPORT dotIdent SEMI )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:62:23:
			// IMPORT dotIdent SEMI
			{
				root_0 = (Object) adaptor.nil();

				IMPORT11 = (Token) match(input, IMPORT,
						FOLLOW_IMPORT_in_myImport345);
				if (state.failed)
					return retval;
				if (state.backtracking == 0) {
					IMPORT11_tree = (Object) adaptor.create(IMPORT11);
					root_0 = (Object) adaptor.becomeRoot(IMPORT11_tree, root_0);
				}
				pushFollow(FOLLOW_dotIdent_in_myImport348);
				dotIdent12 = dotIdent();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, dotIdent12.getTree());
				SEMI13 = (Token) match(input, SEMI, FOLLOW_SEMI_in_myImport350);
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:66:1:
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:66:19:
			// ( PUBLIC | PRIVATE )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:69:1:
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:69:19:
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
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:69:21:
				// STATIC
			{
				root_0 = (Object) adaptor.nil();

				STATIC15 = (Token) match(input, STATIC,
						FOLLOW_STATIC_in_declAttr437);
				if (state.failed)
					return retval;
				if (state.backtracking == 0) {
					STATIC15_tree = (Object) adaptor.create(STATIC15);
					adaptor.addChild(root_0, STATIC15_tree);
				}

			}
				break;
			case 2:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:70:24:
				// INLINE
			{
				root_0 = (Object) adaptor.nil();

				INLINE16 = (Token) match(input, INLINE,
						FOLLOW_INLINE_in_declAttr462);
				if (state.failed)
					return retval;
				if (state.backtracking == 0) {
					INLINE16_tree = (Object) adaptor.create(INLINE16);
					adaptor.addChild(root_0, INLINE16_tree);
				}

			}
				break;
			case 3:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:71:25:
				// DYNAMIC
			{
				root_0 = (Object) adaptor.nil();

				DYNAMIC17 = (Token) match(input, DYNAMIC,
						FOLLOW_DYNAMIC_in_declAttr488);
				if (state.failed)
					return retval;
				if (state.backtracking == 0) {
					DYNAMIC17_tree = (Object) adaptor.create(DYNAMIC17);
					adaptor.addChild(root_0, DYNAMIC17_tree);
				}

			}
				break;
			case 4:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:72:25:
				// OVERRIDE
			{
				root_0 = (Object) adaptor.nil();

				OVERRIDE18 = (Token) match(input, OVERRIDE,
						FOLLOW_OVERRIDE_in_declAttr514);
				if (state.failed)
					return retval;
				if (state.backtracking == 0) {
					OVERRIDE18_tree = (Object) adaptor.create(OVERRIDE18);
					adaptor.addChild(root_0, OVERRIDE18_tree);
				}

			}
				break;
			case 5:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:73:25:
				// access
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_access_in_declAttr540);
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:75:1:
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
					int LA6_0 = input.LA(1);

					if (((LA6_0 >= PUBLIC && LA6_0 <= OVERRIDE))) {
						alt6 = 1;
					}

					switch (alt6) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:75:22:
						// declAttr
					{
						pushFollow(FOLLOW_declAttr_in_declAttrList555);
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
					// 75:33: -> ^( DECL_ATTR_LIST[\"DECL_ATTR_LIST\",true] (
					// declAttr )+ )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:75:36:
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:78:1:
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:78:19:
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
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:78:21:
				// param ( COMMA param )*
			{
				pushFollow(FOLLOW_param_in_paramList596);
				param21 = param();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_param.add(param21.getTree());
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:78:27:
				// ( COMMA param )*
				loop7: do {
					int alt7 = 2;
					int LA7_0 = input.LA(1);

					if ((LA7_0 == COMMA)) {
						alt7 = 1;
					}

					switch (alt7) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:78:28:
						// COMMA param
					{
						COMMA22 = (Token) match(input, COMMA,
								FOLLOW_COMMA_in_paramList599);
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							stream_COMMA.add(COMMA22);

						pushFollow(FOLLOW_param_in_paramList601);
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
					// 78:42: -> ^( PARAM_LIST[\"PARAM_LIST\",true] ( param )+ )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:78:45:
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
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:80:2:
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:81:1:
	// param : ( QUES )? IDENTIFIER typeTagOpt varInit -> ^(
	// VAR[$IDENTIFIER,true] ( IDENTIFIER )? ( typeTagOpt )? ( varInit )? ( QUES
	// )? ) ;
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
				int LA9_0 = input.LA(1);

				if ((LA9_0 == QUES)) {
					alt9 = 1;
				}
				switch (alt9) {
				case 1:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:0:0:
					// QUES
				{
					QUES24 = (Token) match(input, QUES, FOLLOW_QUES_in_param640);
					if (state.failed)
						return retval;
					if (state.backtracking == 0)
						stream_QUES.add(QUES24);

				}
					break;

				}

				IDENTIFIER25 = (Token) match(input, IDENTIFIER,
						FOLLOW_IDENTIFIER_in_param643);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_IDENTIFIER.add(IDENTIFIER25);

				pushFollow(FOLLOW_typeTagOpt_in_param645);
				typeTagOpt26 = typeTagOpt();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_typeTagOpt.add(typeTagOpt26.getTree());
				pushFollow(FOLLOW_varInit_in_param647);
				varInit27 = varInit();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_varInit.add(varInit27.getTree());

				// AST REWRITE
				// elements: typeTagOpt, varInit, IDENTIFIER, QUES
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
					// 81:56: -> ^( VAR[$IDENTIFIER,true] ( IDENTIFIER )? (
					// typeTagOpt )? ( varInit )? ( QUES )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:81:59:
						// ^( VAR[$IDENTIFIER,true] ( IDENTIFIER )? ( typeTagOpt
						// )? ( varInit )? ( QUES )? )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor
									.becomeRoot(new VarDeclaration(VAR,
											IDENTIFIER25, true), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:81:99:
							// ( IDENTIFIER )?
							if (stream_IDENTIFIER.hasNext()) {
								adaptor.addChild(root_1, new VarUsage(
										stream_IDENTIFIER.nextToken()));

							}
							stream_IDENTIFIER.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:81:121:
							// ( typeTagOpt )?
							if (stream_typeTagOpt.hasNext()) {
								adaptor.addChild(root_1, stream_typeTagOpt
										.nextTree());

							}
							stream_typeTagOpt.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:81:133:
							// ( varInit )?
							if (stream_varInit.hasNext()) {
								adaptor.addChild(root_1, stream_varInit
										.nextTree());

							}
							stream_varInit.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:81:142:
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:84:1:
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:84:4:
			// ( IDENTIFIER )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:84:6:
			// IDENTIFIER
			{
				root_0 = (Object) adaptor.nil();

				IDENTIFIER28 = (Token) match(input, IDENTIFIER,
						FOLLOW_IDENTIFIER_in_id683);
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:87:1:
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
					pushFollow(FOLLOW_id_in_dotIdent697);
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
						// 87:15: -> id
						{
							adaptor.addChild(root_0, stream_id.nextTree());

						}

						retval.tree = root_0;
					}
				}

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:87:22:
				// ( DOT ident= id -> ^( DOT $dotIdent $ident) )*
				loop10: do {
					int alt10 = 2;
					int LA10_0 = input.LA(1);

					if ((LA10_0 == DOT)) {
						alt10 = 1;
					}

					switch (alt10) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:87:23:
						// DOT ident= id
					{
						DOT30 = (Token) match(input, DOT,
								FOLLOW_DOT_in_dotIdent705);
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							stream_DOT.add(DOT30);

						pushFollow(FOLLOW_id_in_dotIdent709);
						ident = id();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							stream_id.add(ident.getTree());

						// AST REWRITE
						// elements: ident, dotIdent, DOT
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
							// 87:36: -> ^( DOT $dotIdent $ident)
							{
								// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:87:38:
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:90:1:
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:90:9:
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
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:90:11:
				// EQ
			{
				EQ31 = (Token) match(input, EQ, FOLLOW_EQ_in_assignOp732);
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
					// 90:14: -> EQ[$EQ]
					{
						adaptor.addChild(root_0, new AssignOperationNode(EQ,
								EQ31));

					}

					retval.tree = root_0;
				}
			}
				break;
			case 2:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:91:11:
				// PLUSEQ
			{
				PLUSEQ32 = (Token) match(input, PLUSEQ,
						FOLLOW_PLUSEQ_in_assignOp752);
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
					// 91:19: -> PLUSEQ[$PLUSEQ]
					{
						adaptor.addChild(root_0, new AssignOperationNode(
								PLUSEQ, PLUSEQ32));

					}

					retval.tree = root_0;
				}
			}
				break;
			case 3:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:92:11:
				// SUBEQ
			{
				SUBEQ33 = (Token) match(input, SUBEQ,
						FOLLOW_SUBEQ_in_assignOp773);
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
					// 92:17: -> SUBEQ[$SUBEQ]
					{
						adaptor.addChild(root_0, new AssignOperationNode(SUBEQ,
								SUBEQ33));

					}

					retval.tree = root_0;
				}
			}
				break;
			case 4:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:93:11:
				// SLASHEQ
			{
				SLASHEQ34 = (Token) match(input, SLASHEQ,
						FOLLOW_SLASHEQ_in_assignOp793);
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
					// 93:19: -> SLASHEQ[$SLASHEQ]
					{
						adaptor.addChild(root_0, new AssignOperationNode(
								SLASHEQ, SLASHEQ34));

					}

					retval.tree = root_0;
				}
			}
				break;
			case 5:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:94:4:
				// PERCENTEQ
			{
				PERCENTEQ35 = (Token) match(input, PERCENTEQ,
						FOLLOW_PERCENTEQ_in_assignOp806);
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
					// 95:4: -> PERCENTEQ[$PERCENTEQ]
					{
						adaptor.addChild(root_0, new AssignOperationNode(
								PERCENTEQ, PERCENTEQ35));

					}

					retval.tree = root_0;
				}
			}
				break;
			case 6:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:96:4:
				// AMPEQ
			{
				AMPEQ36 = (Token) match(input, AMPEQ,
						FOLLOW_AMPEQ_in_assignOp822);
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
					// 96:10: -> AMPEQ[$AMPEQ]
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:100:1:
	// funcLit : FUNCTION LPAREN paramList RPAREN ( typeTagOpt )? block -> ^(
	// FUNCTION ( paramList )? ( typeTagOpt )? ( block )? ) ;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:100:19:
			// ( FUNCTION LPAREN paramList RPAREN ( typeTagOpt )? block -> ^(
			// FUNCTION ( paramList )? ( typeTagOpt )? ( block )? ) )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:100:21:
			// FUNCTION LPAREN paramList RPAREN ( typeTagOpt )? block
			{
				FUNCTION37 = (Token) match(input, FUNCTION,
						FOLLOW_FUNCTION_in_funcLit852);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_FUNCTION.add(FUNCTION37);

				LPAREN38 = (Token) match(input, LPAREN,
						FOLLOW_LPAREN_in_funcLit854);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_LPAREN.add(LPAREN38);

				pushFollow(FOLLOW_paramList_in_funcLit856);
				paramList39 = paramList();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_paramList.add(paramList39.getTree());
				RPAREN40 = (Token) match(input, RPAREN,
						FOLLOW_RPAREN_in_funcLit858);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_RPAREN.add(RPAREN40);

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:100:54:
				// ( typeTagOpt )?
				int alt12 = 2;
				switch (input.LA(1)) {
				case COLON: {
					alt12 = 1;
				}
					break;
				case LBRACE: {
					int LA12_2 = input.LA(2);

					if ((synpred21_TinyHaxeTry1())) {
						alt12 = 1;
					}
				}
					break;
				case SEMI: {
					int LA12_3 = input.LA(2);

					if ((synpred21_TinyHaxeTry1())) {
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
					pushFollow(FOLLOW_typeTagOpt_in_funcLit860);
					typeTagOpt41 = typeTagOpt();

					state._fsp--;
					if (state.failed)
						return retval;
					if (state.backtracking == 0)
						stream_typeTagOpt.add(typeTagOpt41.getTree());

				}
					break;

				}

				pushFollow(FOLLOW_block_in_funcLit863);
				block42 = block();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_block.add(block42.getTree());

				// AST REWRITE
				// elements: paramList, typeTagOpt, block, FUNCTION
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
					// 100:72: -> ^( FUNCTION ( paramList )? ( typeTagOpt )? (
					// block )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:100:75:
						// ^( FUNCTION ( paramList )? ( typeTagOpt )? ( block )?
						// )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(
									new FunctionNode(stream_FUNCTION
											.nextToken()), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:100:100:
							// ( paramList )?
							if (stream_paramList.hasNext()) {
								adaptor.addChild(root_1, stream_paramList
										.nextTree());

							}
							stream_paramList.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:100:111:
							// ( typeTagOpt )?
							if (stream_typeTagOpt.hasNext()) {
								adaptor.addChild(root_1, stream_typeTagOpt
										.nextTree());

							}
							stream_typeTagOpt.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:100:123:
							// ( block )?
							if (stream_block.hasNext()) {
								adaptor.addChild(root_1, stream_block
										.nextTree());

							}
							stream_block.reset();

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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:102:1:
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:102:18:
			// ( LBRACKET exprListOpt RBRACKET )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:102:20:
			// LBRACKET exprListOpt RBRACKET
			{
				root_0 = (Object) adaptor.nil();

				LBRACKET43 = (Token) match(input, LBRACKET,
						FOLLOW_LBRACKET_in_arrayLit898);
				if (state.failed)
					return retval;
				pushFollow(FOLLOW_exprListOpt_in_arrayLit901);
				exprListOpt44 = exprListOpt();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, exprListOpt44.getTree());
				RBRACKET45 = (Token) match(input, RBRACKET,
						FOLLOW_RBRACKET_in_arrayLit903);
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:108:1:
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:108:19:
			// ( ppIf | ppElseIf | ppElse | ppEnd | ppError )
			int alt13 = 5;
			switch (input.LA(1)) {
			case PP_IF: {
				alt13 = 1;
			}
				break;
			case PP_ELSEIF: {
				alt13 = 2;
			}
				break;
			case PP_ELSE: {
				alt13 = 3;
			}
				break;
			case PP_END: {
				alt13 = 4;
			}
				break;
			case PP_ERROR: {
				alt13 = 5;
			}
				break;
			default:
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
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:108:21:
				// ppIf
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_ppIf_in_pp931);
				ppIf46 = ppIf();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, ppIf46.getTree());

			}
				break;
			case 2:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:109:25:
				// ppElseIf
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_ppElseIf_in_pp957);
				ppElseIf47 = ppElseIf();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, ppElseIf47.getTree());

			}
				break;
			case 3:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:110:25:
				// ppElse
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_ppElse_in_pp983);
				ppElse48 = ppElse();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, ppElse48.getTree());

			}
				break;
			case 4:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:111:25:
				// ppEnd
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_ppEnd_in_pp1009);
				ppEnd49 = ppEnd();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, ppEnd49.getTree());

			}
				break;
			case 5:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:112:25:
				// ppError
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_ppError_in_pp1035);
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:114:1:
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:114:19:
			// ( PP_IF IDENTIFIER | PP_IF BANG IDENTIFIER )
			int alt14 = 2;
			int LA14_0 = input.LA(1);

			if ((LA14_0 == PP_IF)) {
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
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:114:21:
				// PP_IF IDENTIFIER
			{
				root_0 = (Object) adaptor.nil();

				PP_IF51 = (Token) match(input, PP_IF, FOLLOW_PP_IF_in_ppIf1057);
				if (state.failed)
					return retval;
				if (state.backtracking == 0) {
					PP_IF51_tree = (Object) adaptor.create(PP_IF51);
					adaptor.addChild(root_0, PP_IF51_tree);
				}
				IDENTIFIER52 = (Token) match(input, IDENTIFIER,
						FOLLOW_IDENTIFIER_in_ppIf1059);
				if (state.failed)
					return retval;
				if (state.backtracking == 0) {
					IDENTIFIER52_tree = (Object) adaptor.create(IDENTIFIER52);
					adaptor.addChild(root_0, IDENTIFIER52_tree);
				}

			}
				break;
			case 2:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:115:25:
				// PP_IF BANG IDENTIFIER
			{
				root_0 = (Object) adaptor.nil();

				PP_IF53 = (Token) match(input, PP_IF, FOLLOW_PP_IF_in_ppIf1085);
				if (state.failed)
					return retval;
				if (state.backtracking == 0) {
					PP_IF53_tree = (Object) adaptor.create(PP_IF53);
					adaptor.addChild(root_0, PP_IF53_tree);
				}
				BANG54 = (Token) match(input, BANG, FOLLOW_BANG_in_ppIf1087);
				if (state.failed)
					return retval;
				if (state.backtracking == 0) {
					BANG54_tree = (Object) adaptor.create(BANG54);
					adaptor.addChild(root_0, BANG54_tree);
				}
				IDENTIFIER55 = (Token) match(input, IDENTIFIER,
						FOLLOW_IDENTIFIER_in_ppIf1089);
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:117:1:
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:117:19:
			// ( PP_ELSEIF IDENTIFIER | PP_ELSEIF BANG IDENTIFIER )
			int alt15 = 2;
			int LA15_0 = input.LA(1);

			if ((LA15_0 == PP_ELSEIF)) {
				int LA15_1 = input.LA(2);

				if ((LA15_1 == IDENTIFIER)) {
					alt15 = 1;
				} else if ((LA15_1 == BANG)) {
					alt15 = 2;
				} else {
					if (state.backtracking > 0) {
						state.failed = true;
						return retval;
					}
					NoViableAltException nvae = new NoViableAltException("",
							15, 1, input);

					throw nvae;
				}
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
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:117:21:
				// PP_ELSEIF IDENTIFIER
			{
				root_0 = (Object) adaptor.nil();

				PP_ELSEIF56 = (Token) match(input, PP_ELSEIF,
						FOLLOW_PP_ELSEIF_in_ppElseIf1107);
				if (state.failed)
					return retval;
				if (state.backtracking == 0) {
					PP_ELSEIF56_tree = (Object) adaptor.create(PP_ELSEIF56);
					adaptor.addChild(root_0, PP_ELSEIF56_tree);
				}
				IDENTIFIER57 = (Token) match(input, IDENTIFIER,
						FOLLOW_IDENTIFIER_in_ppElseIf1109);
				if (state.failed)
					return retval;
				if (state.backtracking == 0) {
					IDENTIFIER57_tree = (Object) adaptor.create(IDENTIFIER57);
					adaptor.addChild(root_0, IDENTIFIER57_tree);
				}

			}
				break;
			case 2:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:118:24:
				// PP_ELSEIF BANG IDENTIFIER
			{
				root_0 = (Object) adaptor.nil();

				PP_ELSEIF58 = (Token) match(input, PP_ELSEIF,
						FOLLOW_PP_ELSEIF_in_ppElseIf1134);
				if (state.failed)
					return retval;
				if (state.backtracking == 0) {
					PP_ELSEIF58_tree = (Object) adaptor.create(PP_ELSEIF58);
					adaptor.addChild(root_0, PP_ELSEIF58_tree);
				}
				BANG59 = (Token) match(input, BANG, FOLLOW_BANG_in_ppElseIf1136);
				if (state.failed)
					return retval;
				if (state.backtracking == 0) {
					BANG59_tree = (Object) adaptor.create(BANG59);
					adaptor.addChild(root_0, BANG59_tree);
				}
				IDENTIFIER60 = (Token) match(input, IDENTIFIER,
						FOLLOW_IDENTIFIER_in_ppElseIf1138);
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:120:1:
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:120:19:
			// ( PP_ELSE )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:120:21:
			// PP_ELSE
			{
				root_0 = (Object) adaptor.nil();

				PP_ELSE61 = (Token) match(input, PP_ELSE,
						FOLLOW_PP_ELSE_in_ppElse1158);
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:122:1:
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:122:19:
			// ( PP_END )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:122:21:
			// PP_END
			{
				root_0 = (Object) adaptor.nil();

				PP_END62 = (Token) match(input, PP_END,
						FOLLOW_PP_END_in_ppEnd1179);
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:124:1:
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:124:19:
			// ( PP_ERROR )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:124:21:
			// PP_ERROR
			{
				root_0 = (Object) adaptor.nil();

				PP_ERROR63 = (Token) match(input, PP_ERROR,
						FOLLOW_PP_ERROR_in_ppError1198);
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:129:1:
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:129:9:
			// ( COLON funcType )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:129:11:
			// COLON funcType
			{
				root_0 = (Object) adaptor.nil();

				COLON64 = (Token) match(input, COLON,
						FOLLOW_COLON_in_typeTag1211);
				if (state.failed)
					return retval;
				pushFollow(FOLLOW_funcType_in_typeTag1214);
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:132:1:
	// typeTagOpt : ( typeTag -> ^( TYPE_TAG[\"TYPE_TAG\",true] ( typeTag )? ) |
	// );
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:133:2:
			// ( typeTag -> ^( TYPE_TAG[\"TYPE_TAG\",true] ( typeTag )? ) | )
			int alt16 = 2;
			int LA16_0 = input.LA(1);

			if ((LA16_0 == COLON)) {
				alt16 = 1;
			} else if ((LA16_0 == EOF || LA16_0 == SEMI || LA16_0 == COMMA
					|| LA16_0 == EQ || LA16_0 == RPAREN || LA16_0 == LBRACE)) {
				alt16 = 2;
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return retval;
				}
				NoViableAltException nvae = new NoViableAltException("", 16, 0,
						input);

				throw nvae;
			}
			switch (alt16) {
			case 1:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:133:4:
				// typeTag
			{
				pushFollow(FOLLOW_typeTag_in_typeTagOpt1226);
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
					// 133:12: -> ^( TYPE_TAG[\"TYPE_TAG\",true] ( typeTag )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:133:15:
						// ^( TYPE_TAG[\"TYPE_TAG\",true] ( typeTag )? )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(
									new ExtendedCommonTree(TYPE_TAG,
											"TYPE_TAG", true), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:133:63:
							// ( typeTag )?
							if (stream_typeTag.hasNext()) {
								adaptor.addChild(root_1, stream_typeTag
										.nextTree());

							}
							stream_typeTag.reset();

							adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}
				break;
			case 2:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:135:2:
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:137:1:
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:137:9:
			// ( funcType ( COMMA funcType )* | typeConstraint ( COMMA
			// typeConstraint )* )
			int alt19 = 2;
			alt19 = dfa19.predict(input);
			switch (alt19) {
			case 1:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:137:11:
				// funcType ( COMMA funcType )*
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_funcType_in_typeList1252);
				funcType67 = funcType();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, funcType67.getTree());
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:137:20:
				// ( COMMA funcType )*
				loop17: do {
					int alt17 = 2;
					int LA17_0 = input.LA(1);

					if ((LA17_0 == COMMA)) {
						int LA17_2 = input.LA(2);

						if ((synpred29_TinyHaxeTry1())) {
							alt17 = 1;
						}

					}

					switch (alt17) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:137:21:
						// COMMA funcType
					{
						COMMA68 = (Token) match(input, COMMA,
								FOLLOW_COMMA_in_typeList1255);
						if (state.failed)
							return retval;
						pushFollow(FOLLOW_funcType_in_typeList1258);
						funcType69 = funcType();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							adaptor.addChild(root_0, funcType69.getTree());

					}
						break;

					default:
						break loop17;
					}
				} while (true);

			}
				break;
			case 2:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:138:4:
				// typeConstraint ( COMMA typeConstraint )*
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_typeConstraint_in_typeList1266);
				typeConstraint70 = typeConstraint();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, typeConstraint70.getTree());
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:138:19:
				// ( COMMA typeConstraint )*
				loop18: do {
					int alt18 = 2;
					alt18 = dfa18.predict(input);
					switch (alt18) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:138:20:
						// COMMA typeConstraint
					{
						COMMA71 = (Token) match(input, COMMA,
								FOLLOW_COMMA_in_typeList1269);
						if (state.failed)
							return retval;
						pushFollow(FOLLOW_typeConstraint_in_typeList1272);
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
						break loop18;
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:141:1:
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:141:9:
			// ( ( type ) ( MINUS_BIGGER type )* | VOID )
			int alt21 = 2;
			int LA21_0 = input.LA(1);

			if ((LA21_0 == EOF || (LA21_0 >= SEMI && LA21_0 <= IDENTIFIER)
					|| LA21_0 == IMPORT || LA21_0 == DYNAMIC
					|| (LA21_0 >= COMMA && LA21_0 <= AMPEQ)
					|| (LA21_0 >= LPAREN && LA21_0 <= RPAREN)
					|| (LA21_0 >= RBRACKET && LA21_0 <= PP_IF)
					|| (LA21_0 >= PP_ELSEIF && LA21_0 <= MINUS_BIGGER)
					|| (LA21_0 >= INT && LA21_0 <= GTGT) || LA21_0 == IN
					|| (LA21_0 >= LBRACE && LA21_0 <= RBRACE)
					|| (LA21_0 >= ELLIPSIS && LA21_0 <= PERCENT)
					|| LA21_0 == ENUM || (LA21_0 >= EXTERN && LA21_0 <= TYPEDEF))) {
				alt21 = 1;
			} else if ((LA21_0 == VOID)) {
				int LA21_2 = input.LA(2);

				if ((synpred33_TinyHaxeTry1())) {
					alt21 = 1;
				} else if ((true)) {
					alt21 = 2;
				} else {
					if (state.backtracking > 0) {
						state.failed = true;
						return retval;
					}
					NoViableAltException nvae = new NoViableAltException("",
							21, 2, input);

					throw nvae;
				}
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return retval;
				}
				NoViableAltException nvae = new NoViableAltException("", 21, 0,
						input);

				throw nvae;
			}
			switch (alt21) {
			case 1:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:141:11:
				// ( type ) ( MINUS_BIGGER type )*
			{
				root_0 = (Object) adaptor.nil();

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:141:11:
				// ( type )
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:141:12:
				// type
				{
					pushFollow(FOLLOW_type_in_funcType1287);
					type73 = type();

					state._fsp--;
					if (state.failed)
						return retval;
					if (state.backtracking == 0)
						adaptor.addChild(root_0, type73.getTree());

				}

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:141:18:
				// ( MINUS_BIGGER type )*
				loop20: do {
					int alt20 = 2;
					int LA20_0 = input.LA(1);

					if ((LA20_0 == MINUS_BIGGER)) {
						int LA20_2 = input.LA(2);

						if ((synpred32_TinyHaxeTry1())) {
							alt20 = 1;
						}

					}

					switch (alt20) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:141:19:
						// MINUS_BIGGER type
					{
						MINUS_BIGGER74 = (Token) match(input, MINUS_BIGGER,
								FOLLOW_MINUS_BIGGER_in_funcType1291);
						if (state.failed)
							return retval;
						pushFollow(FOLLOW_type_in_funcType1294);
						type75 = type();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							adaptor.addChild(root_0, type75.getTree());

					}
						break;

					default:
						break loop20;
					}
				} while (true);

			}
				break;
			case 2:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:142:4:
				// VOID
			{
				root_0 = (Object) adaptor.nil();

				VOID76 = (Token) match(input, VOID, FOLLOW_VOID_in_funcType1301);
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:145:1:
	// type : ( ( anonType | dotIdent | INT | FLOAT | DYNAMIC | BOOLEAN | VOID )
	// ( typeParam )* | );
	public final TinyHaxeTry1Parser.type_return type()
			throws RecognitionException {
		TinyHaxeTry1Parser.type_return retval = new TinyHaxeTry1Parser.type_return();
		retval.start = input.LT(1);
		int type_StartIndex = input.index();
		Object root_0 = null;

		Token INT79 = null;
		Token FLOAT80 = null;
		Token DYNAMIC81 = null;
		Token BOOLEAN82 = null;
		Token VOID83 = null;
		TinyHaxeTry1Parser.anonType_return anonType77 = null;

		TinyHaxeTry1Parser.dotIdent_return dotIdent78 = null;

		TinyHaxeTry1Parser.typeParam_return typeParam84 = null;

		Object INT79_tree = null;
		Object FLOAT80_tree = null;
		Object DYNAMIC81_tree = null;
		Object BOOLEAN82_tree = null;
		Object VOID83_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 27)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:145:6:
			// ( ( anonType | dotIdent | INT | FLOAT | DYNAMIC | BOOLEAN | VOID
			// ) ( typeParam )* | )
			int alt24 = 2;
			alt24 = dfa24.predict(input);
			switch (alt24) {
			case 1:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:145:8:
				// ( anonType | dotIdent | INT | FLOAT | DYNAMIC | BOOLEAN |
				// VOID ) ( typeParam )*
			{
				root_0 = (Object) adaptor.nil();

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:145:8:
				// ( anonType | dotIdent | INT | FLOAT | DYNAMIC | BOOLEAN |
				// VOID )
				int alt22 = 7;
				switch (input.LA(1)) {
				case LBRACE: {
					alt22 = 1;
				}
					break;
				case IDENTIFIER: {
					alt22 = 2;
				}
					break;
				case INT: {
					alt22 = 3;
				}
					break;
				case FLOAT: {
					alt22 = 4;
				}
					break;
				case DYNAMIC: {
					alt22 = 5;
				}
					break;
				case BOOLEAN: {
					alt22 = 6;
				}
					break;
				case VOID: {
					alt22 = 7;
				}
					break;
				default:
					if (state.backtracking > 0) {
						state.failed = true;
						return retval;
					}
					NoViableAltException nvae = new NoViableAltException("",
							22, 0, input);

					throw nvae;
				}

				switch (alt22) {
				case 1:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:145:9:
					// anonType
				{
					pushFollow(FOLLOW_anonType_in_type1313);
					anonType77 = anonType();

					state._fsp--;
					if (state.failed)
						return retval;
					if (state.backtracking == 0)
						adaptor.addChild(root_0, anonType77.getTree());

				}
					break;
				case 2:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:145:20:
					// dotIdent
				{
					pushFollow(FOLLOW_dotIdent_in_type1317);
					dotIdent78 = dotIdent();

					state._fsp--;
					if (state.failed)
						return retval;
					if (state.backtracking == 0)
						adaptor.addChild(root_0, dotIdent78.getTree());

				}
					break;
				case 3:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:145:30:
					// INT
				{
					INT79 = (Token) match(input, INT, FOLLOW_INT_in_type1320);
					if (state.failed)
						return retval;
					if (state.backtracking == 0) {
						INT79_tree = (Object) adaptor.create(INT79);
						adaptor.addChild(root_0, INT79_tree);
					}

				}
					break;
				case 4:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:145:35:
					// FLOAT
				{
					FLOAT80 = (Token) match(input, FLOAT,
							FOLLOW_FLOAT_in_type1323);
					if (state.failed)
						return retval;
					if (state.backtracking == 0) {
						FLOAT80_tree = (Object) adaptor.create(FLOAT80);
						adaptor.addChild(root_0, FLOAT80_tree);
					}

				}
					break;
				case 5:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:145:42:
					// DYNAMIC
				{
					DYNAMIC81 = (Token) match(input, DYNAMIC,
							FOLLOW_DYNAMIC_in_type1326);
					if (state.failed)
						return retval;
					if (state.backtracking == 0) {
						DYNAMIC81_tree = (Object) adaptor.create(DYNAMIC81);
						adaptor.addChild(root_0, DYNAMIC81_tree);
					}

				}
					break;
				case 6:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:145:50:
					// BOOLEAN
				{
					BOOLEAN82 = (Token) match(input, BOOLEAN,
							FOLLOW_BOOLEAN_in_type1328);
					if (state.failed)
						return retval;
					if (state.backtracking == 0) {
						BOOLEAN82_tree = (Object) adaptor.create(BOOLEAN82);
						adaptor.addChild(root_0, BOOLEAN82_tree);
					}

				}
					break;
				case 7:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:145:58:
					// VOID
				{
					VOID83 = (Token) match(input, VOID, FOLLOW_VOID_in_type1330);
					if (state.failed)
						return retval;
					if (state.backtracking == 0) {
						VOID83_tree = (Object) adaptor.create(VOID83);
						adaptor.addChild(root_0, VOID83_tree);
					}

				}
					break;

				}

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:145:64:
				// ( typeParam )*
				loop23: do {
					int alt23 = 2;
					int LA23_0 = input.LA(1);

					if ((LA23_0 == LT)) {
						int LA23_2 = input.LA(2);

						if ((synpred40_TinyHaxeTry1())) {
							alt23 = 1;
						}

					}

					switch (alt23) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:145:65:
						// typeParam
					{
						pushFollow(FOLLOW_typeParam_in_type1334);
						typeParam84 = typeParam();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							adaptor.addChild(root_0, typeParam84.getTree());

					}
						break;

					default:
						break loop23;
					}
				} while (true);

			}
				break;
			case 2:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:147:2:
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:149:1:
	// typeParam : LT ( type | typeList ) ( GT | GTGT | ) ;
	public final TinyHaxeTry1Parser.typeParam_return typeParam()
			throws RecognitionException {
		TinyHaxeTry1Parser.typeParam_return retval = new TinyHaxeTry1Parser.typeParam_return();
		retval.start = input.LT(1);
		int typeParam_StartIndex = input.index();
		Object root_0 = null;

		Token LT85 = null;
		Token GT88 = null;
		Token GTGT89 = null;
		TinyHaxeTry1Parser.type_return type86 = null;

		TinyHaxeTry1Parser.typeList_return typeList87 = null;

		Object LT85_tree = null;
		Object GT88_tree = null;
		Object GTGT89_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 28)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:150:2:
			// ( LT ( type | typeList ) ( GT | GTGT | ) )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:150:4:
			// LT ( type | typeList ) ( GT | GTGT | )
			{
				root_0 = (Object) adaptor.nil();

				LT85 = (Token) match(input, LT, FOLLOW_LT_in_typeParam1352);
				if (state.failed)
					return retval;
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:150:8:
				// ( type | typeList )
				int alt25 = 2;
				alt25 = dfa25.predict(input);
				switch (alt25) {
				case 1:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:150:9:
					// type
				{
					pushFollow(FOLLOW_type_in_typeParam1356);
					type86 = type();

					state._fsp--;
					if (state.failed)
						return retval;
					if (state.backtracking == 0)
						adaptor.addChild(root_0, type86.getTree());

				}
					break;
				case 2:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:150:14:
					// typeList
				{
					pushFollow(FOLLOW_typeList_in_typeParam1358);
					typeList87 = typeList();

					state._fsp--;
					if (state.failed)
						return retval;
					if (state.backtracking == 0)
						adaptor.addChild(root_0, typeList87.getTree());

				}
					break;

				}

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:150:24:
				// ( GT | GTGT | )
				int alt26 = 3;
				switch (input.LA(1)) {
				case GT: {
					int LA26_1 = input.LA(2);

					if ((synpred43_TinyHaxeTry1())) {
						alt26 = 1;
					} else if ((true)) {
						alt26 = 3;
					} else {
						if (state.backtracking > 0) {
							state.failed = true;
							return retval;
						}
						NoViableAltException nvae = new NoViableAltException(
								"", 26, 1, input);

						throw nvae;
					}
				}
					break;
				case GTGT: {
					int LA26_2 = input.LA(2);

					if ((synpred44_TinyHaxeTry1())) {
						alt26 = 2;
					} else if ((true)) {
						alt26 = 3;
					} else {
						if (state.backtracking > 0) {
							state.failed = true;
							return retval;
						}
						NoViableAltException nvae = new NoViableAltException(
								"", 26, 2, input);

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
				case PP_IF:
				case PP_ELSEIF:
				case PP_ELSE:
				case PP_END:
				case PP_ERROR:
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
					alt26 = 3;
				}
					break;
				default:
					if (state.backtracking > 0) {
						state.failed = true;
						return retval;
					}
					NoViableAltException nvae = new NoViableAltException("",
							26, 0, input);

					throw nvae;
				}

				switch (alt26) {
				case 1:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:150:25:
					// GT
				{
					GT88 = (Token) match(input, GT, FOLLOW_GT_in_typeParam1362);
					if (state.failed)
						return retval;

				}
					break;
				case 2:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:150:29:
					// GTGT
				{
					GTGT89 = (Token) match(input, GTGT,
							FOLLOW_GTGT_in_typeParam1365);
					if (state.failed)
						return retval;

				}
					break;
				case 3:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:150:35:
				{
				}
					break;

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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:154:1:
	// typeParamOpt : ( typeParam -> ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true]
	// ( typeParam )? ) | );
	public final TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt()
			throws RecognitionException {
		TinyHaxeTry1Parser.typeParamOpt_return retval = new TinyHaxeTry1Parser.typeParamOpt_return();
		retval.start = input.LT(1);
		int typeParamOpt_StartIndex = input.index();
		Object root_0 = null;

		TinyHaxeTry1Parser.typeParam_return typeParam90 = null;

		RewriteRuleSubtreeStream stream_typeParam = new RewriteRuleSubtreeStream(
				adaptor, "rule typeParam");
		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 29)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:155:2:
			// ( typeParam -> ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true] (
			// typeParam )? ) | )
			int alt27 = 2;
			int LA27_0 = input.LA(1);

			if ((LA27_0 == LT)) {
				int LA27_1 = input.LA(2);

				if ((synpred45_TinyHaxeTry1())) {
					alt27 = 1;
				} else if ((true)) {
					alt27 = 2;
				} else {
					if (state.backtracking > 0) {
						state.failed = true;
						return retval;
					}
					NoViableAltException nvae = new NoViableAltException("",
							27, 1, input);

					throw nvae;
				}
			} else if ((LA27_0 == EOF || LA27_0 == SEMI
					|| (LA27_0 >= COMMA && LA27_0 <= AMPEQ)
					|| (LA27_0 >= LPAREN && LA27_0 <= RPAREN)
					|| LA27_0 == RBRACKET || LA27_0 == COLON || LA27_0 == GT
					|| LA27_0 == IN || (LA27_0 >= LBRACE && LA27_0 <= RBRACE)
					|| (LA27_0 >= ELLIPSIS && LA27_0 <= PERCENT) || (LA27_0 >= EXTENDS && LA27_0 <= IMPLEMENTS))) {
				alt27 = 2;
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return retval;
				}
				NoViableAltException nvae = new NoViableAltException("", 27, 0,
						input);

				throw nvae;
			}
			switch (alt27) {
			case 1:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:155:4:
				// typeParam
			{
				pushFollow(FOLLOW_typeParam_in_typeParamOpt1387);
				typeParam90 = typeParam();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_typeParam.add(typeParam90.getTree());

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
					// 155:13: -> ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true] (
					// typeParam )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:155:15:
						// ^( TYPE_PARAM_OPT[\"TYPE_PARAM_OPT\",true] (
						// typeParam )? )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(
									new ExtendedCommonTree(TYPE_PARAM_OPT,
											"TYPE_PARAM_OPT", true), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:155:75:
							// ( typeParam )?
							if (stream_typeParam.hasNext()) {
								adaptor.addChild(root_1, stream_typeParam
										.nextTree());

							}
							stream_typeParam.reset();

							adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}
				break;
			case 2:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:157:9:
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:159:1:
	// typeConstraint : IDENTIFIER COLON LPAREN typeList RPAREN -> ^(
	// $typeConstraint ( IDENTIFIER )? ( typeList )? ) ;
	public final TinyHaxeTry1Parser.typeConstraint_return typeConstraint()
			throws RecognitionException {
		TinyHaxeTry1Parser.typeConstraint_return retval = new TinyHaxeTry1Parser.typeConstraint_return();
		retval.start = input.LT(1);
		int typeConstraint_StartIndex = input.index();
		Object root_0 = null;

		Token IDENTIFIER91 = null;
		Token COLON92 = null;
		Token LPAREN93 = null;
		Token RPAREN95 = null;
		TinyHaxeTry1Parser.typeList_return typeList94 = null;

		Object IDENTIFIER91_tree = null;
		Object COLON92_tree = null;
		Object LPAREN93_tree = null;
		Object RPAREN95_tree = null;
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
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:159:19:
			// ( IDENTIFIER COLON LPAREN typeList RPAREN -> ^( $typeConstraint (
			// IDENTIFIER )? ( typeList )? ) )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:159:21:
			// IDENTIFIER COLON LPAREN typeList RPAREN
			{
				IDENTIFIER91 = (Token) match(input, IDENTIFIER,
						FOLLOW_IDENTIFIER_in_typeConstraint1429);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_IDENTIFIER.add(IDENTIFIER91);

				COLON92 = (Token) match(input, COLON,
						FOLLOW_COLON_in_typeConstraint1431);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_COLON.add(COLON92);

				LPAREN93 = (Token) match(input, LPAREN,
						FOLLOW_LPAREN_in_typeConstraint1433);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_LPAREN.add(LPAREN93);

				pushFollow(FOLLOW_typeList_in_typeConstraint1435);
				typeList94 = typeList();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_typeList.add(typeList94.getTree());
				RPAREN95 = (Token) match(input, RPAREN,
						FOLLOW_RPAREN_in_typeConstraint1437);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_RPAREN.add(RPAREN95);

				// AST REWRITE
				// elements: IDENTIFIER, typeConstraint, typeList
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
					// 159:61: -> ^( $typeConstraint ( IDENTIFIER )? ( typeList
					// )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:159:64:
						// ^( $typeConstraint ( IDENTIFIER )? ( typeList )? )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(stream_retval
									.nextNode(), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:159:82:
							// ( IDENTIFIER )?
							if (stream_IDENTIFIER.hasNext()) {
								adaptor.addChild(root_1, stream_IDENTIFIER
										.nextNode());

							}
							stream_IDENTIFIER.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:159:94:
							// ( typeList )?
							if (stream_typeList.hasNext()) {
								adaptor.addChild(root_1, stream_typeList
										.nextTree());

							}
							stream_typeList.reset();

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

	public static class functionReturn_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "functionReturn"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:163:1:
	// functionReturn : ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN
	// typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? (
	// typeTagOpt )? ( block )? ) ;
	public final TinyHaxeTry1Parser.functionReturn_return functionReturn()
			throws RecognitionException {
		TinyHaxeTry1Parser.functionReturn_return retval = new TinyHaxeTry1Parser.functionReturn_return();
		retval.start = input.LT(1);
		int functionReturn_StartIndex = input.index();
		Object root_0 = null;

		Token FUNCTION97 = null;
		Token NEW98 = null;
		Token LPAREN99 = null;
		Token RPAREN101 = null;
		TinyHaxeTry1Parser.declAttrList_return declAttrList96 = null;

		TinyHaxeTry1Parser.paramList_return paramList100 = null;

		TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt102 = null;

		TinyHaxeTry1Parser.block_return block103 = null;

		Object FUNCTION97_tree = null;
		Object NEW98_tree = null;
		Object LPAREN99_tree = null;
		Object RPAREN101_tree = null;
		RewriteRuleTokenStream stream_FUNCTION = new RewriteRuleTokenStream(
				adaptor, "token FUNCTION");
		RewriteRuleTokenStream stream_NEW = new RewriteRuleTokenStream(adaptor,
				"token NEW");
		RewriteRuleTokenStream stream_RPAREN = new RewriteRuleTokenStream(
				adaptor, "token RPAREN");
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
		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 31)) {
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
				int alt28 = 2;
				int LA28_0 = input.LA(1);

				if (((LA28_0 >= PUBLIC && LA28_0 <= OVERRIDE))) {
					alt28 = 1;
				}
				switch (alt28) {
				case 1:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:0:0:
					// declAttrList
				{
					pushFollow(FOLLOW_declAttrList_in_functionReturn1463);
					declAttrList96 = declAttrList();

					state._fsp--;
					if (state.failed)
						return retval;
					if (state.backtracking == 0)
						stream_declAttrList.add(declAttrList96.getTree());

				}
					break;

				}

				FUNCTION97 = (Token) match(input, FUNCTION,
						FOLLOW_FUNCTION_in_functionReturn1466);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_FUNCTION.add(FUNCTION97);

				NEW98 = (Token) match(input, NEW,
						FOLLOW_NEW_in_functionReturn1468);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_NEW.add(NEW98);

				LPAREN99 = (Token) match(input, LPAREN,
						FOLLOW_LPAREN_in_functionReturn1470);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_LPAREN.add(LPAREN99);

				pushFollow(FOLLOW_paramList_in_functionReturn1472);
				paramList100 = paramList();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_paramList.add(paramList100.getTree());
				RPAREN101 = (Token) match(input, RPAREN,
						FOLLOW_RPAREN_in_functionReturn1474);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_RPAREN.add(RPAREN101);

				pushFollow(FOLLOW_typeTagOpt_in_functionReturn1476);
				typeTagOpt102 = typeTagOpt();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_typeTagOpt.add(typeTagOpt102.getTree());
				pushFollow(FOLLOW_block_in_functionReturn1478);
				block103 = block();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_block.add(block103.getTree());

				// AST REWRITE
				// elements: paramList, block, typeTagOpt, NEW, FUNCTION,
				// declAttrList
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
					// 164:72: -> ^( FUNCTION NEW ( declAttrList )? ( paramList
					// )? ( typeTagOpt )? ( block )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:164:75:
						// ^( FUNCTION NEW ( declAttrList )? ( paramList )? (
						// typeTagOpt )? ( block )? )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(
									new FunctionNode(stream_FUNCTION
											.nextToken()), root_1);

							adaptor.addChild(root_1, stream_NEW.nextNode());
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:164:104:
							// ( declAttrList )?
							if (stream_declAttrList.hasNext()) {
								adaptor.addChild(root_1, stream_declAttrList
										.nextTree());

							}
							stream_declAttrList.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:164:118:
							// ( paramList )?
							if (stream_paramList.hasNext()) {
								adaptor.addChild(root_1, stream_paramList
										.nextTree());

							}
							stream_paramList.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:164:129:
							// ( typeTagOpt )?
							if (stream_typeTagOpt.hasNext()) {
								adaptor.addChild(root_1, stream_typeTagOpt
										.nextTree());

							}
							stream_typeTagOpt.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:164:141:
							// ( block )?
							if (stream_block.hasNext()) {
								adaptor.addChild(root_1, stream_block
										.nextTree());

							}
							stream_block.reset();

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
				memoize(input, 31, functionReturn_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "functionReturn"

	public static class statement_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
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
	public final TinyHaxeTry1Parser.statement_return statement()
			throws RecognitionException {
		TinyHaxeTry1Parser.statement_return retval = new TinyHaxeTry1Parser.statement_return();
		retval.start = input.LT(1);
		int statement_StartIndex = input.index();
		Object root_0 = null;

		Token SEMI106 = null;
		Token IF108 = null;
		Token ELSE110 = null;
		Token FOR111 = null;
		Token LPAREN112 = null;
		Token IN113 = null;
		Token RPAREN114 = null;
		Token WHILE116 = null;
		Token DO119 = null;
		Token WHILE121 = null;
		Token SEMI123 = null;
		Token TRY124 = null;
		Token SWITCH127 = null;
		Token LPAREN128 = null;
		Token RPAREN130 = null;
		Token LBRACE131 = null;
		Token RBRACE133 = null;
		Token RETURN134 = null;
		Token SEMI136 = null;
		Token THROW137 = null;
		Token SEMI139 = null;
		Token BREAK140 = null;
		Token IDENTIFIER141 = null;
		Token SEMI142 = null;
		Token CONTINUE143 = null;
		Token IDENTIFIER144 = null;
		Token SEMI145 = null;
		Token SEMI147 = null;
		Token IDENTIFIER148 = null;
		Token COLON149 = null;
		Token SEMI151 = null;
		TinyHaxeTry1Parser.statement_return st1 = null;

		TinyHaxeTry1Parser.statement_return st2 = null;

		TinyHaxeTry1Parser.expr_return exp1 = null;

		TinyHaxeTry1Parser.expr_return exp2 = null;

		TinyHaxeTry1Parser.block_return block104 = null;

		TinyHaxeTry1Parser.assignExpr_return assignExpr105 = null;

		TinyHaxeTry1Parser.varDecl_return varDecl107 = null;

		TinyHaxeTry1Parser.parExpression_return parExpression109 = null;

		TinyHaxeTry1Parser.statement_return statement115 = null;

		TinyHaxeTry1Parser.parExpression_return parExpression117 = null;

		TinyHaxeTry1Parser.statement_return statement118 = null;

		TinyHaxeTry1Parser.statement_return statement120 = null;

		TinyHaxeTry1Parser.parExpression_return parExpression122 = null;

		TinyHaxeTry1Parser.block_return block125 = null;

		TinyHaxeTry1Parser.catchStmtList_return catchStmtList126 = null;

		TinyHaxeTry1Parser.expr_return expr129 = null;

		TinyHaxeTry1Parser.caseStmt_return caseStmt132 = null;

		TinyHaxeTry1Parser.expr_return expr135 = null;

		TinyHaxeTry1Parser.expr_return expr138 = null;

		TinyHaxeTry1Parser.expr_return expr146 = null;

		TinyHaxeTry1Parser.statement_return statement150 = null;

		Object SEMI106_tree = null;
		Object IF108_tree = null;
		Object ELSE110_tree = null;
		Object FOR111_tree = null;
		Object LPAREN112_tree = null;
		Object IN113_tree = null;
		Object RPAREN114_tree = null;
		Object WHILE116_tree = null;
		Object DO119_tree = null;
		Object WHILE121_tree = null;
		Object SEMI123_tree = null;
		Object TRY124_tree = null;
		Object SWITCH127_tree = null;
		Object LPAREN128_tree = null;
		Object RPAREN130_tree = null;
		Object LBRACE131_tree = null;
		Object RBRACE133_tree = null;
		Object RETURN134_tree = null;
		Object SEMI136_tree = null;
		Object THROW137_tree = null;
		Object SEMI139_tree = null;
		Object BREAK140_tree = null;
		Object IDENTIFIER141_tree = null;
		Object SEMI142_tree = null;
		Object CONTINUE143_tree = null;
		Object IDENTIFIER144_tree = null;
		Object SEMI145_tree = null;
		Object SEMI147_tree = null;
		Object IDENTIFIER148_tree = null;
		Object COLON149_tree = null;
		Object SEMI151_tree = null;
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
			if (state.backtracking > 0 && alreadyParsedRule(input, 32)) {
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
			int alt34 = 16;
			alt34 = dfa34.predict(input);
			switch (alt34) {
			case 1:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:168:4:
				// block
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_block_in_statement1515);
				block104 = block();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, block104.getTree());

			}
				break;
			case 2:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:169:4:
				// assignExpr SEMI
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_assignExpr_in_statement1520);
				assignExpr105 = assignExpr();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, assignExpr105.getTree());
				SEMI106 = (Token) match(input, SEMI,
						FOLLOW_SEMI_in_statement1522);
				if (state.failed)
					return retval;

			}
				break;
			case 3:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:170:4:
				// varDecl
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_varDecl_in_statement1528);
				varDecl107 = varDecl();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, varDecl107.getTree());

			}
				break;
			case 4:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:171:4:
				// IF parExpression st1= statement ( ELSE st2= statement )?
			{
				IF108 = (Token) match(input, IF, FOLLOW_IF_in_statement1533);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_IF.add(IF108);

				pushFollow(FOLLOW_parExpression_in_statement1535);
				parExpression109 = parExpression();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_parExpression.add(parExpression109.getTree());
				pushFollow(FOLLOW_statement_in_statement1539);
				st1 = statement();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_statement.add(st1.getTree());
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:171:35:
				// ( ELSE st2= statement )?
				int alt29 = 2;
				int LA29_0 = input.LA(1);

				if ((LA29_0 == ELSE)) {
					int LA29_1 = input.LA(2);

					if ((synpred50_TinyHaxeTry1())) {
						alt29 = 1;
					}
				}
				switch (alt29) {
				case 1:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:171:36:
					// ELSE st2= statement
				{
					ELSE110 = (Token) match(input, ELSE,
							FOLLOW_ELSE_in_statement1542);
					if (state.failed)
						return retval;
					if (state.backtracking == 0)
						stream_ELSE.add(ELSE110);

					pushFollow(FOLLOW_statement_in_statement1546);
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
				// elements: st2, ELSE, parExpression, st1, IF
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
					// 171:58: -> ^( IF parExpression $st1 ( ^( ELSE $st2) )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:171:61:
						// ^( IF parExpression $st1 ( ^( ELSE $st2) )? )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(new IfNode(
									stream_IF.nextToken()), root_1);

							adaptor.addChild(root_1, stream_parExpression
									.nextTree());
							adaptor.addChild(root_1, stream_st1.nextTree());
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:171:93:
							// ( ^( ELSE $st2) )?
							if (stream_st2.hasNext() || stream_ELSE.hasNext()) {
								// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:171:93:
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
							stream_st2.reset();
							stream_ELSE.reset();

							adaptor.addChild(root_0, root_1);
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
				FOR111 = (Token) match(input, FOR, FOLLOW_FOR_in_statement1586);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_FOR.add(FOR111);

				LPAREN112 = (Token) match(input, LPAREN,
						FOLLOW_LPAREN_in_statement1588);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_LPAREN.add(LPAREN112);

				pushFollow(FOLLOW_expr_in_statement1592);
				exp1 = expr();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_expr.add(exp1.getTree());
				IN113 = (Token) match(input, IN, FOLLOW_IN_in_statement1594);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_IN.add(IN113);

				pushFollow(FOLLOW_expr_in_statement1598);
				exp2 = expr();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_expr.add(exp2.getTree());
				RPAREN114 = (Token) match(input, RPAREN,
						FOLLOW_RPAREN_in_statement1600);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_RPAREN.add(RPAREN114);

				pushFollow(FOLLOW_statement_in_statement1602);
				statement115 = statement();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_statement.add(statement115.getTree());

				// AST REWRITE
				// elements: exp2, exp1, FOR, statement, IN
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
					// 172:56: -> ^( FOR ^( IN $exp1 $exp2) ( statement )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:172:59:
						// ^( FOR ^( IN $exp1 $exp2) ( statement )? )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(new ForNode(
									stream_FOR.nextToken()), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:172:74:
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
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:172:92:
							// ( statement )?
							if (stream_statement.hasNext()) {
								adaptor.addChild(root_1, stream_statement
										.nextTree());

							}
							stream_statement.reset();

							adaptor.addChild(root_0, root_1);
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
				WHILE116 = (Token) match(input, WHILE,
						FOLLOW_WHILE_in_statement1630);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_WHILE.add(WHILE116);

				pushFollow(FOLLOW_parExpression_in_statement1632);
				parExpression117 = parExpression();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_parExpression.add(parExpression117.getTree());
				pushFollow(FOLLOW_statement_in_statement1634);
				statement118 = statement();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_statement.add(statement118.getTree());

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
					// 173:38: -> ^( WHILE ( parExpression )? ( statement )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:173:41:
						// ^( WHILE ( parExpression )? ( statement )? )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(new WhileNode(
									stream_WHILE.nextToken()), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:173:60:
							// ( parExpression )?
							if (stream_parExpression.hasNext()) {
								adaptor.addChild(root_1, stream_parExpression
										.nextTree());

							}
							stream_parExpression.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:173:75:
							// ( statement )?
							if (stream_statement.hasNext()) {
								adaptor.addChild(root_1, stream_statement
										.nextTree());

							}
							stream_statement.reset();

							adaptor.addChild(root_0, root_1);
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
				DO119 = (Token) match(input, DO, FOLLOW_DO_in_statement1658);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_DO.add(DO119);

				pushFollow(FOLLOW_statement_in_statement1660);
				statement120 = statement();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_statement.add(statement120.getTree());
				WHILE121 = (Token) match(input, WHILE,
						FOLLOW_WHILE_in_statement1662);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_WHILE.add(WHILE121);

				pushFollow(FOLLOW_parExpression_in_statement1664);
				parExpression122 = parExpression();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_parExpression.add(parExpression122.getTree());
				SEMI123 = (Token) match(input, SEMI,
						FOLLOW_SEMI_in_statement1666);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_SEMI.add(SEMI123);

				// AST REWRITE
				// elements: statement, parExpression, DO
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
					// 174:45: -> ^( DO ( parExpression )? ( statement )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:174:48:
						// ^( DO ( parExpression )? ( statement )? )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(
									new DoWhileNode(stream_DO.nextToken()),
									root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:174:66:
							// ( parExpression )?
							if (stream_parExpression.hasNext()) {
								adaptor.addChild(root_1, stream_parExpression
										.nextTree());

							}
							stream_parExpression.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:174:81:
							// ( statement )?
							if (stream_statement.hasNext()) {
								adaptor.addChild(root_1, stream_statement
										.nextTree());

							}
							stream_statement.reset();

							adaptor.addChild(root_0, root_1);
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
				TRY124 = (Token) match(input, TRY, FOLLOW_TRY_in_statement1689);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_TRY.add(TRY124);

				pushFollow(FOLLOW_block_in_statement1691);
				block125 = block();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_block.add(block125.getTree());
				pushFollow(FOLLOW_catchStmtList_in_statement1693);
				catchStmtList126 = catchStmtList();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_catchStmtList.add(catchStmtList126.getTree());

				// AST REWRITE
				// elements: block, catchStmtList, TRY
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
					// 175:32: -> ^( TRY ( block )? ( catchStmtList )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:175:35:
						// ^( TRY ( block )? ( catchStmtList )? )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(new TryNode(
									stream_TRY.nextToken()), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:175:50:
							// ( block )?
							if (stream_block.hasNext()) {
								adaptor.addChild(root_1, stream_block
										.nextTree());

							}
							stream_block.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:175:57:
							// ( catchStmtList )?
							if (stream_catchStmtList.hasNext()) {
								adaptor.addChild(root_1, stream_catchStmtList
										.nextTree());

							}
							stream_catchStmtList.reset();

							adaptor.addChild(root_0, root_1);
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
				SWITCH127 = (Token) match(input, SWITCH,
						FOLLOW_SWITCH_in_statement1717);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_SWITCH.add(SWITCH127);

				LPAREN128 = (Token) match(input, LPAREN,
						FOLLOW_LPAREN_in_statement1719);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_LPAREN.add(LPAREN128);

				pushFollow(FOLLOW_expr_in_statement1721);
				expr129 = expr();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_expr.add(expr129.getTree());
				RPAREN130 = (Token) match(input, RPAREN,
						FOLLOW_RPAREN_in_statement1723);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_RPAREN.add(RPAREN130);

				LBRACE131 = (Token) match(input, LBRACE,
						FOLLOW_LBRACE_in_statement1725);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_LBRACE.add(LBRACE131);

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:176:37:
				// ( caseStmt )+
				int cnt30 = 0;
				loop30: do {
					int alt30 = 2;
					int LA30_0 = input.LA(1);

					if (((LA30_0 >= CASE && LA30_0 <= DEFAULT))) {
						alt30 = 1;
					}

					switch (alt30) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:0:0:
						// caseStmt
					{
						pushFollow(FOLLOW_caseStmt_in_statement1727);
						caseStmt132 = caseStmt();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							stream_caseStmt.add(caseStmt132.getTree());

					}
						break;

					default:
						if (cnt30 >= 1)
							break loop30;
						if (state.backtracking > 0) {
							state.failed = true;
							return retval;
						}
						EarlyExitException eee = new EarlyExitException(30,
								input);
						throw eee;
					}
					cnt30++;
				} while (true);

				RBRACE133 = (Token) match(input, RBRACE,
						FOLLOW_RBRACE_in_statement1730);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_RBRACE.add(RBRACE133);

				// AST REWRITE
				// elements: expr, SWITCH, caseStmt
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
					// 176:55: -> ^( SWITCH ( expr )? ( caseStmt )+ )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:176:58:
						// ^( SWITCH ( expr )? ( caseStmt )+ )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(
									new SwitchNode(stream_SWITCH.nextToken()),
									root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:176:79:
							// ( expr )?
							if (stream_expr.hasNext()) {
								adaptor
										.addChild(root_1, stream_expr
												.nextTree());

							}
							stream_expr.reset();
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
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:177:4:
				// RETURN ( expr )? SEMI
			{
				RETURN134 = (Token) match(input, RETURN,
						FOLLOW_RETURN_in_statement1751);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_RETURN.add(RETURN134);

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:177:11:
				// ( expr )?
				int alt31 = 2;
				int LA31_0 = input.LA(1);

				if ((LA31_0 == IDENTIFIER
						|| (LA31_0 >= QUES && LA31_0 <= LPAREN)
						|| LA31_0 == LBRACKET || LA31_0 == BANG
						|| (LA31_0 >= LT && LA31_0 <= GT) || LA31_0 == NEW
						|| LA31_0 == LBRACE
						|| (LA31_0 >= ELLIPSIS && LA31_0 <= CAST) || (LA31_0 >= LONGLITERAL && LA31_0 <= FALSE))) {
					alt31 = 1;
				} else if ((LA31_0 == SEMI)) {
					int LA31_2 = input.LA(2);

					if ((synpred58_TinyHaxeTry1())) {
						alt31 = 1;
					}
				}
				switch (alt31) {
				case 1:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:177:12:
					// expr
				{
					pushFollow(FOLLOW_expr_in_statement1754);
					expr135 = expr();

					state._fsp--;
					if (state.failed)
						return retval;
					if (state.backtracking == 0)
						stream_expr.add(expr135.getTree());

				}
					break;

				}

				SEMI136 = (Token) match(input, SEMI,
						FOLLOW_SEMI_in_statement1758);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_SEMI.add(SEMI136);

				// AST REWRITE
				// elements: expr, RETURN
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
					// 177:28: -> ^( RETURN ( expr )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:177:31:
						// ^( RETURN ( expr )? )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(stream_RETURN
									.nextNode(), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:177:40:
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
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:178:4:
				// THROW expr SEMI
			{
				THROW137 = (Token) match(input, THROW,
						FOLLOW_THROW_in_statement1776);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_THROW.add(THROW137);

				pushFollow(FOLLOW_expr_in_statement1778);
				expr138 = expr();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_expr.add(expr138.getTree());
				SEMI139 = (Token) match(input, SEMI,
						FOLLOW_SEMI_in_statement1780);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_SEMI.add(SEMI139);

				// AST REWRITE
				// elements: THROW, expr
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
					// 178:25: -> ^( THROW ( expr )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:178:28:
						// ^( THROW ( expr )? )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(stream_THROW
									.nextNode(), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:178:36:
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
			case 12:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:179:4:
				// BREAK ( IDENTIFIER )? SEMI
			{
				BREAK140 = (Token) match(input, BREAK,
						FOLLOW_BREAK_in_statement1799);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_BREAK.add(BREAK140);

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:179:10:
				// ( IDENTIFIER )?
				int alt32 = 2;
				int LA32_0 = input.LA(1);

				if ((LA32_0 == IDENTIFIER)) {
					alt32 = 1;
				}
				switch (alt32) {
				case 1:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:179:11:
					// IDENTIFIER
				{
					IDENTIFIER141 = (Token) match(input, IDENTIFIER,
							FOLLOW_IDENTIFIER_in_statement1802);
					if (state.failed)
						return retval;
					if (state.backtracking == 0)
						stream_IDENTIFIER.add(IDENTIFIER141);

				}
					break;

				}

				SEMI142 = (Token) match(input, SEMI,
						FOLLOW_SEMI_in_statement1806);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_SEMI.add(SEMI142);

				// AST REWRITE
				// elements: BREAK, IDENTIFIER
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
					// 179:32: -> ^( BREAK ( IDENTIFIER )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:179:35:
						// ^( BREAK ( IDENTIFIER )? )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(stream_BREAK
									.nextNode(), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:179:43:
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
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:180:4:
				// CONTINUE ( IDENTIFIER )? SEMI
			{
				CONTINUE143 = (Token) match(input, CONTINUE,
						FOLLOW_CONTINUE_in_statement1823);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_CONTINUE.add(CONTINUE143);

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:180:13:
				// ( IDENTIFIER )?
				int alt33 = 2;
				int LA33_0 = input.LA(1);

				if ((LA33_0 == IDENTIFIER)) {
					alt33 = 1;
				}
				switch (alt33) {
				case 1:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:180:14:
					// IDENTIFIER
				{
					IDENTIFIER144 = (Token) match(input, IDENTIFIER,
							FOLLOW_IDENTIFIER_in_statement1826);
					if (state.failed)
						return retval;
					if (state.backtracking == 0)
						stream_IDENTIFIER.add(IDENTIFIER144);

				}
					break;

				}

				SEMI145 = (Token) match(input, SEMI,
						FOLLOW_SEMI_in_statement1830);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_SEMI.add(SEMI145);

				// AST REWRITE
				// elements: CONTINUE, IDENTIFIER
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
					// 180:36: -> ^( CONTINUE ( IDENTIFIER )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:180:39:
						// ^( CONTINUE ( IDENTIFIER )? )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(
									stream_CONTINUE.nextNode(), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:180:50:
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
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:181:4:
				// expr SEMI
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_expr_in_statement1848);
				expr146 = expr();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, expr146.getTree());
				SEMI147 = (Token) match(input, SEMI,
						FOLLOW_SEMI_in_statement1851);
				if (state.failed)
					return retval;

			}
				break;
			case 15:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:182:4:
				// IDENTIFIER COLON statement
			{
				IDENTIFIER148 = (Token) match(input, IDENTIFIER,
						FOLLOW_IDENTIFIER_in_statement1857);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_IDENTIFIER.add(IDENTIFIER148);

				COLON149 = (Token) match(input, COLON,
						FOLLOW_COLON_in_statement1859);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_COLON.add(COLON149);

				pushFollow(FOLLOW_statement_in_statement1861);
				statement150 = statement();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_statement.add(statement150.getTree());

				// AST REWRITE
				// elements: COLON, statement, IDENTIFIER
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
					// 182:35: -> ^( COLON ( IDENTIFIER )? ( statement )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:182:38:
						// ^( COLON ( IDENTIFIER )? ( statement )? )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(stream_COLON
									.nextNode(), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:182:46:
							// ( IDENTIFIER )?
							if (stream_IDENTIFIER.hasNext()) {
								adaptor.addChild(root_1, stream_IDENTIFIER
										.nextNode());

							}
							stream_IDENTIFIER.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:182:58:
							// ( statement )?
							if (stream_statement.hasNext()) {
								adaptor.addChild(root_1, stream_statement
										.nextTree());

							}
							stream_statement.reset();

							adaptor.addChild(root_0, root_1);
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
				root_0 = (Object) adaptor.nil();

				SEMI151 = (Token) match(input, SEMI,
						FOLLOW_SEMI_in_statement1882);
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
				memoize(input, 32, statement_StartIndex);
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:186:1:
	// parExpression : LPAREN expr RPAREN ;
	public final TinyHaxeTry1Parser.parExpression_return parExpression()
			throws RecognitionException {
		TinyHaxeTry1Parser.parExpression_return retval = new TinyHaxeTry1Parser.parExpression_return();
		retval.start = input.LT(1);
		int parExpression_StartIndex = input.index();
		Object root_0 = null;

		Token LPAREN152 = null;
		Token RPAREN154 = null;
		TinyHaxeTry1Parser.expr_return expr153 = null;

		Object LPAREN152_tree = null;
		Object RPAREN154_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 33)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:187:5:
			// ( LPAREN expr RPAREN )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:187:9:
			// LPAREN expr RPAREN
			{
				root_0 = (Object) adaptor.nil();

				LPAREN152 = (Token) match(input, LPAREN,
						FOLLOW_LPAREN_in_parExpression1903);
				if (state.failed)
					return retval;
				pushFollow(FOLLOW_expr_in_parExpression1906);
				expr153 = expr();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, expr153.getTree());
				RPAREN154 = (Token) match(input, RPAREN,
						FOLLOW_RPAREN_in_parExpression1908);
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
				memoize(input, 33, parExpression_StartIndex);
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:190:1:
	// block : ( LBRACE ( blockStmt )* RBRACE -> ^(
	// BLOCK_SCOPE[\"BLOCK_SCOPE\",true,$LBRACE] ( blockStmt )* RBRACE ) | SEMI
	// );
	public final TinyHaxeTry1Parser.block_return block()
			throws RecognitionException {
		TinyHaxeTry1Parser.block_return retval = new TinyHaxeTry1Parser.block_return();
		retval.start = input.LT(1);
		int block_StartIndex = input.index();
		Object root_0 = null;

		Token LBRACE155 = null;
		Token RBRACE157 = null;
		Token SEMI158 = null;
		TinyHaxeTry1Parser.blockStmt_return blockStmt156 = null;

		Object LBRACE155_tree = null;
		Object RBRACE157_tree = null;
		Object SEMI158_tree = null;
		RewriteRuleTokenStream stream_RBRACE = new RewriteRuleTokenStream(
				adaptor, "token RBRACE");
		RewriteRuleTokenStream stream_LBRACE = new RewriteRuleTokenStream(
				adaptor, "token LBRACE");
		RewriteRuleSubtreeStream stream_blockStmt = new RewriteRuleSubtreeStream(
				adaptor, "rule blockStmt");
		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 34)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:190:8:
			// ( LBRACE ( blockStmt )* RBRACE -> ^(
			// BLOCK_SCOPE[\"BLOCK_SCOPE\",true,$LBRACE] ( blockStmt )* RBRACE )
			// | SEMI )
			int alt36 = 2;
			int LA36_0 = input.LA(1);

			if ((LA36_0 == LBRACE)) {
				alt36 = 1;
			} else if ((LA36_0 == SEMI)) {
				alt36 = 2;
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return retval;
				}
				NoViableAltException nvae = new NoViableAltException("", 36, 0,
						input);

				throw nvae;
			}
			switch (alt36) {
			case 1:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:190:10:
				// LBRACE ( blockStmt )* RBRACE
			{
				LBRACE155 = (Token) match(input, LBRACE,
						FOLLOW_LBRACE_in_block1923);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_LBRACE.add(LBRACE155);

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:190:17:
				// ( blockStmt )*
				loop35: do {
					int alt35 = 2;
					int LA35_0 = input.LA(1);

					if (((LA35_0 >= SEMI && LA35_0 <= IDENTIFIER)
							|| (LA35_0 >= PUBLIC && LA35_0 <= OVERRIDE)
							|| (LA35_0 >= QUES && LA35_0 <= LPAREN)
							|| LA35_0 == LBRACKET || LA35_0 == BANG
							|| (LA35_0 >= LT && LA35_0 <= GT)
							|| (LA35_0 >= NEW && LA35_0 <= IF) || LA35_0 == FOR
							|| (LA35_0 >= WHILE && LA35_0 <= LBRACE)
							|| (LA35_0 >= RETURN && LA35_0 <= CONTINUE)
							|| (LA35_0 >= ELLIPSIS && LA35_0 <= CAST)
							|| (LA35_0 >= VAR && LA35_0 <= CLASS) || (LA35_0 >= LONGLITERAL && LA35_0 <= FALSE))) {
						alt35 = 1;
					}

					switch (alt35) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:190:18:
						// blockStmt
					{
						pushFollow(FOLLOW_blockStmt_in_block1926);
						blockStmt156 = blockStmt();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							stream_blockStmt.add(blockStmt156.getTree());

					}
						break;

					default:
						break loop35;
					}
				} while (true);

				RBRACE157 = (Token) match(input, RBRACE,
						FOLLOW_RBRACE_in_block1930);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_RBRACE.add(RBRACE157);

				// AST REWRITE
				// elements: blockStmt, RBRACE
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
					// 190:37: -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\",true,$LBRACE] (
					// blockStmt )* RBRACE )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:190:39:
						// ^( BLOCK_SCOPE[\"BLOCK_SCOPE\",true,$LBRACE] (
						// blockStmt )* RBRACE )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(
									new BlockScopeNode(BLOCK_SCOPE,
											"BLOCK_SCOPE", true, LBRACE155),
									root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:190:97:
							// ( blockStmt )*
							while (stream_blockStmt.hasNext()) {
								adaptor.addChild(root_1, stream_blockStmt
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

							adaptor.addChild(root_0, root_1);
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
				root_0 = (Object) adaptor.nil();

				SEMI158 = (Token) match(input, SEMI, FOLLOW_SEMI_in_block1950);
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
				memoize(input, 34, block_StartIndex);
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:194:1:
	// blockStmt : ( varDecl | classDecl | statement );
	public final TinyHaxeTry1Parser.blockStmt_return blockStmt()
			throws RecognitionException {
		TinyHaxeTry1Parser.blockStmt_return retval = new TinyHaxeTry1Parser.blockStmt_return();
		retval.start = input.LT(1);
		int blockStmt_StartIndex = input.index();
		Object root_0 = null;

		TinyHaxeTry1Parser.varDecl_return varDecl159 = null;

		TinyHaxeTry1Parser.classDecl_return classDecl160 = null;

		TinyHaxeTry1Parser.statement_return statement161 = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 35)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:195:2:
			// ( varDecl | classDecl | statement )
			int alt37 = 3;
			alt37 = dfa37.predict(input);
			switch (alt37) {
			case 1:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:195:4:
				// varDecl
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_varDecl_in_blockStmt1963);
				varDecl159 = varDecl();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, varDecl159.getTree());

			}
				break;
			case 2:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:196:4:
				// classDecl
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_classDecl_in_blockStmt1968);
				classDecl160 = classDecl();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, classDecl160.getTree());

			}
				break;
			case 3:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:197:4:
				// statement
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_statement_in_blockStmt1973);
				statement161 = statement();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, statement161.getTree());

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
				memoize(input, 35, blockStmt_StartIndex);
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:201:1:
	// breakStmt : BREAK SEMI ;
	public final TinyHaxeTry1Parser.breakStmt_return breakStmt()
			throws RecognitionException {
		TinyHaxeTry1Parser.breakStmt_return retval = new TinyHaxeTry1Parser.breakStmt_return();
		retval.start = input.LT(1);
		int breakStmt_StartIndex = input.index();
		Object root_0 = null;

		Token BREAK162 = null;
		Token SEMI163 = null;

		Object BREAK162_tree = null;
		Object SEMI163_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 36)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:202:2:
			// ( BREAK SEMI )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:202:4:
			// BREAK SEMI
			{
				root_0 = (Object) adaptor.nil();

				BREAK162 = (Token) match(input, BREAK,
						FOLLOW_BREAK_in_breakStmt2006);
				if (state.failed)
					return retval;
				if (state.backtracking == 0) {
					BREAK162_tree = (Object) adaptor.create(BREAK162);
					adaptor.addChild(root_0, BREAK162_tree);
				}
				SEMI163 = (Token) match(input, SEMI,
						FOLLOW_SEMI_in_breakStmt2008);
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
				memoize(input, 36, breakStmt_StartIndex);
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:205:1:
	// continueStmt : CONTINUE SEMI ;
	public final TinyHaxeTry1Parser.continueStmt_return continueStmt()
			throws RecognitionException {
		TinyHaxeTry1Parser.continueStmt_return retval = new TinyHaxeTry1Parser.continueStmt_return();
		retval.start = input.LT(1);
		int continueStmt_StartIndex = input.index();
		Object root_0 = null;

		Token CONTINUE164 = null;
		Token SEMI165 = null;

		Object CONTINUE164_tree = null;
		Object SEMI165_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 37)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:206:2:
			// ( CONTINUE SEMI )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:206:4:
			// CONTINUE SEMI
			{
				root_0 = (Object) adaptor.nil();

				CONTINUE164 = (Token) match(input, CONTINUE,
						FOLLOW_CONTINUE_in_continueStmt2027);
				if (state.failed)
					return retval;
				if (state.backtracking == 0) {
					CONTINUE164_tree = (Object) adaptor.create(CONTINUE164);
					adaptor.addChild(root_0, CONTINUE164_tree);
				}
				SEMI165 = (Token) match(input, SEMI,
						FOLLOW_SEMI_in_continueStmt2029);
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
				memoize(input, 37, continueStmt_StartIndex);
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:209:1:
	// caseStmt : ( CASE exprList COLON statement -> ^( CASE ( exprList )? (
	// statement )? ) | DEFAULT COLON statement -> ^( DEFAULT ( statement )? )
	// );
	public final TinyHaxeTry1Parser.caseStmt_return caseStmt()
			throws RecognitionException {
		TinyHaxeTry1Parser.caseStmt_return retval = new TinyHaxeTry1Parser.caseStmt_return();
		retval.start = input.LT(1);
		int caseStmt_StartIndex = input.index();
		Object root_0 = null;

		Token CASE166 = null;
		Token COLON168 = null;
		Token DEFAULT170 = null;
		Token COLON171 = null;
		TinyHaxeTry1Parser.exprList_return exprList167 = null;

		TinyHaxeTry1Parser.statement_return statement169 = null;

		TinyHaxeTry1Parser.statement_return statement172 = null;

		Object CASE166_tree = null;
		Object COLON168_tree = null;
		Object DEFAULT170_tree = null;
		Object COLON171_tree = null;
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
			if (state.backtracking > 0 && alreadyParsedRule(input, 38)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:209:9:
			// ( CASE exprList COLON statement -> ^( CASE ( exprList )? (
			// statement )? ) | DEFAULT COLON statement -> ^( DEFAULT (
			// statement )? ) )
			int alt38 = 2;
			int LA38_0 = input.LA(1);

			if ((LA38_0 == CASE)) {
				alt38 = 1;
			} else if ((LA38_0 == DEFAULT)) {
				alt38 = 2;
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return retval;
				}
				NoViableAltException nvae = new NoViableAltException("", 38, 0,
						input);

				throw nvae;
			}
			switch (alt38) {
			case 1:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:209:11:
				// CASE exprList COLON statement
			{
				CASE166 = (Token) match(input, CASE,
						FOLLOW_CASE_in_caseStmt2040);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_CASE.add(CASE166);

				pushFollow(FOLLOW_exprList_in_caseStmt2042);
				exprList167 = exprList();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_exprList.add(exprList167.getTree());
				COLON168 = (Token) match(input, COLON,
						FOLLOW_COLON_in_caseStmt2044);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_COLON.add(COLON168);

				pushFollow(FOLLOW_statement_in_caseStmt2046);
				statement169 = statement();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_statement.add(statement169.getTree());

				// AST REWRITE
				// elements: exprList, statement, CASE
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
					// 209:42: -> ^( CASE ( exprList )? ( statement )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:209:45:
						// ^( CASE ( exprList )? ( statement )? )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(stream_CASE
									.nextNode(), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:209:52:
							// ( exprList )?
							if (stream_exprList.hasNext()) {
								adaptor.addChild(root_1, stream_exprList
										.nextTree());

							}
							stream_exprList.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:209:62:
							// ( statement )?
							if (stream_statement.hasNext()) {
								adaptor.addChild(root_1, stream_statement
										.nextTree());

							}
							stream_statement.reset();

							adaptor.addChild(root_0, root_1);
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
				DEFAULT170 = (Token) match(input, DEFAULT,
						FOLLOW_DEFAULT_in_caseStmt2064);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_DEFAULT.add(DEFAULT170);

				COLON171 = (Token) match(input, COLON,
						FOLLOW_COLON_in_caseStmt2066);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_COLON.add(COLON171);

				pushFollow(FOLLOW_statement_in_caseStmt2068);
				statement172 = statement();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_statement.add(statement172.getTree());

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
					// 210:29: -> ^( DEFAULT ( statement )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:210:32:
						// ^( DEFAULT ( statement )? )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(stream_DEFAULT
									.nextNode(), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:210:42:
							// ( statement )?
							if (stream_statement.hasNext()) {
								adaptor.addChild(root_1, stream_statement
										.nextTree());

							}
							stream_statement.reset();

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
				memoize(input, 38, caseStmt_StartIndex);
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:213:1:
	// defaultStmt : DEFAULT COLON ;
	public final TinyHaxeTry1Parser.defaultStmt_return defaultStmt()
			throws RecognitionException {
		TinyHaxeTry1Parser.defaultStmt_return retval = new TinyHaxeTry1Parser.defaultStmt_return();
		retval.start = input.LT(1);
		int defaultStmt_StartIndex = input.index();
		Object root_0 = null;

		Token DEFAULT173 = null;
		Token COLON174 = null;

		Object DEFAULT173_tree = null;
		Object COLON174_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 39)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:214:9:
			// ( DEFAULT COLON )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:214:11:
			// DEFAULT COLON
			{
				root_0 = (Object) adaptor.nil();

				DEFAULT173 = (Token) match(input, DEFAULT,
						FOLLOW_DEFAULT_in_defaultStmt2097);
				if (state.failed)
					return retval;
				if (state.backtracking == 0) {
					DEFAULT173_tree = (Object) adaptor.create(DEFAULT173);
					adaptor.addChild(root_0, DEFAULT173_tree);
				}
				COLON174 = (Token) match(input, COLON,
						FOLLOW_COLON_in_defaultStmt2099);
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
				memoize(input, 39, defaultStmt_StartIndex);
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:217:1:
	// catchStmtList : ( catchStmt catchStmtList | );
	public final TinyHaxeTry1Parser.catchStmtList_return catchStmtList()
			throws RecognitionException {
		TinyHaxeTry1Parser.catchStmtList_return retval = new TinyHaxeTry1Parser.catchStmtList_return();
		retval.start = input.LT(1);
		int catchStmtList_StartIndex = input.index();
		Object root_0 = null;

		TinyHaxeTry1Parser.catchStmt_return catchStmt175 = null;

		TinyHaxeTry1Parser.catchStmtList_return catchStmtList176 = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 40)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:218:2:
			// ( catchStmt catchStmtList | )
			int alt39 = 2;
			int LA39_0 = input.LA(1);

			if ((LA39_0 == CATCH)) {
				alt39 = 1;
			} else if ((LA39_0 == EOF
					|| (LA39_0 >= SEMI && LA39_0 <= IDENTIFIER)
					|| (LA39_0 >= PUBLIC && LA39_0 <= RBRACKET)
					|| LA39_0 == BANG || LA39_0 == COLON
					|| (LA39_0 >= LT && LA39_0 <= GT)
					|| (LA39_0 >= NEW && LA39_0 <= DEFAULT)
					|| (LA39_0 >= ELLIPSIS && LA39_0 <= CAST)
					|| (LA39_0 >= VAR && LA39_0 <= CLASS)
					|| (LA39_0 >= EXTENDS && LA39_0 <= IMPLEMENTS) || (LA39_0 >= LONGLITERAL && LA39_0 <= FALSE))) {
				alt39 = 2;
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return retval;
				}
				NoViableAltException nvae = new NoViableAltException("", 39, 0,
						input);

				throw nvae;
			}
			switch (alt39) {
			case 1:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:218:4:
				// catchStmt catchStmtList
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_catchStmt_in_catchStmtList2112);
				catchStmt175 = catchStmt();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, catchStmt175.getTree());
				pushFollow(FOLLOW_catchStmtList_in_catchStmtList2114);
				catchStmtList176 = catchStmtList();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, catchStmtList176.getTree());

			}
				break;
			case 2:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:220:2:
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
				memoize(input, 40, catchStmtList_StartIndex);
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:222:1:
	// catchStmt : CATCH LPAREN param RPAREN block -> ^( CATCH ( param )? (
	// block )? ) ;
	public final TinyHaxeTry1Parser.catchStmt_return catchStmt()
			throws RecognitionException {
		TinyHaxeTry1Parser.catchStmt_return retval = new TinyHaxeTry1Parser.catchStmt_return();
		retval.start = input.LT(1);
		int catchStmt_StartIndex = input.index();
		Object root_0 = null;

		Token CATCH177 = null;
		Token LPAREN178 = null;
		Token RPAREN180 = null;
		TinyHaxeTry1Parser.param_return param179 = null;

		TinyHaxeTry1Parser.block_return block181 = null;

		Object CATCH177_tree = null;
		Object LPAREN178_tree = null;
		Object RPAREN180_tree = null;
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
			if (state.backtracking > 0 && alreadyParsedRule(input, 41)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:223:9:
			// ( CATCH LPAREN param RPAREN block -> ^( CATCH ( param )? ( block
			// )? ) )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:223:11:
			// CATCH LPAREN param RPAREN block
			{
				CATCH177 = (Token) match(input, CATCH,
						FOLLOW_CATCH_in_catchStmt2143);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_CATCH.add(CATCH177);

				LPAREN178 = (Token) match(input, LPAREN,
						FOLLOW_LPAREN_in_catchStmt2145);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_LPAREN.add(LPAREN178);

				pushFollow(FOLLOW_param_in_catchStmt2147);
				param179 = param();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_param.add(param179.getTree());
				RPAREN180 = (Token) match(input, RPAREN,
						FOLLOW_RPAREN_in_catchStmt2149);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_RPAREN.add(RPAREN180);

				pushFollow(FOLLOW_block_in_catchStmt2151);
				block181 = block();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_block.add(block181.getTree());

				// AST REWRITE
				// elements: block, CATCH, param
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
					// 223:43: -> ^( CATCH ( param )? ( block )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:223:46:
						// ^( CATCH ( param )? ( block )? )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(stream_CATCH
									.nextNode(), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:223:54:
							// ( param )?
							if (stream_param.hasNext()) {
								adaptor.addChild(root_1, stream_param
										.nextTree());

							}
							stream_param.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:223:61:
							// ( block )?
							if (stream_block.hasNext()) {
								adaptor.addChild(root_1, stream_block
										.nextTree());

							}
							stream_block.reset();

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
				memoize(input, 41, catchStmt_StartIndex);
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:228:1:
	// exprListOpt : ( exprList | );
	public final TinyHaxeTry1Parser.exprListOpt_return exprListOpt()
			throws RecognitionException {
		TinyHaxeTry1Parser.exprListOpt_return retval = new TinyHaxeTry1Parser.exprListOpt_return();
		retval.start = input.LT(1);
		int exprListOpt_StartIndex = input.index();
		Object root_0 = null;

		TinyHaxeTry1Parser.exprList_return exprList182 = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 42)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:229:2:
			// ( exprList | )
			int alt40 = 2;
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
				alt40 = 1;
			}
				break;
			case RBRACKET: {
				int LA40_2 = input.LA(2);

				if ((synpred73_TinyHaxeTry1())) {
					alt40 = 1;
				} else if ((true)) {
					alt40 = 2;
				} else {
					if (state.backtracking > 0) {
						state.failed = true;
						return retval;
					}
					NoViableAltException nvae = new NoViableAltException("",
							40, 2, input);

					throw nvae;
				}
			}
				break;
			case RPAREN: {
				int LA40_3 = input.LA(2);

				if ((synpred73_TinyHaxeTry1())) {
					alt40 = 1;
				} else if ((true)) {
					alt40 = 2;
				} else {
					if (state.backtracking > 0) {
						state.failed = true;
						return retval;
					}
					NoViableAltException nvae = new NoViableAltException("",
							40, 3, input);

					throw nvae;
				}
			}
				break;
			default:
				if (state.backtracking > 0) {
					state.failed = true;
					return retval;
				}
				NoViableAltException nvae = new NoViableAltException("", 40, 0,
						input);

				throw nvae;
			}

			switch (alt40) {
			case 1:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:229:4:
				// exprList
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_exprList_in_exprListOpt2177);
				exprList182 = exprList();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, exprList182.getTree());

			}
				break;
			case 2:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:231:2:
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
				memoize(input, 42, exprListOpt_StartIndex);
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:233:1:
	// exprList : expr ( COMMA expr )* ;
	public final TinyHaxeTry1Parser.exprList_return exprList()
			throws RecognitionException {
		TinyHaxeTry1Parser.exprList_return retval = new TinyHaxeTry1Parser.exprList_return();
		retval.start = input.LT(1);
		int exprList_StartIndex = input.index();
		Object root_0 = null;

		Token COMMA184 = null;
		TinyHaxeTry1Parser.expr_return expr183 = null;

		TinyHaxeTry1Parser.expr_return expr185 = null;

		Object COMMA184_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 43)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:233:9:
			// ( expr ( COMMA expr )* )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:233:11:
			// expr ( COMMA expr )*
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_expr_in_exprList2197);
				expr183 = expr();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, expr183.getTree());
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:233:16:
				// ( COMMA expr )*
				loop41: do {
					int alt41 = 2;
					int LA41_0 = input.LA(1);

					if ((LA41_0 == COMMA)) {
						alt41 = 1;
					}

					switch (alt41) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:233:17:
						// COMMA expr
					{
						COMMA184 = (Token) match(input, COMMA,
								FOLLOW_COMMA_in_exprList2200);
						if (state.failed)
							return retval;
						pushFollow(FOLLOW_expr_in_exprList2203);
						expr185 = expr();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							adaptor.addChild(root_0, expr185.getTree());

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
				memoize(input, 43, exprList_StartIndex);
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:236:1:
	// expr : assignExpr ;
	public final TinyHaxeTry1Parser.expr_return expr()
			throws RecognitionException {
		TinyHaxeTry1Parser.expr_return retval = new TinyHaxeTry1Parser.expr_return();
		retval.start = input.LT(1);
		int expr_StartIndex = input.index();
		Object root_0 = null;

		TinyHaxeTry1Parser.assignExpr_return assignExpr186 = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 44)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:236:6:
			// ( assignExpr )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:236:8:
			// assignExpr
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_assignExpr_in_expr2216);
				assignExpr186 = assignExpr();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, assignExpr186.getTree());

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
				memoize(input, 44, expr_StartIndex);
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:239:1:
	// assignExpr : iterExpr ( assignOp iterExpr )* ;
	public final TinyHaxeTry1Parser.assignExpr_return assignExpr()
			throws RecognitionException {
		TinyHaxeTry1Parser.assignExpr_return retval = new TinyHaxeTry1Parser.assignExpr_return();
		retval.start = input.LT(1);
		int assignExpr_StartIndex = input.index();
		Object root_0 = null;

		TinyHaxeTry1Parser.iterExpr_return iterExpr187 = null;

		TinyHaxeTry1Parser.assignOp_return assignOp188 = null;

		TinyHaxeTry1Parser.iterExpr_return iterExpr189 = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 45)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:240:9:
			// ( iterExpr ( assignOp iterExpr )* )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:240:12:
			// iterExpr ( assignOp iterExpr )*
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_iterExpr_in_assignExpr2236);
				iterExpr187 = iterExpr();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, iterExpr187.getTree());
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:240:21:
				// ( assignOp iterExpr )*
				loop42: do {
					int alt42 = 2;
					int LA42_0 = input.LA(1);

					if (((LA42_0 >= EQ && LA42_0 <= AMPEQ))) {
						alt42 = 1;
					}

					switch (alt42) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:240:22:
						// assignOp iterExpr
					{
						pushFollow(FOLLOW_assignOp_in_assignExpr2239);
						assignOp188 = assignOp();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							root_0 = (Object) adaptor.becomeRoot(assignOp188
									.getTree(), root_0);
						pushFollow(FOLLOW_iterExpr_in_assignExpr2242);
						iterExpr189 = iterExpr();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							adaptor.addChild(root_0, iterExpr189.getTree());

					}
						break;

					default:
						break loop42;
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
				memoize(input, 45, assignExpr_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "assignExpr"

	public static class ternaryExpr_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "ternaryExpr"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:244:1:
	// ternaryExpr : logicOrExpr ( QUES expr COLON logicOrExpr )* ;
	public final TinyHaxeTry1Parser.ternaryExpr_return ternaryExpr()
			throws RecognitionException {
		TinyHaxeTry1Parser.ternaryExpr_return retval = new TinyHaxeTry1Parser.ternaryExpr_return();
		retval.start = input.LT(1);
		int ternaryExpr_StartIndex = input.index();
		Object root_0 = null;

		Token QUES191 = null;
		Token COLON193 = null;
		TinyHaxeTry1Parser.logicOrExpr_return logicOrExpr190 = null;

		TinyHaxeTry1Parser.expr_return expr192 = null;

		TinyHaxeTry1Parser.logicOrExpr_return logicOrExpr194 = null;

		Object QUES191_tree = null;
		Object COLON193_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 46)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:245:2:
			// ( logicOrExpr ( QUES expr COLON logicOrExpr )* )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:245:4:
			// logicOrExpr ( QUES expr COLON logicOrExpr )*
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_logicOrExpr_in_ternaryExpr2265);
				logicOrExpr190 = logicOrExpr();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, logicOrExpr190.getTree());
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:245:16:
				// ( QUES expr COLON logicOrExpr )*
				loop43: do {
					int alt43 = 2;
					int LA43_0 = input.LA(1);

					if ((LA43_0 == QUES)) {
						alt43 = 1;
					}

					switch (alt43) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:245:17:
						// QUES expr COLON logicOrExpr
					{
						QUES191 = (Token) match(input, QUES,
								FOLLOW_QUES_in_ternaryExpr2268);
						if (state.failed)
							return retval;
						if (state.backtracking == 0) {
							QUES191_tree = (Object) adaptor.create(QUES191);
							root_0 = (Object) adaptor.becomeRoot(QUES191_tree,
									root_0);
						}
						pushFollow(FOLLOW_expr_in_ternaryExpr2271);
						expr192 = expr();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							adaptor.addChild(root_0, expr192.getTree());
						COLON193 = (Token) match(input, COLON,
								FOLLOW_COLON_in_ternaryExpr2273);
						if (state.failed)
							return retval;
						pushFollow(FOLLOW_logicOrExpr_in_ternaryExpr2276);
						logicOrExpr194 = logicOrExpr();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							adaptor.addChild(root_0, logicOrExpr194.getTree());

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
				memoize(input, 46, ternaryExpr_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "ternaryExpr"

	public static class iterExpr_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "iterExpr"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:248:1:
	// iterExpr : ternaryExpr ( ELLIPSIS ternaryExpr )* ;
	public final TinyHaxeTry1Parser.iterExpr_return iterExpr()
			throws RecognitionException {
		TinyHaxeTry1Parser.iterExpr_return retval = new TinyHaxeTry1Parser.iterExpr_return();
		retval.start = input.LT(1);
		int iterExpr_StartIndex = input.index();
		Object root_0 = null;

		Token ELLIPSIS196 = null;
		TinyHaxeTry1Parser.ternaryExpr_return ternaryExpr195 = null;

		TinyHaxeTry1Parser.ternaryExpr_return ternaryExpr197 = null;

		Object ELLIPSIS196_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 47)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:248:9:
			// ( ternaryExpr ( ELLIPSIS ternaryExpr )* )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:248:11:
			// ternaryExpr ( ELLIPSIS ternaryExpr )*
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_ternaryExpr_in_iterExpr2288);
				ternaryExpr195 = ternaryExpr();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, ternaryExpr195.getTree());
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:248:23:
				// ( ELLIPSIS ternaryExpr )*
				loop44: do {
					int alt44 = 2;
					int LA44_0 = input.LA(1);

					if ((LA44_0 == ELLIPSIS)) {
						alt44 = 1;
					}

					switch (alt44) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:248:24:
						// ELLIPSIS ternaryExpr
					{
						ELLIPSIS196 = (Token) match(input, ELLIPSIS,
								FOLLOW_ELLIPSIS_in_iterExpr2291);
						if (state.failed)
							return retval;
						if (state.backtracking == 0) {
							ELLIPSIS196_tree = (Object) adaptor
									.create(ELLIPSIS196);
							root_0 = (Object) adaptor.becomeRoot(
									ELLIPSIS196_tree, root_0);
						}
						pushFollow(FOLLOW_ternaryExpr_in_iterExpr2294);
						ternaryExpr197 = ternaryExpr();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							adaptor.addChild(root_0, ternaryExpr197.getTree());

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
				memoize(input, 47, iterExpr_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "iterExpr"

	public static class logicOrExpr_return extends ParserRuleReturnScope {
		Object tree;

		@Override
		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "logicOrExpr"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:251:1:
	// logicOrExpr : ( logicAndExpr ) ( BARBAR logicAndExpr )* ;
	public final TinyHaxeTry1Parser.logicOrExpr_return logicOrExpr()
			throws RecognitionException {
		TinyHaxeTry1Parser.logicOrExpr_return retval = new TinyHaxeTry1Parser.logicOrExpr_return();
		retval.start = input.LT(1);
		int logicOrExpr_StartIndex = input.index();
		Object root_0 = null;

		Token BARBAR199 = null;
		TinyHaxeTry1Parser.logicAndExpr_return logicAndExpr198 = null;

		TinyHaxeTry1Parser.logicAndExpr_return logicAndExpr200 = null;

		Object BARBAR199_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 48)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:252:2:
			// ( ( logicAndExpr ) ( BARBAR logicAndExpr )* )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:252:4:
			// ( logicAndExpr ) ( BARBAR logicAndExpr )*
			{
				root_0 = (Object) adaptor.nil();

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:252:4:
				// ( logicAndExpr )
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:252:5:
				// logicAndExpr
				{
					pushFollow(FOLLOW_logicAndExpr_in_logicOrExpr2323);
					logicAndExpr198 = logicAndExpr();

					state._fsp--;
					if (state.failed)
						return retval;
					if (state.backtracking == 0)
						adaptor.addChild(root_0, logicAndExpr198.getTree());

				}

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:252:19:
				// ( BARBAR logicAndExpr )*
				loop45: do {
					int alt45 = 2;
					int LA45_0 = input.LA(1);

					if ((LA45_0 == BARBAR)) {
						alt45 = 1;
					}

					switch (alt45) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:252:20:
						// BARBAR logicAndExpr
					{
						BARBAR199 = (Token) match(input, BARBAR,
								FOLLOW_BARBAR_in_logicOrExpr2327);
						if (state.failed)
							return retval;
						if (state.backtracking == 0) {
							BARBAR199_tree = (Object) adaptor.create(BARBAR199);
							root_0 = (Object) adaptor.becomeRoot(
									BARBAR199_tree, root_0);
						}
						pushFollow(FOLLOW_logicAndExpr_in_logicOrExpr2330);
						logicAndExpr200 = logicAndExpr();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							adaptor.addChild(root_0, logicAndExpr200.getTree());

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
				memoize(input, 48, logicOrExpr_StartIndex);
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:255:1:
	// logicAndExpr : ( cmpExpr ) ( AMPAMP cmpExpr )* ;
	public final TinyHaxeTry1Parser.logicAndExpr_return logicAndExpr()
			throws RecognitionException {
		TinyHaxeTry1Parser.logicAndExpr_return retval = new TinyHaxeTry1Parser.logicAndExpr_return();
		retval.start = input.LT(1);
		int logicAndExpr_StartIndex = input.index();
		Object root_0 = null;

		Token AMPAMP202 = null;
		TinyHaxeTry1Parser.cmpExpr_return cmpExpr201 = null;

		TinyHaxeTry1Parser.cmpExpr_return cmpExpr203 = null;

		Object AMPAMP202_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 49)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:256:2:
			// ( ( cmpExpr ) ( AMPAMP cmpExpr )* )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:256:4:
			// ( cmpExpr ) ( AMPAMP cmpExpr )*
			{
				root_0 = (Object) adaptor.nil();

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:256:4:
				// ( cmpExpr )
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:256:5:
				// cmpExpr
				{
					pushFollow(FOLLOW_cmpExpr_in_logicAndExpr2351);
					cmpExpr201 = cmpExpr();

					state._fsp--;
					if (state.failed)
						return retval;
					if (state.backtracking == 0)
						adaptor.addChild(root_0, cmpExpr201.getTree());

				}

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:256:14:
				// ( AMPAMP cmpExpr )*
				loop46: do {
					int alt46 = 2;
					int LA46_0 = input.LA(1);

					if ((LA46_0 == AMPAMP)) {
						alt46 = 1;
					}

					switch (alt46) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:256:15:
						// AMPAMP cmpExpr
					{
						AMPAMP202 = (Token) match(input, AMPAMP,
								FOLLOW_AMPAMP_in_logicAndExpr2355);
						if (state.failed)
							return retval;
						if (state.backtracking == 0) {
							AMPAMP202_tree = (Object) adaptor.create(AMPAMP202);
							root_0 = (Object) adaptor.becomeRoot(
									AMPAMP202_tree, root_0);
						}
						pushFollow(FOLLOW_cmpExpr_in_logicAndExpr2358);
						cmpExpr203 = cmpExpr();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							adaptor.addChild(root_0, cmpExpr203.getTree());

					}
						break;

					default:
						break loop46;
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
				memoize(input, 49, logicAndExpr_StartIndex);
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:259:1:
	// cmpExpr : ( bitExpr ) ( ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr
	// )* ;
	public final TinyHaxeTry1Parser.cmpExpr_return cmpExpr()
			throws RecognitionException {
		TinyHaxeTry1Parser.cmpExpr_return retval = new TinyHaxeTry1Parser.cmpExpr_return();
		retval.start = input.LT(1);
		int cmpExpr_StartIndex = input.index();
		Object root_0 = null;

		Token EQEQ205 = null;
		Token BANGEQ206 = null;
		Token GTEQ207 = null;
		Token LTEQ208 = null;
		Token GT209 = null;
		Token LT210 = null;
		TinyHaxeTry1Parser.bitExpr_return bitExpr204 = null;

		TinyHaxeTry1Parser.bitExpr_return bitExpr211 = null;

		Object EQEQ205_tree = null;
		Object BANGEQ206_tree = null;
		Object GTEQ207_tree = null;
		Object LTEQ208_tree = null;
		Object GT209_tree = null;
		Object LT210_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 50)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:259:9:
			// ( ( bitExpr ) ( ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr
			// )* )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:259:11:
			// ( bitExpr ) ( ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr
			// )*
			{
				root_0 = (Object) adaptor.nil();

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:259:11:
				// ( bitExpr )
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:259:12:
				// bitExpr
				{
					pushFollow(FOLLOW_bitExpr_in_cmpExpr2372);
					bitExpr204 = bitExpr();

					state._fsp--;
					if (state.failed)
						return retval;
					if (state.backtracking == 0)
						adaptor.addChild(root_0, bitExpr204.getTree());

				}

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:259:21:
				// ( ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr )*
				loop48: do {
					int alt48 = 2;
					int LA48_0 = input.LA(1);

					if (((LA48_0 >= LT && LA48_0 <= GT) || (LA48_0 >= EQEQ && LA48_0 <= LTEQ))) {
						alt48 = 1;
					}

					switch (alt48) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:259:22:
						// ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT ) bitExpr
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:259:22:
						// ( EQEQ | BANGEQ | GTEQ | LTEQ | GT | LT )
						int alt47 = 6;
						switch (input.LA(1)) {
						case EQEQ: {
							alt47 = 1;
						}
							break;
						case BANGEQ: {
							alt47 = 2;
						}
							break;
						case GTEQ: {
							alt47 = 3;
						}
							break;
						case LTEQ: {
							alt47 = 4;
						}
							break;
						case GT: {
							alt47 = 5;
						}
							break;
						case LT: {
							alt47 = 6;
						}
							break;
						default:
							if (state.backtracking > 0) {
								state.failed = true;
								return retval;
							}
							NoViableAltException nvae = new NoViableAltException(
									"", 47, 0, input);

							throw nvae;
						}

						switch (alt47) {
						case 1:
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:259:23:
							// EQEQ
						{
							EQEQ205 = (Token) match(input, EQEQ,
									FOLLOW_EQEQ_in_cmpExpr2377);
							if (state.failed)
								return retval;
							if (state.backtracking == 0) {
								EQEQ205_tree = (Object) adaptor.create(EQEQ205);
								root_0 = (Object) adaptor.becomeRoot(
										EQEQ205_tree, root_0);
							}

						}
							break;
						case 2:
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:259:30:
							// BANGEQ
						{
							BANGEQ206 = (Token) match(input, BANGEQ,
									FOLLOW_BANGEQ_in_cmpExpr2381);
							if (state.failed)
								return retval;
							if (state.backtracking == 0) {
								BANGEQ206_tree = (Object) adaptor
										.create(BANGEQ206);
								root_0 = (Object) adaptor.becomeRoot(
										BANGEQ206_tree, root_0);
							}

						}
							break;
						case 3:
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:259:40:
							// GTEQ
						{
							GTEQ207 = (Token) match(input, GTEQ,
									FOLLOW_GTEQ_in_cmpExpr2386);
							if (state.failed)
								return retval;
							if (state.backtracking == 0) {
								GTEQ207_tree = (Object) adaptor.create(GTEQ207);
								root_0 = (Object) adaptor.becomeRoot(
										GTEQ207_tree, root_0);
							}

						}
							break;
						case 4:
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:259:48:
							// LTEQ
						{
							LTEQ208 = (Token) match(input, LTEQ,
									FOLLOW_LTEQ_in_cmpExpr2391);
							if (state.failed)
								return retval;
							if (state.backtracking == 0) {
								LTEQ208_tree = (Object) adaptor.create(LTEQ208);
								root_0 = (Object) adaptor.becomeRoot(
										LTEQ208_tree, root_0);
							}

						}
							break;
						case 5:
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:259:56:
							// GT
						{
							GT209 = (Token) match(input, GT,
									FOLLOW_GT_in_cmpExpr2396);
							if (state.failed)
								return retval;
							if (state.backtracking == 0) {
								GT209_tree = (Object) adaptor.create(GT209);
								root_0 = (Object) adaptor.becomeRoot(
										GT209_tree, root_0);
							}

						}
							break;
						case 6:
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:259:62:
							// LT
						{
							LT210 = (Token) match(input, LT,
									FOLLOW_LT_in_cmpExpr2401);
							if (state.failed)
								return retval;
							if (state.backtracking == 0) {
								LT210_tree = (Object) adaptor.create(LT210);
								root_0 = (Object) adaptor.becomeRoot(
										LT210_tree, root_0);
							}

						}
							break;

						}

						pushFollow(FOLLOW_bitExpr_in_cmpExpr2406);
						bitExpr211 = bitExpr();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							adaptor.addChild(root_0, bitExpr211.getTree());

					}
						break;

					default:
						break loop48;
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
				memoize(input, 50, cmpExpr_StartIndex);
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:262:1:
	// bitExpr : ( shiftExpr ) ( BAR shiftExpr | AMP shiftExpr | CARET shiftExpr
	// )* ;
	public final TinyHaxeTry1Parser.bitExpr_return bitExpr()
			throws RecognitionException {
		TinyHaxeTry1Parser.bitExpr_return retval = new TinyHaxeTry1Parser.bitExpr_return();
		retval.start = input.LT(1);
		int bitExpr_StartIndex = input.index();
		Object root_0 = null;

		Token BAR213 = null;
		Token AMP215 = null;
		Token CARET217 = null;
		TinyHaxeTry1Parser.shiftExpr_return shiftExpr212 = null;

		TinyHaxeTry1Parser.shiftExpr_return shiftExpr214 = null;

		TinyHaxeTry1Parser.shiftExpr_return shiftExpr216 = null;

		TinyHaxeTry1Parser.shiftExpr_return shiftExpr218 = null;

		Object BAR213_tree = null;
		Object AMP215_tree = null;
		Object CARET217_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 51)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:262:9:
			// ( ( shiftExpr ) ( BAR shiftExpr | AMP shiftExpr | CARET shiftExpr
			// )* )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:262:11:
			// ( shiftExpr ) ( BAR shiftExpr | AMP shiftExpr | CARET shiftExpr
			// )*
			{
				root_0 = (Object) adaptor.nil();

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:262:11:
				// ( shiftExpr )
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:262:12:
				// shiftExpr
				{
					pushFollow(FOLLOW_shiftExpr_in_bitExpr2420);
					shiftExpr212 = shiftExpr();

					state._fsp--;
					if (state.failed)
						return retval;
					if (state.backtracking == 0)
						adaptor.addChild(root_0, shiftExpr212.getTree());

				}

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:262:23:
				// ( BAR shiftExpr | AMP shiftExpr | CARET shiftExpr )*
				loop49: do {
					int alt49 = 4;
					switch (input.LA(1)) {
					case BAR: {
						alt49 = 1;
					}
						break;
					case AMP: {
						alt49 = 2;
					}
						break;
					case CARET: {
						alt49 = 3;
					}
						break;

					}

					switch (alt49) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:262:24:
						// BAR shiftExpr
					{
						BAR213 = (Token) match(input, BAR,
								FOLLOW_BAR_in_bitExpr2424);
						if (state.failed)
							return retval;
						if (state.backtracking == 0) {
							BAR213_tree = (Object) adaptor.create(BAR213);
							root_0 = (Object) adaptor.becomeRoot(BAR213_tree,
									root_0);
						}
						pushFollow(FOLLOW_shiftExpr_in_bitExpr2427);
						shiftExpr214 = shiftExpr();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							adaptor.addChild(root_0, shiftExpr214.getTree());

					}
						break;
					case 2:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:262:41:
						// AMP shiftExpr
					{
						AMP215 = (Token) match(input, AMP,
								FOLLOW_AMP_in_bitExpr2431);
						if (state.failed)
							return retval;
						if (state.backtracking == 0) {
							AMP215_tree = (Object) adaptor.create(AMP215);
							root_0 = (Object) adaptor.becomeRoot(AMP215_tree,
									root_0);
						}
						pushFollow(FOLLOW_shiftExpr_in_bitExpr2434);
						shiftExpr216 = shiftExpr();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							adaptor.addChild(root_0, shiftExpr216.getTree());

					}
						break;
					case 3:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:262:57:
						// CARET shiftExpr
					{
						CARET217 = (Token) match(input, CARET,
								FOLLOW_CARET_in_bitExpr2437);
						if (state.failed)
							return retval;
						if (state.backtracking == 0) {
							CARET217_tree = (Object) adaptor.create(CARET217);
							root_0 = (Object) adaptor.becomeRoot(CARET217_tree,
									root_0);
						}
						pushFollow(FOLLOW_shiftExpr_in_bitExpr2440);
						shiftExpr218 = shiftExpr();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							adaptor.addChild(root_0, shiftExpr218.getTree());

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
				memoize(input, 51, bitExpr_StartIndex);
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:265:1:
	// shiftExpr : ( addExpr ) ( LTLT addExpr | ( GT GT ) addExpr | GTGTGT
	// addExpr )* ;
	public final TinyHaxeTry1Parser.shiftExpr_return shiftExpr()
			throws RecognitionException {
		TinyHaxeTry1Parser.shiftExpr_return retval = new TinyHaxeTry1Parser.shiftExpr_return();
		retval.start = input.LT(1);
		int shiftExpr_StartIndex = input.index();
		Object root_0 = null;

		Token LTLT220 = null;
		Token GT222 = null;
		Token GT223 = null;
		Token GTGTGT225 = null;
		TinyHaxeTry1Parser.addExpr_return addExpr219 = null;

		TinyHaxeTry1Parser.addExpr_return addExpr221 = null;

		TinyHaxeTry1Parser.addExpr_return addExpr224 = null;

		TinyHaxeTry1Parser.addExpr_return addExpr226 = null;

		Object LTLT220_tree = null;
		Object GT222_tree = null;
		Object GT223_tree = null;
		Object GTGTGT225_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 52)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:266:2:
			// ( ( addExpr ) ( LTLT addExpr | ( GT GT ) addExpr | GTGTGT addExpr
			// )* )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:266:4:
			// ( addExpr ) ( LTLT addExpr | ( GT GT ) addExpr | GTGTGT addExpr
			// )*
			{
				root_0 = (Object) adaptor.nil();

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:266:4:
				// ( addExpr )
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:266:5:
				// addExpr
				{
					pushFollow(FOLLOW_addExpr_in_shiftExpr2454);
					addExpr219 = addExpr();

					state._fsp--;
					if (state.failed)
						return retval;
					if (state.backtracking == 0)
						adaptor.addChild(root_0, addExpr219.getTree());

				}

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:266:14:
				// ( LTLT addExpr | ( GT GT ) addExpr | GTGTGT addExpr )*
				loop50: do {
					int alt50 = 4;
					switch (input.LA(1)) {
					case GT: {
						int LA50_2 = input.LA(2);

						if ((LA50_2 == GT)) {
							int LA50_5 = input.LA(3);

							if ((synpred90_TinyHaxeTry1())) {
								alt50 = 2;
							}

						}

					}
						break;
					case LTLT: {
						alt50 = 1;
					}
						break;
					case GTGTGT: {
						alt50 = 3;
					}
						break;

					}

					switch (alt50) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:266:15:
						// LTLT addExpr
					{
						LTLT220 = (Token) match(input, LTLT,
								FOLLOW_LTLT_in_shiftExpr2458);
						if (state.failed)
							return retval;
						if (state.backtracking == 0) {
							LTLT220_tree = (Object) adaptor.create(LTLT220);
							root_0 = (Object) adaptor.becomeRoot(LTLT220_tree,
									root_0);
						}
						pushFollow(FOLLOW_addExpr_in_shiftExpr2462);
						addExpr221 = addExpr();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							adaptor.addChild(root_0, addExpr221.getTree());

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
							GT222 = (Token) match(input, GT,
									FOLLOW_GT_in_shiftExpr2467);
							if (state.failed)
								return retval;
							if (state.backtracking == 0) {
								GT222_tree = (Object) adaptor.create(GT222);
								adaptor.addChild(root_0, GT222_tree);
							}
							GT223 = (Token) match(input, GT,
									FOLLOW_GT_in_shiftExpr2469);
							if (state.failed)
								return retval;
							if (state.backtracking == 0) {
								GT223_tree = (Object) adaptor.create(GT223);
								adaptor.addChild(root_0, GT223_tree);
							}

						}

						pushFollow(FOLLOW_addExpr_in_shiftExpr2474);
						addExpr224 = addExpr();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							adaptor.addChild(root_0, addExpr224.getTree());

					}
						break;
					case 3:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:266:52:
						// GTGTGT addExpr
					{
						GTGTGT225 = (Token) match(input, GTGTGT,
								FOLLOW_GTGTGT_in_shiftExpr2478);
						if (state.failed)
							return retval;
						if (state.backtracking == 0) {
							GTGTGT225_tree = (Object) adaptor.create(GTGTGT225);
							root_0 = (Object) adaptor.becomeRoot(
									GTGTGT225_tree, root_0);
						}
						pushFollow(FOLLOW_addExpr_in_shiftExpr2481);
						addExpr226 = addExpr();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							adaptor.addChild(root_0, addExpr226.getTree());

					}
						break;

					default:
						break loop50;
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
				memoize(input, 52, shiftExpr_StartIndex);
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:269:1:
	// addExpr : ( multExpr ) ( ( PLUS | SUB ) multExpr )* ;
	public final TinyHaxeTry1Parser.addExpr_return addExpr()
			throws RecognitionException {
		TinyHaxeTry1Parser.addExpr_return retval = new TinyHaxeTry1Parser.addExpr_return();
		retval.start = input.LT(1);
		int addExpr_StartIndex = input.index();
		Object root_0 = null;

		Token PLUS228 = null;
		Token SUB229 = null;
		TinyHaxeTry1Parser.multExpr_return multExpr227 = null;

		TinyHaxeTry1Parser.multExpr_return multExpr230 = null;

		Object PLUS228_tree = null;
		Object SUB229_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 53)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:269:9:
			// ( ( multExpr ) ( ( PLUS | SUB ) multExpr )* )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:269:12:
			// ( multExpr ) ( ( PLUS | SUB ) multExpr )*
			{
				root_0 = (Object) adaptor.nil();

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:269:12:
				// ( multExpr )
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:269:13:
				// multExpr
				{
					pushFollow(FOLLOW_multExpr_in_addExpr2495);
					multExpr227 = multExpr();

					state._fsp--;
					if (state.failed)
						return retval;
					if (state.backtracking == 0)
						adaptor.addChild(root_0, multExpr227.getTree());

				}

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:269:23:
				// ( ( PLUS | SUB ) multExpr )*
				loop52: do {
					int alt52 = 2;
					int LA52_0 = input.LA(1);

					if (((LA52_0 >= PLUS && LA52_0 <= SUB))) {
						alt52 = 1;
					}

					switch (alt52) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:269:24:
						// ( PLUS | SUB ) multExpr
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:269:24:
						// ( PLUS | SUB )
						int alt51 = 2;
						int LA51_0 = input.LA(1);

						if ((LA51_0 == PLUS)) {
							alt51 = 1;
						} else if ((LA51_0 == SUB)) {
							alt51 = 2;
						} else {
							if (state.backtracking > 0) {
								state.failed = true;
								return retval;
							}
							NoViableAltException nvae = new NoViableAltException(
									"", 51, 0, input);

							throw nvae;
						}
						switch (alt51) {
						case 1:
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:269:25:
							// PLUS
						{
							PLUS228 = (Token) match(input, PLUS,
									FOLLOW_PLUS_in_addExpr2500);
							if (state.failed)
								return retval;
							if (state.backtracking == 0) {
								PLUS228_tree = (Object) adaptor.create(PLUS228);
								root_0 = (Object) adaptor.becomeRoot(
										PLUS228_tree, root_0);
							}

						}
							break;
						case 2:
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:269:33:
							// SUB
						{
							SUB229 = (Token) match(input, SUB,
									FOLLOW_SUB_in_addExpr2505);
							if (state.failed)
								return retval;
							if (state.backtracking == 0) {
								SUB229_tree = (Object) adaptor.create(SUB229);
								root_0 = (Object) adaptor.becomeRoot(
										SUB229_tree, root_0);
							}

						}
							break;

						}

						pushFollow(FOLLOW_multExpr_in_addExpr2509);
						multExpr230 = multExpr();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							adaptor.addChild(root_0, multExpr230.getTree());

					}
						break;

					default:
						break loop52;
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
				memoize(input, 53, addExpr_StartIndex);
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:272:1:
	// multExpr : ( prefixExpr ) ( ( STAR | SLASH | PERCENT ) prefixExpr )* ;
	public final TinyHaxeTry1Parser.multExpr_return multExpr()
			throws RecognitionException {
		TinyHaxeTry1Parser.multExpr_return retval = new TinyHaxeTry1Parser.multExpr_return();
		retval.start = input.LT(1);
		int multExpr_StartIndex = input.index();
		Object root_0 = null;

		Token STAR232 = null;
		Token SLASH233 = null;
		Token PERCENT234 = null;
		TinyHaxeTry1Parser.prefixExpr_return prefixExpr231 = null;

		TinyHaxeTry1Parser.prefixExpr_return prefixExpr235 = null;

		Object STAR232_tree = null;
		Object SLASH233_tree = null;
		Object PERCENT234_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 54)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:272:9:
			// ( ( prefixExpr ) ( ( STAR | SLASH | PERCENT ) prefixExpr )* )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:272:11:
			// ( prefixExpr ) ( ( STAR | SLASH | PERCENT ) prefixExpr )*
			{
				root_0 = (Object) adaptor.nil();

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:272:11:
				// ( prefixExpr )
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:272:12:
				// prefixExpr
				{
					pushFollow(FOLLOW_prefixExpr_in_multExpr2523);
					prefixExpr231 = prefixExpr();

					state._fsp--;
					if (state.failed)
						return retval;
					if (state.backtracking == 0)
						adaptor.addChild(root_0, prefixExpr231.getTree());

				}

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:272:24:
				// ( ( STAR | SLASH | PERCENT ) prefixExpr )*
				loop54: do {
					int alt54 = 2;
					int LA54_0 = input.LA(1);

					if (((LA54_0 >= STAR && LA54_0 <= PERCENT))) {
						alt54 = 1;
					}

					switch (alt54) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:272:25:
						// ( STAR | SLASH | PERCENT ) prefixExpr
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:272:25:
						// ( STAR | SLASH | PERCENT )
						int alt53 = 3;
						switch (input.LA(1)) {
						case STAR: {
							alt53 = 1;
						}
							break;
						case SLASH: {
							alt53 = 2;
						}
							break;
						case PERCENT: {
							alt53 = 3;
						}
							break;
						default:
							if (state.backtracking > 0) {
								state.failed = true;
								return retval;
							}
							NoViableAltException nvae = new NoViableAltException(
									"", 53, 0, input);

							throw nvae;
						}

						switch (alt53) {
						case 1:
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:272:26:
							// STAR
						{
							STAR232 = (Token) match(input, STAR,
									FOLLOW_STAR_in_multExpr2528);
							if (state.failed)
								return retval;
							if (state.backtracking == 0) {
								STAR232_tree = (Object) adaptor.create(STAR232);
								root_0 = (Object) adaptor.becomeRoot(
										STAR232_tree, root_0);
							}

						}
							break;
						case 2:
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:272:32:
							// SLASH
						{
							SLASH233 = (Token) match(input, SLASH,
									FOLLOW_SLASH_in_multExpr2531);
							if (state.failed)
								return retval;
							if (state.backtracking == 0) {
								SLASH233_tree = (Object) adaptor
										.create(SLASH233);
								root_0 = (Object) adaptor.becomeRoot(
										SLASH233_tree, root_0);
							}

						}
							break;
						case 3:
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:272:39:
							// PERCENT
						{
							PERCENT234 = (Token) match(input, PERCENT,
									FOLLOW_PERCENT_in_multExpr2534);
							if (state.failed)
								return retval;
							if (state.backtracking == 0) {
								PERCENT234_tree = (Object) adaptor
										.create(PERCENT234);
								root_0 = (Object) adaptor.becomeRoot(
										PERCENT234_tree, root_0);
							}

						}
							break;

						}

						pushFollow(FOLLOW_prefixExpr_in_multExpr2538);
						prefixExpr235 = prefixExpr();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							adaptor.addChild(root_0, prefixExpr235.getTree());

					}
						break;

					default:
						break loop54;
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
				memoize(input, 54, multExpr_StartIndex);
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:275:1:
	// prefixExpr : ( ( SUB | SUBSUB | PLUSPLUS | BANG | TILDE ) prefixExpr |
	// newExpr | cast | suffixExpr );
	public final TinyHaxeTry1Parser.prefixExpr_return prefixExpr()
			throws RecognitionException {
		TinyHaxeTry1Parser.prefixExpr_return retval = new TinyHaxeTry1Parser.prefixExpr_return();
		retval.start = input.LT(1);
		int prefixExpr_StartIndex = input.index();
		Object root_0 = null;

		Token set236 = null;
		TinyHaxeTry1Parser.prefixExpr_return prefixExpr237 = null;

		TinyHaxeTry1Parser.newExpr_return newExpr238 = null;

		TinyHaxeTry1Parser.cast_return cast239 = null;

		TinyHaxeTry1Parser.suffixExpr_return suffixExpr240 = null;

		Object set236_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 55)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:276:9:
			// ( ( SUB | SUBSUB | PLUSPLUS | BANG | TILDE ) prefixExpr | newExpr
			// | cast | suffixExpr )
			int alt55 = 4;
			switch (input.LA(1)) {
			case PLUSPLUS: {
				int LA55_1 = input.LA(2);

				if ((synpred101_TinyHaxeTry1())) {
					alt55 = 1;
				} else if ((true)) {
					alt55 = 4;
				} else {
					if (state.backtracking > 0) {
						state.failed = true;
						return retval;
					}
					NoViableAltException nvae = new NoViableAltException("",
							55, 1, input);

					throw nvae;
				}
			}
				break;
			case NEW: {
				alt55 = 2;
			}
				break;
			case CAST: {
				alt55 = 3;
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
				alt55 = 4;
			}
				break;
			case SUBSUB: {
				int LA55_5 = input.LA(2);

				if ((synpred101_TinyHaxeTry1())) {
					alt55 = 1;
				} else if ((true)) {
					alt55 = 4;
				} else {
					if (state.backtracking > 0) {
						state.failed = true;
						return retval;
					}
					NoViableAltException nvae = new NoViableAltException("",
							55, 5, input);

					throw nvae;
				}
			}
				break;
			case SUB: {
				int LA55_6 = input.LA(2);

				if ((synpred101_TinyHaxeTry1())) {
					alt55 = 1;
				} else if ((true)) {
					alt55 = 4;
				} else {
					if (state.backtracking > 0) {
						state.failed = true;
						return retval;
					}
					NoViableAltException nvae = new NoViableAltException("",
							55, 6, input);

					throw nvae;
				}
			}
				break;
			case BANG:
			case TILDE: {
				alt55 = 1;
			}
				break;
			default:
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
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:276:11:
				// ( SUB | SUBSUB | PLUSPLUS | BANG | TILDE ) prefixExpr
			{
				root_0 = (Object) adaptor.nil();

				set236 = (Token) input.LT(1);
				if (input.LA(1) == BANG || input.LA(1) == SUB
						|| (input.LA(1) >= SUBSUB && input.LA(1) <= TILDE)) {
					input.consume();
					if (state.backtracking == 0)
						adaptor.addChild(root_0, (Object) adaptor
								.create(set236));
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

				pushFollow(FOLLOW_prefixExpr_in_prefixExpr2571);
				prefixExpr237 = prefixExpr();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, prefixExpr237.getTree());

			}
				break;
			case 2:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:277:11:
				// newExpr
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_newExpr_in_prefixExpr2583);
				newExpr238 = newExpr();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, newExpr238.getTree());

			}
				break;
			case 3:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:278:11:
				// cast
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_cast_in_prefixExpr2595);
				cast239 = cast();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, cast239.getTree());

			}
				break;
			case 4:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:279:11:
				// suffixExpr
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_suffixExpr_in_prefixExpr2607);
				suffixExpr240 = suffixExpr();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, suffixExpr240.getTree());

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
				memoize(input, 55, prefixExpr_StartIndex);
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:282:1:
	// suffixExpr : ( value LPAREN exprListOpt RPAREN -> ^(
	// SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( exprListOpt )? ) | value
	// LBRACKET expr RBRACKET | value PLUSPLUS -> ^(
	// SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( PLUSPLUS )? ) | value
	// SUBSUB -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? SUBSUB ) |
	// value typeParamOpt );
	public final TinyHaxeTry1Parser.suffixExpr_return suffixExpr()
			throws RecognitionException {
		TinyHaxeTry1Parser.suffixExpr_return retval = new TinyHaxeTry1Parser.suffixExpr_return();
		retval.start = input.LT(1);
		int suffixExpr_StartIndex = input.index();
		Object root_0 = null;

		Token LPAREN242 = null;
		Token RPAREN244 = null;
		Token LBRACKET246 = null;
		Token RBRACKET248 = null;
		Token PLUSPLUS250 = null;
		Token SUBSUB252 = null;
		TinyHaxeTry1Parser.value_return value241 = null;

		TinyHaxeTry1Parser.exprListOpt_return exprListOpt243 = null;

		TinyHaxeTry1Parser.value_return value245 = null;

		TinyHaxeTry1Parser.expr_return expr247 = null;

		TinyHaxeTry1Parser.value_return value249 = null;

		TinyHaxeTry1Parser.value_return value251 = null;

		TinyHaxeTry1Parser.value_return value253 = null;

		TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt254 = null;

		Object LPAREN242_tree = null;
		Object RPAREN244_tree = null;
		Object LBRACKET246_tree = null;
		Object RBRACKET248_tree = null;
		Object PLUSPLUS250_tree = null;
		Object SUBSUB252_tree = null;
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
			if (state.backtracking > 0 && alreadyParsedRule(input, 56)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:283:2:
			// ( value LPAREN exprListOpt RPAREN -> ^(
			// SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( exprListOpt )? ) |
			// value LBRACKET expr RBRACKET | value PLUSPLUS -> ^(
			// SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( PLUSPLUS )? ) |
			// value SUBSUB -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )?
			// SUBSUB ) | value typeParamOpt )
			int alt56 = 5;
			alt56 = dfa56.predict(input);
			switch (alt56) {
			case 1:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:283:4:
				// value LPAREN exprListOpt RPAREN
			{
				pushFollow(FOLLOW_value_in_suffixExpr2626);
				value241 = value();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_value.add(value241.getTree());
				LPAREN242 = (Token) match(input, LPAREN,
						FOLLOW_LPAREN_in_suffixExpr2628);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_LPAREN.add(LPAREN242);

				pushFollow(FOLLOW_exprListOpt_in_suffixExpr2630);
				exprListOpt243 = exprListOpt();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_exprListOpt.add(exprListOpt243.getTree());
				RPAREN244 = (Token) match(input, RPAREN,
						FOLLOW_RPAREN_in_suffixExpr2632);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_RPAREN.add(RPAREN244);

				// AST REWRITE
				// elements: value, exprListOpt
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
					// 283:36: -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value
					// )? ( exprListOpt )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:283:39:
						// ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? (
						// exprListOpt )? )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(
									new ExtendedCommonTree(SUFFIX_EXPR,
											"SUFFIX_EXPR", true), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:283:93:
							// ( value )?
							if (stream_value.hasNext()) {
								adaptor.addChild(root_1, stream_value
										.nextTree());

							}
							stream_value.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:283:100:
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
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:284:4:
				// value LBRACKET expr RBRACKET
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_value_in_suffixExpr2653);
				value245 = value();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, value245.getTree());
				LBRACKET246 = (Token) match(input, LBRACKET,
						FOLLOW_LBRACKET_in_suffixExpr2655);
				if (state.failed)
					return retval;
				if (state.backtracking == 0) {
					LBRACKET246_tree = (Object) adaptor.create(LBRACKET246);
					adaptor.addChild(root_0, LBRACKET246_tree);
				}
				pushFollow(FOLLOW_expr_in_suffixExpr2657);
				expr247 = expr();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, expr247.getTree());
				RBRACKET248 = (Token) match(input, RBRACKET,
						FOLLOW_RBRACKET_in_suffixExpr2659);
				if (state.failed)
					return retval;
				if (state.backtracking == 0) {
					RBRACKET248_tree = (Object) adaptor.create(RBRACKET248);
					adaptor.addChild(root_0, RBRACKET248_tree);
				}

			}
				break;
			case 3:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:285:4:
				// value PLUSPLUS
			{
				pushFollow(FOLLOW_value_in_suffixExpr2664);
				value249 = value();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_value.add(value249.getTree());
				PLUSPLUS250 = (Token) match(input, PLUSPLUS,
						FOLLOW_PLUSPLUS_in_suffixExpr2666);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_PLUSPLUS.add(PLUSPLUS250);

				// AST REWRITE
				// elements: value, PLUSPLUS
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
					// 285:22: -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value
					// )? ( PLUSPLUS )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:285:25:
						// ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? (
						// PLUSPLUS )? )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(
									new ExtendedCommonTree(SUFFIX_EXPR,
											"SUFFIX_EXPR", true), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:285:79:
							// ( value )?
							if (stream_value.hasNext()) {
								adaptor.addChild(root_1, stream_value
										.nextTree());

							}
							stream_value.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:285:86:
							// ( PLUSPLUS )?
							if (stream_PLUSPLUS.hasNext()) {
								adaptor.addChild(root_1, stream_PLUSPLUS
										.nextNode());

							}
							stream_PLUSPLUS.reset();

							adaptor.addChild(root_0, root_1);
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
				pushFollow(FOLLOW_value_in_suffixExpr2690);
				value251 = value();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_value.add(value251.getTree());
				SUBSUB252 = (Token) match(input, SUBSUB,
						FOLLOW_SUBSUB_in_suffixExpr2692);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_SUBSUB.add(SUBSUB252);

				// AST REWRITE
				// elements: SUBSUB, value
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
					// 286:20: -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value
					// )? SUBSUB )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:286:23:
						// ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )?
						// SUBSUB )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(
									new ExtendedCommonTree(SUFFIX_EXPR,
											"SUFFIX_EXPR", true), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:286:77:
							// ( value )?
							if (stream_value.hasNext()) {
								adaptor.addChild(root_1, stream_value
										.nextTree());

							}
							stream_value.reset();
							adaptor.addChild(root_1, stream_SUBSUB.nextNode());

							adaptor.addChild(root_0, root_1);
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
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_value_in_suffixExpr2715);
				value253 = value();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, value253.getTree());
				pushFollow(FOLLOW_typeParamOpt_in_suffixExpr2717);
				typeParamOpt254 = typeParamOpt();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, typeParamOpt254.getTree());

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
				memoize(input, 56, suffixExpr_StartIndex);
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:290:1:
	// value : ( funcLit | arrayLit | objLit | NULL | elementarySymbol | LPAREN
	// ( expr | statement ) RPAREN | dotIdent | );
	public final TinyHaxeTry1Parser.value_return value()
			throws RecognitionException {
		TinyHaxeTry1Parser.value_return retval = new TinyHaxeTry1Parser.value_return();
		retval.start = input.LT(1);
		int value_StartIndex = input.index();
		Object root_0 = null;

		Token NULL258 = null;
		Token LPAREN260 = null;
		Token RPAREN263 = null;
		TinyHaxeTry1Parser.funcLit_return funcLit255 = null;

		TinyHaxeTry1Parser.arrayLit_return arrayLit256 = null;

		TinyHaxeTry1Parser.objLit_return objLit257 = null;

		TinyHaxeTry1Parser.elementarySymbol_return elementarySymbol259 = null;

		TinyHaxeTry1Parser.expr_return expr261 = null;

		TinyHaxeTry1Parser.statement_return statement262 = null;

		TinyHaxeTry1Parser.dotIdent_return dotIdent264 = null;

		Object NULL258_tree = null;
		Object LPAREN260_tree = null;
		Object RPAREN263_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 57)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:290:7:
			// ( funcLit | arrayLit | objLit | NULL | elementarySymbol | LPAREN
			// ( expr | statement ) RPAREN | dotIdent | )
			int alt58 = 8;
			alt58 = dfa58.predict(input);
			switch (alt58) {
			case 1:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:290:9:
				// funcLit
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_funcLit_in_value2726);
				funcLit255 = funcLit();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, funcLit255.getTree());

			}
				break;
			case 2:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:291:4:
				// arrayLit
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_arrayLit_in_value2732);
				arrayLit256 = arrayLit();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, arrayLit256.getTree());

			}
				break;
			case 3:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:292:14:
				// objLit
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_objLit_in_value2747);
				objLit257 = objLit();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, objLit257.getTree());

			}
				break;
			case 4:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:293:14:
				// NULL
			{
				root_0 = (Object) adaptor.nil();

				NULL258 = (Token) match(input, NULL, FOLLOW_NULL_in_value2762);
				if (state.failed)
					return retval;
				if (state.backtracking == 0) {
					NULL258_tree = (Object) adaptor.create(NULL258);
					adaptor.addChild(root_0, NULL258_tree);
				}

			}
				break;
			case 5:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:294:14:
				// elementarySymbol
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_elementarySymbol_in_value2777);
				elementarySymbol259 = elementarySymbol();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, elementarySymbol259.getTree());

			}
				break;
			case 6:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:295:14:
				// LPAREN ( expr | statement ) RPAREN
			{
				root_0 = (Object) adaptor.nil();

				LPAREN260 = (Token) match(input, LPAREN,
						FOLLOW_LPAREN_in_value2792);
				if (state.failed)
					return retval;
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:295:22:
				// ( expr | statement )
				int alt57 = 2;
				alt57 = dfa57.predict(input);
				switch (alt57) {
				case 1:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:295:23:
					// expr
				{
					pushFollow(FOLLOW_expr_in_value2796);
					expr261 = expr();

					state._fsp--;
					if (state.failed)
						return retval;
					if (state.backtracking == 0)
						adaptor.addChild(root_0, expr261.getTree());

				}
					break;
				case 2:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:295:28:
					// statement
				{
					pushFollow(FOLLOW_statement_in_value2798);
					statement262 = statement();

					state._fsp--;
					if (state.failed)
						return retval;
					if (state.backtracking == 0)
						adaptor.addChild(root_0, statement262.getTree());

				}
					break;

				}

				RPAREN263 = (Token) match(input, RPAREN,
						FOLLOW_RPAREN_in_value2801);
				if (state.failed)
					return retval;

			}
				break;
			case 7:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:296:11:
				// dotIdent
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_dotIdent_in_value2814);
				dotIdent264 = dotIdent();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, dotIdent264.getTree());

			}
				break;
			case 8:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:298:9:
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
				memoize(input, 57, value_StartIndex);
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:300:1:
	// newExpr : NEW type LPAREN exprListOpt RPAREN -> ^( NEW ( type )? (
	// exprListOpt )? ) ;
	public final TinyHaxeTry1Parser.newExpr_return newExpr()
			throws RecognitionException {
		TinyHaxeTry1Parser.newExpr_return retval = new TinyHaxeTry1Parser.newExpr_return();
		retval.start = input.LT(1);
		int newExpr_StartIndex = input.index();
		Object root_0 = null;

		Token NEW265 = null;
		Token LPAREN267 = null;
		Token RPAREN269 = null;
		TinyHaxeTry1Parser.type_return type266 = null;

		TinyHaxeTry1Parser.exprListOpt_return exprListOpt268 = null;

		Object NEW265_tree = null;
		Object LPAREN267_tree = null;
		Object RPAREN269_tree = null;
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
			if (state.backtracking > 0 && alreadyParsedRule(input, 58)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:301:2:
			// ( NEW type LPAREN exprListOpt RPAREN -> ^( NEW ( type )? (
			// exprListOpt )? ) )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:301:4:
			// NEW type LPAREN exprListOpt RPAREN
			{
				NEW265 = (Token) match(input, NEW, FOLLOW_NEW_in_newExpr2861);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_NEW.add(NEW265);

				pushFollow(FOLLOW_type_in_newExpr2863);
				type266 = type();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_type.add(type266.getTree());
				LPAREN267 = (Token) match(input, LPAREN,
						FOLLOW_LPAREN_in_newExpr2865);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_LPAREN.add(LPAREN267);

				pushFollow(FOLLOW_exprListOpt_in_newExpr2867);
				exprListOpt268 = exprListOpt();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_exprListOpt.add(exprListOpt268.getTree());
				RPAREN269 = (Token) match(input, RPAREN,
						FOLLOW_RPAREN_in_newExpr2869);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_RPAREN.add(RPAREN269);

				// AST REWRITE
				// elements: NEW, type, exprListOpt
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
					// 301:39: -> ^( NEW ( type )? ( exprListOpt )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:301:42:
						// ^( NEW ( type )? ( exprListOpt )? )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(stream_NEW
									.nextNode(), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:301:48:
							// ( type )?
							if (stream_type.hasNext()) {
								adaptor
										.addChild(root_1, stream_type
												.nextTree());

							}
							stream_type.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:301:54:
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
				memoize(input, 58, newExpr_StartIndex);
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:304:1:
	// cast : ( CAST LPAREN expr ( COMMA funcType )? RPAREN -> ^( CAST ( expr )?
	// ( funcType )? ) | CAST LPAREN expr RPAREN -> ^( CAST ( expr )? ) );
	public final TinyHaxeTry1Parser.cast_return cast()
			throws RecognitionException {
		TinyHaxeTry1Parser.cast_return retval = new TinyHaxeTry1Parser.cast_return();
		retval.start = input.LT(1);
		int cast_StartIndex = input.index();
		Object root_0 = null;

		Token CAST270 = null;
		Token LPAREN271 = null;
		Token COMMA273 = null;
		Token RPAREN275 = null;
		Token CAST276 = null;
		Token LPAREN277 = null;
		Token RPAREN279 = null;
		TinyHaxeTry1Parser.expr_return expr272 = null;

		TinyHaxeTry1Parser.funcType_return funcType274 = null;

		TinyHaxeTry1Parser.expr_return expr278 = null;

		Object CAST270_tree = null;
		Object LPAREN271_tree = null;
		Object COMMA273_tree = null;
		Object RPAREN275_tree = null;
		Object CAST276_tree = null;
		Object LPAREN277_tree = null;
		Object RPAREN279_tree = null;
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
			if (state.backtracking > 0 && alreadyParsedRule(input, 59)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:304:9:
			// ( CAST LPAREN expr ( COMMA funcType )? RPAREN -> ^( CAST ( expr
			// )? ( funcType )? ) | CAST LPAREN expr RPAREN -> ^( CAST ( expr )?
			// ) )
			int alt60 = 2;
			int LA60_0 = input.LA(1);

			if ((LA60_0 == CAST)) {
				int LA60_1 = input.LA(2);

				if ((synpred117_TinyHaxeTry1())) {
					alt60 = 1;
				} else if ((true)) {
					alt60 = 2;
				} else {
					if (state.backtracking > 0) {
						state.failed = true;
						return retval;
					}
					NoViableAltException nvae = new NoViableAltException("",
							60, 1, input);

					throw nvae;
				}
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return retval;
				}
				NoViableAltException nvae = new NoViableAltException("", 60, 0,
						input);

				throw nvae;
			}
			switch (alt60) {
			case 1:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:304:11:
				// CAST LPAREN expr ( COMMA funcType )? RPAREN
			{
				CAST270 = (Token) match(input, CAST, FOLLOW_CAST_in_cast2895);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_CAST.add(CAST270);

				LPAREN271 = (Token) match(input, LPAREN,
						FOLLOW_LPAREN_in_cast2897);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_LPAREN.add(LPAREN271);

				pushFollow(FOLLOW_expr_in_cast2899);
				expr272 = expr();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_expr.add(expr272.getTree());
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:304:28:
				// ( COMMA funcType )?
				int alt59 = 2;
				int LA59_0 = input.LA(1);

				if ((LA59_0 == COMMA)) {
					alt59 = 1;
				}
				switch (alt59) {
				case 1:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:304:29:
					// COMMA funcType
				{
					COMMA273 = (Token) match(input, COMMA,
							FOLLOW_COMMA_in_cast2902);
					if (state.failed)
						return retval;
					if (state.backtracking == 0)
						stream_COMMA.add(COMMA273);

					pushFollow(FOLLOW_funcType_in_cast2904);
					funcType274 = funcType();

					state._fsp--;
					if (state.failed)
						return retval;
					if (state.backtracking == 0)
						stream_funcType.add(funcType274.getTree());

				}
					break;

				}

				RPAREN275 = (Token) match(input, RPAREN,
						FOLLOW_RPAREN_in_cast2908);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_RPAREN.add(RPAREN275);

				// AST REWRITE
				// elements: CAST, expr, funcType
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
					// 304:54: -> ^( CAST ( expr )? ( funcType )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:304:57:
						// ^( CAST ( expr )? ( funcType )? )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(stream_CAST
									.nextNode(), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:304:64:
							// ( expr )?
							if (stream_expr.hasNext()) {
								adaptor
										.addChild(root_1, stream_expr
												.nextTree());

							}
							stream_expr.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:304:70:
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
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:305:4:
				// CAST LPAREN expr RPAREN
			{
				CAST276 = (Token) match(input, CAST, FOLLOW_CAST_in_cast2926);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_CAST.add(CAST276);

				LPAREN277 = (Token) match(input, LPAREN,
						FOLLOW_LPAREN_in_cast2928);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_LPAREN.add(LPAREN277);

				pushFollow(FOLLOW_expr_in_cast2930);
				expr278 = expr();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_expr.add(expr278.getTree());
				RPAREN279 = (Token) match(input, RPAREN,
						FOLLOW_RPAREN_in_cast2932);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_RPAREN.add(RPAREN279);

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
					// 305:31: -> ^( CAST ( expr )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:305:34:
						// ^( CAST ( expr )? )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(stream_CAST
									.nextNode(), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:305:41:
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
				memoize(input, 59, cast_StartIndex);
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:310:1:
	// topLevelDecl : ( classDecl | interfaceDecl | enumDecl | typedefDecl );
	public final TinyHaxeTry1Parser.topLevelDecl_return topLevelDecl()
			throws RecognitionException {
		TinyHaxeTry1Parser.topLevelDecl_return retval = new TinyHaxeTry1Parser.topLevelDecl_return();
		retval.start = input.LT(1);
		int topLevelDecl_StartIndex = input.index();
		Object root_0 = null;

		TinyHaxeTry1Parser.classDecl_return classDecl280 = null;

		TinyHaxeTry1Parser.interfaceDecl_return interfaceDecl281 = null;

		TinyHaxeTry1Parser.enumDecl_return enumDecl282 = null;

		TinyHaxeTry1Parser.typedefDecl_return typedefDecl283 = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 60)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:311:2:
			// ( classDecl | interfaceDecl | enumDecl | typedefDecl )
			int alt61 = 4;
			switch (input.LA(1)) {
			case EXTERN:
			case CLASS: {
				alt61 = 1;
			}
				break;
			case INTERFACE: {
				alt61 = 2;
			}
				break;
			case ENUM: {
				alt61 = 3;
			}
				break;
			case TYPEDEF: {
				alt61 = 4;
			}
				break;
			default:
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
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:311:4:
				// classDecl
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_classDecl_in_topLevelDecl2964);
				classDecl280 = classDecl();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, classDecl280.getTree());

			}
				break;
			case 2:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:312:4:
				// interfaceDecl
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_interfaceDecl_in_topLevelDecl2969);
				interfaceDecl281 = interfaceDecl();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, interfaceDecl281.getTree());

			}
				break;
			case 3:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:313:11:
				// enumDecl
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_enumDecl_in_topLevelDecl2981);
				enumDecl282 = enumDecl();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, enumDecl282.getTree());

			}
				break;
			case 4:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:314:4:
				// typedefDecl
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_typedefDecl_in_topLevelDecl2986);
				typedefDecl283 = typedefDecl();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, typedefDecl283.getTree());

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
				memoize(input, 60, topLevelDecl_StartIndex);
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:317:1:
	// enumDecl : ENUM IDENTIFIER typeParamOpt LBRACE enumBody RBRACE -> ^( ENUM
	// ( IDENTIFIER )? ( typeParamOpt )? ( enumBody )? ) ;
	public final TinyHaxeTry1Parser.enumDecl_return enumDecl()
			throws RecognitionException {
		TinyHaxeTry1Parser.enumDecl_return retval = new TinyHaxeTry1Parser.enumDecl_return();
		retval.start = input.LT(1);
		int enumDecl_StartIndex = input.index();
		Object root_0 = null;

		Token ENUM284 = null;
		Token IDENTIFIER285 = null;
		Token LBRACE287 = null;
		Token RBRACE289 = null;
		TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt286 = null;

		TinyHaxeTry1Parser.enumBody_return enumBody288 = null;

		Object ENUM284_tree = null;
		Object IDENTIFIER285_tree = null;
		Object LBRACE287_tree = null;
		Object RBRACE289_tree = null;
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
			if (state.backtracking > 0 && alreadyParsedRule(input, 61)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:317:9:
			// ( ENUM IDENTIFIER typeParamOpt LBRACE enumBody RBRACE -> ^( ENUM
			// ( IDENTIFIER )? ( typeParamOpt )? ( enumBody )? ) )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:317:11:
			// ENUM IDENTIFIER typeParamOpt LBRACE enumBody RBRACE
			{
				ENUM284 = (Token) match(input, ENUM,
						FOLLOW_ENUM_in_enumDecl2996);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_ENUM.add(ENUM284);

				IDENTIFIER285 = (Token) match(input, IDENTIFIER,
						FOLLOW_IDENTIFIER_in_enumDecl2998);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_IDENTIFIER.add(IDENTIFIER285);

				pushFollow(FOLLOW_typeParamOpt_in_enumDecl3000);
				typeParamOpt286 = typeParamOpt();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_typeParamOpt.add(typeParamOpt286.getTree());
				LBRACE287 = (Token) match(input, LBRACE,
						FOLLOW_LBRACE_in_enumDecl3002);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_LBRACE.add(LBRACE287);

				pushFollow(FOLLOW_enumBody_in_enumDecl3004);
				enumBody288 = enumBody();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_enumBody.add(enumBody288.getTree());
				RBRACE289 = (Token) match(input, RBRACE,
						FOLLOW_RBRACE_in_enumDecl3006);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_RBRACE.add(RBRACE289);

				// AST REWRITE
				// elements: IDENTIFIER, typeParamOpt, ENUM, enumBody
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
					// 317:63: -> ^( ENUM ( IDENTIFIER )? ( typeParamOpt )? (
					// enumBody )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:317:66:
						// ^( ENUM ( IDENTIFIER )? ( typeParamOpt )? ( enumBody
						// )? )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(stream_ENUM
									.nextNode(), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:317:73:
							// ( IDENTIFIER )?
							if (stream_IDENTIFIER.hasNext()) {
								adaptor.addChild(root_1, stream_IDENTIFIER
										.nextNode());

							}
							stream_IDENTIFIER.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:317:85:
							// ( typeParamOpt )?
							if (stream_typeParamOpt.hasNext()) {
								adaptor.addChild(root_1, stream_typeParamOpt
										.nextTree());

							}
							stream_typeParamOpt.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:317:99:
							// ( enumBody )?
							if (stream_enumBody.hasNext()) {
								adaptor.addChild(root_1, stream_enumBody
										.nextTree());

							}
							stream_enumBody.reset();

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
				memoize(input, 61, enumDecl_StartIndex);
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:320:1:
	// enumBody : ( enumValueDecl )* ;
	public final TinyHaxeTry1Parser.enumBody_return enumBody()
			throws RecognitionException {
		TinyHaxeTry1Parser.enumBody_return retval = new TinyHaxeTry1Parser.enumBody_return();
		retval.start = input.LT(1);
		int enumBody_StartIndex = input.index();
		Object root_0 = null;

		TinyHaxeTry1Parser.enumValueDecl_return enumValueDecl290 = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 62)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:320:9:
			// ( ( enumValueDecl )* )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:320:11:
			// ( enumValueDecl )*
			{
				root_0 = (Object) adaptor.nil();

				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:320:11:
				// ( enumValueDecl )*
				loop62: do {
					int alt62 = 2;
					int LA62_0 = input.LA(1);

					if ((LA62_0 == IDENTIFIER || LA62_0 == PP_IF || (LA62_0 >= PP_ELSEIF && LA62_0 <= PP_ERROR))) {
						alt62 = 1;
					}

					switch (alt62) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:320:12:
						// enumValueDecl
					{
						pushFollow(FOLLOW_enumValueDecl_in_enumBody3032);
						enumValueDecl290 = enumValueDecl();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							adaptor
									.addChild(root_0, enumValueDecl290
											.getTree());

					}
						break;

					default:
						break loop62;
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
				memoize(input, 62, enumBody_StartIndex);
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:323:1:
	// enumValueDecl : ( IDENTIFIER LPAREN paramList RPAREN SEMI -> ^(
	// IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? ( paramList )? ) | IDENTIFIER
	// SEMI -> ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? ) | pp );
	public final TinyHaxeTry1Parser.enumValueDecl_return enumValueDecl()
			throws RecognitionException {
		TinyHaxeTry1Parser.enumValueDecl_return retval = new TinyHaxeTry1Parser.enumValueDecl_return();
		retval.start = input.LT(1);
		int enumValueDecl_StartIndex = input.index();
		Object root_0 = null;

		Token IDENTIFIER291 = null;
		Token LPAREN292 = null;
		Token RPAREN294 = null;
		Token SEMI295 = null;
		Token IDENTIFIER296 = null;
		Token SEMI297 = null;
		TinyHaxeTry1Parser.paramList_return paramList293 = null;

		TinyHaxeTry1Parser.pp_return pp298 = null;

		Object IDENTIFIER291_tree = null;
		Object LPAREN292_tree = null;
		Object RPAREN294_tree = null;
		Object SEMI295_tree = null;
		Object IDENTIFIER296_tree = null;
		Object SEMI297_tree = null;
		RewriteRuleTokenStream stream_RPAREN = new RewriteRuleTokenStream(
				adaptor, "token RPAREN");
		RewriteRuleTokenStream stream_SEMI = new RewriteRuleTokenStream(
				adaptor, "token SEMI");
		RewriteRuleTokenStream stream_IDENTIFIER = new RewriteRuleTokenStream(
				adaptor, "token IDENTIFIER");
		RewriteRuleTokenStream stream_LPAREN = new RewriteRuleTokenStream(
				adaptor, "token LPAREN");
		RewriteRuleSubtreeStream stream_paramList = new RewriteRuleSubtreeStream(
				adaptor, "rule paramList");
		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 63)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:324:2:
			// ( IDENTIFIER LPAREN paramList RPAREN SEMI -> ^(
			// IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? ( paramList )? ) |
			// IDENTIFIER SEMI -> ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? ) |
			// pp )
			int alt63 = 3;
			int LA63_0 = input.LA(1);

			if ((LA63_0 == IDENTIFIER)) {
				int LA63_1 = input.LA(2);

				if ((LA63_1 == LPAREN)) {
					alt63 = 1;
				} else if ((LA63_1 == SEMI)) {
					alt63 = 2;
				} else {
					if (state.backtracking > 0) {
						state.failed = true;
						return retval;
					}
					NoViableAltException nvae = new NoViableAltException("",
							63, 1, input);

					throw nvae;
				}
			} else if ((LA63_0 == PP_IF || (LA63_0 >= PP_ELSEIF && LA63_0 <= PP_ERROR))) {
				alt63 = 3;
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return retval;
				}
				NoViableAltException nvae = new NoViableAltException("", 63, 0,
						input);

				throw nvae;
			}
			switch (alt63) {
			case 1:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:324:4:
				// IDENTIFIER LPAREN paramList RPAREN SEMI
			{
				IDENTIFIER291 = (Token) match(input, IDENTIFIER,
						FOLLOW_IDENTIFIER_in_enumValueDecl3051);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_IDENTIFIER.add(IDENTIFIER291);

				LPAREN292 = (Token) match(input, LPAREN,
						FOLLOW_LPAREN_in_enumValueDecl3053);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_LPAREN.add(LPAREN292);

				pushFollow(FOLLOW_paramList_in_enumValueDecl3055);
				paramList293 = paramList();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_paramList.add(paramList293.getTree());
				RPAREN294 = (Token) match(input, RPAREN,
						FOLLOW_RPAREN_in_enumValueDecl3057);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_RPAREN.add(RPAREN294);

				SEMI295 = (Token) match(input, SEMI,
						FOLLOW_SEMI_in_enumValueDecl3059);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_SEMI.add(SEMI295);

				// AST REWRITE
				// elements: IDENTIFIER, paramList, IDENTIFIER
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
					// 324:44: -> ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? (
					// paramList )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:324:46:
						// ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? (
						// paramList )? )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(
									new VarDeclaration(IDENTIFIER,
											IDENTIFIER291), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:324:88:
							// ( IDENTIFIER )?
							if (stream_IDENTIFIER.hasNext()) {
								adaptor.addChild(root_1, new VarUsage(
										stream_IDENTIFIER.nextToken()));

							}
							stream_IDENTIFIER.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:324:110:
							// ( paramList )?
							if (stream_paramList.hasNext()) {
								adaptor.addChild(root_1, stream_paramList
										.nextTree());

							}
							stream_paramList.reset();

							adaptor.addChild(root_0, root_1);
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
				IDENTIFIER296 = (Token) match(input, IDENTIFIER,
						FOLLOW_IDENTIFIER_in_enumValueDecl3084);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_IDENTIFIER.add(IDENTIFIER296);

				SEMI297 = (Token) match(input, SEMI,
						FOLLOW_SEMI_in_enumValueDecl3086);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_SEMI.add(SEMI297);

				// AST REWRITE
				// elements: IDENTIFIER, IDENTIFIER
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
					// 325:23: -> ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:325:25:
						// ^( IDENTIFIER[$IDENTIFIER] ( IDENTIFIER )? )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(
									new VarDeclaration(IDENTIFIER,
											IDENTIFIER296), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:325:67:
							// ( IDENTIFIER )?
							if (stream_IDENTIFIER.hasNext()) {
								adaptor.addChild(root_1, new VarUsage(
										stream_IDENTIFIER.nextToken()));

							}
							stream_IDENTIFIER.reset();

							adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}
				break;
			case 3:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:326:4:
				// pp
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_pp_in_enumValueDecl3109);
				pp298 = pp();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, pp298.getTree());

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
				memoize(input, 63, enumValueDecl_StartIndex);
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:329:1:
	// varDeclList : varDecl varDeclList ;
	public final TinyHaxeTry1Parser.varDeclList_return varDeclList()
			throws RecognitionException {
		TinyHaxeTry1Parser.varDeclList_return retval = new TinyHaxeTry1Parser.varDeclList_return();
		retval.start = input.LT(1);
		int varDeclList_StartIndex = input.index();
		Object root_0 = null;

		TinyHaxeTry1Parser.varDecl_return varDecl299 = null;

		TinyHaxeTry1Parser.varDeclList_return varDeclList300 = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 64)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:330:2:
			// ( varDecl varDeclList )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:330:4:
			// varDecl varDeclList
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_varDecl_in_varDeclList3128);
				varDecl299 = varDecl();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, varDecl299.getTree());
				pushFollow(FOLLOW_varDeclList_in_varDeclList3130);
				varDeclList300 = varDeclList();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, varDeclList300.getTree());

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
				memoize(input, 64, varDeclList_StartIndex);
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:333:1:
	// varDecl : ( declAttrList )? VAR varDeclPartList SEMI -> ^( VAR[$VAR] (
	// declAttrList )? ( varDeclPartList )? ) ;
	public final TinyHaxeTry1Parser.varDecl_return varDecl()
			throws RecognitionException {
		TinyHaxeTry1Parser.varDecl_return retval = new TinyHaxeTry1Parser.varDecl_return();
		retval.start = input.LT(1);
		int varDecl_StartIndex = input.index();
		Object root_0 = null;

		Token VAR302 = null;
		Token SEMI304 = null;
		TinyHaxeTry1Parser.declAttrList_return declAttrList301 = null;

		TinyHaxeTry1Parser.varDeclPartList_return varDeclPartList303 = null;

		Object VAR302_tree = null;
		Object SEMI304_tree = null;
		RewriteRuleTokenStream stream_VAR = new RewriteRuleTokenStream(adaptor,
				"token VAR");
		RewriteRuleTokenStream stream_SEMI = new RewriteRuleTokenStream(
				adaptor, "token SEMI");
		RewriteRuleSubtreeStream stream_declAttrList = new RewriteRuleSubtreeStream(
				adaptor, "rule declAttrList");
		RewriteRuleSubtreeStream stream_varDeclPartList = new RewriteRuleSubtreeStream(
				adaptor, "rule varDeclPartList");
		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 65)) {
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
				int alt64 = 2;
				int LA64_0 = input.LA(1);

				if (((LA64_0 >= PUBLIC && LA64_0 <= OVERRIDE))) {
					alt64 = 1;
				}
				switch (alt64) {
				case 1:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:333:12:
					// declAttrList
				{
					pushFollow(FOLLOW_declAttrList_in_varDecl3142);
					declAttrList301 = declAttrList();

					state._fsp--;
					if (state.failed)
						return retval;
					if (state.backtracking == 0)
						stream_declAttrList.add(declAttrList301.getTree());

				}
					break;

				}

				VAR302 = (Token) match(input, VAR, FOLLOW_VAR_in_varDecl3146);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_VAR.add(VAR302);

				pushFollow(FOLLOW_varDeclPartList_in_varDecl3148);
				varDeclPartList303 = varDeclPartList();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_varDeclPartList.add(varDeclPartList303.getTree());
				SEMI304 = (Token) match(input, SEMI, FOLLOW_SEMI_in_varDecl3150);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_SEMI.add(SEMI304);

				// AST REWRITE
				// elements: varDeclPartList, declAttrList, VAR
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
					// 333:52: -> ^( VAR[$VAR] ( declAttrList )? (
					// varDeclPartList )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:333:54:
						// ^( VAR[$VAR] ( declAttrList )? ( varDeclPartList )? )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(
									new VarDeclaration(VAR, VAR302), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:333:82:
							// ( declAttrList )?
							if (stream_declAttrList.hasNext()) {
								adaptor.addChild(root_1, stream_declAttrList
										.nextTree());

							}
							stream_declAttrList.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:333:96:
							// ( varDeclPartList )?
							if (stream_varDeclPartList.hasNext()) {
								adaptor.addChild(root_1, stream_varDeclPartList
										.nextTree());

							}
							stream_varDeclPartList.reset();

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
				memoize(input, 65, varDecl_StartIndex);
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:336:1:
	// varDeclPartList : varDeclPart ( COMMA varDeclPart )* ;
	public final TinyHaxeTry1Parser.varDeclPartList_return varDeclPartList()
			throws RecognitionException {
		TinyHaxeTry1Parser.varDeclPartList_return retval = new TinyHaxeTry1Parser.varDeclPartList_return();
		retval.start = input.LT(1);
		int varDeclPartList_StartIndex = input.index();
		Object root_0 = null;

		Token COMMA306 = null;
		TinyHaxeTry1Parser.varDeclPart_return varDeclPart305 = null;

		TinyHaxeTry1Parser.varDeclPart_return varDeclPart307 = null;

		Object COMMA306_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 66)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:337:2:
			// ( varDeclPart ( COMMA varDeclPart )* )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:337:4:
			// varDeclPart ( COMMA varDeclPart )*
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_varDeclPart_in_varDeclPartList3180);
				varDeclPart305 = varDeclPart();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, varDeclPart305.getTree());
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:337:16:
				// ( COMMA varDeclPart )*
				loop65: do {
					int alt65 = 2;
					int LA65_0 = input.LA(1);

					if ((LA65_0 == COMMA)) {
						alt65 = 1;
					}

					switch (alt65) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:337:17:
						// COMMA varDeclPart
					{
						COMMA306 = (Token) match(input, COMMA,
								FOLLOW_COMMA_in_varDeclPartList3183);
						if (state.failed)
							return retval;
						pushFollow(FOLLOW_varDeclPart_in_varDeclPartList3186);
						varDeclPart307 = varDeclPart();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							adaptor.addChild(root_0, varDeclPart307.getTree());

					}
						break;

					default:
						break loop65;
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
				memoize(input, 66, varDeclPartList_StartIndex);
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:340:1:
	// varDeclPart : IDENTIFIER propDeclOpt typeTagOpt varInit ;
	public final TinyHaxeTry1Parser.varDeclPart_return varDeclPart()
			throws RecognitionException {
		TinyHaxeTry1Parser.varDeclPart_return retval = new TinyHaxeTry1Parser.varDeclPart_return();
		retval.start = input.LT(1);
		int varDeclPart_StartIndex = input.index();
		Object root_0 = null;

		Token IDENTIFIER308 = null;
		TinyHaxeTry1Parser.propDeclOpt_return propDeclOpt309 = null;

		TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt310 = null;

		TinyHaxeTry1Parser.varInit_return varInit311 = null;

		Object IDENTIFIER308_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 67)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:341:2:
			// ( IDENTIFIER propDeclOpt typeTagOpt varInit )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:341:4:
			// IDENTIFIER propDeclOpt typeTagOpt varInit
			{
				root_0 = (Object) adaptor.nil();

				IDENTIFIER308 = (Token) match(input, IDENTIFIER,
						FOLLOW_IDENTIFIER_in_varDeclPart3200);
				if (state.failed)
					return retval;
				if (state.backtracking == 0) {
					IDENTIFIER308_tree = new VarUsage(IDENTIFIER308);
					adaptor.addChild(root_0, IDENTIFIER308_tree);
				}
				pushFollow(FOLLOW_propDeclOpt_in_varDeclPart3205);
				propDeclOpt309 = propDeclOpt();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, propDeclOpt309.getTree());
				pushFollow(FOLLOW_typeTagOpt_in_varDeclPart3207);
				typeTagOpt310 = typeTagOpt();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, typeTagOpt310.getTree());
				pushFollow(FOLLOW_varInit_in_varDeclPart3209);
				varInit311 = varInit();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, varInit311.getTree());

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
				memoize(input, 67, varDeclPart_StartIndex);
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:344:1:
	// propDecl : LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN -> ^(
	// PROPERTY_DECL[\"PROPERTY_DECL\",true] ( $a1)? ( $a2)? ) ;
	public final TinyHaxeTry1Parser.propDecl_return propDecl()
			throws RecognitionException {
		TinyHaxeTry1Parser.propDecl_return retval = new TinyHaxeTry1Parser.propDecl_return();
		retval.start = input.LT(1);
		int propDecl_StartIndex = input.index();
		Object root_0 = null;

		Token LPAREN312 = null;
		Token COMMA313 = null;
		Token RPAREN314 = null;
		TinyHaxeTry1Parser.propAccessor_return a1 = null;

		TinyHaxeTry1Parser.propAccessor_return a2 = null;

		Object LPAREN312_tree = null;
		Object COMMA313_tree = null;
		Object RPAREN314_tree = null;
		RewriteRuleTokenStream stream_RPAREN = new RewriteRuleTokenStream(
				adaptor, "token RPAREN");
		RewriteRuleTokenStream stream_COMMA = new RewriteRuleTokenStream(
				adaptor, "token COMMA");
		RewriteRuleTokenStream stream_LPAREN = new RewriteRuleTokenStream(
				adaptor, "token LPAREN");
		RewriteRuleSubtreeStream stream_propAccessor = new RewriteRuleSubtreeStream(
				adaptor, "rule propAccessor");
		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 68)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:344:9:
			// ( LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN -> ^(
			// PROPERTY_DECL[\"PROPERTY_DECL\",true] ( $a1)? ( $a2)? ) )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:344:11:
			// LPAREN a1= propAccessor COMMA a2= propAccessor RPAREN
			{
				LPAREN312 = (Token) match(input, LPAREN,
						FOLLOW_LPAREN_in_propDecl3219);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_LPAREN.add(LPAREN312);

				pushFollow(FOLLOW_propAccessor_in_propDecl3223);
				a1 = propAccessor();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_propAccessor.add(a1.getTree());
				COMMA313 = (Token) match(input, COMMA,
						FOLLOW_COMMA_in_propDecl3225);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_COMMA.add(COMMA313);

				pushFollow(FOLLOW_propAccessor_in_propDecl3229);
				a2 = propAccessor();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_propAccessor.add(a2.getTree());
				RPAREN314 = (Token) match(input, RPAREN,
						FOLLOW_RPAREN_in_propDecl3231);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_RPAREN.add(RPAREN314);

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
					// 344:63: -> ^( PROPERTY_DECL[\"PROPERTY_DECL\",true] (
					// $a1)? ( $a2)? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:344:66:
						// ^( PROPERTY_DECL[\"PROPERTY_DECL\",true] ( $a1)? (
						// $a2)? )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(
									new ExtendedCommonTree(PROPERTY_DECL,
											"PROPERTY_DECL", true), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:344:124:
							// ( $a1)?
							if (stream_a1.hasNext()) {
								adaptor.addChild(root_1, stream_a1.nextTree());

							}
							stream_a1.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:344:129:
							// ( $a2)?
							if (stream_a2.hasNext()) {
								adaptor.addChild(root_1, stream_a2.nextTree());

							}
							stream_a2.reset();

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
				memoize(input, 68, propDecl_StartIndex);
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:347:1:
	// propAccessor : ( IDENTIFIER | NULL | DEFAULT | DYNAMIC );
	public final TinyHaxeTry1Parser.propAccessor_return propAccessor()
			throws RecognitionException {
		TinyHaxeTry1Parser.propAccessor_return retval = new TinyHaxeTry1Parser.propAccessor_return();
		retval.start = input.LT(1);
		int propAccessor_StartIndex = input.index();
		Object root_0 = null;

		Token set315 = null;

		Object set315_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 69)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:348:2:
			// ( IDENTIFIER | NULL | DEFAULT | DYNAMIC )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:
			{
				root_0 = (Object) adaptor.nil();

				set315 = (Token) input.LT(1);
				if (input.LA(1) == IDENTIFIER || input.LA(1) == DYNAMIC
						|| input.LA(1) == DEFAULT || input.LA(1) == NULL) {
					input.consume();
					if (state.backtracking == 0)
						adaptor.addChild(root_0, (Object) adaptor
								.create(set315));
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
				memoize(input, 69, propAccessor_StartIndex);
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:354:1:
	// propDeclOpt : ( propDecl | );
	public final TinyHaxeTry1Parser.propDeclOpt_return propDeclOpt()
			throws RecognitionException {
		TinyHaxeTry1Parser.propDeclOpt_return retval = new TinyHaxeTry1Parser.propDeclOpt_return();
		retval.start = input.LT(1);
		int propDeclOpt_StartIndex = input.index();
		Object root_0 = null;

		TinyHaxeTry1Parser.propDecl_return propDecl316 = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 70)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:355:2:
			// ( propDecl | )
			int alt66 = 2;
			int LA66_0 = input.LA(1);

			if ((LA66_0 == LPAREN)) {
				alt66 = 1;
			} else if ((LA66_0 == EOF || LA66_0 == SEMI || LA66_0 == COMMA
					|| LA66_0 == EQ || LA66_0 == RPAREN || LA66_0 == COLON || LA66_0 == LBRACE)) {
				alt66 = 2;
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return retval;
				}
				NoViableAltException nvae = new NoViableAltException("", 66, 0,
						input);

				throw nvae;
			}
			switch (alt66) {
			case 1:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:355:4:
				// propDecl
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_propDecl_in_propDeclOpt3291);
				propDecl316 = propDecl();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, propDecl316.getTree());

			}
				break;
			case 2:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:357:2:
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
				memoize(input, 70, propDeclOpt_StartIndex);
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:359:1:
	// varInit : ( EQ expr -> ^( VAR_INIT[\"VAR_INIT\",true] ( expr )? ) | );
	public final TinyHaxeTry1Parser.varInit_return varInit()
			throws RecognitionException {
		TinyHaxeTry1Parser.varInit_return retval = new TinyHaxeTry1Parser.varInit_return();
		retval.start = input.LT(1);
		int varInit_StartIndex = input.index();
		Object root_0 = null;

		Token EQ317 = null;
		TinyHaxeTry1Parser.expr_return expr318 = null;

		Object EQ317_tree = null;
		RewriteRuleTokenStream stream_EQ = new RewriteRuleTokenStream(adaptor,
				"token EQ");
		RewriteRuleSubtreeStream stream_expr = new RewriteRuleSubtreeStream(
				adaptor, "rule expr");
		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 71)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:359:9:
			// ( EQ expr -> ^( VAR_INIT[\"VAR_INIT\",true] ( expr )? ) | )
			int alt67 = 2;
			int LA67_0 = input.LA(1);

			if ((LA67_0 == EQ)) {
				alt67 = 1;
			} else if ((LA67_0 == EOF || LA67_0 == SEMI || LA67_0 == COMMA || LA67_0 == RPAREN)) {
				alt67 = 2;
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return retval;
				}
				NoViableAltException nvae = new NoViableAltException("", 67, 0,
						input);

				throw nvae;
			}
			switch (alt67) {
			case 1:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:359:11:
				// EQ expr
			{
				EQ317 = (Token) match(input, EQ, FOLLOW_EQ_in_varInit3306);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_EQ.add(EQ317);

				pushFollow(FOLLOW_expr_in_varInit3308);
				expr318 = expr();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_expr.add(expr318.getTree());

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
					// 359:19: -> ^( VAR_INIT[\"VAR_INIT\",true] ( expr )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:359:21:
						// ^( VAR_INIT[\"VAR_INIT\",true] ( expr )? )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(
									new ExtendedCommonTree(VAR_INIT,
											"VAR_INIT", true), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:359:69:
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
			case 2:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:361:2:
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
				memoize(input, 71, varInit_StartIndex);
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:363:1:
	// funcDecl : ( ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN
	// typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? (
	// typeTagOpt )? ( block )? ) | ( declAttrList )? FUNCTION IDENTIFIER
	// typeParamOpt LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION
	// IDENTIFIER ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? (
	// typeParamOpt )? ) );
	public final TinyHaxeTry1Parser.funcDecl_return funcDecl()
			throws RecognitionException {
		TinyHaxeTry1Parser.funcDecl_return retval = new TinyHaxeTry1Parser.funcDecl_return();
		retval.start = input.LT(1);
		int funcDecl_StartIndex = input.index();
		Object root_0 = null;

		Token FUNCTION320 = null;
		Token NEW321 = null;
		Token LPAREN322 = null;
		Token RPAREN324 = null;
		Token FUNCTION328 = null;
		Token IDENTIFIER329 = null;
		Token LPAREN331 = null;
		Token RPAREN333 = null;
		TinyHaxeTry1Parser.declAttrList_return declAttrList319 = null;

		TinyHaxeTry1Parser.paramList_return paramList323 = null;

		TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt325 = null;

		TinyHaxeTry1Parser.block_return block326 = null;

		TinyHaxeTry1Parser.declAttrList_return declAttrList327 = null;

		TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt330 = null;

		TinyHaxeTry1Parser.paramList_return paramList332 = null;

		TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt334 = null;

		TinyHaxeTry1Parser.block_return block335 = null;

		Object FUNCTION320_tree = null;
		Object NEW321_tree = null;
		Object LPAREN322_tree = null;
		Object RPAREN324_tree = null;
		Object FUNCTION328_tree = null;
		Object IDENTIFIER329_tree = null;
		Object LPAREN331_tree = null;
		Object RPAREN333_tree = null;
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
			if (state.backtracking > 0 && alreadyParsedRule(input, 72)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:363:9:
			// ( ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN
			// typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList
			// )? ( typeTagOpt )? ( block )? ) | ( declAttrList )? FUNCTION
			// IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block
			// -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? (
			// typeTagOpt )? ( block )? ( typeParamOpt )? ) )
			int alt70 = 2;
			alt70 = dfa70.predict(input);
			switch (alt70) {
			case 1:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:363:11:
				// ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN
				// typeTagOpt block
			{
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:363:11:
				// ( declAttrList )?
				int alt68 = 2;
				int LA68_0 = input.LA(1);

				if (((LA68_0 >= PUBLIC && LA68_0 <= OVERRIDE))) {
					alt68 = 1;
				}
				switch (alt68) {
				case 1:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:0:0:
					// declAttrList
				{
					pushFollow(FOLLOW_declAttrList_in_funcDecl3334);
					declAttrList319 = declAttrList();

					state._fsp--;
					if (state.failed)
						return retval;
					if (state.backtracking == 0)
						stream_declAttrList.add(declAttrList319.getTree());

				}
					break;

				}

				FUNCTION320 = (Token) match(input, FUNCTION,
						FOLLOW_FUNCTION_in_funcDecl3337);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_FUNCTION.add(FUNCTION320);

				NEW321 = (Token) match(input, NEW, FOLLOW_NEW_in_funcDecl3339);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_NEW.add(NEW321);

				LPAREN322 = (Token) match(input, LPAREN,
						FOLLOW_LPAREN_in_funcDecl3341);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_LPAREN.add(LPAREN322);

				pushFollow(FOLLOW_paramList_in_funcDecl3343);
				paramList323 = paramList();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_paramList.add(paramList323.getTree());
				RPAREN324 = (Token) match(input, RPAREN,
						FOLLOW_RPAREN_in_funcDecl3345);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_RPAREN.add(RPAREN324);

				pushFollow(FOLLOW_typeTagOpt_in_funcDecl3347);
				typeTagOpt325 = typeTagOpt();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_typeTagOpt.add(typeTagOpt325.getTree());
				pushFollow(FOLLOW_block_in_funcDecl3349);
				block326 = block();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_block.add(block326.getTree());

				// AST REWRITE
				// elements: declAttrList, paramList, NEW, FUNCTION, block,
				// typeTagOpt
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
					// 364:4: -> ^( FUNCTION NEW ( declAttrList )? ( paramList
					// )? ( typeTagOpt )? ( block )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:364:7:
						// ^( FUNCTION NEW ( declAttrList )? ( paramList )? (
						// typeTagOpt )? ( block )? )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(
									new FunctionNode(stream_FUNCTION
											.nextToken()), root_1);

							adaptor.addChild(root_1, stream_NEW.nextNode());
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:364:36:
							// ( declAttrList )?
							if (stream_declAttrList.hasNext()) {
								adaptor.addChild(root_1, stream_declAttrList
										.nextTree());

							}
							stream_declAttrList.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:364:50:
							// ( paramList )?
							if (stream_paramList.hasNext()) {
								adaptor.addChild(root_1, stream_paramList
										.nextTree());

							}
							stream_paramList.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:364:61:
							// ( typeTagOpt )?
							if (stream_typeTagOpt.hasNext()) {
								adaptor.addChild(root_1, stream_typeTagOpt
										.nextTree());

							}
							stream_typeTagOpt.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:364:73:
							// ( block )?
							if (stream_block.hasNext()) {
								adaptor.addChild(root_1, stream_block
										.nextTree());

							}
							stream_block.reset();

							adaptor.addChild(root_0, root_1);
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
				int alt69 = 2;
				int LA69_0 = input.LA(1);

				if (((LA69_0 >= PUBLIC && LA69_0 <= OVERRIDE))) {
					alt69 = 1;
				}
				switch (alt69) {
				case 1:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:0:0:
					// declAttrList
				{
					pushFollow(FOLLOW_declAttrList_in_funcDecl3382);
					declAttrList327 = declAttrList();

					state._fsp--;
					if (state.failed)
						return retval;
					if (state.backtracking == 0)
						stream_declAttrList.add(declAttrList327.getTree());

				}
					break;

				}

				FUNCTION328 = (Token) match(input, FUNCTION,
						FOLLOW_FUNCTION_in_funcDecl3385);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_FUNCTION.add(FUNCTION328);

				IDENTIFIER329 = (Token) match(input, IDENTIFIER,
						FOLLOW_IDENTIFIER_in_funcDecl3387);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_IDENTIFIER.add(IDENTIFIER329);

				pushFollow(FOLLOW_typeParamOpt_in_funcDecl3389);
				typeParamOpt330 = typeParamOpt();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_typeParamOpt.add(typeParamOpt330.getTree());
				LPAREN331 = (Token) match(input, LPAREN,
						FOLLOW_LPAREN_in_funcDecl3391);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_LPAREN.add(LPAREN331);

				pushFollow(FOLLOW_paramList_in_funcDecl3393);
				paramList332 = paramList();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_paramList.add(paramList332.getTree());
				RPAREN333 = (Token) match(input, RPAREN,
						FOLLOW_RPAREN_in_funcDecl3395);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_RPAREN.add(RPAREN333);

				pushFollow(FOLLOW_typeTagOpt_in_funcDecl3397);
				typeTagOpt334 = typeTagOpt();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_typeTagOpt.add(typeTagOpt334.getTree());
				pushFollow(FOLLOW_block_in_funcDecl3399);
				block335 = block();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_block.add(block335.getTree());

				// AST REWRITE
				// elements: IDENTIFIER, typeParamOpt, declAttrList, paramList,
				// block, FUNCTION, typeTagOpt
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
					// 366:4: -> ^( FUNCTION IDENTIFIER ( declAttrList )? (
					// paramList )? ( typeTagOpt )? ( block )? ( typeParamOpt )?
					// )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:366:6:
						// ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList
						// )? ( typeTagOpt )? ( block )? ( typeParamOpt )? )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(
									new FunctionNode(stream_FUNCTION
											.nextToken()), root_1);

							adaptor.addChild(root_1, stream_IDENTIFIER
									.nextNode());
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:366:42:
							// ( declAttrList )?
							if (stream_declAttrList.hasNext()) {
								adaptor.addChild(root_1, stream_declAttrList
										.nextTree());

							}
							stream_declAttrList.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:366:56:
							// ( paramList )?
							if (stream_paramList.hasNext()) {
								adaptor.addChild(root_1, stream_paramList
										.nextTree());

							}
							stream_paramList.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:366:67:
							// ( typeTagOpt )?
							if (stream_typeTagOpt.hasNext()) {
								adaptor.addChild(root_1, stream_typeTagOpt
										.nextTree());

							}
							stream_typeTagOpt.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:366:79:
							// ( block )?
							if (stream_block.hasNext()) {
								adaptor.addChild(root_1, stream_block
										.nextTree());

							}
							stream_block.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:366:86:
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
				memoize(input, 72, funcDecl_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "funcDecl"

	public static class funcProtoDecl_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
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
	public final TinyHaxeTry1Parser.funcProtoDecl_return funcProtoDecl()
			throws RecognitionException {
		TinyHaxeTry1Parser.funcProtoDecl_return retval = new TinyHaxeTry1Parser.funcProtoDecl_return();
		retval.start = input.LT(1);
		int funcProtoDecl_StartIndex = input.index();
		Object root_0 = null;

		Token FUNCTION337 = null;
		Token NEW338 = null;
		Token LPAREN339 = null;
		Token RPAREN341 = null;
		Token SEMI343 = null;
		Token FUNCTION345 = null;
		Token IDENTIFIER346 = null;
		Token LPAREN348 = null;
		Token RPAREN350 = null;
		Token SEMI352 = null;
		Token FUNCTION353 = null;
		Token NEW354 = null;
		Token LPAREN355 = null;
		Token RPAREN357 = null;
		Token SEMI359 = null;
		Token FUNCTION360 = null;
		Token IDENTIFIER361 = null;
		Token LPAREN363 = null;
		Token RPAREN365 = null;
		Token SEMI367 = null;
		TinyHaxeTry1Parser.declAttrList_return declAttrList336 = null;

		TinyHaxeTry1Parser.paramList_return paramList340 = null;

		TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt342 = null;

		TinyHaxeTry1Parser.declAttrList_return declAttrList344 = null;

		TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt347 = null;

		TinyHaxeTry1Parser.paramList_return paramList349 = null;

		TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt351 = null;

		TinyHaxeTry1Parser.paramList_return paramList356 = null;

		TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt358 = null;

		TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt362 = null;

		TinyHaxeTry1Parser.paramList_return paramList364 = null;

		TinyHaxeTry1Parser.typeTagOpt_return typeTagOpt366 = null;

		Object FUNCTION337_tree = null;
		Object NEW338_tree = null;
		Object LPAREN339_tree = null;
		Object RPAREN341_tree = null;
		Object SEMI343_tree = null;
		Object FUNCTION345_tree = null;
		Object IDENTIFIER346_tree = null;
		Object LPAREN348_tree = null;
		Object RPAREN350_tree = null;
		Object SEMI352_tree = null;
		Object FUNCTION353_tree = null;
		Object NEW354_tree = null;
		Object LPAREN355_tree = null;
		Object RPAREN357_tree = null;
		Object SEMI359_tree = null;
		Object FUNCTION360_tree = null;
		Object IDENTIFIER361_tree = null;
		Object LPAREN363_tree = null;
		Object RPAREN365_tree = null;
		Object SEMI367_tree = null;
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
			if (state.backtracking > 0 && alreadyParsedRule(input, 73)) {
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
			int alt71 = 4;
			alt71 = dfa71.predict(input);
			switch (alt71) {
			case 1:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:370:4:
				// declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt
				// SEMI
			{
				pushFollow(FOLLOW_declAttrList_in_funcProtoDecl3440);
				declAttrList336 = declAttrList();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_declAttrList.add(declAttrList336.getTree());
				FUNCTION337 = (Token) match(input, FUNCTION,
						FOLLOW_FUNCTION_in_funcProtoDecl3442);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_FUNCTION.add(FUNCTION337);

				NEW338 = (Token) match(input, NEW,
						FOLLOW_NEW_in_funcProtoDecl3444);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_NEW.add(NEW338);

				LPAREN339 = (Token) match(input, LPAREN,
						FOLLOW_LPAREN_in_funcProtoDecl3446);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_LPAREN.add(LPAREN339);

				pushFollow(FOLLOW_paramList_in_funcProtoDecl3448);
				paramList340 = paramList();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_paramList.add(paramList340.getTree());
				RPAREN341 = (Token) match(input, RPAREN,
						FOLLOW_RPAREN_in_funcProtoDecl3450);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_RPAREN.add(RPAREN341);

				pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl3452);
				typeTagOpt342 = typeTagOpt();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_typeTagOpt.add(typeTagOpt342.getTree());
				SEMI343 = (Token) match(input, SEMI,
						FOLLOW_SEMI_in_funcProtoDecl3454);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_SEMI.add(SEMI343);

				// AST REWRITE
				// elements: declAttrList, paramList, typeTagOpt, FUNCTION, NEW
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
					// 371:4: -> ^( FUNCTION ( NEW )? ( paramList )? (
					// typeTagOpt )? ( declAttrList )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:371:7:
						// ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? (
						// declAttrList )? )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(
									stream_FUNCTION.nextNode(), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:371:18:
							// ( NEW )?
							if (stream_NEW.hasNext()) {
								adaptor.addChild(root_1, stream_NEW.nextNode());

							}
							stream_NEW.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:371:23:
							// ( paramList )?
							if (stream_paramList.hasNext()) {
								adaptor.addChild(root_1, stream_paramList
										.nextTree());

							}
							stream_paramList.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:371:34:
							// ( typeTagOpt )?
							if (stream_typeTagOpt.hasNext()) {
								adaptor.addChild(root_1, stream_typeTagOpt
										.nextTree());

							}
							stream_typeTagOpt.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:371:46:
							// ( declAttrList )?
							if (stream_declAttrList.hasNext()) {
								adaptor.addChild(root_1, stream_declAttrList
										.nextTree());

							}
							stream_declAttrList.reset();

							adaptor.addChild(root_0, root_1);
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
				pushFollow(FOLLOW_declAttrList_in_funcProtoDecl3481);
				declAttrList344 = declAttrList();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_declAttrList.add(declAttrList344.getTree());
				FUNCTION345 = (Token) match(input, FUNCTION,
						FOLLOW_FUNCTION_in_funcProtoDecl3483);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_FUNCTION.add(FUNCTION345);

				IDENTIFIER346 = (Token) match(input, IDENTIFIER,
						FOLLOW_IDENTIFIER_in_funcProtoDecl3485);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_IDENTIFIER.add(IDENTIFIER346);

				pushFollow(FOLLOW_typeParamOpt_in_funcProtoDecl3487);
				typeParamOpt347 = typeParamOpt();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_typeParamOpt.add(typeParamOpt347.getTree());
				LPAREN348 = (Token) match(input, LPAREN,
						FOLLOW_LPAREN_in_funcProtoDecl3489);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_LPAREN.add(LPAREN348);

				pushFollow(FOLLOW_paramList_in_funcProtoDecl3491);
				paramList349 = paramList();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_paramList.add(paramList349.getTree());
				RPAREN350 = (Token) match(input, RPAREN,
						FOLLOW_RPAREN_in_funcProtoDecl3493);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_RPAREN.add(RPAREN350);

				pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl3495);
				typeTagOpt351 = typeTagOpt();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_typeTagOpt.add(typeTagOpt351.getTree());
				SEMI352 = (Token) match(input, SEMI,
						FOLLOW_SEMI_in_funcProtoDecl3497);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_SEMI.add(SEMI352);

				// AST REWRITE
				// elements: FUNCTION, declAttrList, typeTagOpt, IDENTIFIER,
				// typeParamOpt, paramList
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
					// 373:4: -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? (
					// typeTagOpt )? ( declAttrList )? ( typeParamOpt )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:373:6:
						// ^( FUNCTION ( IDENTIFIER )? ( paramList )? (
						// typeTagOpt )? ( declAttrList )? ( typeParamOpt )? )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(
									stream_FUNCTION.nextNode(), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:373:17:
							// ( IDENTIFIER )?
							if (stream_IDENTIFIER.hasNext()) {
								adaptor.addChild(root_1, stream_IDENTIFIER
										.nextNode());

							}
							stream_IDENTIFIER.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:373:29:
							// ( paramList )?
							if (stream_paramList.hasNext()) {
								adaptor.addChild(root_1, stream_paramList
										.nextTree());

							}
							stream_paramList.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:373:40:
							// ( typeTagOpt )?
							if (stream_typeTagOpt.hasNext()) {
								adaptor.addChild(root_1, stream_typeTagOpt
										.nextTree());

							}
							stream_typeTagOpt.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:373:52:
							// ( declAttrList )?
							if (stream_declAttrList.hasNext()) {
								adaptor.addChild(root_1, stream_declAttrList
										.nextTree());

							}
							stream_declAttrList.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:373:66:
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
			case 3:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:374:4:
				// FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI
			{
				FUNCTION353 = (Token) match(input, FUNCTION,
						FOLLOW_FUNCTION_in_funcProtoDecl3526);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_FUNCTION.add(FUNCTION353);

				NEW354 = (Token) match(input, NEW,
						FOLLOW_NEW_in_funcProtoDecl3528);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_NEW.add(NEW354);

				LPAREN355 = (Token) match(input, LPAREN,
						FOLLOW_LPAREN_in_funcProtoDecl3530);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_LPAREN.add(LPAREN355);

				pushFollow(FOLLOW_paramList_in_funcProtoDecl3532);
				paramList356 = paramList();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_paramList.add(paramList356.getTree());
				RPAREN357 = (Token) match(input, RPAREN,
						FOLLOW_RPAREN_in_funcProtoDecl3534);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_RPAREN.add(RPAREN357);

				pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl3536);
				typeTagOpt358 = typeTagOpt();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_typeTagOpt.add(typeTagOpt358.getTree());
				SEMI359 = (Token) match(input, SEMI,
						FOLLOW_SEMI_in_funcProtoDecl3538);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_SEMI.add(SEMI359);

				// AST REWRITE
				// elements: FUNCTION, typeTagOpt, NEW, paramList
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
					// 375:4: -> ^( FUNCTION ( NEW )? ( paramList )? (
					// typeTagOpt )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:375:7:
						// ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(
									stream_FUNCTION.nextNode(), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:375:18:
							// ( NEW )?
							if (stream_NEW.hasNext()) {
								adaptor.addChild(root_1, stream_NEW.nextNode());

							}
							stream_NEW.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:375:23:
							// ( paramList )?
							if (stream_paramList.hasNext()) {
								adaptor.addChild(root_1, stream_paramList
										.nextTree());

							}
							stream_paramList.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:375:34:
							// ( typeTagOpt )?
							if (stream_typeTagOpt.hasNext()) {
								adaptor.addChild(root_1, stream_typeTagOpt
										.nextTree());

							}
							stream_typeTagOpt.reset();

							adaptor.addChild(root_0, root_1);
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
				FUNCTION360 = (Token) match(input, FUNCTION,
						FOLLOW_FUNCTION_in_funcProtoDecl3562);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_FUNCTION.add(FUNCTION360);

				IDENTIFIER361 = (Token) match(input, IDENTIFIER,
						FOLLOW_IDENTIFIER_in_funcProtoDecl3564);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_IDENTIFIER.add(IDENTIFIER361);

				pushFollow(FOLLOW_typeParamOpt_in_funcProtoDecl3566);
				typeParamOpt362 = typeParamOpt();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_typeParamOpt.add(typeParamOpt362.getTree());
				LPAREN363 = (Token) match(input, LPAREN,
						FOLLOW_LPAREN_in_funcProtoDecl3568);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_LPAREN.add(LPAREN363);

				pushFollow(FOLLOW_paramList_in_funcProtoDecl3570);
				paramList364 = paramList();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_paramList.add(paramList364.getTree());
				RPAREN365 = (Token) match(input, RPAREN,
						FOLLOW_RPAREN_in_funcProtoDecl3572);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_RPAREN.add(RPAREN365);

				pushFollow(FOLLOW_typeTagOpt_in_funcProtoDecl3574);
				typeTagOpt366 = typeTagOpt();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_typeTagOpt.add(typeTagOpt366.getTree());
				SEMI367 = (Token) match(input, SEMI,
						FOLLOW_SEMI_in_funcProtoDecl3576);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_SEMI.add(SEMI367);

				// AST REWRITE
				// elements: FUNCTION, typeParamOpt, paramList, typeTagOpt,
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
					// 377:4: -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? (
					// typeTagOpt )? ( typeParamOpt )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:377:6:
						// ^( FUNCTION ( IDENTIFIER )? ( paramList )? (
						// typeTagOpt )? ( typeParamOpt )? )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(
									stream_FUNCTION.nextNode(), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:377:17:
							// ( IDENTIFIER )?
							if (stream_IDENTIFIER.hasNext()) {
								adaptor.addChild(root_1, stream_IDENTIFIER
										.nextNode());

							}
							stream_IDENTIFIER.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:377:29:
							// ( paramList )?
							if (stream_paramList.hasNext()) {
								adaptor.addChild(root_1, stream_paramList
										.nextTree());

							}
							stream_paramList.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:377:40:
							// ( typeTagOpt )?
							if (stream_typeTagOpt.hasNext()) {
								adaptor.addChild(root_1, stream_typeTagOpt
										.nextTree());

							}
							stream_typeTagOpt.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:377:52:
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
				memoize(input, 73, funcProtoDecl_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "funcProtoDecl"

	public static class classDecl_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "classDecl"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:380:1:
	// classDecl : ( EXTERN )? CLASS IDENTIFIER typeParamOpt inheritListOpt lb=
	// LBRACE classBodyScope[$lb] RBRACE -> ^( CLASS IDENTIFIER ( EXTERN )? (
	// typeParamOpt )? ( inheritListOpt )? ( classBodyScope )? RBRACE[$RBRACE,
	// true] ) ;
	public final TinyHaxeTry1Parser.classDecl_return classDecl()
			throws RecognitionException {
		TinyHaxeTry1Parser.classDecl_return retval = new TinyHaxeTry1Parser.classDecl_return();
		retval.start = input.LT(1);
		int classDecl_StartIndex = input.index();
		Object root_0 = null;

		Token lb = null;
		Token EXTERN368 = null;
		Token CLASS369 = null;
		Token IDENTIFIER370 = null;
		Token RBRACE374 = null;
		TinyHaxeTry1Parser.typeParamOpt_return typeParamOpt371 = null;

		TinyHaxeTry1Parser.inheritListOpt_return inheritListOpt372 = null;

		TinyHaxeTry1Parser.classBodyScope_return classBodyScope373 = null;

		Object lb_tree = null;
		Object EXTERN368_tree = null;
		Object CLASS369_tree = null;
		Object IDENTIFIER370_tree = null;
		Object RBRACE374_tree = null;
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
			if (state.backtracking > 0 && alreadyParsedRule(input, 74)) {
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
				int alt72 = 2;
				int LA72_0 = input.LA(1);

				if ((LA72_0 == EXTERN)) {
					alt72 = 1;
				}
				switch (alt72) {
				case 1:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:0:0:
					// EXTERN
				{
					EXTERN368 = (Token) match(input, EXTERN,
							FOLLOW_EXTERN_in_classDecl3609);
					if (state.failed)
						return retval;
					if (state.backtracking == 0)
						stream_EXTERN.add(EXTERN368);

				}
					break;

				}

				CLASS369 = (Token) match(input, CLASS,
						FOLLOW_CLASS_in_classDecl3612);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_CLASS.add(CLASS369);

				IDENTIFIER370 = (Token) match(input, IDENTIFIER,
						FOLLOW_IDENTIFIER_in_classDecl3614);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_IDENTIFIER.add(IDENTIFIER370);

				pushFollow(FOLLOW_typeParamOpt_in_classDecl3616);
				typeParamOpt371 = typeParamOpt();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_typeParamOpt.add(typeParamOpt371.getTree());
				pushFollow(FOLLOW_inheritListOpt_in_classDecl3618);
				inheritListOpt372 = inheritListOpt();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_inheritListOpt.add(inheritListOpt372.getTree());
				lb = (Token) match(input, LBRACE,
						FOLLOW_LBRACE_in_classDecl3622);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_LBRACE.add(lb);

				pushFollow(FOLLOW_classBodyScope_in_classDecl3624);
				classBodyScope373 = classBodyScope(lb);

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_classBodyScope.add(classBodyScope373.getTree());
				RBRACE374 = (Token) match(input, RBRACE,
						FOLLOW_RBRACE_in_classDecl3627);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_RBRACE.add(RBRACE374);

				// AST REWRITE
				// elements: classBodyScope, CLASS, IDENTIFIER, typeParamOpt,
				// inheritListOpt, EXTERN, RBRACE
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
					// 382:4: -> ^( CLASS IDENTIFIER ( EXTERN )? ( typeParamOpt
					// )? ( inheritListOpt )? ( classBodyScope )?
					// RBRACE[$RBRACE, true] )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:382:7:
						// ^( CLASS IDENTIFIER ( EXTERN )? ( typeParamOpt )? (
						// inheritListOpt )? ( classBodyScope )? RBRACE[$RBRACE,
						// true] )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(new ClassNode(
									stream_CLASS.nextToken()), root_1);

							adaptor.addChild(root_1, stream_IDENTIFIER
									.nextNode());
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:382:37:
							// ( EXTERN )?
							if (stream_EXTERN.hasNext()) {
								adaptor.addChild(root_1, stream_EXTERN
										.nextNode());

							}
							stream_EXTERN.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:382:45:
							// ( typeParamOpt )?
							if (stream_typeParamOpt.hasNext()) {
								adaptor.addChild(root_1, stream_typeParamOpt
										.nextTree());

							}
							stream_typeParamOpt.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:382:59:
							// ( inheritListOpt )?
							if (stream_inheritListOpt.hasNext()) {
								adaptor.addChild(root_1, stream_inheritListOpt
										.nextTree());

							}
							stream_inheritListOpt.reset();
							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:382:75:
							// ( classBodyScope )?
							if (stream_classBodyScope.hasNext()) {
								adaptor.addChild(root_1, stream_classBodyScope
										.nextTree());

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
												.setrBracketPosition(((CommonToken) RBRACE374)
														.getStartIndex());
									}
								}
							}
							// adaptor.addChild(root_1, new
							// ExtendedCommonTree(RBRACE, RBRACE374, true));

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
				memoize(input, 74, classDecl_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "classDecl"

	public static class classBodyScope_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "classBodyScope"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:385:1:
	// classBodyScope[Token lBracket] : classBody -> ^(
	// BLOCK_SCOPE[\"BLOCK_SCOPE\",true, $lBracket] ( classBody )? ) ;
	public final TinyHaxeTry1Parser.classBodyScope_return classBodyScope(
			Token lBracket) throws RecognitionException {
		TinyHaxeTry1Parser.classBodyScope_return retval = new TinyHaxeTry1Parser.classBodyScope_return();
		retval.start = input.LT(1);
		int classBodyScope_StartIndex = input.index();
		Object root_0 = null;

		TinyHaxeTry1Parser.classBody_return classBody375 = null;

		RewriteRuleSubtreeStream stream_classBody = new RewriteRuleSubtreeStream(
				adaptor, "rule classBody");
		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 75)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:386:2:
			// ( classBody -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\",true, $lBracket] (
			// classBody )? ) )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:386:4:
			// classBody
			{
				pushFollow(FOLLOW_classBody_in_classBodyScope3673);
				classBody375 = classBody();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_classBody.add(classBody375.getTree());

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
					// 386:14: -> ^( BLOCK_SCOPE[\"BLOCK_SCOPE\",true,
					// $lBracket] ( classBody )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:386:17:
						// ^( BLOCK_SCOPE[\"BLOCK_SCOPE\",true, $lBracket] (
						// classBody )? )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(
									new BlockScopeNode(BLOCK_SCOPE,
											"BLOCK_SCOPE", true, lBracket),
									root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:386:78:
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
				memoize(input, 75, classBodyScope_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "classBodyScope"

	public static class classBody_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "classBody"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:389:1:
	// classBody : ( varDecl classBody | funcDecl classBody | pp classBody |
	// enumDecl classBody | );
	public final TinyHaxeTry1Parser.classBody_return classBody()
			throws RecognitionException {
		TinyHaxeTry1Parser.classBody_return retval = new TinyHaxeTry1Parser.classBody_return();
		retval.start = input.LT(1);
		int classBody_StartIndex = input.index();
		Object root_0 = null;

		TinyHaxeTry1Parser.varDecl_return varDecl376 = null;

		TinyHaxeTry1Parser.classBody_return classBody377 = null;

		TinyHaxeTry1Parser.funcDecl_return funcDecl378 = null;

		TinyHaxeTry1Parser.classBody_return classBody379 = null;

		TinyHaxeTry1Parser.pp_return pp380 = null;

		TinyHaxeTry1Parser.classBody_return classBody381 = null;

		TinyHaxeTry1Parser.enumDecl_return enumDecl382 = null;

		TinyHaxeTry1Parser.classBody_return classBody383 = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 76)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:390:2:
			// ( varDecl classBody | funcDecl classBody | pp classBody |
			// enumDecl classBody | )
			int alt73 = 5;
			alt73 = dfa73.predict(input);
			switch (alt73) {
			case 1:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:390:4:
				// varDecl classBody
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_varDecl_in_classBody3697);
				varDecl376 = varDecl();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, varDecl376.getTree());
				pushFollow(FOLLOW_classBody_in_classBody3699);
				classBody377 = classBody();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, classBody377.getTree());

			}
				break;
			case 2:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:391:4:
				// funcDecl classBody
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_funcDecl_in_classBody3704);
				funcDecl378 = funcDecl();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, funcDecl378.getTree());
				pushFollow(FOLLOW_classBody_in_classBody3706);
				classBody379 = classBody();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, classBody379.getTree());

			}
				break;
			case 3:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:392:4:
				// pp classBody
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_pp_in_classBody3711);
				pp380 = pp();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, pp380.getTree());
				pushFollow(FOLLOW_classBody_in_classBody3713);
				classBody381 = classBody();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, classBody381.getTree());

			}
				break;
			case 4:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:393:4:
				// enumDecl classBody
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_enumDecl_in_classBody3718);
				enumDecl382 = enumDecl();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, enumDecl382.getTree());
				pushFollow(FOLLOW_classBody_in_classBody3720);
				classBody383 = classBody();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, classBody383.getTree());

			}
				break;
			case 5:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:395:2:
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
				memoize(input, 76, classBody_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "classBody"

	public static class interfaceDecl_return extends ParserRuleReturnScope {
		Object tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "interfaceDecl"
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:397:1:
	// interfaceDecl : INTERFACE type inheritListOpt LBRACE interfaceBody RBRACE
	// ;
	public final TinyHaxeTry1Parser.interfaceDecl_return interfaceDecl()
			throws RecognitionException {
		TinyHaxeTry1Parser.interfaceDecl_return retval = new TinyHaxeTry1Parser.interfaceDecl_return();
		retval.start = input.LT(1);
		int interfaceDecl_StartIndex = input.index();
		Object root_0 = null;

		Token INTERFACE384 = null;
		Token LBRACE387 = null;
		Token RBRACE389 = null;
		TinyHaxeTry1Parser.type_return type385 = null;

		TinyHaxeTry1Parser.inheritListOpt_return inheritListOpt386 = null;

		TinyHaxeTry1Parser.interfaceBody_return interfaceBody388 = null;

		Object INTERFACE384_tree = null;
		Object LBRACE387_tree = null;
		Object RBRACE389_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 77)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:398:2:
			// ( INTERFACE type inheritListOpt LBRACE interfaceBody RBRACE )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:398:4:
			// INTERFACE type inheritListOpt LBRACE interfaceBody RBRACE
			{
				root_0 = (Object) adaptor.nil();

				INTERFACE384 = (Token) match(input, INTERFACE,
						FOLLOW_INTERFACE_in_interfaceDecl3740);
				if (state.failed)
					return retval;
				if (state.backtracking == 0) {
					INTERFACE384_tree = (Object) adaptor.create(INTERFACE384);
					adaptor.addChild(root_0, INTERFACE384_tree);
				}
				pushFollow(FOLLOW_type_in_interfaceDecl3742);
				type385 = type();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, type385.getTree());
				pushFollow(FOLLOW_inheritListOpt_in_interfaceDecl3744);
				inheritListOpt386 = inheritListOpt();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, inheritListOpt386.getTree());
				LBRACE387 = (Token) match(input, LBRACE,
						FOLLOW_LBRACE_in_interfaceDecl3746);
				if (state.failed)
					return retval;
				pushFollow(FOLLOW_interfaceBody_in_interfaceDecl3749);
				interfaceBody388 = interfaceBody();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, interfaceBody388.getTree());
				RBRACE389 = (Token) match(input, RBRACE,
						FOLLOW_RBRACE_in_interfaceDecl3751);
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
				memoize(input, 77, interfaceDecl_StartIndex);
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:401:1:
	// interfaceBody : ( varDecl interfaceBody | funcProtoDecl interfaceBody |
	// pp interfaceBody | );
	public final TinyHaxeTry1Parser.interfaceBody_return interfaceBody()
			throws RecognitionException {
		TinyHaxeTry1Parser.interfaceBody_return retval = new TinyHaxeTry1Parser.interfaceBody_return();
		retval.start = input.LT(1);
		int interfaceBody_StartIndex = input.index();
		Object root_0 = null;

		TinyHaxeTry1Parser.varDecl_return varDecl390 = null;

		TinyHaxeTry1Parser.interfaceBody_return interfaceBody391 = null;

		TinyHaxeTry1Parser.funcProtoDecl_return funcProtoDecl392 = null;

		TinyHaxeTry1Parser.interfaceBody_return interfaceBody393 = null;

		TinyHaxeTry1Parser.pp_return pp394 = null;

		TinyHaxeTry1Parser.interfaceBody_return interfaceBody395 = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 78)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:402:2:
			// ( varDecl interfaceBody | funcProtoDecl interfaceBody | pp
			// interfaceBody | )
			int alt74 = 4;
			alt74 = dfa74.predict(input);
			switch (alt74) {
			case 1:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:402:4:
				// varDecl interfaceBody
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_varDecl_in_interfaceBody3764);
				varDecl390 = varDecl();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, varDecl390.getTree());
				pushFollow(FOLLOW_interfaceBody_in_interfaceBody3766);
				interfaceBody391 = interfaceBody();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, interfaceBody391.getTree());

			}
				break;
			case 2:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:403:4:
				// funcProtoDecl interfaceBody
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_funcProtoDecl_in_interfaceBody3771);
				funcProtoDecl392 = funcProtoDecl();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, funcProtoDecl392.getTree());
				pushFollow(FOLLOW_interfaceBody_in_interfaceBody3773);
				interfaceBody393 = interfaceBody();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, interfaceBody393.getTree());

			}
				break;
			case 3:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:404:4:
				// pp interfaceBody
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_pp_in_interfaceBody3778);
				pp394 = pp();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, pp394.getTree());
				pushFollow(FOLLOW_interfaceBody_in_interfaceBody3780);
				interfaceBody395 = interfaceBody();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, interfaceBody395.getTree());

			}
				break;
			case 4:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:406:2:
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
				memoize(input, 78, interfaceBody_StartIndex);
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:408:1:
	// inheritList : inherit ( COMMA inherit )* ;
	public final TinyHaxeTry1Parser.inheritList_return inheritList()
			throws RecognitionException {
		TinyHaxeTry1Parser.inheritList_return retval = new TinyHaxeTry1Parser.inheritList_return();
		retval.start = input.LT(1);
		int inheritList_StartIndex = input.index();
		Object root_0 = null;

		Token COMMA397 = null;
		TinyHaxeTry1Parser.inherit_return inherit396 = null;

		TinyHaxeTry1Parser.inherit_return inherit398 = null;

		Object COMMA397_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 79)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:409:2:
			// ( inherit ( COMMA inherit )* )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:409:4:
			// inherit ( COMMA inherit )*
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_inherit_in_inheritList3801);
				inherit396 = inherit();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, inherit396.getTree());
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:409:12:
				// ( COMMA inherit )*
				loop75: do {
					int alt75 = 2;
					int LA75_0 = input.LA(1);

					if ((LA75_0 == COMMA)) {
						alt75 = 1;
					}

					switch (alt75) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:409:13:
						// COMMA inherit
					{
						COMMA397 = (Token) match(input, COMMA,
								FOLLOW_COMMA_in_inheritList3804);
						if (state.failed)
							return retval;
						pushFollow(FOLLOW_inherit_in_inheritList3807);
						inherit398 = inherit();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							adaptor.addChild(root_0, inherit398.getTree());

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
				memoize(input, 79, inheritList_StartIndex);
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:412:1:
	// inheritListOpt : ( inheritList -> ^(
	// INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\",true] ( inheritList )? ) | );
	public final TinyHaxeTry1Parser.inheritListOpt_return inheritListOpt()
			throws RecognitionException {
		TinyHaxeTry1Parser.inheritListOpt_return retval = new TinyHaxeTry1Parser.inheritListOpt_return();
		retval.start = input.LT(1);
		int inheritListOpt_StartIndex = input.index();
		Object root_0 = null;

		TinyHaxeTry1Parser.inheritList_return inheritList399 = null;

		RewriteRuleSubtreeStream stream_inheritList = new RewriteRuleSubtreeStream(
				adaptor, "rule inheritList");
		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 80)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:413:2:
			// ( inheritList -> ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\",true] (
			// inheritList )? ) | )
			int alt76 = 2;
			int LA76_0 = input.LA(1);

			if (((LA76_0 >= EXTENDS && LA76_0 <= IMPLEMENTS))) {
				alt76 = 1;
			} else if ((LA76_0 == LBRACE)) {
				alt76 = 2;
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return retval;
				}
				NoViableAltException nvae = new NoViableAltException("", 76, 0,
						input);

				throw nvae;
			}
			switch (alt76) {
			case 1:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:413:4:
				// inheritList
			{
				pushFollow(FOLLOW_inheritList_in_inheritListOpt3825);
				inheritList399 = inheritList();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_inheritList.add(inheritList399.getTree());

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
					// 413:16: -> ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\",true]
					// ( inheritList )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:413:18:
						// ^( INHERIT_LIST_OPT[\"INHERIT_LIST_OPT\",true] (
						// inheritList )? )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(
									new ExtendedCommonTree(INHERIT_LIST_OPT,
											"INHERIT_LIST_OPT", true), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:413:82:
							// ( inheritList )?
							if (stream_inheritList.hasNext()) {
								adaptor.addChild(root_1, stream_inheritList
										.nextTree());

							}
							stream_inheritList.reset();

							adaptor.addChild(root_0, root_1);
						}

					}

					retval.tree = root_0;
				}
			}
				break;
			case 2:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:415:6:
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
				memoize(input, 80, inheritListOpt_StartIndex);
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:417:1:
	// inherit : ( EXTENDS type -> ^( EXTENDS ( type )? ) | IMPLEMENTS type ->
	// ^( IMPLEMENTS ( type )? ) );
	public final TinyHaxeTry1Parser.inherit_return inherit()
			throws RecognitionException {
		TinyHaxeTry1Parser.inherit_return retval = new TinyHaxeTry1Parser.inherit_return();
		retval.start = input.LT(1);
		int inherit_StartIndex = input.index();
		Object root_0 = null;

		Token EXTENDS400 = null;
		Token IMPLEMENTS402 = null;
		TinyHaxeTry1Parser.type_return type401 = null;

		TinyHaxeTry1Parser.type_return type403 = null;

		Object EXTENDS400_tree = null;
		Object IMPLEMENTS402_tree = null;
		RewriteRuleTokenStream stream_IMPLEMENTS = new RewriteRuleTokenStream(
				adaptor, "token IMPLEMENTS");
		RewriteRuleTokenStream stream_EXTENDS = new RewriteRuleTokenStream(
				adaptor, "token EXTENDS");
		RewriteRuleSubtreeStream stream_type = new RewriteRuleSubtreeStream(
				adaptor, "rule type");
		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 81)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:417:9:
			// ( EXTENDS type -> ^( EXTENDS ( type )? ) | IMPLEMENTS type -> ^(
			// IMPLEMENTS ( type )? ) )
			int alt77 = 2;
			int LA77_0 = input.LA(1);

			if ((LA77_0 == EXTENDS)) {
				alt77 = 1;
			} else if ((LA77_0 == IMPLEMENTS)) {
				alt77 = 2;
			} else {
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
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:417:11:
				// EXTENDS type
			{
				EXTENDS400 = (Token) match(input, EXTENDS,
						FOLLOW_EXTENDS_in_inherit3860);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_EXTENDS.add(EXTENDS400);

				pushFollow(FOLLOW_type_in_inherit3862);
				type401 = type();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_type.add(type401.getTree());

				// AST REWRITE
				// elements: type, EXTENDS
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
					// 417:25: -> ^( EXTENDS ( type )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:417:28:
						// ^( EXTENDS ( type )? )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(stream_EXTENDS
									.nextNode(), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:417:38:
							// ( type )?
							if (stream_type.hasNext()) {
								adaptor
										.addChild(root_1, stream_type
												.nextTree());

							}
							stream_type.reset();

							adaptor.addChild(root_0, root_1);
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
				IMPLEMENTS402 = (Token) match(input, IMPLEMENTS,
						FOLLOW_IMPLEMENTS_in_inherit3884);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_IMPLEMENTS.add(IMPLEMENTS402);

				pushFollow(FOLLOW_type_in_inherit3886);
				type403 = type();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_type.add(type403.getTree());

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
					// 418:27: -> ^( IMPLEMENTS ( type )? )
					{
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:418:30:
						// ^( IMPLEMENTS ( type )? )
						{
							Object root_1 = (Object) adaptor.nil();
							root_1 = (Object) adaptor.becomeRoot(
									stream_IMPLEMENTS.nextNode(), root_1);

							// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:418:43:
							// ( type )?
							if (stream_type.hasNext()) {
								adaptor
										.addChild(root_1, stream_type
												.nextTree());

							}
							stream_type.reset();

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
				memoize(input, 81, inherit_StartIndex);
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:421:1:
	// typedefDecl : TYPEDEF IDENTIFIER EQ funcType ;
	public final TinyHaxeTry1Parser.typedefDecl_return typedefDecl()
			throws RecognitionException {
		TinyHaxeTry1Parser.typedefDecl_return retval = new TinyHaxeTry1Parser.typedefDecl_return();
		retval.start = input.LT(1);
		int typedefDecl_StartIndex = input.index();
		Object root_0 = null;

		Token TYPEDEF404 = null;
		Token IDENTIFIER405 = null;
		Token EQ406 = null;
		TinyHaxeTry1Parser.funcType_return funcType407 = null;

		Object TYPEDEF404_tree = null;
		Object IDENTIFIER405_tree = null;
		Object EQ406_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 82)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:422:2:
			// ( TYPEDEF IDENTIFIER EQ funcType )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:422:4:
			// TYPEDEF IDENTIFIER EQ funcType
			{
				root_0 = (Object) adaptor.nil();

				TYPEDEF404 = (Token) match(input, TYPEDEF,
						FOLLOW_TYPEDEF_in_typedefDecl3914);
				if (state.failed)
					return retval;
				if (state.backtracking == 0) {
					TYPEDEF404_tree = (Object) adaptor.create(TYPEDEF404);
					adaptor.addChild(root_0, TYPEDEF404_tree);
				}
				IDENTIFIER405 = (Token) match(input, IDENTIFIER,
						FOLLOW_IDENTIFIER_in_typedefDecl3916);
				if (state.failed)
					return retval;
				if (state.backtracking == 0) {
					IDENTIFIER405_tree = (Object) adaptor.create(IDENTIFIER405);
					adaptor.addChild(root_0, IDENTIFIER405_tree);
				}
				EQ406 = (Token) match(input, EQ, FOLLOW_EQ_in_typedefDecl3918);
				if (state.failed)
					return retval;
				if (state.backtracking == 0) {
					EQ406_tree = (Object) adaptor.create(EQ406);
					adaptor.addChild(root_0, EQ406_tree);
				}
				pushFollow(FOLLOW_funcType_in_typedefDecl3920);
				funcType407 = funcType();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, funcType407.getTree());

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
				memoize(input, 82, typedefDecl_StartIndex);
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:425:1:
	// typeExtend : GT funcType COMMA ;
	public final TinyHaxeTry1Parser.typeExtend_return typeExtend()
			throws RecognitionException {
		TinyHaxeTry1Parser.typeExtend_return retval = new TinyHaxeTry1Parser.typeExtend_return();
		retval.start = input.LT(1);
		int typeExtend_StartIndex = input.index();
		Object root_0 = null;

		Token GT408 = null;
		Token COMMA410 = null;
		TinyHaxeTry1Parser.funcType_return funcType409 = null;

		Object GT408_tree = null;
		Object COMMA410_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 83)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:426:9:
			// ( GT funcType COMMA )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:426:11:
			// GT funcType COMMA
			{
				root_0 = (Object) adaptor.nil();

				GT408 = (Token) match(input, GT, FOLLOW_GT_in_typeExtend3939);
				if (state.failed)
					return retval;
				if (state.backtracking == 0) {
					GT408_tree = (Object) adaptor.create(GT408);
					adaptor.addChild(root_0, GT408_tree);
				}
				pushFollow(FOLLOW_funcType_in_typeExtend3941);
				funcType409 = funcType();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, funcType409.getTree());
				COMMA410 = (Token) match(input, COMMA,
						FOLLOW_COMMA_in_typeExtend3943);
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
				memoize(input, 83, typeExtend_StartIndex);
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:429:1:
	// anonType : LBRACE ( | anonTypeFieldList | varDeclList | typeExtend ( |
	// anonTypeFieldList | varDeclList ) ) RBRACE ;
	public final TinyHaxeTry1Parser.anonType_return anonType()
			throws RecognitionException {
		TinyHaxeTry1Parser.anonType_return retval = new TinyHaxeTry1Parser.anonType_return();
		retval.start = input.LT(1);
		int anonType_StartIndex = input.index();
		Object root_0 = null;

		Token LBRACE411 = null;
		Token RBRACE417 = null;
		TinyHaxeTry1Parser.anonTypeFieldList_return anonTypeFieldList412 = null;

		TinyHaxeTry1Parser.varDeclList_return varDeclList413 = null;

		TinyHaxeTry1Parser.typeExtend_return typeExtend414 = null;

		TinyHaxeTry1Parser.anonTypeFieldList_return anonTypeFieldList415 = null;

		TinyHaxeTry1Parser.varDeclList_return varDeclList416 = null;

		Object LBRACE411_tree = null;
		Object RBRACE417_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 84)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:429:9:
			// ( LBRACE ( | anonTypeFieldList | varDeclList | typeExtend ( |
			// anonTypeFieldList | varDeclList ) ) RBRACE )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:429:11:
			// LBRACE ( | anonTypeFieldList | varDeclList | typeExtend ( |
			// anonTypeFieldList | varDeclList ) ) RBRACE
			{
				root_0 = (Object) adaptor.nil();

				LBRACE411 = (Token) match(input, LBRACE,
						FOLLOW_LBRACE_in_anonType3954);
				if (state.failed)
					return retval;
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:430:4:
				// ( | anonTypeFieldList | varDeclList | typeExtend ( |
				// anonTypeFieldList | varDeclList ) )
				int alt79 = 4;
				switch (input.LA(1)) {
				case RBRACE: {
					alt79 = 1;
				}
					break;
				case IDENTIFIER: {
					alt79 = 2;
				}
					break;
				case PUBLIC:
				case PRIVATE:
				case STATIC:
				case INLINE:
				case DYNAMIC:
				case OVERRIDE:
				case VAR: {
					alt79 = 3;
				}
					break;
				case GT: {
					alt79 = 4;
				}
					break;
				default:
					if (state.backtracking > 0) {
						state.failed = true;
						return retval;
					}
					NoViableAltException nvae = new NoViableAltException("",
							79, 0, input);

					throw nvae;
				}

				switch (alt79) {
				case 1:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:431:22:
				{
				}
					break;
				case 2:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:431:27:
					// anonTypeFieldList
				{
					pushFollow(FOLLOW_anonTypeFieldList_in_anonType3989);
					anonTypeFieldList412 = anonTypeFieldList();

					state._fsp--;
					if (state.failed)
						return retval;
					if (state.backtracking == 0)
						adaptor
								.addChild(root_0, anonTypeFieldList412
										.getTree());

				}
					break;
				case 3:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:432:26:
					// varDeclList
				{
					pushFollow(FOLLOW_varDeclList_in_anonType4017);
					varDeclList413 = varDeclList();

					state._fsp--;
					if (state.failed)
						return retval;
					if (state.backtracking == 0)
						adaptor.addChild(root_0, varDeclList413.getTree());

				}
					break;
				case 4:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:433:27:
					// typeExtend ( | anonTypeFieldList | varDeclList )
				{
					pushFollow(FOLLOW_typeExtend_in_anonType4046);
					typeExtend414 = typeExtend();

					state._fsp--;
					if (state.failed)
						return retval;
					if (state.backtracking == 0)
						adaptor.addChild(root_0, typeExtend414.getTree());
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:433:38:
					// ( | anonTypeFieldList | varDeclList )
					int alt78 = 3;
					switch (input.LA(1)) {
					case RBRACE: {
						alt78 = 1;
					}
						break;
					case IDENTIFIER: {
						alt78 = 2;
					}
						break;
					case PUBLIC:
					case PRIVATE:
					case STATIC:
					case INLINE:
					case DYNAMIC:
					case OVERRIDE:
					case VAR: {
						alt78 = 3;
					}
						break;
					default:
						if (state.backtracking > 0) {
							state.failed = true;
							return retval;
						}
						NoViableAltException nvae = new NoViableAltException(
								"", 78, 0, input);

						throw nvae;
					}

					switch (alt78) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:434:24:
					{
					}
						break;
					case 2:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:434:25:
						// anonTypeFieldList
					{
						pushFollow(FOLLOW_anonTypeFieldList_in_anonType4074);
						anonTypeFieldList415 = anonTypeFieldList();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							adaptor.addChild(root_0, anonTypeFieldList415
									.getTree());

					}
						break;
					case 3:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:435:25:
						// varDeclList
					{
						pushFollow(FOLLOW_varDeclList_in_anonType4100);
						varDeclList416 = varDeclList();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							adaptor.addChild(root_0, varDeclList416.getTree());

					}
						break;

					}

				}
					break;

				}

				RBRACE417 = (Token) match(input, RBRACE,
						FOLLOW_RBRACE_in_anonType4144);
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
				memoize(input, 84, anonType_StartIndex);
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:440:1:
	// anonTypeFieldList : anonTypeField ( COMMA anonTypeField )* ;
	public final TinyHaxeTry1Parser.anonTypeFieldList_return anonTypeFieldList()
			throws RecognitionException {
		TinyHaxeTry1Parser.anonTypeFieldList_return retval = new TinyHaxeTry1Parser.anonTypeFieldList_return();
		retval.start = input.LT(1);
		int anonTypeFieldList_StartIndex = input.index();
		Object root_0 = null;

		Token COMMA419 = null;
		TinyHaxeTry1Parser.anonTypeField_return anonTypeField418 = null;

		TinyHaxeTry1Parser.anonTypeField_return anonTypeField420 = null;

		Object COMMA419_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 85)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:441:2:
			// ( anonTypeField ( COMMA anonTypeField )* )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:441:4:
			// anonTypeField ( COMMA anonTypeField )*
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_anonTypeField_in_anonTypeFieldList4158);
				anonTypeField418 = anonTypeField();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, anonTypeField418.getTree());
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:441:18:
				// ( COMMA anonTypeField )*
				loop80: do {
					int alt80 = 2;
					int LA80_0 = input.LA(1);

					if ((LA80_0 == COMMA)) {
						alt80 = 1;
					}

					switch (alt80) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:441:19:
						// COMMA anonTypeField
					{
						COMMA419 = (Token) match(input, COMMA,
								FOLLOW_COMMA_in_anonTypeFieldList4161);
						if (state.failed)
							return retval;
						pushFollow(FOLLOW_anonTypeField_in_anonTypeFieldList4164);
						anonTypeField420 = anonTypeField();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							adaptor
									.addChild(root_0, anonTypeField420
											.getTree());

					}
						break;

					default:
						break loop80;
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
				memoize(input, 85, anonTypeFieldList_StartIndex);
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:444:1:
	// objLit : '{' objLitElemList '}' ;
	public final TinyHaxeTry1Parser.objLit_return objLit()
			throws RecognitionException {
		TinyHaxeTry1Parser.objLit_return retval = new TinyHaxeTry1Parser.objLit_return();
		retval.start = input.LT(1);
		int objLit_StartIndex = input.index();
		Object root_0 = null;

		Token char_literal421 = null;
		Token char_literal423 = null;
		TinyHaxeTry1Parser.objLitElemList_return objLitElemList422 = null;

		Object char_literal421_tree = null;
		Object char_literal423_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 86)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:444:8:
			// ( '{' objLitElemList '}' )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:444:10:
			// '{' objLitElemList '}'
			{
				root_0 = (Object) adaptor.nil();

				char_literal421 = (Token) match(input, LBRACE,
						FOLLOW_LBRACE_in_objLit4176);
				if (state.failed)
					return retval;
				pushFollow(FOLLOW_objLitElemList_in_objLit4179);
				objLitElemList422 = objLitElemList();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, objLitElemList422.getTree());
				char_literal423 = (Token) match(input, RBRACE,
						FOLLOW_RBRACE_in_objLit4181);
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
				memoize(input, 86, objLit_StartIndex);
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:447:1:
	// anonTypeField : IDENTIFIER COLON funcType ;
	public final TinyHaxeTry1Parser.anonTypeField_return anonTypeField()
			throws RecognitionException {
		TinyHaxeTry1Parser.anonTypeField_return retval = new TinyHaxeTry1Parser.anonTypeField_return();
		retval.start = input.LT(1);
		int anonTypeField_StartIndex = input.index();
		Object root_0 = null;

		Token IDENTIFIER424 = null;
		Token COLON425 = null;
		TinyHaxeTry1Parser.funcType_return funcType426 = null;

		Object IDENTIFIER424_tree = null;
		Object COLON425_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 87)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:448:2:
			// ( IDENTIFIER COLON funcType )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:448:4:
			// IDENTIFIER COLON funcType
			{
				root_0 = (Object) adaptor.nil();

				IDENTIFIER424 = (Token) match(input, IDENTIFIER,
						FOLLOW_IDENTIFIER_in_anonTypeField4193);
				if (state.failed)
					return retval;
				if (state.backtracking == 0) {
					IDENTIFIER424_tree = (Object) adaptor.create(IDENTIFIER424);
					adaptor.addChild(root_0, IDENTIFIER424_tree);
				}
				COLON425 = (Token) match(input, COLON,
						FOLLOW_COLON_in_anonTypeField4195);
				if (state.failed)
					return retval;
				pushFollow(FOLLOW_funcType_in_anonTypeField4198);
				funcType426 = funcType();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, funcType426.getTree());

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
				memoize(input, 87, anonTypeField_StartIndex);
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:451:1:
	// objLitElemList : objLitElem ( COMMA objLitElem )* ;
	public final TinyHaxeTry1Parser.objLitElemList_return objLitElemList()
			throws RecognitionException {
		TinyHaxeTry1Parser.objLitElemList_return retval = new TinyHaxeTry1Parser.objLitElemList_return();
		retval.start = input.LT(1);
		int objLitElemList_StartIndex = input.index();
		Object root_0 = null;

		Token COMMA428 = null;
		TinyHaxeTry1Parser.objLitElem_return objLitElem427 = null;

		TinyHaxeTry1Parser.objLitElem_return objLitElem429 = null;

		Object COMMA428_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 88)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:452:2:
			// ( objLitElem ( COMMA objLitElem )* )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:452:4:
			// objLitElem ( COMMA objLitElem )*
			{
				root_0 = (Object) adaptor.nil();

				pushFollow(FOLLOW_objLitElem_in_objLitElemList4214);
				objLitElem427 = objLitElem();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, objLitElem427.getTree());
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:452:15:
				// ( COMMA objLitElem )*
				loop81: do {
					int alt81 = 2;
					int LA81_0 = input.LA(1);

					if ((LA81_0 == COMMA)) {
						alt81 = 1;
					}

					switch (alt81) {
					case 1:
						// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:452:16:
						// COMMA objLitElem
					{
						COMMA428 = (Token) match(input, COMMA,
								FOLLOW_COMMA_in_objLitElemList4217);
						if (state.failed)
							return retval;
						pushFollow(FOLLOW_objLitElem_in_objLitElemList4220);
						objLitElem429 = objLitElem();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							adaptor.addChild(root_0, objLitElem429.getTree());

					}
						break;

					default:
						break loop81;
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
				memoize(input, 88, objLitElemList_StartIndex);
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:455:1:
	// objLitElem : IDENTIFIER COLON expr ;
	public final TinyHaxeTry1Parser.objLitElem_return objLitElem()
			throws RecognitionException {
		TinyHaxeTry1Parser.objLitElem_return retval = new TinyHaxeTry1Parser.objLitElem_return();
		retval.start = input.LT(1);
		int objLitElem_StartIndex = input.index();
		Object root_0 = null;

		Token IDENTIFIER430 = null;
		Token COLON431 = null;
		TinyHaxeTry1Parser.expr_return expr432 = null;

		Object IDENTIFIER430_tree = null;
		Object COLON431_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 89)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:456:9:
			// ( IDENTIFIER COLON expr )
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:456:11:
			// IDENTIFIER COLON expr
			{
				root_0 = (Object) adaptor.nil();

				IDENTIFIER430 = (Token) match(input, IDENTIFIER,
						FOLLOW_IDENTIFIER_in_objLitElem4241);
				if (state.failed)
					return retval;
				if (state.backtracking == 0) {
					IDENTIFIER430_tree = (Object) adaptor.create(IDENTIFIER430);
					adaptor.addChild(root_0, IDENTIFIER430_tree);
				}
				COLON431 = (Token) match(input, COLON,
						FOLLOW_COLON_in_objLitElem4243);
				if (state.failed)
					return retval;
				pushFollow(FOLLOW_expr_in_objLitElem4246);
				expr432 = expr();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, expr432.getTree());

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
				memoize(input, 89, objLitElem_StartIndex);
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
	// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:459:1:
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

		Token LONGLITERAL433 = null;
		Token INTLITERAL434 = null;
		Token STRINGLITERAL435 = null;
		Token CHARLITERAL436 = null;
		Token FLOATNUM437 = null;
		Token TRUE438 = null;
		Token FALSE439 = null;

		Object LONGLITERAL433_tree = null;
		Object INTLITERAL434_tree = null;
		Object STRINGLITERAL435_tree = null;
		Object CHARLITERAL436_tree = null;
		Object FLOATNUM437_tree = null;
		Object TRUE438_tree = null;
		Object FALSE439_tree = null;
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
			if (state.backtracking > 0 && alreadyParsedRule(input, 90)) {
				return retval;
			}
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:460:2:
			// ( LONGLITERAL -> LONGLITERAL[$LONGLITERAL, \"INT\"] | INTLITERAL
			// -> INTLITERAL[$INTLITERAL, \"INT\"] | STRINGLITERAL ->
			// STRINGLITERAL[$STRINGLITERAL,\"STRING\"] | CHARLITERAL ->
			// CHARLITERAL[$CHARLITERAL, \"STRING\"] | FLOATNUM ->
			// FLOATNUM[$FLOATNUM, \"FLOAT\"] | TRUE -> TRUE[$TRUE,\"BOOL\"] |
			// FALSE -> FALSE[$FALSE,\"BOOL\"] )
			int alt82 = 7;
			switch (input.LA(1)) {
			case LONGLITERAL: {
				alt82 = 1;
			}
				break;
			case INTLITERAL: {
				alt82 = 2;
			}
				break;
			case STRINGLITERAL: {
				alt82 = 3;
			}
				break;
			case CHARLITERAL: {
				alt82 = 4;
			}
				break;
			case FLOATNUM: {
				alt82 = 5;
			}
				break;
			case TRUE: {
				alt82 = 6;
			}
				break;
			case FALSE: {
				alt82 = 7;
			}
				break;
			default:
				if (state.backtracking > 0) {
					state.failed = true;
					return retval;
				}
				NoViableAltException nvae = new NoViableAltException("", 82, 0,
						input);

				throw nvae;
			}

			switch (alt82) {
			case 1:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:460:4:
				// LONGLITERAL
			{
				LONGLITERAL433 = (Token) match(input, LONGLITERAL,
						FOLLOW_LONGLITERAL_in_elementarySymbol4258);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_LONGLITERAL.add(LONGLITERAL433);

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
					// 460:16: -> LONGLITERAL[$LONGLITERAL, \"INT\"]
					{
						adaptor.addChild(root_0, new VarUsage(LONGLITERAL,
								LONGLITERAL433, "INT"));

					}

					retval.tree = root_0;
				}
			}
				break;
			case 2:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:461:4:
				// INTLITERAL
			{
				INTLITERAL434 = (Token) match(input, INTLITERAL,
						FOLLOW_INTLITERAL_in_elementarySymbol4271);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_INTLITERAL.add(INTLITERAL434);

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
					// 461:15: -> INTLITERAL[$INTLITERAL, \"INT\"]
					{
						adaptor.addChild(root_0, new VarUsage(INTLITERAL,
								INTLITERAL434, "INT"));

					}

					retval.tree = root_0;
				}
			}
				break;
			case 3:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:462:4:
				// STRINGLITERAL
			{
				STRINGLITERAL435 = (Token) match(input, STRINGLITERAL,
						FOLLOW_STRINGLITERAL_in_elementarySymbol4284);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_STRINGLITERAL.add(STRINGLITERAL435);

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
					// 462:18: -> STRINGLITERAL[$STRINGLITERAL,\"STRING\"]
					{
						adaptor.addChild(root_0, new VarUsage(STRINGLITERAL,
								STRINGLITERAL435, "STRING"));

					}

					retval.tree = root_0;
				}
			}
				break;
			case 4:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:463:4:
				// CHARLITERAL
			{
				CHARLITERAL436 = (Token) match(input, CHARLITERAL,
						FOLLOW_CHARLITERAL_in_elementarySymbol4297);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_CHARLITERAL.add(CHARLITERAL436);

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
					// 463:16: -> CHARLITERAL[$CHARLITERAL, \"STRING\"]
					{
						adaptor.addChild(root_0, new VarUsage(CHARLITERAL,
								CHARLITERAL436, "STRING"));

					}

					retval.tree = root_0;
				}
			}
				break;
			case 5:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:464:4:
				// FLOATNUM
			{
				FLOATNUM437 = (Token) match(input, FLOATNUM,
						FOLLOW_FLOATNUM_in_elementarySymbol4310);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_FLOATNUM.add(FLOATNUM437);

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
					// 464:13: -> FLOATNUM[$FLOATNUM, \"FLOAT\"]
					{
						adaptor.addChild(root_0, new VarUsage(FLOATNUM,
								FLOATNUM437, "FLOAT"));

					}

					retval.tree = root_0;
				}
			}
				break;
			case 6:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:465:4:
				// TRUE
			{
				TRUE438 = (Token) match(input, TRUE,
						FOLLOW_TRUE_in_elementarySymbol4323);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_TRUE.add(TRUE438);

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
					// 465:10: -> TRUE[$TRUE,\"BOOL\"]
					{
						adaptor.addChild(root_0, new VarUsage(TRUE, TRUE438,
								"BOOL"));

					}

					retval.tree = root_0;
				}
			}
				break;
			case 7:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:466:4:
				// FALSE
			{
				FALSE439 = (Token) match(input, FALSE,
						FOLLOW_FALSE_in_elementarySymbol4337);
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					stream_FALSE.add(FALSE439);

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
					// 466:11: -> FALSE[$FALSE,\"BOOL\"]
					{
						adaptor.addChild(root_0, new VarUsage(FALSE, FALSE439,
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
				memoize(input, 90, elementarySymbol_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "elementarySymbol"

	// $ANTLR start synpred21_TinyHaxeTry1
	public final void synpred21_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:100:54:
		// ( typeTagOpt )
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:100:54:
		// typeTagOpt
		{
			pushFollow(FOLLOW_typeTagOpt_in_synpred21_TinyHaxeTry1860);
			typeTagOpt();

			state._fsp--;
			if (state.failed)
				return;

		}
	}

	// $ANTLR end synpred21_TinyHaxeTry1

	// $ANTLR start synpred29_TinyHaxeTry1
	public final void synpred29_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:137:21:
		// ( COMMA funcType )
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:137:21:
		// COMMA funcType
		{
			match(input, COMMA, FOLLOW_COMMA_in_synpred29_TinyHaxeTry11255);
			if (state.failed)
				return;
			pushFollow(FOLLOW_funcType_in_synpred29_TinyHaxeTry11258);
			funcType();

			state._fsp--;
			if (state.failed)
				return;

		}
	}

	// $ANTLR end synpred29_TinyHaxeTry1

	// $ANTLR start synpred30_TinyHaxeTry1
	public final void synpred30_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:137:11:
		// ( funcType ( COMMA funcType )* )
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:137:11:
		// funcType ( COMMA funcType )*
		{
			pushFollow(FOLLOW_funcType_in_synpred30_TinyHaxeTry11252);
			funcType();

			state._fsp--;
			if (state.failed)
				return;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:137:20:
			// ( COMMA funcType )*
			loop84: do {
				int alt84 = 2;
				int LA84_0 = input.LA(1);

				if ((LA84_0 == COMMA)) {
					alt84 = 1;
				}

				switch (alt84) {
				case 1:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:137:21:
					// COMMA funcType
				{
					match(input, COMMA,
							FOLLOW_COMMA_in_synpred30_TinyHaxeTry11255);
					if (state.failed)
						return;
					pushFollow(FOLLOW_funcType_in_synpred30_TinyHaxeTry11258);
					funcType();

					state._fsp--;
					if (state.failed)
						return;

				}
					break;

				default:
					break loop84;
				}
			} while (true);

		}
	}

	// $ANTLR end synpred30_TinyHaxeTry1

	// $ANTLR start synpred31_TinyHaxeTry1
	public final void synpred31_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:138:20:
		// ( COMMA typeConstraint )
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:138:20:
		// COMMA typeConstraint
		{
			match(input, COMMA, FOLLOW_COMMA_in_synpred31_TinyHaxeTry11269);
			if (state.failed)
				return;
			pushFollow(FOLLOW_typeConstraint_in_synpred31_TinyHaxeTry11272);
			typeConstraint();

			state._fsp--;
			if (state.failed)
				return;

		}
	}

	// $ANTLR end synpred31_TinyHaxeTry1

	// $ANTLR start synpred32_TinyHaxeTry1
	public final void synpred32_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:141:19:
		// ( MINUS_BIGGER type )
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:141:19:
		// MINUS_BIGGER type
		{
			match(input, MINUS_BIGGER,
					FOLLOW_MINUS_BIGGER_in_synpred32_TinyHaxeTry11291);
			if (state.failed)
				return;
			pushFollow(FOLLOW_type_in_synpred32_TinyHaxeTry11294);
			type();

			state._fsp--;
			if (state.failed)
				return;

		}
	}

	// $ANTLR end synpred32_TinyHaxeTry1

	// $ANTLR start synpred33_TinyHaxeTry1
	public final void synpred33_TinyHaxeTry1_fragment()
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
				pushFollow(FOLLOW_type_in_synpred33_TinyHaxeTry11287);
				type();

				state._fsp--;
				if (state.failed)
					return;

			}

			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:141:18:
			// ( MINUS_BIGGER type )*
			loop85: do {
				int alt85 = 2;
				int LA85_0 = input.LA(1);

				if ((LA85_0 == MINUS_BIGGER)) {
					alt85 = 1;
				}

				switch (alt85) {
				case 1:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:141:19:
					// MINUS_BIGGER type
				{
					match(input, MINUS_BIGGER,
							FOLLOW_MINUS_BIGGER_in_synpred33_TinyHaxeTry11291);
					if (state.failed)
						return;
					pushFollow(FOLLOW_type_in_synpred33_TinyHaxeTry11294);
					type();

					state._fsp--;
					if (state.failed)
						return;

				}
					break;

				default:
					break loop85;
				}
			} while (true);

		}
	}

	// $ANTLR end synpred33_TinyHaxeTry1

	// $ANTLR start synpred40_TinyHaxeTry1
	public final void synpred40_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:145:65:
		// ( typeParam )
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:145:65:
		// typeParam
		{
			pushFollow(FOLLOW_typeParam_in_synpred40_TinyHaxeTry11334);
			typeParam();

			state._fsp--;
			if (state.failed)
				return;

		}
	}

	// $ANTLR end synpred40_TinyHaxeTry1

	// $ANTLR start synpred41_TinyHaxeTry1
	public final void synpred41_TinyHaxeTry1_fragment()
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
			int alt86 = 7;
			switch (input.LA(1)) {
			case LBRACE: {
				alt86 = 1;
			}
				break;
			case IDENTIFIER: {
				alt86 = 2;
			}
				break;
			case INT: {
				alt86 = 3;
			}
				break;
			case FLOAT: {
				alt86 = 4;
			}
				break;
			case DYNAMIC: {
				alt86 = 5;
			}
				break;
			case BOOLEAN: {
				alt86 = 6;
			}
				break;
			case VOID: {
				alt86 = 7;
			}
				break;
			default:
				if (state.backtracking > 0) {
					state.failed = true;
					return;
				}
				NoViableAltException nvae = new NoViableAltException("", 86, 0,
						input);

				throw nvae;
			}

			switch (alt86) {
			case 1:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:145:9:
				// anonType
			{
				pushFollow(FOLLOW_anonType_in_synpred41_TinyHaxeTry11313);
				anonType();

				state._fsp--;
				if (state.failed)
					return;

			}
				break;
			case 2:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:145:20:
				// dotIdent
			{
				pushFollow(FOLLOW_dotIdent_in_synpred41_TinyHaxeTry11317);
				dotIdent();

				state._fsp--;
				if (state.failed)
					return;

			}
				break;
			case 3:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:145:30:
				// INT
			{
				match(input, INT, FOLLOW_INT_in_synpred41_TinyHaxeTry11320);
				if (state.failed)
					return;

			}
				break;
			case 4:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:145:35:
				// FLOAT
			{
				match(input, FLOAT, FOLLOW_FLOAT_in_synpred41_TinyHaxeTry11323);
				if (state.failed)
					return;

			}
				break;
			case 5:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:145:42:
				// DYNAMIC
			{
				match(input, DYNAMIC,
						FOLLOW_DYNAMIC_in_synpred41_TinyHaxeTry11326);
				if (state.failed)
					return;

			}
				break;
			case 6:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:145:50:
				// BOOLEAN
			{
				match(input, BOOLEAN,
						FOLLOW_BOOLEAN_in_synpred41_TinyHaxeTry11328);
				if (state.failed)
					return;

			}
				break;
			case 7:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:145:58:
				// VOID
			{
				match(input, VOID, FOLLOW_VOID_in_synpred41_TinyHaxeTry11330);
				if (state.failed)
					return;

			}
				break;

			}

			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:145:64:
			// ( typeParam )*
			loop87: do {
				int alt87 = 2;
				int LA87_0 = input.LA(1);

				if ((LA87_0 == LT)) {
					alt87 = 1;
				}

				switch (alt87) {
				case 1:
					// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:145:65:
					// typeParam
				{
					pushFollow(FOLLOW_typeParam_in_synpred41_TinyHaxeTry11334);
					typeParam();

					state._fsp--;
					if (state.failed)
						return;

				}
					break;

				default:
					break loop87;
				}
			} while (true);

		}
	}

	// $ANTLR end synpred41_TinyHaxeTry1

	// $ANTLR start synpred42_TinyHaxeTry1
	public final void synpred42_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:150:9:
		// ( type )
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:150:9:
		// type
		{
			pushFollow(FOLLOW_type_in_synpred42_TinyHaxeTry11356);
			type();

			state._fsp--;
			if (state.failed)
				return;

		}
	}

	// $ANTLR end synpred42_TinyHaxeTry1

	// $ANTLR start synpred43_TinyHaxeTry1
	public final void synpred43_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:150:25:
		// ( GT )
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:150:25:
		// GT
		{
			match(input, GT, FOLLOW_GT_in_synpred43_TinyHaxeTry11362);
			if (state.failed)
				return;

		}
	}

	// $ANTLR end synpred43_TinyHaxeTry1

	// $ANTLR start synpred44_TinyHaxeTry1
	public final void synpred44_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:150:29:
		// ( GTGT )
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:150:29:
		// GTGT
		{
			match(input, GTGT, FOLLOW_GTGT_in_synpred44_TinyHaxeTry11365);
			if (state.failed)
				return;

		}
	}

	// $ANTLR end synpred44_TinyHaxeTry1

	// $ANTLR start synpred45_TinyHaxeTry1
	public final void synpred45_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:155:4:
		// ( typeParam )
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:155:4:
		// typeParam
		{
			pushFollow(FOLLOW_typeParam_in_synpred45_TinyHaxeTry11387);
			typeParam();

			state._fsp--;
			if (state.failed)
				return;

		}
	}

	// $ANTLR end synpred45_TinyHaxeTry1

	// $ANTLR start synpred47_TinyHaxeTry1
	public final void synpred47_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:168:4:
		// ( block )
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:168:4:
		// block
		{
			pushFollow(FOLLOW_block_in_synpred47_TinyHaxeTry11515);
			block();

			state._fsp--;
			if (state.failed)
				return;

		}
	}

	// $ANTLR end synpred47_TinyHaxeTry1

	// $ANTLR start synpred48_TinyHaxeTry1
	public final void synpred48_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:169:4:
		// ( assignExpr SEMI )
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:169:4:
		// assignExpr SEMI
		{
			pushFollow(FOLLOW_assignExpr_in_synpred48_TinyHaxeTry11520);
			assignExpr();

			state._fsp--;
			if (state.failed)
				return;
			match(input, SEMI, FOLLOW_SEMI_in_synpred48_TinyHaxeTry11522);
			if (state.failed)
				return;

		}
	}

	// $ANTLR end synpred48_TinyHaxeTry1

	// $ANTLR start synpred50_TinyHaxeTry1
	public final void synpred50_TinyHaxeTry1_fragment()
			throws RecognitionException {
		TinyHaxeTry1Parser.statement_return st2 = null;

		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:171:36:
		// ( ELSE st2= statement )
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:171:36:
		// ELSE st2= statement
		{
			match(input, ELSE, FOLLOW_ELSE_in_synpred50_TinyHaxeTry11542);
			if (state.failed)
				return;
			pushFollow(FOLLOW_statement_in_synpred50_TinyHaxeTry11546);
			st2 = statement();

			state._fsp--;
			if (state.failed)
				return;

		}
	}

	// $ANTLR end synpred50_TinyHaxeTry1

	// $ANTLR start synpred58_TinyHaxeTry1
	public final void synpred58_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:177:12:
		// ( expr )
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:177:12:
		// expr
		{
			pushFollow(FOLLOW_expr_in_synpred58_TinyHaxeTry11754);
			expr();

			state._fsp--;
			if (state.failed)
				return;

		}
	}

	// $ANTLR end synpred58_TinyHaxeTry1

	// $ANTLR start synpred65_TinyHaxeTry1
	public final void synpred65_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:181:4:
		// ( expr SEMI )
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:181:4:
		// expr SEMI
		{
			pushFollow(FOLLOW_expr_in_synpred65_TinyHaxeTry11848);
			expr();

			state._fsp--;
			if (state.failed)
				return;
			match(input, SEMI, FOLLOW_SEMI_in_synpred65_TinyHaxeTry11851);
			if (state.failed)
				return;

		}
	}

	// $ANTLR end synpred65_TinyHaxeTry1

	// $ANTLR start synpred66_TinyHaxeTry1
	public final void synpred66_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:182:4:
		// ( IDENTIFIER COLON statement )
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:182:4:
		// IDENTIFIER COLON statement
		{
			match(input, IDENTIFIER,
					FOLLOW_IDENTIFIER_in_synpred66_TinyHaxeTry11857);
			if (state.failed)
				return;
			match(input, COLON, FOLLOW_COLON_in_synpred66_TinyHaxeTry11859);
			if (state.failed)
				return;
			pushFollow(FOLLOW_statement_in_synpred66_TinyHaxeTry11861);
			statement();

			state._fsp--;
			if (state.failed)
				return;

		}
	}

	// $ANTLR end synpred66_TinyHaxeTry1

	// $ANTLR start synpred69_TinyHaxeTry1
	public final void synpred69_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:195:4:
		// ( varDecl )
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:195:4:
		// varDecl
		{
			pushFollow(FOLLOW_varDecl_in_synpred69_TinyHaxeTry11963);
			varDecl();

			state._fsp--;
			if (state.failed)
				return;

		}
	}

	// $ANTLR end synpred69_TinyHaxeTry1

	// $ANTLR start synpred73_TinyHaxeTry1
	public final void synpred73_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:229:4:
		// ( exprList )
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:229:4:
		// exprList
		{
			pushFollow(FOLLOW_exprList_in_synpred73_TinyHaxeTry12177);
			exprList();

			state._fsp--;
			if (state.failed)
				return;

		}
	}

	// $ANTLR end synpred73_TinyHaxeTry1

	// $ANTLR start synpred90_TinyHaxeTry1
	public final void synpred90_TinyHaxeTry1_fragment()
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
				match(input, GT, FOLLOW_GT_in_synpred90_TinyHaxeTry12467);
				if (state.failed)
					return;
				match(input, GT, FOLLOW_GT_in_synpred90_TinyHaxeTry12469);
				if (state.failed)
					return;

			}

			pushFollow(FOLLOW_addExpr_in_synpred90_TinyHaxeTry12474);
			addExpr();

			state._fsp--;
			if (state.failed)
				return;

		}
	}

	// $ANTLR end synpred90_TinyHaxeTry1

	// $ANTLR start synpred101_TinyHaxeTry1
	public final void synpred101_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:276:11:
		// ( ( SUB | SUBSUB | PLUSPLUS | BANG | TILDE ) prefixExpr )
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:276:11:
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

			pushFollow(FOLLOW_prefixExpr_in_synpred101_TinyHaxeTry12571);
			prefixExpr();

			state._fsp--;
			if (state.failed)
				return;

		}
	}

	// $ANTLR end synpred101_TinyHaxeTry1

	// $ANTLR start synpred104_TinyHaxeTry1
	public final void synpred104_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:283:4:
		// ( value LPAREN exprListOpt RPAREN )
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:283:4:
		// value LPAREN exprListOpt RPAREN
		{
			pushFollow(FOLLOW_value_in_synpred104_TinyHaxeTry12626);
			value();

			state._fsp--;
			if (state.failed)
				return;
			match(input, LPAREN, FOLLOW_LPAREN_in_synpred104_TinyHaxeTry12628);
			if (state.failed)
				return;
			pushFollow(FOLLOW_exprListOpt_in_synpred104_TinyHaxeTry12630);
			exprListOpt();

			state._fsp--;
			if (state.failed)
				return;
			match(input, RPAREN, FOLLOW_RPAREN_in_synpred104_TinyHaxeTry12632);
			if (state.failed)
				return;

		}
	}

	// $ANTLR end synpred104_TinyHaxeTry1

	// $ANTLR start synpred105_TinyHaxeTry1
	public final void synpred105_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:284:4:
		// ( value LBRACKET expr RBRACKET )
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:284:4:
		// value LBRACKET expr RBRACKET
		{
			pushFollow(FOLLOW_value_in_synpred105_TinyHaxeTry12653);
			value();

			state._fsp--;
			if (state.failed)
				return;
			match(input, LBRACKET,
					FOLLOW_LBRACKET_in_synpred105_TinyHaxeTry12655);
			if (state.failed)
				return;
			pushFollow(FOLLOW_expr_in_synpred105_TinyHaxeTry12657);
			expr();

			state._fsp--;
			if (state.failed)
				return;
			match(input, RBRACKET,
					FOLLOW_RBRACKET_in_synpred105_TinyHaxeTry12659);
			if (state.failed)
				return;

		}
	}

	// $ANTLR end synpred105_TinyHaxeTry1

	// $ANTLR start synpred106_TinyHaxeTry1
	public final void synpred106_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:285:4:
		// ( value PLUSPLUS )
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:285:4:
		// value PLUSPLUS
		{
			pushFollow(FOLLOW_value_in_synpred106_TinyHaxeTry12664);
			value();

			state._fsp--;
			if (state.failed)
				return;
			match(input, PLUSPLUS,
					FOLLOW_PLUSPLUS_in_synpred106_TinyHaxeTry12666);
			if (state.failed)
				return;

		}
	}

	// $ANTLR end synpred106_TinyHaxeTry1

	// $ANTLR start synpred107_TinyHaxeTry1
	public final void synpred107_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:286:4:
		// ( value SUBSUB )
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:286:4:
		// value SUBSUB
		{
			pushFollow(FOLLOW_value_in_synpred107_TinyHaxeTry12690);
			value();

			state._fsp--;
			if (state.failed)
				return;
			match(input, SUBSUB, FOLLOW_SUBSUB_in_synpred107_TinyHaxeTry12692);
			if (state.failed)
				return;

		}
	}

	// $ANTLR end synpred107_TinyHaxeTry1

	// $ANTLR start synpred109_TinyHaxeTry1
	public final void synpred109_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:291:4:
		// ( arrayLit )
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:291:4:
		// arrayLit
		{
			pushFollow(FOLLOW_arrayLit_in_synpred109_TinyHaxeTry12732);
			arrayLit();

			state._fsp--;
			if (state.failed)
				return;

		}
	}

	// $ANTLR end synpred109_TinyHaxeTry1

	// $ANTLR start synpred113_TinyHaxeTry1
	public final void synpred113_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:295:23:
		// ( expr )
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:295:23:
		// expr
		{
			pushFollow(FOLLOW_expr_in_synpred113_TinyHaxeTry12796);
			expr();

			state._fsp--;
			if (state.failed)
				return;

		}
	}

	// $ANTLR end synpred113_TinyHaxeTry1

	// $ANTLR start synpred114_TinyHaxeTry1
	public final void synpred114_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:295:14:
		// ( LPAREN ( expr | statement ) RPAREN )
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:295:14:
		// LPAREN ( expr | statement ) RPAREN
		{
			match(input, LPAREN, FOLLOW_LPAREN_in_synpred114_TinyHaxeTry12792);
			if (state.failed)
				return;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:295:22:
			// ( expr | statement )
			int alt94 = 2;
			alt94 = dfa94.predict(input);
			switch (alt94) {
			case 1:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:295:23:
				// expr
			{
				pushFollow(FOLLOW_expr_in_synpred114_TinyHaxeTry12796);
				expr();

				state._fsp--;
				if (state.failed)
					return;

			}
				break;
			case 2:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:295:28:
				// statement
			{
				pushFollow(FOLLOW_statement_in_synpred114_TinyHaxeTry12798);
				statement();

				state._fsp--;
				if (state.failed)
					return;

			}
				break;

			}

			match(input, RPAREN, FOLLOW_RPAREN_in_synpred114_TinyHaxeTry12801);
			if (state.failed)
				return;

		}
	}

	// $ANTLR end synpred114_TinyHaxeTry1

	// $ANTLR start synpred117_TinyHaxeTry1
	public final void synpred117_TinyHaxeTry1_fragment()
			throws RecognitionException {
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:304:11:
		// ( CAST LPAREN expr ( COMMA funcType )? RPAREN )
		// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:304:11:
		// CAST LPAREN expr ( COMMA funcType )? RPAREN
		{
			match(input, CAST, FOLLOW_CAST_in_synpred117_TinyHaxeTry12895);
			if (state.failed)
				return;
			match(input, LPAREN, FOLLOW_LPAREN_in_synpred117_TinyHaxeTry12897);
			if (state.failed)
				return;
			pushFollow(FOLLOW_expr_in_synpred117_TinyHaxeTry12899);
			expr();

			state._fsp--;
			if (state.failed)
				return;
			// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:304:28:
			// ( COMMA funcType )?
			int alt95 = 2;
			int LA95_0 = input.LA(1);

			if ((LA95_0 == COMMA)) {
				alt95 = 1;
			}
			switch (alt95) {
			case 1:
				// C:\\dist\\eclipse\\workspace\\haXe-IDE\\src\\resources\\TinyHaxeTry1.g:304:29:
				// COMMA funcType
			{
				match(input, COMMA, FOLLOW_COMMA_in_synpred117_TinyHaxeTry12902);
				if (state.failed)
					return;
				pushFollow(FOLLOW_funcType_in_synpred117_TinyHaxeTry12904);
				funcType();

				state._fsp--;
				if (state.failed)
					return;

			}
				break;

			}

			match(input, RPAREN, FOLLOW_RPAREN_in_synpred117_TinyHaxeTry12908);
			if (state.failed)
				return;

		}
	}

	// $ANTLR end synpred117_TinyHaxeTry1

	// Delegated rules

	public final boolean synpred104_TinyHaxeTry1() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred104_TinyHaxeTry1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred73_TinyHaxeTry1() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred73_TinyHaxeTry1_fragment(); // can never throw exception
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

	public final boolean synpred66_TinyHaxeTry1() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred66_TinyHaxeTry1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred48_TinyHaxeTry1() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred48_TinyHaxeTry1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred40_TinyHaxeTry1() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred40_TinyHaxeTry1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred30_TinyHaxeTry1() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred30_TinyHaxeTry1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred29_TinyHaxeTry1() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred29_TinyHaxeTry1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred45_TinyHaxeTry1() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred45_TinyHaxeTry1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred43_TinyHaxeTry1() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred43_TinyHaxeTry1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred101_TinyHaxeTry1() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred101_TinyHaxeTry1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred31_TinyHaxeTry1() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred31_TinyHaxeTry1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred69_TinyHaxeTry1() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred69_TinyHaxeTry1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred113_TinyHaxeTry1() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred113_TinyHaxeTry1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred44_TinyHaxeTry1() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred44_TinyHaxeTry1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred117_TinyHaxeTry1() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred117_TinyHaxeTry1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred105_TinyHaxeTry1() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred105_TinyHaxeTry1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred50_TinyHaxeTry1() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred50_TinyHaxeTry1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred21_TinyHaxeTry1() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred21_TinyHaxeTry1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred41_TinyHaxeTry1() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred41_TinyHaxeTry1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred107_TinyHaxeTry1() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred107_TinyHaxeTry1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred114_TinyHaxeTry1() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred114_TinyHaxeTry1_fragment(); // can never throw exception
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

	public final boolean synpred65_TinyHaxeTry1() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred65_TinyHaxeTry1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred32_TinyHaxeTry1() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred32_TinyHaxeTry1_fragment(); // can never throw exception
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

	public final boolean synpred42_TinyHaxeTry1() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred42_TinyHaxeTry1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred109_TinyHaxeTry1() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred109_TinyHaxeTry1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public final boolean synpred33_TinyHaxeTry1() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred33_TinyHaxeTry1_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	protected DFA19 dfa19 = new DFA19(this);
	protected DFA18 dfa18 = new DFA18(this);
	protected DFA24 dfa24 = new DFA24(this);
	protected DFA25 dfa25 = new DFA25(this);
	protected DFA34 dfa34 = new DFA34(this);
	protected DFA37 dfa37 = new DFA37(this);
	protected DFA56 dfa56 = new DFA56(this);
	protected DFA58 dfa58 = new DFA58(this);
	protected DFA57 dfa57 = new DFA57(this);
	protected DFA70 dfa70 = new DFA70(this);
	protected DFA71 dfa71 = new DFA71(this);
	protected DFA73 dfa73 = new DFA73(this);
	protected DFA74 dfa74 = new DFA74(this);
	protected DFA94 dfa94 = new DFA94(this);
	static final String DFA19_eotS = "\73\uffff";
	static final String DFA19_eofS = "\1\1\72\uffff";
	static final String DFA19_minS = "\1\20\1\uffff\1\0\70\uffff";
	static final String DFA19_maxS = "\1\145\1\uffff\1\0\70\uffff";
	static final String DFA19_acceptS = "\1\uffff\1\1\70\uffff\1\2";
	static final String DFA19_specialS = "\2\uffff\1\0\70\uffff}>";
	static final String[] DFA19_transitionS = {
			"\1\1\1\2\1\uffff\1\1\4\uffff\1\1\1\uffff\10\1\1\uffff\2\1\1"
					+ "\uffff\2\1\1\uffff\15\1\4\uffff\1\1\4\uffff\2\1\7\uffff\21\1"
					+ "\5\uffff\1\1\1\uffff\6\1", "", "\1\uffff", "", "", "",
			"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
			"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
			"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
			"", "" };

	static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
	static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
	static final char[] DFA19_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA19_minS);
	static final char[] DFA19_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA19_maxS);
	static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
	static final short[] DFA19_special = DFA
			.unpackEncodedString(DFA19_specialS);
	static final short[][] DFA19_transition;

	static {
		int numStates = DFA19_transitionS.length;
		DFA19_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
		}
	}

	class DFA19 extends DFA {

		public DFA19(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 19;
			this.eot = DFA19_eot;
			this.eof = DFA19_eof;
			this.min = DFA19_min;
			this.max = DFA19_max;
			this.accept = DFA19_accept;
			this.special = DFA19_special;
			this.transition = DFA19_transition;
		}

		public String getDescription() {
			return "137:1: typeList : ( funcType ( COMMA funcType )* | typeConstraint ( COMMA typeConstraint )* );";
		}

		public int specialStateTransition(int s, IntStream _input)
				throws NoViableAltException {
			TokenStream input = (TokenStream) _input;
			int _s = s;
			switch (s) {
			case 0:
				int LA19_2 = input.LA(1);

				int index19_2 = input.index();
				input.rewind();
				s = -1;
				if ((synpred30_TinyHaxeTry1())) {
					s = 1;
				}

				else if ((true)) {
					s = 58;
				}

				input.seek(index19_2);
				if (s >= 0)
					return s;
				break;
			}
			if (state.backtracking > 0) {
				state.failed = true;
				return -1;
			}
			NoViableAltException nvae = new NoViableAltException(
					getDescription(), 19, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA18_eotS = "\65\uffff";
	static final String DFA18_eofS = "\1\1\64\uffff";
	static final String DFA18_minS = "\1\20\4\uffff\1\0\57\uffff";
	static final String DFA18_maxS = "\1\145\4\uffff\1\0\57\uffff";
	static final String DFA18_acceptS = "\1\uffff\1\2\62\uffff\1\1";
	static final String DFA18_specialS = "\5\uffff\1\0\57\uffff}>";
	static final String[] DFA18_transitionS = {
			"\1\1\2\uffff\1\1\6\uffff\1\5\7\1\1\uffff\2\1\1\uffff\2\1\1"
					+ "\uffff\6\1\4\uffff\3\1\4\uffff\1\1\4\uffff\2\1\7\uffff\21\1"
					+ "\5\uffff\1\1\1\uffff\6\1", "", "", "", "", "\1\uffff",
			"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
			"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
			"", "", "", "", "", "", "", "", "", "", "", "", "" };

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

		public String getDescription() {
			return "()* loopback of 138:19: ( COMMA typeConstraint )*";
		}

		public int specialStateTransition(int s, IntStream _input)
				throws NoViableAltException {
			TokenStream input = (TokenStream) _input;
			int _s = s;
			switch (s) {
			case 0:
				int LA18_5 = input.LA(1);

				int index18_5 = input.index();
				input.rewind();
				s = -1;
				if ((synpred31_TinyHaxeTry1())) {
					s = 52;
				}

				else if ((true)) {
					s = 1;
				}

				input.seek(index18_5);
				if (s >= 0)
					return s;
				break;
			}
			if (state.backtracking > 0) {
				state.failed = true;
				return -1;
			}
			NoViableAltException nvae = new NoViableAltException(
					getDescription(), 18, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA24_eotS = "\72\uffff";
	static final String DFA24_eofS = "\1\10\71\uffff";
	static final String DFA24_minS = "\1\20\1\0\70\uffff";
	static final String DFA24_maxS = "\1\145\1\0\70\uffff";
	static final String DFA24_acceptS = "\2\uffff\1\1\5\uffff\1\2\61\uffff";
	static final String DFA24_specialS = "\1\uffff\1\0\70\uffff}>";
	static final String[] DFA24_transitionS = {
			"\1\10\1\2\1\uffff\1\10\4\uffff\1\2\1\uffff\10\10\1\uffff\2"
					+ "\10\1\uffff\2\10\1\uffff\6\10\4\2\3\10\4\uffff\1\10\4\uffff"
					+ "\1\1\1\10\7\uffff\21\10\5\uffff\1\10\1\uffff\6\10",
			"\1\uffff", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
			"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
			"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
			"", "", "", "", "", "", "", "" };

	static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
	static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
	static final char[] DFA24_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA24_minS);
	static final char[] DFA24_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA24_maxS);
	static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
	static final short[] DFA24_special = DFA
			.unpackEncodedString(DFA24_specialS);
	static final short[][] DFA24_transition;

	static {
		int numStates = DFA24_transitionS.length;
		DFA24_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
		}
	}

	class DFA24 extends DFA {

		public DFA24(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 24;
			this.eot = DFA24_eot;
			this.eof = DFA24_eof;
			this.min = DFA24_min;
			this.max = DFA24_max;
			this.accept = DFA24_accept;
			this.special = DFA24_special;
			this.transition = DFA24_transition;
		}

		@Override
		public String getDescription() {
			return "145:1: type : ( ( anonType | dotIdent | INT | FLOAT | DYNAMIC | BOOLEAN | VOID ) ( typeParam )* | );";
		}

		@Override
		public int specialStateTransition(int s, IntStream _input)
				throws NoViableAltException {
			TokenStream input = (TokenStream) _input;
			int _s = s;
			switch (s) {
			case 0:
				int LA24_1 = input.LA(1);

				int index24_1 = input.index();
				input.rewind();
				s = -1;
				if ((synpred41_TinyHaxeTry1())) {
					s = 2;
				}

				else if ((true)) {
					s = 8;
				}

				input.seek(index24_1);
				if (s >= 0)
					return s;
				break;
			}
			if (state.backtracking > 0) {
				state.failed = true;
				return -1;
			}
			NoViableAltException nvae = new NoViableAltException(
					getDescription(), 24, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA25_eotS = "\74\uffff";
	static final String DFA25_eofS = "\1\16\73\uffff";
	static final String DFA25_minS = "\1\20\71\0\2\uffff";
	static final String DFA25_maxS = "\1\145\71\0\2\uffff";
	static final String DFA25_acceptS = "\72\uffff\1\1\1\2";
	static final String DFA25_specialS = "\1\uffff\1\0\1\40\1\67\1\61\1\57\1\50\1\62\1\24\1\23\1\51\1\15"
			+ "\1\64\1\43\1\35\1\10\1\17\1\46\1\21\1\26\1\3\1\11\1\33\1\55\1\34"
			+ "\1\20\1\12\1\32\1\41\1\47\1\27\1\1\1\22\1\16\1\7\1\30\1\2\1\42\1"
			+ "\14\1\37\1\56\1\63\1\5\1\65\1\70\1\53\1\4\1\45\1\36\1\31\1\13\1"
			+ "\60\1\66\1\52\1\54\1\6\1\25\1\44\2\uffff}>";
	static final String[] DFA25_transitionS = {
			"\1\17\1\2\1\uffff\1\20\4\uffff\1\5\1\uffff\1\14\1\60\1\13\1"
					+ "\62\1\63\1\64\1\65\1\66\1\uffff\1\34\1\15\1\uffff\1\71\1\21"
					+ "\1\uffff\1\22\1\23\1\24\1\25\1\70\1\12\1\7\1\3\1\4\1\6\1\37"
					+ "\1\10\1\11\4\uffff\1\67\4\uffff\1\1\1\33\7\uffff\1\61\1\57\1"
					+ "\56\1\52\1\53\1\54\1\55\1\47\1\50\1\51\1\45\1\46\1\43\1\44\1"
					+ "\40\1\41\1\42\5\uffff\1\31\1\uffff\1\26\1\27\1\30\1\35\1\36"
					+ "\1\32", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "", "" };

	static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
	static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
	static final char[] DFA25_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA25_minS);
	static final char[] DFA25_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA25_maxS);
	static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
	static final short[] DFA25_special = DFA
			.unpackEncodedString(DFA25_specialS);
	static final short[][] DFA25_transition;

	static {
		int numStates = DFA25_transitionS.length;
		DFA25_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
		}
	}

	class DFA25 extends DFA {

		public DFA25(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 25;
			this.eot = DFA25_eot;
			this.eof = DFA25_eof;
			this.min = DFA25_min;
			this.max = DFA25_max;
			this.accept = DFA25_accept;
			this.special = DFA25_special;
			this.transition = DFA25_transition;
		}

		@Override
		public String getDescription() {
			return "150:8: ( type | typeList )";
		}

		@Override
		public int specialStateTransition(int s, IntStream _input)
				throws NoViableAltException {
			TokenStream input = (TokenStream) _input;
			int _s = s;
			switch (s) {
			case 0:
				int LA25_1 = input.LA(1);

				int index25_1 = input.index();
				input.rewind();
				s = -1;
				if ((synpred42_TinyHaxeTry1())) {
					s = 58;
				}

				else if ((true)) {
					s = 59;
				}

				input.seek(index25_1);
				if (s >= 0)
					return s;
				break;
			case 1:
				int LA25_31 = input.LA(1);

				int index25_31 = input.index();
				input.rewind();
				s = -1;
				if ((synpred42_TinyHaxeTry1())) {
					s = 58;
				}

				else if ((true)) {
					s = 59;
				}

				input.seek(index25_31);
				if (s >= 0)
					return s;
				break;
			case 2:
				int LA25_36 = input.LA(1);

				int index25_36 = input.index();
				input.rewind();
				s = -1;
				if ((synpred42_TinyHaxeTry1())) {
					s = 58;
				}

				else if ((true)) {
					s = 59;
				}

				input.seek(index25_36);
				if (s >= 0)
					return s;
				break;
			case 3:
				int LA25_20 = input.LA(1);

				int index25_20 = input.index();
				input.rewind();
				s = -1;
				if ((synpred42_TinyHaxeTry1())) {
					s = 58;
				}

				else if ((true)) {
					s = 59;
				}

				input.seek(index25_20);
				if (s >= 0)
					return s;
				break;
			case 4:
				int LA25_46 = input.LA(1);

				int index25_46 = input.index();
				input.rewind();
				s = -1;
				if ((synpred42_TinyHaxeTry1())) {
					s = 58;
				}

				else if ((true)) {
					s = 59;
				}

				input.seek(index25_46);
				if (s >= 0)
					return s;
				break;
			case 5:
				int LA25_42 = input.LA(1);

				int index25_42 = input.index();
				input.rewind();
				s = -1;
				if ((synpred42_TinyHaxeTry1())) {
					s = 58;
				}

				else if ((true)) {
					s = 59;
				}

				input.seek(index25_42);
				if (s >= 0)
					return s;
				break;
			case 6:
				int LA25_55 = input.LA(1);

				int index25_55 = input.index();
				input.rewind();
				s = -1;
				if ((synpred42_TinyHaxeTry1())) {
					s = 58;
				}

				else if ((true)) {
					s = 59;
				}

				input.seek(index25_55);
				if (s >= 0)
					return s;
				break;
			case 7:
				int LA25_34 = input.LA(1);

				int index25_34 = input.index();
				input.rewind();
				s = -1;
				if ((synpred42_TinyHaxeTry1())) {
					s = 58;
				}

				else if ((true)) {
					s = 59;
				}

				input.seek(index25_34);
				if (s >= 0)
					return s;
				break;
			case 8:
				int LA25_15 = input.LA(1);

				int index25_15 = input.index();
				input.rewind();
				s = -1;
				if ((synpred42_TinyHaxeTry1())) {
					s = 58;
				}

				else if ((true)) {
					s = 59;
				}

				input.seek(index25_15);
				if (s >= 0)
					return s;
				break;
			case 9:
				int LA25_21 = input.LA(1);

				int index25_21 = input.index();
				input.rewind();
				s = -1;
				if ((synpred42_TinyHaxeTry1())) {
					s = 58;
				}

				else if ((true)) {
					s = 59;
				}

				input.seek(index25_21);
				if (s >= 0)
					return s;
				break;
			case 10:
				int LA25_26 = input.LA(1);

				int index25_26 = input.index();
				input.rewind();
				s = -1;
				if ((synpred42_TinyHaxeTry1())) {
					s = 58;
				}

				else if ((true)) {
					s = 59;
				}

				input.seek(index25_26);
				if (s >= 0)
					return s;
				break;
			case 11:
				int LA25_50 = input.LA(1);

				int index25_50 = input.index();
				input.rewind();
				s = -1;
				if ((synpred42_TinyHaxeTry1())) {
					s = 58;
				}

				else if ((true)) {
					s = 59;
				}

				input.seek(index25_50);
				if (s >= 0)
					return s;
				break;
			case 12:
				int LA25_38 = input.LA(1);

				int index25_38 = input.index();
				input.rewind();
				s = -1;
				if ((synpred42_TinyHaxeTry1())) {
					s = 58;
				}

				else if ((true)) {
					s = 59;
				}

				input.seek(index25_38);
				if (s >= 0)
					return s;
				break;
			case 13:
				int LA25_11 = input.LA(1);

				int index25_11 = input.index();
				input.rewind();
				s = -1;
				if ((synpred42_TinyHaxeTry1())) {
					s = 58;
				}

				else if ((true)) {
					s = 59;
				}

				input.seek(index25_11);
				if (s >= 0)
					return s;
				break;
			case 14:
				int LA25_33 = input.LA(1);

				int index25_33 = input.index();
				input.rewind();
				s = -1;
				if ((synpred42_TinyHaxeTry1())) {
					s = 58;
				}

				else if ((true)) {
					s = 59;
				}

				input.seek(index25_33);
				if (s >= 0)
					return s;
				break;
			case 15:
				int LA25_16 = input.LA(1);

				int index25_16 = input.index();
				input.rewind();
				s = -1;
				if ((synpred42_TinyHaxeTry1())) {
					s = 58;
				}

				else if ((true)) {
					s = 59;
				}

				input.seek(index25_16);
				if (s >= 0)
					return s;
				break;
			case 16:
				int LA25_25 = input.LA(1);

				int index25_25 = input.index();
				input.rewind();
				s = -1;
				if ((synpred42_TinyHaxeTry1())) {
					s = 58;
				}

				else if ((true)) {
					s = 59;
				}

				input.seek(index25_25);
				if (s >= 0)
					return s;
				break;
			case 17:
				int LA25_18 = input.LA(1);

				int index25_18 = input.index();
				input.rewind();
				s = -1;
				if ((synpred42_TinyHaxeTry1())) {
					s = 58;
				}

				else if ((true)) {
					s = 59;
				}

				input.seek(index25_18);
				if (s >= 0)
					return s;
				break;
			case 18:
				int LA25_32 = input.LA(1);

				int index25_32 = input.index();
				input.rewind();
				s = -1;
				if ((synpred42_TinyHaxeTry1())) {
					s = 58;
				}

				else if ((true)) {
					s = 59;
				}

				input.seek(index25_32);
				if (s >= 0)
					return s;
				break;
			case 19:
				int LA25_9 = input.LA(1);

				int index25_9 = input.index();
				input.rewind();
				s = -1;
				if ((synpred42_TinyHaxeTry1())) {
					s = 58;
				}

				else if ((true)) {
					s = 59;
				}

				input.seek(index25_9);
				if (s >= 0)
					return s;
				break;
			case 20:
				int LA25_8 = input.LA(1);

				int index25_8 = input.index();
				input.rewind();
				s = -1;
				if ((synpred42_TinyHaxeTry1())) {
					s = 58;
				}

				else if ((true)) {
					s = 59;
				}

				input.seek(index25_8);
				if (s >= 0)
					return s;
				break;
			case 21:
				int LA25_56 = input.LA(1);

				int index25_56 = input.index();
				input.rewind();
				s = -1;
				if ((synpred42_TinyHaxeTry1())) {
					s = 58;
				}

				else if ((true)) {
					s = 59;
				}

				input.seek(index25_56);
				if (s >= 0)
					return s;
				break;
			case 22:
				int LA25_19 = input.LA(1);

				int index25_19 = input.index();
				input.rewind();
				s = -1;
				if ((synpred42_TinyHaxeTry1())) {
					s = 58;
				}

				else if ((true)) {
					s = 59;
				}

				input.seek(index25_19);
				if (s >= 0)
					return s;
				break;
			case 23:
				int LA25_30 = input.LA(1);

				int index25_30 = input.index();
				input.rewind();
				s = -1;
				if ((synpred42_TinyHaxeTry1())) {
					s = 58;
				}

				else if ((true)) {
					s = 59;
				}

				input.seek(index25_30);
				if (s >= 0)
					return s;
				break;
			case 24:
				int LA25_35 = input.LA(1);

				int index25_35 = input.index();
				input.rewind();
				s = -1;
				if ((synpred42_TinyHaxeTry1())) {
					s = 58;
				}

				else if ((true)) {
					s = 59;
				}

				input.seek(index25_35);
				if (s >= 0)
					return s;
				break;
			case 25:
				int LA25_49 = input.LA(1);

				int index25_49 = input.index();
				input.rewind();
				s = -1;
				if ((synpred42_TinyHaxeTry1())) {
					s = 58;
				}

				else if ((true)) {
					s = 59;
				}

				input.seek(index25_49);
				if (s >= 0)
					return s;
				break;
			case 26:
				int LA25_27 = input.LA(1);

				int index25_27 = input.index();
				input.rewind();
				s = -1;
				if ((synpred42_TinyHaxeTry1())) {
					s = 58;
				}

				else if ((true)) {
					s = 59;
				}

				input.seek(index25_27);
				if (s >= 0)
					return s;
				break;
			case 27:
				int LA25_22 = input.LA(1);

				int index25_22 = input.index();
				input.rewind();
				s = -1;
				if ((synpred42_TinyHaxeTry1())) {
					s = 58;
				}

				else if ((true)) {
					s = 59;
				}

				input.seek(index25_22);
				if (s >= 0)
					return s;
				break;
			case 28:
				int LA25_24 = input.LA(1);

				int index25_24 = input.index();
				input.rewind();
				s = -1;
				if ((synpred42_TinyHaxeTry1())) {
					s = 58;
				}

				else if ((true)) {
					s = 59;
				}

				input.seek(index25_24);
				if (s >= 0)
					return s;
				break;
			case 29:
				int LA25_14 = input.LA(1);

				int index25_14 = input.index();
				input.rewind();
				s = -1;
				if ((synpred42_TinyHaxeTry1())) {
					s = 58;
				}

				else if ((true)) {
					s = 59;
				}

				input.seek(index25_14);
				if (s >= 0)
					return s;
				break;
			case 30:
				int LA25_48 = input.LA(1);

				int index25_48 = input.index();
				input.rewind();
				s = -1;
				if ((synpred42_TinyHaxeTry1())) {
					s = 58;
				}

				else if ((true)) {
					s = 59;
				}

				input.seek(index25_48);
				if (s >= 0)
					return s;
				break;
			case 31:
				int LA25_39 = input.LA(1);

				int index25_39 = input.index();
				input.rewind();
				s = -1;
				if ((synpred42_TinyHaxeTry1())) {
					s = 58;
				}

				else if ((true)) {
					s = 59;
				}

				input.seek(index25_39);
				if (s >= 0)
					return s;
				break;
			case 32:
				int LA25_2 = input.LA(1);

				int index25_2 = input.index();
				input.rewind();
				s = -1;
				if ((synpred42_TinyHaxeTry1())) {
					s = 58;
				}

				else if ((true)) {
					s = 59;
				}

				input.seek(index25_2);
				if (s >= 0)
					return s;
				break;
			case 33:
				int LA25_28 = input.LA(1);

				int index25_28 = input.index();
				input.rewind();
				s = -1;
				if ((synpred42_TinyHaxeTry1())) {
					s = 58;
				}

				else if ((true)) {
					s = 59;
				}

				input.seek(index25_28);
				if (s >= 0)
					return s;
				break;
			case 34:
				int LA25_37 = input.LA(1);

				int index25_37 = input.index();
				input.rewind();
				s = -1;
				if ((synpred42_TinyHaxeTry1())) {
					s = 58;
				}

				else if ((true)) {
					s = 59;
				}

				input.seek(index25_37);
				if (s >= 0)
					return s;
				break;
			case 35:
				int LA25_13 = input.LA(1);

				int index25_13 = input.index();
				input.rewind();
				s = -1;
				if ((synpred42_TinyHaxeTry1())) {
					s = 58;
				}

				else if ((true)) {
					s = 59;
				}

				input.seek(index25_13);
				if (s >= 0)
					return s;
				break;
			case 36:
				int LA25_57 = input.LA(1);

				int index25_57 = input.index();
				input.rewind();
				s = -1;
				if ((synpred42_TinyHaxeTry1())) {
					s = 58;
				}

				else if ((true)) {
					s = 59;
				}

				input.seek(index25_57);
				if (s >= 0)
					return s;
				break;
			case 37:
				int LA25_47 = input.LA(1);

				int index25_47 = input.index();
				input.rewind();
				s = -1;
				if ((synpred42_TinyHaxeTry1())) {
					s = 58;
				}

				else if ((true)) {
					s = 59;
				}

				input.seek(index25_47);
				if (s >= 0)
					return s;
				break;
			case 38:
				int LA25_17 = input.LA(1);

				int index25_17 = input.index();
				input.rewind();
				s = -1;
				if ((synpred42_TinyHaxeTry1())) {
					s = 58;
				}

				else if ((true)) {
					s = 59;
				}

				input.seek(index25_17);
				if (s >= 0)
					return s;
				break;
			case 39:
				int LA25_29 = input.LA(1);

				int index25_29 = input.index();
				input.rewind();
				s = -1;
				if ((synpred42_TinyHaxeTry1())) {
					s = 58;
				}

				else if ((true)) {
					s = 59;
				}

				input.seek(index25_29);
				if (s >= 0)
					return s;
				break;
			case 40:
				int LA25_6 = input.LA(1);

				int index25_6 = input.index();
				input.rewind();
				s = -1;
				if ((synpred42_TinyHaxeTry1())) {
					s = 58;
				}

				else if ((true)) {
					s = 59;
				}

				input.seek(index25_6);
				if (s >= 0)
					return s;
				break;
			case 41:
				int LA25_10 = input.LA(1);

				int index25_10 = input.index();
				input.rewind();
				s = -1;
				if ((synpred42_TinyHaxeTry1())) {
					s = 58;
				}

				else if ((true)) {
					s = 59;
				}

				input.seek(index25_10);
				if (s >= 0)
					return s;
				break;
			case 42:
				int LA25_53 = input.LA(1);

				int index25_53 = input.index();
				input.rewind();
				s = -1;
				if ((synpred42_TinyHaxeTry1())) {
					s = 58;
				}

				else if ((true)) {
					s = 59;
				}

				input.seek(index25_53);
				if (s >= 0)
					return s;
				break;
			case 43:
				int LA25_45 = input.LA(1);

				int index25_45 = input.index();
				input.rewind();
				s = -1;
				if ((synpred42_TinyHaxeTry1())) {
					s = 58;
				}

				else if ((true)) {
					s = 59;
				}

				input.seek(index25_45);
				if (s >= 0)
					return s;
				break;
			case 44:
				int LA25_54 = input.LA(1);

				int index25_54 = input.index();
				input.rewind();
				s = -1;
				if ((synpred42_TinyHaxeTry1())) {
					s = 58;
				}

				else if ((true)) {
					s = 59;
				}

				input.seek(index25_54);
				if (s >= 0)
					return s;
				break;
			case 45:
				int LA25_23 = input.LA(1);

				int index25_23 = input.index();
				input.rewind();
				s = -1;
				if ((synpred42_TinyHaxeTry1())) {
					s = 58;
				}

				else if ((true)) {
					s = 59;
				}

				input.seek(index25_23);
				if (s >= 0)
					return s;
				break;
			case 46:
				int LA25_40 = input.LA(1);

				int index25_40 = input.index();
				input.rewind();
				s = -1;
				if ((synpred42_TinyHaxeTry1())) {
					s = 58;
				}

				else if ((true)) {
					s = 59;
				}

				input.seek(index25_40);
				if (s >= 0)
					return s;
				break;
			case 47:
				int LA25_5 = input.LA(1);

				int index25_5 = input.index();
				input.rewind();
				s = -1;
				if ((synpred42_TinyHaxeTry1())) {
					s = 58;
				}

				else if ((true)) {
					s = 59;
				}

				input.seek(index25_5);
				if (s >= 0)
					return s;
				break;
			case 48:
				int LA25_51 = input.LA(1);

				int index25_51 = input.index();
				input.rewind();
				s = -1;
				if ((synpred42_TinyHaxeTry1())) {
					s = 58;
				}

				else if ((true)) {
					s = 59;
				}

				input.seek(index25_51);
				if (s >= 0)
					return s;
				break;
			case 49:
				int LA25_4 = input.LA(1);

				int index25_4 = input.index();
				input.rewind();
				s = -1;
				if ((synpred42_TinyHaxeTry1())) {
					s = 58;
				}

				else if ((true)) {
					s = 59;
				}

				input.seek(index25_4);
				if (s >= 0)
					return s;
				break;
			case 50:
				int LA25_7 = input.LA(1);

				int index25_7 = input.index();
				input.rewind();
				s = -1;
				if ((synpred42_TinyHaxeTry1())) {
					s = 58;
				}

				else if ((true)) {
					s = 59;
				}

				input.seek(index25_7);
				if (s >= 0)
					return s;
				break;
			case 51:
				int LA25_41 = input.LA(1);

				int index25_41 = input.index();
				input.rewind();
				s = -1;
				if ((synpred42_TinyHaxeTry1())) {
					s = 58;
				}

				else if ((true)) {
					s = 59;
				}

				input.seek(index25_41);
				if (s >= 0)
					return s;
				break;
			case 52:
				int LA25_12 = input.LA(1);

				int index25_12 = input.index();
				input.rewind();
				s = -1;
				if ((synpred42_TinyHaxeTry1())) {
					s = 58;
				}

				else if ((true)) {
					s = 59;
				}

				input.seek(index25_12);
				if (s >= 0)
					return s;
				break;
			case 53:
				int LA25_43 = input.LA(1);

				int index25_43 = input.index();
				input.rewind();
				s = -1;
				if ((synpred42_TinyHaxeTry1())) {
					s = 58;
				}

				else if ((true)) {
					s = 59;
				}

				input.seek(index25_43);
				if (s >= 0)
					return s;
				break;
			case 54:
				int LA25_52 = input.LA(1);

				int index25_52 = input.index();
				input.rewind();
				s = -1;
				if ((synpred42_TinyHaxeTry1())) {
					s = 58;
				}

				else if ((true)) {
					s = 59;
				}

				input.seek(index25_52);
				if (s >= 0)
					return s;
				break;
			case 55:
				int LA25_3 = input.LA(1);

				int index25_3 = input.index();
				input.rewind();
				s = -1;
				if ((synpred42_TinyHaxeTry1())) {
					s = 58;
				}

				else if ((true)) {
					s = 59;
				}

				input.seek(index25_3);
				if (s >= 0)
					return s;
				break;
			case 56:
				int LA25_44 = input.LA(1);

				int index25_44 = input.index();
				input.rewind();
				s = -1;
				if ((synpred42_TinyHaxeTry1())) {
					s = 58;
				}

				else if ((true)) {
					s = 59;
				}

				input.seek(index25_44);
				if (s >= 0)
					return s;
				break;
			}
			if (state.backtracking > 0) {
				state.failed = true;
				return -1;
			}
			NoViableAltException nvae = new NoViableAltException(
					getDescription(), 25, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA34_eotS = "\103\uffff";
	static final String DFA34_eofS = "\103\uffff";
	static final String DFA34_minS = "\1\20\55\0\25\uffff";
	static final String DFA34_maxS = "\1\154\55\0\25\uffff";
	static final String DFA34_acceptS = "\56\uffff\1\3\5\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"
			+ "\1\15\1\1\1\2\1\16\1\20\1\17";
	static final String DFA34_specialS = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"
			+ "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"
			+ "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"
			+ "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\25\uffff}>";
	static final String[] DFA34_transitionS = {
			"\1\2\1\21\2\uffff\6\56\1\uffff\1\46\1\50\1\51\1\52\1\53\1\54"
					+ "\1\55\1\6\1\20\1\uffff\1\7\2\uffff\1\31\12\uffff\1\24\1\33\1"
					+ "\uffff\1\4\1\64\1\uffff\1\65\1\uffff\1\66\1\67\1\70\1\71\1\1"
					+ "\1\uffff\1\72\1\73\1\74\1\75\3\uffff\1\47\1\45\1\44\1\40\1\41"
					+ "\1\42\1\43\1\35\1\36\1\37\1\32\1\34\1\30\1\23\1\25\1\26\1\27"
					+ "\1\22\1\3\1\31\1\10\1\5\1\uffff\1\56\6\uffff\1\11\1\12\1\13"
					+ "\1\14\1\15\1\16\1\17", "\1\uffff", "\1\uffff",
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

	static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
	static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
	static final char[] DFA34_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA34_minS);
	static final char[] DFA34_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA34_maxS);
	static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
	static final short[] DFA34_special = DFA
			.unpackEncodedString(DFA34_specialS);
	static final short[][] DFA34_transition;

	static {
		int numStates = DFA34_transitionS.length;
		DFA34_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
		}
	}

	class DFA34 extends DFA {

		public DFA34(BaseRecognizer recognizer) {
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

		@Override
		public String getDescription() {
			return "167:1: statement : ( block | assignExpr SEMI | varDecl | IF parExpression st1= statement ( ELSE st2= statement )? -> ^( IF parExpression $st1 ( ^( ELSE $st2) )? ) | FOR LPAREN exp1= expr IN exp2= expr RPAREN statement -> ^( FOR ^( IN $exp1 $exp2) ( statement )? ) | WHILE parExpression statement -> ^( WHILE ( parExpression )? ( statement )? ) | DO statement WHILE parExpression SEMI -> ^( DO ( parExpression )? ( statement )? ) | TRY block catchStmtList -> ^( TRY ( block )? ( catchStmtList )? ) | SWITCH LPAREN expr RPAREN LBRACE ( caseStmt )+ RBRACE -> ^( SWITCH ( expr )? ( caseStmt )+ ) | RETURN ( expr )? SEMI -> ^( RETURN ( expr )? ) | THROW expr SEMI -> ^( THROW ( expr )? ) | BREAK ( IDENTIFIER )? SEMI -> ^( BREAK ( IDENTIFIER )? ) | CONTINUE ( IDENTIFIER )? SEMI -> ^( CONTINUE ( IDENTIFIER )? ) | expr SEMI | IDENTIFIER COLON statement -> ^( COLON ( IDENTIFIER )? ( statement )? ) | SEMI );";
		}

		@Override
		public int specialStateTransition(int s, IntStream _input)
				throws NoViableAltException {
			TokenStream input = (TokenStream) _input;
			int _s = s;
			switch (s) {
			case 0:
				int LA34_1 = input.LA(1);

				int index34_1 = input.index();
				input.rewind();
				s = -1;
				if ((synpred47_TinyHaxeTry1())) {
					s = 62;
				}

				else if ((synpred48_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((synpred65_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index34_1);
				if (s >= 0)
					return s;
				break;
			case 1:
				int LA34_2 = input.LA(1);

				int index34_2 = input.index();
				input.rewind();
				s = -1;
				if ((synpred47_TinyHaxeTry1())) {
					s = 62;
				}

				else if ((synpred48_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((synpred65_TinyHaxeTry1())) {
					s = 64;
				}

				else if ((true)) {
					s = 65;
				}

				input.seek(index34_2);
				if (s >= 0)
					return s;
				break;
			case 2:
				int LA34_3 = input.LA(1);

				int index34_3 = input.index();
				input.rewind();
				s = -1;
				if ((synpred48_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((synpred65_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index34_3);
				if (s >= 0)
					return s;
				break;
			case 3:
				int LA34_4 = input.LA(1);

				int index34_4 = input.index();
				input.rewind();
				s = -1;
				if ((synpred48_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((synpred65_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index34_4);
				if (s >= 0)
					return s;
				break;
			case 4:
				int LA34_5 = input.LA(1);

				int index34_5 = input.index();
				input.rewind();
				s = -1;
				if ((synpred48_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((synpred65_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index34_5);
				if (s >= 0)
					return s;
				break;
			case 5:
				int LA34_6 = input.LA(1);

				int index34_6 = input.index();
				input.rewind();
				s = -1;
				if ((synpred48_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((synpred65_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index34_6);
				if (s >= 0)
					return s;
				break;
			case 6:
				int LA34_7 = input.LA(1);

				int index34_7 = input.index();
				input.rewind();
				s = -1;
				if ((synpred48_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((synpred65_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index34_7);
				if (s >= 0)
					return s;
				break;
			case 7:
				int LA34_8 = input.LA(1);

				int index34_8 = input.index();
				input.rewind();
				s = -1;
				if ((synpred48_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((synpred65_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index34_8);
				if (s >= 0)
					return s;
				break;
			case 8:
				int LA34_9 = input.LA(1);

				int index34_9 = input.index();
				input.rewind();
				s = -1;
				if ((synpred48_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((synpred65_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index34_9);
				if (s >= 0)
					return s;
				break;
			case 9:
				int LA34_10 = input.LA(1);

				int index34_10 = input.index();
				input.rewind();
				s = -1;
				if ((synpred48_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((synpred65_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index34_10);
				if (s >= 0)
					return s;
				break;
			case 10:
				int LA34_11 = input.LA(1);

				int index34_11 = input.index();
				input.rewind();
				s = -1;
				if ((synpred48_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((synpred65_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index34_11);
				if (s >= 0)
					return s;
				break;
			case 11:
				int LA34_12 = input.LA(1);

				int index34_12 = input.index();
				input.rewind();
				s = -1;
				if ((synpred48_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((synpred65_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index34_12);
				if (s >= 0)
					return s;
				break;
			case 12:
				int LA34_13 = input.LA(1);

				int index34_13 = input.index();
				input.rewind();
				s = -1;
				if ((synpred48_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((synpred65_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index34_13);
				if (s >= 0)
					return s;
				break;
			case 13:
				int LA34_14 = input.LA(1);

				int index34_14 = input.index();
				input.rewind();
				s = -1;
				if ((synpred48_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((synpred65_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index34_14);
				if (s >= 0)
					return s;
				break;
			case 14:
				int LA34_15 = input.LA(1);

				int index34_15 = input.index();
				input.rewind();
				s = -1;
				if ((synpred48_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((synpred65_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index34_15);
				if (s >= 0)
					return s;
				break;
			case 15:
				int LA34_16 = input.LA(1);

				int index34_16 = input.index();
				input.rewind();
				s = -1;
				if ((synpred48_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((synpred65_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index34_16);
				if (s >= 0)
					return s;
				break;
			case 16:
				int LA34_17 = input.LA(1);

				int index34_17 = input.index();
				input.rewind();
				s = -1;
				if ((synpred48_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((synpred65_TinyHaxeTry1())) {
					s = 64;
				}

				else if ((synpred66_TinyHaxeTry1())) {
					s = 66;
				}

				input.seek(index34_17);
				if (s >= 0)
					return s;
				break;
			case 17:
				int LA34_18 = input.LA(1);

				int index34_18 = input.index();
				input.rewind();
				s = -1;
				if ((synpred48_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((synpred65_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index34_18);
				if (s >= 0)
					return s;
				break;
			case 18:
				int LA34_19 = input.LA(1);

				int index34_19 = input.index();
				input.rewind();
				s = -1;
				if ((synpred48_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((synpred65_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index34_19);
				if (s >= 0)
					return s;
				break;
			case 19:
				int LA34_20 = input.LA(1);

				int index34_20 = input.index();
				input.rewind();
				s = -1;
				if ((synpred48_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((synpred65_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index34_20);
				if (s >= 0)
					return s;
				break;
			case 20:
				int LA34_21 = input.LA(1);

				int index34_21 = input.index();
				input.rewind();
				s = -1;
				if ((synpred48_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((synpred65_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index34_21);
				if (s >= 0)
					return s;
				break;
			case 21:
				int LA34_22 = input.LA(1);

				int index34_22 = input.index();
				input.rewind();
				s = -1;
				if ((synpred48_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((synpred65_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index34_22);
				if (s >= 0)
					return s;
				break;
			case 22:
				int LA34_23 = input.LA(1);

				int index34_23 = input.index();
				input.rewind();
				s = -1;
				if ((synpred48_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((synpred65_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index34_23);
				if (s >= 0)
					return s;
				break;
			case 23:
				int LA34_24 = input.LA(1);

				int index34_24 = input.index();
				input.rewind();
				s = -1;
				if ((synpred48_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((synpred65_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index34_24);
				if (s >= 0)
					return s;
				break;
			case 24:
				int LA34_25 = input.LA(1);

				int index34_25 = input.index();
				input.rewind();
				s = -1;
				if ((synpred48_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((synpred65_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index34_25);
				if (s >= 0)
					return s;
				break;
			case 25:
				int LA34_26 = input.LA(1);

				int index34_26 = input.index();
				input.rewind();
				s = -1;
				if ((synpred48_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((synpred65_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index34_26);
				if (s >= 0)
					return s;
				break;
			case 26:
				int LA34_27 = input.LA(1);

				int index34_27 = input.index();
				input.rewind();
				s = -1;
				if ((synpred48_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((synpred65_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index34_27);
				if (s >= 0)
					return s;
				break;
			case 27:
				int LA34_28 = input.LA(1);

				int index34_28 = input.index();
				input.rewind();
				s = -1;
				if ((synpred48_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((synpred65_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index34_28);
				if (s >= 0)
					return s;
				break;
			case 28:
				int LA34_29 = input.LA(1);

				int index34_29 = input.index();
				input.rewind();
				s = -1;
				if ((synpred48_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((synpred65_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index34_29);
				if (s >= 0)
					return s;
				break;
			case 29:
				int LA34_30 = input.LA(1);

				int index34_30 = input.index();
				input.rewind();
				s = -1;
				if ((synpred48_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((synpred65_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index34_30);
				if (s >= 0)
					return s;
				break;
			case 30:
				int LA34_31 = input.LA(1);

				int index34_31 = input.index();
				input.rewind();
				s = -1;
				if ((synpred48_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((synpred65_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index34_31);
				if (s >= 0)
					return s;
				break;
			case 31:
				int LA34_32 = input.LA(1);

				int index34_32 = input.index();
				input.rewind();
				s = -1;
				if ((synpred48_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((synpred65_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index34_32);
				if (s >= 0)
					return s;
				break;
			case 32:
				int LA34_33 = input.LA(1);

				int index34_33 = input.index();
				input.rewind();
				s = -1;
				if ((synpred48_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((synpred65_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index34_33);
				if (s >= 0)
					return s;
				break;
			case 33:
				int LA34_34 = input.LA(1);

				int index34_34 = input.index();
				input.rewind();
				s = -1;
				if ((synpred48_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((synpred65_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index34_34);
				if (s >= 0)
					return s;
				break;
			case 34:
				int LA34_35 = input.LA(1);

				int index34_35 = input.index();
				input.rewind();
				s = -1;
				if ((synpred48_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((synpred65_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index34_35);
				if (s >= 0)
					return s;
				break;
			case 35:
				int LA34_36 = input.LA(1);

				int index34_36 = input.index();
				input.rewind();
				s = -1;
				if ((synpred48_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((synpred65_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index34_36);
				if (s >= 0)
					return s;
				break;
			case 36:
				int LA34_37 = input.LA(1);

				int index34_37 = input.index();
				input.rewind();
				s = -1;
				if ((synpred48_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((synpred65_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index34_37);
				if (s >= 0)
					return s;
				break;
			case 37:
				int LA34_38 = input.LA(1);

				int index34_38 = input.index();
				input.rewind();
				s = -1;
				if ((synpred48_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((synpred65_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index34_38);
				if (s >= 0)
					return s;
				break;
			case 38:
				int LA34_39 = input.LA(1);

				int index34_39 = input.index();
				input.rewind();
				s = -1;
				if ((synpred48_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((synpred65_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index34_39);
				if (s >= 0)
					return s;
				break;
			case 39:
				int LA34_40 = input.LA(1);

				int index34_40 = input.index();
				input.rewind();
				s = -1;
				if ((synpred48_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((synpred65_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index34_40);
				if (s >= 0)
					return s;
				break;
			case 40:
				int LA34_41 = input.LA(1);

				int index34_41 = input.index();
				input.rewind();
				s = -1;
				if ((synpred48_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((synpred65_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index34_41);
				if (s >= 0)
					return s;
				break;
			case 41:
				int LA34_42 = input.LA(1);

				int index34_42 = input.index();
				input.rewind();
				s = -1;
				if ((synpred48_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((synpred65_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index34_42);
				if (s >= 0)
					return s;
				break;
			case 42:
				int LA34_43 = input.LA(1);

				int index34_43 = input.index();
				input.rewind();
				s = -1;
				if ((synpred48_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((synpred65_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index34_43);
				if (s >= 0)
					return s;
				break;
			case 43:
				int LA34_44 = input.LA(1);

				int index34_44 = input.index();
				input.rewind();
				s = -1;
				if ((synpred48_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((synpred65_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index34_44);
				if (s >= 0)
					return s;
				break;
			case 44:
				int LA34_45 = input.LA(1);

				int index34_45 = input.index();
				input.rewind();
				s = -1;
				if ((synpred48_TinyHaxeTry1())) {
					s = 63;
				}

				else if ((synpred65_TinyHaxeTry1())) {
					s = 64;
				}

				input.seek(index34_45);
				if (s >= 0)
					return s;
				break;
			}
			if (state.backtracking > 0) {
				state.failed = true;
				return -1;
			}
			NoViableAltException nvae = new NoViableAltException(
					getDescription(), 34, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA37_eotS = "\101\uffff";
	static final String DFA37_eofS = "\101\uffff";
	static final String DFA37_minS = "\1\20\6\0\72\uffff";
	static final String DFA37_maxS = "\1\154\6\0\72\uffff";
	static final String DFA37_acceptS = "\7\uffff\1\2\1\uffff\1\3\66\uffff\1\1";
	static final String DFA37_specialS = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\72\uffff}>";
	static final String[] DFA37_transitionS = {
			"\2\11\2\uffff\2\5\1\1\1\2\1\3\1\4\1\uffff\11\11\1\uffff\1\11"
					+ "\2\uffff\1\11\12\uffff\2\11\1\uffff\2\11\1\uffff\1\11\1\uffff"
					+ "\5\11\1\uffff\4\11\3\uffff\26\11\1\uffff\1\6\2\7\4\uffff\7\11",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
			"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
			"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
			"", "", "", "", "", "", "", "", "", "" };

	static final short[] DFA37_eot = DFA.unpackEncodedString(DFA37_eotS);
	static final short[] DFA37_eof = DFA.unpackEncodedString(DFA37_eofS);
	static final char[] DFA37_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA37_minS);
	static final char[] DFA37_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA37_maxS);
	static final short[] DFA37_accept = DFA.unpackEncodedString(DFA37_acceptS);
	static final short[] DFA37_special = DFA
			.unpackEncodedString(DFA37_specialS);
	static final short[][] DFA37_transition;

	static {
		int numStates = DFA37_transitionS.length;
		DFA37_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA37_transition[i] = DFA.unpackEncodedString(DFA37_transitionS[i]);
		}
	}

	class DFA37 extends DFA {

		public DFA37(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 37;
			this.eot = DFA37_eot;
			this.eof = DFA37_eof;
			this.min = DFA37_min;
			this.max = DFA37_max;
			this.accept = DFA37_accept;
			this.special = DFA37_special;
			this.transition = DFA37_transition;
		}

		@Override
		public String getDescription() {
			return "194:1: blockStmt : ( varDecl | classDecl | statement );";
		}

		@Override
		public int specialStateTransition(int s, IntStream _input)
				throws NoViableAltException {
			TokenStream input = (TokenStream) _input;
			int _s = s;
			switch (s) {
			case 0:
				int LA37_1 = input.LA(1);

				int index37_1 = input.index();
				input.rewind();
				s = -1;
				if ((synpred69_TinyHaxeTry1())) {
					s = 64;
				}

				else if ((true)) {
					s = 9;
				}

				input.seek(index37_1);
				if (s >= 0)
					return s;
				break;
			case 1:
				int LA37_2 = input.LA(1);

				int index37_2 = input.index();
				input.rewind();
				s = -1;
				if ((synpred69_TinyHaxeTry1())) {
					s = 64;
				}

				else if ((true)) {
					s = 9;
				}

				input.seek(index37_2);
				if (s >= 0)
					return s;
				break;
			case 2:
				int LA37_3 = input.LA(1);

				int index37_3 = input.index();
				input.rewind();
				s = -1;
				if ((synpred69_TinyHaxeTry1())) {
					s = 64;
				}

				else if ((true)) {
					s = 9;
				}

				input.seek(index37_3);
				if (s >= 0)
					return s;
				break;
			case 3:
				int LA37_4 = input.LA(1);

				int index37_4 = input.index();
				input.rewind();
				s = -1;
				if ((synpred69_TinyHaxeTry1())) {
					s = 64;
				}

				else if ((true)) {
					s = 9;
				}

				input.seek(index37_4);
				if (s >= 0)
					return s;
				break;
			case 4:
				int LA37_5 = input.LA(1);

				int index37_5 = input.index();
				input.rewind();
				s = -1;
				if ((synpred69_TinyHaxeTry1())) {
					s = 64;
				}

				else if ((true)) {
					s = 9;
				}

				input.seek(index37_5);
				if (s >= 0)
					return s;
				break;
			case 5:
				int LA37_6 = input.LA(1);

				int index37_6 = input.index();
				input.rewind();
				s = -1;
				if ((synpred69_TinyHaxeTry1())) {
					s = 64;
				}

				else if ((true)) {
					s = 9;
				}

				input.seek(index37_6);
				if (s >= 0)
					return s;
				break;
			}
			if (state.backtracking > 0) {
				state.failed = true;
				return -1;
			}
			NoViableAltException nvae = new NoViableAltException(
					getDescription(), 37, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA56_eotS = "\64\uffff";
	static final String DFA56_eofS = "\1\20\63\uffff";
	static final String DFA56_minS = "\1\20\15\0\46\uffff";
	static final String DFA56_maxS = "\1\154\15\0\46\uffff";
	static final String DFA56_acceptS = "\16\uffff\1\3\1\4\1\5\41\uffff\1\1\1\2";
	static final String DFA56_specialS = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"
			+ "\14\46\uffff}>";
	static final String[] DFA56_transitionS = {
			"\1\20\1\15\10\uffff\10\20\1\1\1\14\1\20\1\2\1\20\6\uffff\1"
					+ "\20\5\uffff\2\20\5\uffff\1\20\4\uffff\1\3\1\20\7\uffff\21\20"
					+ "\1\17\1\16\1\uffff\1\4\11\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1"
					+ "\13", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "", "", "", "", "",
			"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
			"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "" };

	static final short[] DFA56_eot = DFA.unpackEncodedString(DFA56_eotS);
	static final short[] DFA56_eof = DFA.unpackEncodedString(DFA56_eofS);
	static final char[] DFA56_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA56_minS);
	static final char[] DFA56_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA56_maxS);
	static final short[] DFA56_accept = DFA.unpackEncodedString(DFA56_acceptS);
	static final short[] DFA56_special = DFA
			.unpackEncodedString(DFA56_specialS);
	static final short[][] DFA56_transition;

	static {
		int numStates = DFA56_transitionS.length;
		DFA56_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA56_transition[i] = DFA.unpackEncodedString(DFA56_transitionS[i]);
		}
	}

	class DFA56 extends DFA {

		public DFA56(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 56;
			this.eot = DFA56_eot;
			this.eof = DFA56_eof;
			this.min = DFA56_min;
			this.max = DFA56_max;
			this.accept = DFA56_accept;
			this.special = DFA56_special;
			this.transition = DFA56_transition;
		}

		@Override
		public String getDescription() {
			return "282:1: suffixExpr : ( value LPAREN exprListOpt RPAREN -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( exprListOpt )? ) | value LBRACKET expr RBRACKET | value PLUSPLUS -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? ( PLUSPLUS )? ) | value SUBSUB -> ^( SUFFIX_EXPR[\"SUFFIX_EXPR\",true] ( value )? SUBSUB ) | value typeParamOpt );";
		}

		@Override
		public int specialStateTransition(int s, IntStream _input)
				throws NoViableAltException {
			TokenStream input = (TokenStream) _input;
			int _s = s;
			switch (s) {
			case 0:
				int LA56_1 = input.LA(1);

				int index56_1 = input.index();
				input.rewind();
				s = -1;
				if ((synpred104_TinyHaxeTry1())) {
					s = 50;
				}

				else if ((synpred105_TinyHaxeTry1())) {
					s = 51;
				}

				else if ((synpred106_TinyHaxeTry1())) {
					s = 14;
				}

				else if ((synpred107_TinyHaxeTry1())) {
					s = 15;
				}

				else if ((true)) {
					s = 16;
				}

				input.seek(index56_1);
				if (s >= 0)
					return s;
				break;
			case 1:
				int LA56_2 = input.LA(1);

				int index56_2 = input.index();
				input.rewind();
				s = -1;
				if ((synpred104_TinyHaxeTry1())) {
					s = 50;
				}

				else if ((synpred105_TinyHaxeTry1())) {
					s = 51;
				}

				else if ((synpred106_TinyHaxeTry1())) {
					s = 14;
				}

				else if ((synpred107_TinyHaxeTry1())) {
					s = 15;
				}

				else if ((true)) {
					s = 16;
				}

				input.seek(index56_2);
				if (s >= 0)
					return s;
				break;
			case 2:
				int LA56_3 = input.LA(1);

				int index56_3 = input.index();
				input.rewind();
				s = -1;
				if ((synpred104_TinyHaxeTry1())) {
					s = 50;
				}

				else if ((synpred105_TinyHaxeTry1())) {
					s = 51;
				}

				else if ((synpred106_TinyHaxeTry1())) {
					s = 14;
				}

				else if ((synpred107_TinyHaxeTry1())) {
					s = 15;
				}

				else if ((true)) {
					s = 16;
				}

				input.seek(index56_3);
				if (s >= 0)
					return s;
				break;
			case 3:
				int LA56_4 = input.LA(1);

				int index56_4 = input.index();
				input.rewind();
				s = -1;
				if ((synpred104_TinyHaxeTry1())) {
					s = 50;
				}

				else if ((synpred105_TinyHaxeTry1())) {
					s = 51;
				}

				else if ((synpred106_TinyHaxeTry1())) {
					s = 14;
				}

				else if ((synpred107_TinyHaxeTry1())) {
					s = 15;
				}

				else if ((true)) {
					s = 16;
				}

				input.seek(index56_4);
				if (s >= 0)
					return s;
				break;
			case 4:
				int LA56_5 = input.LA(1);

				int index56_5 = input.index();
				input.rewind();
				s = -1;
				if ((synpred104_TinyHaxeTry1())) {
					s = 50;
				}

				else if ((synpred105_TinyHaxeTry1())) {
					s = 51;
				}

				else if ((synpred106_TinyHaxeTry1())) {
					s = 14;
				}

				else if ((synpred107_TinyHaxeTry1())) {
					s = 15;
				}

				else if ((true)) {
					s = 16;
				}

				input.seek(index56_5);
				if (s >= 0)
					return s;
				break;
			case 5:
				int LA56_6 = input.LA(1);

				int index56_6 = input.index();
				input.rewind();
				s = -1;
				if ((synpred104_TinyHaxeTry1())) {
					s = 50;
				}

				else if ((synpred105_TinyHaxeTry1())) {
					s = 51;
				}

				else if ((synpred106_TinyHaxeTry1())) {
					s = 14;
				}

				else if ((synpred107_TinyHaxeTry1())) {
					s = 15;
				}

				else if ((true)) {
					s = 16;
				}

				input.seek(index56_6);
				if (s >= 0)
					return s;
				break;
			case 6:
				int LA56_7 = input.LA(1);

				int index56_7 = input.index();
				input.rewind();
				s = -1;
				if ((synpred104_TinyHaxeTry1())) {
					s = 50;
				}

				else if ((synpred105_TinyHaxeTry1())) {
					s = 51;
				}

				else if ((synpred106_TinyHaxeTry1())) {
					s = 14;
				}

				else if ((synpred107_TinyHaxeTry1())) {
					s = 15;
				}

				else if ((true)) {
					s = 16;
				}

				input.seek(index56_7);
				if (s >= 0)
					return s;
				break;
			case 7:
				int LA56_8 = input.LA(1);

				int index56_8 = input.index();
				input.rewind();
				s = -1;
				if ((synpred104_TinyHaxeTry1())) {
					s = 50;
				}

				else if ((synpred105_TinyHaxeTry1())) {
					s = 51;
				}

				else if ((synpred106_TinyHaxeTry1())) {
					s = 14;
				}

				else if ((synpred107_TinyHaxeTry1())) {
					s = 15;
				}

				else if ((true)) {
					s = 16;
				}

				input.seek(index56_8);
				if (s >= 0)
					return s;
				break;
			case 8:
				int LA56_9 = input.LA(1);

				int index56_9 = input.index();
				input.rewind();
				s = -1;
				if ((synpred104_TinyHaxeTry1())) {
					s = 50;
				}

				else if ((synpred105_TinyHaxeTry1())) {
					s = 51;
				}

				else if ((synpred106_TinyHaxeTry1())) {
					s = 14;
				}

				else if ((synpred107_TinyHaxeTry1())) {
					s = 15;
				}

				else if ((true)) {
					s = 16;
				}

				input.seek(index56_9);
				if (s >= 0)
					return s;
				break;
			case 9:
				int LA56_10 = input.LA(1);

				int index56_10 = input.index();
				input.rewind();
				s = -1;
				if ((synpred104_TinyHaxeTry1())) {
					s = 50;
				}

				else if ((synpred105_TinyHaxeTry1())) {
					s = 51;
				}

				else if ((synpred106_TinyHaxeTry1())) {
					s = 14;
				}

				else if ((synpred107_TinyHaxeTry1())) {
					s = 15;
				}

				else if ((true)) {
					s = 16;
				}

				input.seek(index56_10);
				if (s >= 0)
					return s;
				break;
			case 10:
				int LA56_11 = input.LA(1);

				int index56_11 = input.index();
				input.rewind();
				s = -1;
				if ((synpred104_TinyHaxeTry1())) {
					s = 50;
				}

				else if ((synpred105_TinyHaxeTry1())) {
					s = 51;
				}

				else if ((synpred106_TinyHaxeTry1())) {
					s = 14;
				}

				else if ((synpred107_TinyHaxeTry1())) {
					s = 15;
				}

				else if ((true)) {
					s = 16;
				}

				input.seek(index56_11);
				if (s >= 0)
					return s;
				break;
			case 11:
				int LA56_12 = input.LA(1);

				int index56_12 = input.index();
				input.rewind();
				s = -1;
				if ((synpred104_TinyHaxeTry1())) {
					s = 50;
				}

				else if ((synpred105_TinyHaxeTry1())) {
					s = 51;
				}

				else if ((synpred106_TinyHaxeTry1())) {
					s = 14;
				}

				else if ((synpred107_TinyHaxeTry1())) {
					s = 15;
				}

				else if ((true)) {
					s = 16;
				}

				input.seek(index56_12);
				if (s >= 0)
					return s;
				break;
			case 12:
				int LA56_13 = input.LA(1);

				int index56_13 = input.index();
				input.rewind();
				s = -1;
				if ((synpred104_TinyHaxeTry1())) {
					s = 50;
				}

				else if ((synpred105_TinyHaxeTry1())) {
					s = 51;
				}

				else if ((synpred106_TinyHaxeTry1())) {
					s = 14;
				}

				else if ((synpred107_TinyHaxeTry1())) {
					s = 15;
				}

				else if ((true)) {
					s = 16;
				}

				input.seek(index56_13);
				if (s >= 0)
					return s;
				break;
			}
			if (state.backtracking > 0) {
				state.failed = true;
				return -1;
			}
			NoViableAltException nvae = new NoViableAltException(
					getDescription(), 56, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA58_eotS = "\64\uffff";
	static final String DFA58_eofS = "\1\16\63\uffff";
	static final String DFA58_minS = "\1\20\1\uffff\1\0\11\uffff\1\0\47\uffff";
	static final String DFA58_maxS = "\1\154\1\uffff\1\0\11\uffff\1\0\47\uffff";
	static final String DFA58_acceptS = "\1\uffff\1\1\1\uffff\1\3\1\4\1\5\7\uffff\1\7\1\10\43\uffff\1\2"
			+ "\1\6";
	static final String DFA58_specialS = "\2\uffff\1\0\11\uffff\1\1\47\uffff}>";
	static final String[] DFA58_transitionS = {
			"\1\16\1\15\10\uffff\10\16\1\1\1\14\1\16\1\2\1\16\6\uffff\1"
					+ "\16\5\uffff\2\16\5\uffff\1\16\4\uffff\1\3\1\16\7\uffff\23\16"
					+ "\1\uffff\1\4\11\uffff\7\5", "", "\1\uffff", "", "", "",
			"", "", "", "", "", "", "\1\uffff", "", "", "", "", "", "", "", "",
			"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
			"", "", "", "", "", "", "", "", "", "", "", "", "", "" };

	static final short[] DFA58_eot = DFA.unpackEncodedString(DFA58_eotS);
	static final short[] DFA58_eof = DFA.unpackEncodedString(DFA58_eofS);
	static final char[] DFA58_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA58_minS);
	static final char[] DFA58_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA58_maxS);
	static final short[] DFA58_accept = DFA.unpackEncodedString(DFA58_acceptS);
	static final short[] DFA58_special = DFA
			.unpackEncodedString(DFA58_specialS);
	static final short[][] DFA58_transition;

	static {
		int numStates = DFA58_transitionS.length;
		DFA58_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA58_transition[i] = DFA.unpackEncodedString(DFA58_transitionS[i]);
		}
	}

	class DFA58 extends DFA {

		public DFA58(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 58;
			this.eot = DFA58_eot;
			this.eof = DFA58_eof;
			this.min = DFA58_min;
			this.max = DFA58_max;
			this.accept = DFA58_accept;
			this.special = DFA58_special;
			this.transition = DFA58_transition;
		}

		@Override
		public String getDescription() {
			return "290:1: value : ( funcLit | arrayLit | objLit | NULL | elementarySymbol | LPAREN ( expr | statement ) RPAREN | dotIdent | );";
		}

		@Override
		public int specialStateTransition(int s, IntStream _input)
				throws NoViableAltException {
			TokenStream input = (TokenStream) _input;
			int _s = s;
			switch (s) {
			case 0:
				int LA58_2 = input.LA(1);

				int index58_2 = input.index();
				input.rewind();
				s = -1;
				if ((synpred109_TinyHaxeTry1())) {
					s = 50;
				}

				else if ((true)) {
					s = 14;
				}

				input.seek(index58_2);
				if (s >= 0)
					return s;
				break;
			case 1:
				int LA58_12 = input.LA(1);

				int index58_12 = input.index();
				input.rewind();
				s = -1;
				if ((synpred114_TinyHaxeTry1())) {
					s = 51;
				}

				else if ((true)) {
					s = 14;
				}

				input.seek(index58_12);
				if (s >= 0)
					return s;
				break;
			}
			if (state.backtracking > 0) {
				state.failed = true;
				return -1;
			}
			NoViableAltException nvae = new NoViableAltException(
					getDescription(), 58, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA57_eotS = "\77\uffff";
	static final String DFA57_eofS = "\77\uffff";
	static final String DFA57_minS = "\1\20\54\0\22\uffff";
	static final String DFA57_maxS = "\1\154\54\0\22\uffff";
	static final String DFA57_acceptS = "\55\uffff\1\1\1\2\20\uffff";
	static final String DFA57_specialS = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"
			+ "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"
			+ "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"
			+ "\1\46\1\47\1\50\1\51\1\52\1\53\22\uffff}>";
	static final String[] DFA57_transitionS = {
			"\1\56\1\20\2\uffff\6\56\1\uffff\1\45\1\47\1\50\1\51\1\52\1"
					+ "\53\1\54\1\4\1\17\1\55\1\5\2\uffff\1\30\12\uffff\1\23\1\32\1"
					+ "\uffff\1\2\1\56\1\uffff\1\56\1\uffff\4\56\1\6\1\uffff\4\56\3"
					+ "\uffff\1\46\1\44\1\43\1\37\1\40\1\41\1\42\1\34\1\35\1\36\1\31"
					+ "\1\33\1\27\1\22\1\24\1\25\1\26\1\21\1\1\1\30\1\7\1\3\1\uffff"
					+ "\1\56\6\uffff\1\10\1\11\1\12\1\13\1\14\1\15\1\16",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "", "", "", "", "",
			"", "", "", "", "", "", "", "", "", "", "", "", "" };

	static final short[] DFA57_eot = DFA.unpackEncodedString(DFA57_eotS);
	static final short[] DFA57_eof = DFA.unpackEncodedString(DFA57_eofS);
	static final char[] DFA57_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA57_minS);
	static final char[] DFA57_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA57_maxS);
	static final short[] DFA57_accept = DFA.unpackEncodedString(DFA57_acceptS);
	static final short[] DFA57_special = DFA
			.unpackEncodedString(DFA57_specialS);
	static final short[][] DFA57_transition;

	static {
		int numStates = DFA57_transitionS.length;
		DFA57_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA57_transition[i] = DFA.unpackEncodedString(DFA57_transitionS[i]);
		}
	}

	class DFA57 extends DFA {

		public DFA57(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 57;
			this.eot = DFA57_eot;
			this.eof = DFA57_eof;
			this.min = DFA57_min;
			this.max = DFA57_max;
			this.accept = DFA57_accept;
			this.special = DFA57_special;
			this.transition = DFA57_transition;
		}

		@Override
		public String getDescription() {
			return "295:22: ( expr | statement )";
		}

		@Override
		public int specialStateTransition(int s, IntStream _input)
				throws NoViableAltException {
			TokenStream input = (TokenStream) _input;
			int _s = s;
			switch (s) {
			case 0:
				int LA57_1 = input.LA(1);

				int index57_1 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index57_1);
				if (s >= 0)
					return s;
				break;
			case 1:
				int LA57_2 = input.LA(1);

				int index57_2 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index57_2);
				if (s >= 0)
					return s;
				break;
			case 2:
				int LA57_3 = input.LA(1);

				int index57_3 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index57_3);
				if (s >= 0)
					return s;
				break;
			case 3:
				int LA57_4 = input.LA(1);

				int index57_4 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index57_4);
				if (s >= 0)
					return s;
				break;
			case 4:
				int LA57_5 = input.LA(1);

				int index57_5 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index57_5);
				if (s >= 0)
					return s;
				break;
			case 5:
				int LA57_6 = input.LA(1);

				int index57_6 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index57_6);
				if (s >= 0)
					return s;
				break;
			case 6:
				int LA57_7 = input.LA(1);

				int index57_7 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index57_7);
				if (s >= 0)
					return s;
				break;
			case 7:
				int LA57_8 = input.LA(1);

				int index57_8 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index57_8);
				if (s >= 0)
					return s;
				break;
			case 8:
				int LA57_9 = input.LA(1);

				int index57_9 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index57_9);
				if (s >= 0)
					return s;
				break;
			case 9:
				int LA57_10 = input.LA(1);

				int index57_10 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index57_10);
				if (s >= 0)
					return s;
				break;
			case 10:
				int LA57_11 = input.LA(1);

				int index57_11 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index57_11);
				if (s >= 0)
					return s;
				break;
			case 11:
				int LA57_12 = input.LA(1);

				int index57_12 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index57_12);
				if (s >= 0)
					return s;
				break;
			case 12:
				int LA57_13 = input.LA(1);

				int index57_13 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index57_13);
				if (s >= 0)
					return s;
				break;
			case 13:
				int LA57_14 = input.LA(1);

				int index57_14 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index57_14);
				if (s >= 0)
					return s;
				break;
			case 14:
				int LA57_15 = input.LA(1);

				int index57_15 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index57_15);
				if (s >= 0)
					return s;
				break;
			case 15:
				int LA57_16 = input.LA(1);

				int index57_16 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index57_16);
				if (s >= 0)
					return s;
				break;
			case 16:
				int LA57_17 = input.LA(1);

				int index57_17 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index57_17);
				if (s >= 0)
					return s;
				break;
			case 17:
				int LA57_18 = input.LA(1);

				int index57_18 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index57_18);
				if (s >= 0)
					return s;
				break;
			case 18:
				int LA57_19 = input.LA(1);

				int index57_19 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index57_19);
				if (s >= 0)
					return s;
				break;
			case 19:
				int LA57_20 = input.LA(1);

				int index57_20 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index57_20);
				if (s >= 0)
					return s;
				break;
			case 20:
				int LA57_21 = input.LA(1);

				int index57_21 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index57_21);
				if (s >= 0)
					return s;
				break;
			case 21:
				int LA57_22 = input.LA(1);

				int index57_22 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index57_22);
				if (s >= 0)
					return s;
				break;
			case 22:
				int LA57_23 = input.LA(1);

				int index57_23 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index57_23);
				if (s >= 0)
					return s;
				break;
			case 23:
				int LA57_24 = input.LA(1);

				int index57_24 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index57_24);
				if (s >= 0)
					return s;
				break;
			case 24:
				int LA57_25 = input.LA(1);

				int index57_25 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index57_25);
				if (s >= 0)
					return s;
				break;
			case 25:
				int LA57_26 = input.LA(1);

				int index57_26 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index57_26);
				if (s >= 0)
					return s;
				break;
			case 26:
				int LA57_27 = input.LA(1);

				int index57_27 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index57_27);
				if (s >= 0)
					return s;
				break;
			case 27:
				int LA57_28 = input.LA(1);

				int index57_28 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index57_28);
				if (s >= 0)
					return s;
				break;
			case 28:
				int LA57_29 = input.LA(1);

				int index57_29 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index57_29);
				if (s >= 0)
					return s;
				break;
			case 29:
				int LA57_30 = input.LA(1);

				int index57_30 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index57_30);
				if (s >= 0)
					return s;
				break;
			case 30:
				int LA57_31 = input.LA(1);

				int index57_31 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index57_31);
				if (s >= 0)
					return s;
				break;
			case 31:
				int LA57_32 = input.LA(1);

				int index57_32 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index57_32);
				if (s >= 0)
					return s;
				break;
			case 32:
				int LA57_33 = input.LA(1);

				int index57_33 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index57_33);
				if (s >= 0)
					return s;
				break;
			case 33:
				int LA57_34 = input.LA(1);

				int index57_34 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index57_34);
				if (s >= 0)
					return s;
				break;
			case 34:
				int LA57_35 = input.LA(1);

				int index57_35 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index57_35);
				if (s >= 0)
					return s;
				break;
			case 35:
				int LA57_36 = input.LA(1);

				int index57_36 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index57_36);
				if (s >= 0)
					return s;
				break;
			case 36:
				int LA57_37 = input.LA(1);

				int index57_37 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index57_37);
				if (s >= 0)
					return s;
				break;
			case 37:
				int LA57_38 = input.LA(1);

				int index57_38 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index57_38);
				if (s >= 0)
					return s;
				break;
			case 38:
				int LA57_39 = input.LA(1);

				int index57_39 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index57_39);
				if (s >= 0)
					return s;
				break;
			case 39:
				int LA57_40 = input.LA(1);

				int index57_40 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index57_40);
				if (s >= 0)
					return s;
				break;
			case 40:
				int LA57_41 = input.LA(1);

				int index57_41 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index57_41);
				if (s >= 0)
					return s;
				break;
			case 41:
				int LA57_42 = input.LA(1);

				int index57_42 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index57_42);
				if (s >= 0)
					return s;
				break;
			case 42:
				int LA57_43 = input.LA(1);

				int index57_43 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index57_43);
				if (s >= 0)
					return s;
				break;
			case 43:
				int LA57_44 = input.LA(1);

				int index57_44 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index57_44);
				if (s >= 0)
					return s;
				break;
			}
			if (state.backtracking > 0) {
				state.failed = true;
				return -1;
			}
			NoViableAltException nvae = new NoViableAltException(
					getDescription(), 57, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA70_eotS = "\11\uffff";
	static final String DFA70_eofS = "\11\uffff";
	static final String DFA70_minS = "\6\24\1\21\2\uffff";
	static final String DFA70_maxS = "\6\42\1\66\2\uffff";
	static final String DFA70_acceptS = "\7\uffff\1\1\1\2";
	static final String DFA70_specialS = "\11\uffff}>";
	static final String[] DFA70_transitionS = {
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\6",
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\6",
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\6",
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\6",
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\6",
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\6", "\1\10\44\uffff\1\7", "", "" };

	static final short[] DFA70_eot = DFA.unpackEncodedString(DFA70_eotS);
	static final short[] DFA70_eof = DFA.unpackEncodedString(DFA70_eofS);
	static final char[] DFA70_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA70_minS);
	static final char[] DFA70_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA70_maxS);
	static final short[] DFA70_accept = DFA.unpackEncodedString(DFA70_acceptS);
	static final short[] DFA70_special = DFA
			.unpackEncodedString(DFA70_specialS);
	static final short[][] DFA70_transition;

	static {
		int numStates = DFA70_transitionS.length;
		DFA70_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA70_transition[i] = DFA.unpackEncodedString(DFA70_transitionS[i]);
		}
	}

	class DFA70 extends DFA {

		public DFA70(BaseRecognizer recognizer) {
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

		@Override
		public String getDescription() {
			return "363:1: funcDecl : ( ( declAttrList )? FUNCTION NEW LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION NEW ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ) | ( declAttrList )? FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt block -> ^( FUNCTION IDENTIFIER ( declAttrList )? ( paramList )? ( typeTagOpt )? ( block )? ( typeParamOpt )? ) );";
		}
	}

	static final String DFA71_eotS = "\14\uffff";
	static final String DFA71_eofS = "\14\uffff";
	static final String DFA71_minS = "\6\24\2\21\4\uffff";
	static final String DFA71_maxS = "\6\42\2\66\4\uffff";
	static final String DFA71_acceptS = "\10\uffff\1\3\1\4\1\1\1\2";
	static final String DFA71_specialS = "\14\uffff}>";
	static final String[] DFA71_transitionS = {
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\6",
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7",
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7",
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7",
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7",
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7", "\1\11\44\uffff\1\10",
			"\1\13\44\uffff\1\12", "", "", "", "" };

	static final short[] DFA71_eot = DFA.unpackEncodedString(DFA71_eotS);
	static final short[] DFA71_eof = DFA.unpackEncodedString(DFA71_eofS);
	static final char[] DFA71_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA71_minS);
	static final char[] DFA71_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA71_maxS);
	static final short[] DFA71_accept = DFA.unpackEncodedString(DFA71_acceptS);
	static final short[] DFA71_special = DFA
			.unpackEncodedString(DFA71_specialS);
	static final short[][] DFA71_transition;

	static {
		int numStates = DFA71_transitionS.length;
		DFA71_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA71_transition[i] = DFA.unpackEncodedString(DFA71_transitionS[i]);
		}
	}

	class DFA71 extends DFA {

		public DFA71(BaseRecognizer recognizer) {
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

		@Override
		public String getDescription() {
			return "369:1: funcProtoDecl : ( declAttrList FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ) | declAttrList FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( declAttrList )? ( typeParamOpt )? ) | FUNCTION NEW LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( NEW )? ( paramList )? ( typeTagOpt )? ) | FUNCTION IDENTIFIER typeParamOpt LPAREN paramList RPAREN typeTagOpt SEMI -> ^( FUNCTION ( IDENTIFIER )? ( paramList )? ( typeTagOpt )? ( typeParamOpt )? ) );";
		}
	}

	static final String DFA73_eotS = "\13\uffff";
	static final String DFA73_eofS = "\1\12\12\uffff";
	static final String DFA73_minS = "\6\24\5\uffff";
	static final String DFA73_maxS = "\6\137\5\uffff";
	static final String DFA73_acceptS = "\6\uffff\1\1\1\2\1\3\1\4\1\5";
	static final String DFA73_specialS = "\13\uffff}>";
	static final String[] DFA73_transitionS = {
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\4\uffff\1\10\1\uffff\4\10"
					+ "\23\uffff\1\12\35\uffff\1\11\1\6",
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\74\uffff\1\6",
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\74\uffff\1\6",
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\74\uffff\1\6",
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\74\uffff\1\6",
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\74\uffff\1\6", "", "", "", "",
			"" };

	static final short[] DFA73_eot = DFA.unpackEncodedString(DFA73_eotS);
	static final short[] DFA73_eof = DFA.unpackEncodedString(DFA73_eofS);
	static final char[] DFA73_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA73_minS);
	static final char[] DFA73_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA73_maxS);
	static final short[] DFA73_accept = DFA.unpackEncodedString(DFA73_acceptS);
	static final short[] DFA73_special = DFA
			.unpackEncodedString(DFA73_specialS);
	static final short[][] DFA73_transition;

	static {
		int numStates = DFA73_transitionS.length;
		DFA73_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA73_transition[i] = DFA.unpackEncodedString(DFA73_transitionS[i]);
		}
	}

	class DFA73 extends DFA {

		public DFA73(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 73;
			this.eot = DFA73_eot;
			this.eof = DFA73_eof;
			this.min = DFA73_min;
			this.max = DFA73_max;
			this.accept = DFA73_accept;
			this.special = DFA73_special;
			this.transition = DFA73_transition;
		}

		@Override
		public String getDescription() {
			return "389:1: classBody : ( varDecl classBody | funcDecl classBody | pp classBody | enumDecl classBody | );";
		}
	}

	static final String DFA74_eotS = "\12\uffff";
	static final String DFA74_eofS = "\1\11\11\uffff";
	static final String DFA74_minS = "\6\24\4\uffff";
	static final String DFA74_maxS = "\6\137\4\uffff";
	static final String DFA74_acceptS = "\6\uffff\1\1\1\2\1\3\1\4";
	static final String DFA74_specialS = "\12\uffff}>";
	static final String[] DFA74_transitionS = {
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\4\uffff\1\10\1\uffff\4\10"
					+ "\23\uffff\1\11\36\uffff\1\6",
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\74\uffff\1\6",
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\74\uffff\1\6",
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\74\uffff\1\6",
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\74\uffff\1\6",
			"\2\5\1\1\1\2\1\3\1\4\10\uffff\1\7\74\uffff\1\6", "", "", "", "" };

	static final short[] DFA74_eot = DFA.unpackEncodedString(DFA74_eotS);
	static final short[] DFA74_eof = DFA.unpackEncodedString(DFA74_eofS);
	static final char[] DFA74_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA74_minS);
	static final char[] DFA74_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA74_maxS);
	static final short[] DFA74_accept = DFA.unpackEncodedString(DFA74_acceptS);
	static final short[] DFA74_special = DFA
			.unpackEncodedString(DFA74_specialS);
	static final short[][] DFA74_transition;

	static {
		int numStates = DFA74_transitionS.length;
		DFA74_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA74_transition[i] = DFA.unpackEncodedString(DFA74_transitionS[i]);
		}
	}

	class DFA74 extends DFA {

		public DFA74(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 74;
			this.eot = DFA74_eot;
			this.eof = DFA74_eof;
			this.min = DFA74_min;
			this.max = DFA74_max;
			this.accept = DFA74_accept;
			this.special = DFA74_special;
			this.transition = DFA74_transition;
		}

		@Override
		public String getDescription() {
			return "401:1: interfaceBody : ( varDecl interfaceBody | funcProtoDecl interfaceBody | pp interfaceBody | );";
		}
	}

	static final String DFA94_eotS = "\77\uffff";
	static final String DFA94_eofS = "\77\uffff";
	static final String DFA94_minS = "\1\20\54\0\22\uffff";
	static final String DFA94_maxS = "\1\154\54\0\22\uffff";
	static final String DFA94_acceptS = "\55\uffff\1\1\1\2\20\uffff";
	static final String DFA94_specialS = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"
			+ "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"
			+ "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"
			+ "\1\46\1\47\1\50\1\51\1\52\1\53\22\uffff}>";
	static final String[] DFA94_transitionS = {
			"\1\56\1\20\2\uffff\6\56\1\uffff\1\45\1\47\1\50\1\51\1\52\1"
					+ "\53\1\54\1\4\1\17\1\55\1\5\2\uffff\1\30\12\uffff\1\23\1\32\1"
					+ "\uffff\1\2\1\56\1\uffff\1\56\1\uffff\4\56\1\6\1\uffff\4\56\3"
					+ "\uffff\1\46\1\44\1\43\1\37\1\40\1\41\1\42\1\34\1\35\1\36\1\31"
					+ "\1\33\1\27\1\22\1\24\1\25\1\26\1\21\1\1\1\30\1\7\1\3\1\uffff"
					+ "\1\56\6\uffff\1\10\1\11\1\12\1\13\1\14\1\15\1\16",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff",
			"\1\uffff", "\1\uffff", "\1\uffff", "\1\uffff", "", "", "", "", "",
			"", "", "", "", "", "", "", "", "", "", "", "", "" };

	static final short[] DFA94_eot = DFA.unpackEncodedString(DFA94_eotS);
	static final short[] DFA94_eof = DFA.unpackEncodedString(DFA94_eofS);
	static final char[] DFA94_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA94_minS);
	static final char[] DFA94_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA94_maxS);
	static final short[] DFA94_accept = DFA.unpackEncodedString(DFA94_acceptS);
	static final short[] DFA94_special = DFA
			.unpackEncodedString(DFA94_specialS);
	static final short[][] DFA94_transition;

	static {
		int numStates = DFA94_transitionS.length;
		DFA94_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA94_transition[i] = DFA.unpackEncodedString(DFA94_transitionS[i]);
		}
	}

	class DFA94 extends DFA {

		public DFA94(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 94;
			this.eot = DFA94_eot;
			this.eof = DFA94_eof;
			this.min = DFA94_min;
			this.max = DFA94_max;
			this.accept = DFA94_accept;
			this.special = DFA94_special;
			this.transition = DFA94_transition;
		}

		@Override
		public String getDescription() {
			return "295:22: ( expr | statement )";
		}

		@Override
		public int specialStateTransition(int s, IntStream _input)
				throws NoViableAltException {
			TokenStream input = (TokenStream) _input;
			int _s = s;
			switch (s) {
			case 0:
				int LA94_1 = input.LA(1);

				int index94_1 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index94_1);
				if (s >= 0)
					return s;
				break;
			case 1:
				int LA94_2 = input.LA(1);

				int index94_2 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index94_2);
				if (s >= 0)
					return s;
				break;
			case 2:
				int LA94_3 = input.LA(1);

				int index94_3 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index94_3);
				if (s >= 0)
					return s;
				break;
			case 3:
				int LA94_4 = input.LA(1);

				int index94_4 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index94_4);
				if (s >= 0)
					return s;
				break;
			case 4:
				int LA94_5 = input.LA(1);

				int index94_5 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index94_5);
				if (s >= 0)
					return s;
				break;
			case 5:
				int LA94_6 = input.LA(1);

				int index94_6 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index94_6);
				if (s >= 0)
					return s;
				break;
			case 6:
				int LA94_7 = input.LA(1);

				int index94_7 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index94_7);
				if (s >= 0)
					return s;
				break;
			case 7:
				int LA94_8 = input.LA(1);

				int index94_8 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index94_8);
				if (s >= 0)
					return s;
				break;
			case 8:
				int LA94_9 = input.LA(1);

				int index94_9 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index94_9);
				if (s >= 0)
					return s;
				break;
			case 9:
				int LA94_10 = input.LA(1);

				int index94_10 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index94_10);
				if (s >= 0)
					return s;
				break;
			case 10:
				int LA94_11 = input.LA(1);

				int index94_11 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index94_11);
				if (s >= 0)
					return s;
				break;
			case 11:
				int LA94_12 = input.LA(1);

				int index94_12 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index94_12);
				if (s >= 0)
					return s;
				break;
			case 12:
				int LA94_13 = input.LA(1);

				int index94_13 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index94_13);
				if (s >= 0)
					return s;
				break;
			case 13:
				int LA94_14 = input.LA(1);

				int index94_14 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index94_14);
				if (s >= 0)
					return s;
				break;
			case 14:
				int LA94_15 = input.LA(1);

				int index94_15 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index94_15);
				if (s >= 0)
					return s;
				break;
			case 15:
				int LA94_16 = input.LA(1);

				int index94_16 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index94_16);
				if (s >= 0)
					return s;
				break;
			case 16:
				int LA94_17 = input.LA(1);

				int index94_17 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index94_17);
				if (s >= 0)
					return s;
				break;
			case 17:
				int LA94_18 = input.LA(1);

				int index94_18 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index94_18);
				if (s >= 0)
					return s;
				break;
			case 18:
				int LA94_19 = input.LA(1);

				int index94_19 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index94_19);
				if (s >= 0)
					return s;
				break;
			case 19:
				int LA94_20 = input.LA(1);

				int index94_20 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index94_20);
				if (s >= 0)
					return s;
				break;
			case 20:
				int LA94_21 = input.LA(1);

				int index94_21 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index94_21);
				if (s >= 0)
					return s;
				break;
			case 21:
				int LA94_22 = input.LA(1);

				int index94_22 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index94_22);
				if (s >= 0)
					return s;
				break;
			case 22:
				int LA94_23 = input.LA(1);

				int index94_23 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index94_23);
				if (s >= 0)
					return s;
				break;
			case 23:
				int LA94_24 = input.LA(1);

				int index94_24 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index94_24);
				if (s >= 0)
					return s;
				break;
			case 24:
				int LA94_25 = input.LA(1);

				int index94_25 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index94_25);
				if (s >= 0)
					return s;
				break;
			case 25:
				int LA94_26 = input.LA(1);

				int index94_26 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index94_26);
				if (s >= 0)
					return s;
				break;
			case 26:
				int LA94_27 = input.LA(1);

				int index94_27 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index94_27);
				if (s >= 0)
					return s;
				break;
			case 27:
				int LA94_28 = input.LA(1);

				int index94_28 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index94_28);
				if (s >= 0)
					return s;
				break;
			case 28:
				int LA94_29 = input.LA(1);

				int index94_29 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index94_29);
				if (s >= 0)
					return s;
				break;
			case 29:
				int LA94_30 = input.LA(1);

				int index94_30 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index94_30);
				if (s >= 0)
					return s;
				break;
			case 30:
				int LA94_31 = input.LA(1);

				int index94_31 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index94_31);
				if (s >= 0)
					return s;
				break;
			case 31:
				int LA94_32 = input.LA(1);

				int index94_32 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index94_32);
				if (s >= 0)
					return s;
				break;
			case 32:
				int LA94_33 = input.LA(1);

				int index94_33 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index94_33);
				if (s >= 0)
					return s;
				break;
			case 33:
				int LA94_34 = input.LA(1);

				int index94_34 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index94_34);
				if (s >= 0)
					return s;
				break;
			case 34:
				int LA94_35 = input.LA(1);

				int index94_35 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index94_35);
				if (s >= 0)
					return s;
				break;
			case 35:
				int LA94_36 = input.LA(1);

				int index94_36 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index94_36);
				if (s >= 0)
					return s;
				break;
			case 36:
				int LA94_37 = input.LA(1);

				int index94_37 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index94_37);
				if (s >= 0)
					return s;
				break;
			case 37:
				int LA94_38 = input.LA(1);

				int index94_38 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index94_38);
				if (s >= 0)
					return s;
				break;
			case 38:
				int LA94_39 = input.LA(1);

				int index94_39 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index94_39);
				if (s >= 0)
					return s;
				break;
			case 39:
				int LA94_40 = input.LA(1);

				int index94_40 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index94_40);
				if (s >= 0)
					return s;
				break;
			case 40:
				int LA94_41 = input.LA(1);

				int index94_41 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index94_41);
				if (s >= 0)
					return s;
				break;
			case 41:
				int LA94_42 = input.LA(1);

				int index94_42 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index94_42);
				if (s >= 0)
					return s;
				break;
			case 42:
				int LA94_43 = input.LA(1);

				int index94_43 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index94_43);
				if (s >= 0)
					return s;
				break;
			case 43:
				int LA94_44 = input.LA(1);

				int index94_44 = input.index();
				input.rewind();
				s = -1;
				if ((synpred113_TinyHaxeTry1())) {
					s = 45;
				}

				else if ((true)) {
					s = 46;
				}

				input.seek(index94_44);
				if (s >= 0)
					return s;
				break;
			}
			if (state.backtracking > 0) {
				state.failed = true;
				return -1;
			}
			NoViableAltException nvae = new NoViableAltException(
					getDescription(), 94, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	public static final BitSet FOLLOW_myPackage_in_module119 = new BitSet(
			new long[] { 0x00001E8000080000L, 0x0000002740000000L });
	public static final BitSet FOLLOW_topLevelList_in_module122 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_topLevel_in_topLevelList157 = new BitSet(
			new long[] { 0x00001E8000080002L, 0x0000002740000000L });
	public static final BitSet FOLLOW_myImport_in_topLevel176 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_pp_in_topLevel202 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_topLevelDecl_in_topLevel228 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_PACKAGE_in_myPackage247 = new BitSet(
			new long[] { 0x0000000000020000L });
	public static final BitSet FOLLOW_dotIdent_in_myPackage249 = new BitSet(
			new long[] { 0x0000000000010000L });
	public static final BitSet FOLLOW_SEMI_in_myPackage251 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_IDENTIFIER_in_qualifiedIdentifier283 = new BitSet(
			new long[] { 0x0000000000040002L });
	public static final BitSet FOLLOW_DOT_in_qualifiedIdentifier299 = new BitSet(
			new long[] { 0x0000000000020000L });
	public static final BitSet FOLLOW_IDENTIFIER_in_qualifiedIdentifier303 = new BitSet(
			new long[] { 0x0000000000040002L });
	public static final BitSet FOLLOW_IMPORT_in_myImport345 = new BitSet(
			new long[] { 0x0000000000020000L });
	public static final BitSet FOLLOW_dotIdent_in_myImport348 = new BitSet(
			new long[] { 0x0000000000010000L });
	public static final BitSet FOLLOW_SEMI_in_myImport350 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_set_in_access0 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_STATIC_in_declAttr437 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_INLINE_in_declAttr462 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_DYNAMIC_in_declAttr488 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_OVERRIDE_in_declAttr514 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_access_in_declAttr540 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_declAttr_in_declAttrList555 = new BitSet(
			new long[] { 0x0000000003F00002L });
	public static final BitSet FOLLOW_param_in_paramList596 = new BitSet(
			new long[] { 0x0000000004000002L });
	public static final BitSet FOLLOW_COMMA_in_paramList599 = new BitSet(
			new long[] { 0x0000000008020000L });
	public static final BitSet FOLLOW_param_in_paramList601 = new BitSet(
			new long[] { 0x0000000004000002L });
	public static final BitSet FOLLOW_QUES_in_param640 = new BitSet(
			new long[] { 0x0000000000020000L });
	public static final BitSet FOLLOW_IDENTIFIER_in_param643 = new BitSet(
			new long[] { 0x0000200010000000L });
	public static final BitSet FOLLOW_typeTagOpt_in_param645 = new BitSet(
			new long[] { 0x0000000010000000L });
	public static final BitSet FOLLOW_varInit_in_param647 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_IDENTIFIER_in_id683 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_id_in_dotIdent697 = new BitSet(
			new long[] { 0x0000000000040002L });
	public static final BitSet FOLLOW_DOT_in_dotIdent705 = new BitSet(
			new long[] { 0x0000000000020000L });
	public static final BitSet FOLLOW_id_in_dotIdent709 = new BitSet(
			new long[] { 0x0000000000040002L });
	public static final BitSet FOLLOW_EQ_in_assignOp732 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_PLUSEQ_in_assignOp752 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_SUBEQ_in_assignOp773 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_SLASHEQ_in_assignOp793 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_PERCENTEQ_in_assignOp806 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_AMPEQ_in_assignOp822 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_FUNCTION_in_funcLit852 = new BitSet(
			new long[] { 0x0000000800000000L });
	public static final BitSet FOLLOW_LPAREN_in_funcLit854 = new BitSet(
			new long[] { 0x0000001008020000L });
	public static final BitSet FOLLOW_paramList_in_funcLit856 = new BitSet(
			new long[] { 0x0000001000000000L });
	public static final BitSet FOLLOW_RPAREN_in_funcLit858 = new BitSet(
			new long[] { 0x8000200000010000L });
	public static final BitSet FOLLOW_typeTagOpt_in_funcLit860 = new BitSet(
			new long[] { 0x8000200000010000L });
	public static final BitSet FOLLOW_block_in_funcLit863 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_LBRACKET_in_arrayLit898 = new BitSet(
			new long[] { 0x8048016C00020000L, 0x00001FC03E200000L });
	public static final BitSet FOLLOW_exprListOpt_in_arrayLit901 = new BitSet(
			new long[] { 0x0000004000000000L });
	public static final BitSet FOLLOW_RBRACKET_in_arrayLit903 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ppIf_in_pp931 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ppElseIf_in_pp957 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ppElse_in_pp983 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ppEnd_in_pp1009 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ppError_in_pp1035 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_PP_IF_in_ppIf1057 = new BitSet(
			new long[] { 0x0000000000020000L });
	public static final BitSet FOLLOW_IDENTIFIER_in_ppIf1059 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_PP_IF_in_ppIf1085 = new BitSet(
			new long[] { 0x0000010000000000L });
	public static final BitSet FOLLOW_BANG_in_ppIf1087 = new BitSet(
			new long[] { 0x0000000000020000L });
	public static final BitSet FOLLOW_IDENTIFIER_in_ppIf1089 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_PP_ELSEIF_in_ppElseIf1107 = new BitSet(
			new long[] { 0x0000000000020000L });
	public static final BitSet FOLLOW_IDENTIFIER_in_ppElseIf1109 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_PP_ELSEIF_in_ppElseIf1134 = new BitSet(
			new long[] { 0x0000010000000000L });
	public static final BitSet FOLLOW_BANG_in_ppElseIf1136 = new BitSet(
			new long[] { 0x0000000000020000L });
	public static final BitSet FOLLOW_IDENTIFIER_in_ppElseIf1138 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_PP_ELSE_in_ppElse1158 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_PP_END_in_ppEnd1179 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_PP_ERROR_in_ppError1198 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_COLON_in_typeTag1211 = new BitSet(
			new long[] { 0x8007C00001020000L });
	public static final BitSet FOLLOW_funcType_in_typeTag1214 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_typeTag_in_typeTagOpt1226 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_funcType_in_typeList1252 = new BitSet(
			new long[] { 0x0000000004000002L });
	public static final BitSet FOLLOW_COMMA_in_typeList1255 = new BitSet(
			new long[] { 0x8007C00001020000L });
	public static final BitSet FOLLOW_funcType_in_typeList1258 = new BitSet(
			new long[] { 0x0000000004000002L });
	public static final BitSet FOLLOW_typeConstraint_in_typeList1266 = new BitSet(
			new long[] { 0x0000000004000002L });
	public static final BitSet FOLLOW_COMMA_in_typeList1269 = new BitSet(
			new long[] { 0x0000000000020000L });
	public static final BitSet FOLLOW_typeConstraint_in_typeList1272 = new BitSet(
			new long[] { 0x0000000004000002L });
	public static final BitSet FOLLOW_type_in_funcType1287 = new BitSet(
			new long[] { 0x0000400000000002L });
	public static final BitSet FOLLOW_MINUS_BIGGER_in_funcType1291 = new BitSet(
			new long[] { 0x8007C00001020000L });
	public static final BitSet FOLLOW_type_in_funcType1294 = new BitSet(
			new long[] { 0x0000400000000002L });
	public static final BitSet FOLLOW_VOID_in_funcType1301 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_anonType_in_type1313 = new BitSet(
			new long[] { 0x0008000000000002L });
	public static final BitSet FOLLOW_dotIdent_in_type1317 = new BitSet(
			new long[] { 0x0008000000000002L });
	public static final BitSet FOLLOW_INT_in_type1320 = new BitSet(
			new long[] { 0x0008000000000002L });
	public static final BitSet FOLLOW_FLOAT_in_type1323 = new BitSet(
			new long[] { 0x0008000000000002L });
	public static final BitSet FOLLOW_DYNAMIC_in_type1326 = new BitSet(
			new long[] { 0x0008000000000002L });
	public static final BitSet FOLLOW_BOOLEAN_in_type1328 = new BitSet(
			new long[] { 0x0008000000000002L });
	public static final BitSet FOLLOW_VOID_in_type1330 = new BitSet(
			new long[] { 0x0008000000000002L });
	public static final BitSet FOLLOW_typeParam_in_type1334 = new BitSet(
			new long[] { 0x0008000000000002L });
	public static final BitSet FOLLOW_LT_in_typeParam1352 = new BitSet(
			new long[] { 0x8037C00001020000L });
	public static final BitSet FOLLOW_type_in_typeParam1356 = new BitSet(
			new long[] { 0x0030000000000002L });
	public static final BitSet FOLLOW_typeList_in_typeParam1358 = new BitSet(
			new long[] { 0x0030000000000002L });
	public static final BitSet FOLLOW_GT_in_typeParam1362 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_GTGT_in_typeParam1365 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_typeParam_in_typeParamOpt1387 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_IDENTIFIER_in_typeConstraint1429 = new BitSet(
			new long[] { 0x0000200000000000L });
	public static final BitSet FOLLOW_COLON_in_typeConstraint1431 = new BitSet(
			new long[] { 0x0000000800000000L });
	public static final BitSet FOLLOW_LPAREN_in_typeConstraint1433 = new BitSet(
			new long[] { 0x8037C00001020000L });
	public static final BitSet FOLLOW_typeList_in_typeConstraint1435 = new BitSet(
			new long[] { 0x0000001000000000L });
	public static final BitSet FOLLOW_RPAREN_in_typeConstraint1437 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_declAttrList_in_functionReturn1463 = new BitSet(
			new long[] { 0x0000000400000000L });
	public static final BitSet FOLLOW_FUNCTION_in_functionReturn1466 = new BitSet(
			new long[] { 0x0040000000000000L });
	public static final BitSet FOLLOW_NEW_in_functionReturn1468 = new BitSet(
			new long[] { 0x0000000800000000L });
	public static final BitSet FOLLOW_LPAREN_in_functionReturn1470 = new BitSet(
			new long[] { 0x0000001008020000L });
	public static final BitSet FOLLOW_paramList_in_functionReturn1472 = new BitSet(
			new long[] { 0x0000001000000000L });
	public static final BitSet FOLLOW_RPAREN_in_functionReturn1474 = new BitSet(
			new long[] { 0x8000200000010000L });
	public static final BitSet FOLLOW_typeTagOpt_in_functionReturn1476 = new BitSet(
			new long[] { 0x8000200000010000L });
	public static final BitSet FOLLOW_block_in_functionReturn1478 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_block_in_statement1515 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_assignExpr_in_statement1520 = new BitSet(
			new long[] { 0x0000000000010000L });
	public static final BitSet FOLLOW_SEMI_in_statement1522 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_varDecl_in_statement1528 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_IF_in_statement1533 = new BitSet(
			new long[] { 0x0000000800000000L });
	public static final BitSet FOLLOW_parExpression_in_statement1535 = new BitSet(
			new long[] { 0xFAC8212C03F30000L, 0x00001FC0BE20001EL });
	public static final BitSet FOLLOW_statement_in_statement1539 = new BitSet(
			new long[] { 0x0100000000000002L });
	public static final BitSet FOLLOW_ELSE_in_statement1542 = new BitSet(
			new long[] { 0xFAC8212C03F30000L, 0x00001FC0BE20001EL });
	public static final BitSet FOLLOW_statement_in_statement1546 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_FOR_in_statement1586 = new BitSet(
			new long[] { 0x0000000800000000L });
	public static final BitSet FOLLOW_LPAREN_in_statement1588 = new BitSet(
			new long[] { 0x8048012C00020000L, 0x00001FC03E200000L });
	public static final BitSet FOLLOW_expr_in_statement1592 = new BitSet(
			new long[] { 0x0400000000000000L });
	public static final BitSet FOLLOW_IN_in_statement1594 = new BitSet(
			new long[] { 0x8048012C00020000L, 0x00001FC03E200000L });
	public static final BitSet FOLLOW_expr_in_statement1598 = new BitSet(
			new long[] { 0x0000001000000000L });
	public static final BitSet FOLLOW_RPAREN_in_statement1600 = new BitSet(
			new long[] { 0xFAC8212C03F30000L, 0x00001FC0BE20001EL });
	public static final BitSet FOLLOW_statement_in_statement1602 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_WHILE_in_statement1630 = new BitSet(
			new long[] { 0x0000000800000000L });
	public static final BitSet FOLLOW_parExpression_in_statement1632 = new BitSet(
			new long[] { 0xFAC8212C03F30000L, 0x00001FC0BE20001EL });
	public static final BitSet FOLLOW_statement_in_statement1634 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_DO_in_statement1658 = new BitSet(
			new long[] { 0xFAC8212C03F30000L, 0x00001FC0BE20001EL });
	public static final BitSet FOLLOW_statement_in_statement1660 = new BitSet(
			new long[] { 0x0800000000000000L });
	public static final BitSet FOLLOW_WHILE_in_statement1662 = new BitSet(
			new long[] { 0x0000000800000000L });
	public static final BitSet FOLLOW_parExpression_in_statement1664 = new BitSet(
			new long[] { 0x0000000000010000L });
	public static final BitSet FOLLOW_SEMI_in_statement1666 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_TRY_in_statement1689 = new BitSet(
			new long[] { 0x8000200000010000L });
	public static final BitSet FOLLOW_block_in_statement1691 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000080L });
	public static final BitSet FOLLOW_catchStmtList_in_statement1693 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_SWITCH_in_statement1717 = new BitSet(
			new long[] { 0x0000000800000000L });
	public static final BitSet FOLLOW_LPAREN_in_statement1719 = new BitSet(
			new long[] { 0x8048012C00020000L, 0x00001FC03E200000L });
	public static final BitSet FOLLOW_expr_in_statement1721 = new BitSet(
			new long[] { 0x0000001000000000L });
	public static final BitSet FOLLOW_RPAREN_in_statement1723 = new BitSet(
			new long[] { 0x8000000000000000L });
	public static final BitSet FOLLOW_LBRACE_in_statement1725 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000060L });
	public static final BitSet FOLLOW_caseStmt_in_statement1727 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000061L });
	public static final BitSet FOLLOW_RBRACE_in_statement1730 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_RETURN_in_statement1751 = new BitSet(
			new long[] { 0x8048012C00030000L, 0x00001FC03E200000L });
	public static final BitSet FOLLOW_expr_in_statement1754 = new BitSet(
			new long[] { 0x0000000000010000L });
	public static final BitSet FOLLOW_SEMI_in_statement1758 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_THROW_in_statement1776 = new BitSet(
			new long[] { 0x8048012C00020000L, 0x00001FC03E200000L });
	public static final BitSet FOLLOW_expr_in_statement1778 = new BitSet(
			new long[] { 0x0000000000010000L });
	public static final BitSet FOLLOW_SEMI_in_statement1780 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_BREAK_in_statement1799 = new BitSet(
			new long[] { 0x0000000000030000L });
	public static final BitSet FOLLOW_IDENTIFIER_in_statement1802 = new BitSet(
			new long[] { 0x0000000000010000L });
	public static final BitSet FOLLOW_SEMI_in_statement1806 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_CONTINUE_in_statement1823 = new BitSet(
			new long[] { 0x0000000000030000L });
	public static final BitSet FOLLOW_IDENTIFIER_in_statement1826 = new BitSet(
			new long[] { 0x0000000000010000L });
	public static final BitSet FOLLOW_SEMI_in_statement1830 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_expr_in_statement1848 = new BitSet(
			new long[] { 0x0000000000010000L });
	public static final BitSet FOLLOW_SEMI_in_statement1851 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_IDENTIFIER_in_statement1857 = new BitSet(
			new long[] { 0x0000200000000000L });
	public static final BitSet FOLLOW_COLON_in_statement1859 = new BitSet(
			new long[] { 0xFAC8212C03F30000L, 0x00001FC0BE20001EL });
	public static final BitSet FOLLOW_statement_in_statement1861 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_SEMI_in_statement1882 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_LPAREN_in_parExpression1903 = new BitSet(
			new long[] { 0x8048012C00020000L, 0x00001FC03E200000L });
	public static final BitSet FOLLOW_expr_in_parExpression1906 = new BitSet(
			new long[] { 0x0000001000000000L });
	public static final BitSet FOLLOW_RPAREN_in_parExpression1908 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_LBRACE_in_block1923 = new BitSet(
			new long[] { 0xFAC8212C03F30000L, 0x00001FC3BE20001FL });
	public static final BitSet FOLLOW_blockStmt_in_block1926 = new BitSet(
			new long[] { 0xFAC8212C03F30000L, 0x00001FC3BE20001FL });
	public static final BitSet FOLLOW_RBRACE_in_block1930 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_SEMI_in_block1950 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_varDecl_in_blockStmt1963 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_classDecl_in_blockStmt1968 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_statement_in_blockStmt1973 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_BREAK_in_breakStmt2006 = new BitSet(
			new long[] { 0x0000000000010000L });
	public static final BitSet FOLLOW_SEMI_in_breakStmt2008 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_CONTINUE_in_continueStmt2027 = new BitSet(
			new long[] { 0x0000000000010000L });
	public static final BitSet FOLLOW_SEMI_in_continueStmt2029 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_CASE_in_caseStmt2040 = new BitSet(
			new long[] { 0x8048012C00020000L, 0x00001FC03E200000L });
	public static final BitSet FOLLOW_exprList_in_caseStmt2042 = new BitSet(
			new long[] { 0x0000200000000000L });
	public static final BitSet FOLLOW_COLON_in_caseStmt2044 = new BitSet(
			new long[] { 0xFAC8212C03F30000L, 0x00001FC0BE20001EL });
	public static final BitSet FOLLOW_statement_in_caseStmt2046 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_DEFAULT_in_caseStmt2064 = new BitSet(
			new long[] { 0x0000200000000000L });
	public static final BitSet FOLLOW_COLON_in_caseStmt2066 = new BitSet(
			new long[] { 0xFAC8212C03F30000L, 0x00001FC0BE20001EL });
	public static final BitSet FOLLOW_statement_in_caseStmt2068 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_DEFAULT_in_defaultStmt2097 = new BitSet(
			new long[] { 0x0000200000000000L });
	public static final BitSet FOLLOW_COLON_in_defaultStmt2099 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_catchStmt_in_catchStmtList2112 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000080L });
	public static final BitSet FOLLOW_catchStmtList_in_catchStmtList2114 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_CATCH_in_catchStmt2143 = new BitSet(
			new long[] { 0x0000000800000000L });
	public static final BitSet FOLLOW_LPAREN_in_catchStmt2145 = new BitSet(
			new long[] { 0x0000000008020000L });
	public static final BitSet FOLLOW_param_in_catchStmt2147 = new BitSet(
			new long[] { 0x0000001000000000L });
	public static final BitSet FOLLOW_RPAREN_in_catchStmt2149 = new BitSet(
			new long[] { 0x8000200000010000L });
	public static final BitSet FOLLOW_block_in_catchStmt2151 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_exprList_in_exprListOpt2177 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_expr_in_exprList2197 = new BitSet(
			new long[] { 0x0000000004000002L });
	public static final BitSet FOLLOW_COMMA_in_exprList2200 = new BitSet(
			new long[] { 0x8048012C00020000L, 0x00001FC03E200000L });
	public static final BitSet FOLLOW_expr_in_exprList2203 = new BitSet(
			new long[] { 0x0000000004000002L });
	public static final BitSet FOLLOW_assignExpr_in_expr2216 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_iterExpr_in_assignExpr2236 = new BitSet(
			new long[] { 0x00000003F0000002L });
	public static final BitSet FOLLOW_assignOp_in_assignExpr2239 = new BitSet(
			new long[] { 0x8048012C00020000L, 0x00001FC03E200000L });
	public static final BitSet FOLLOW_iterExpr_in_assignExpr2242 = new BitSet(
			new long[] { 0x00000003F0000002L });
	public static final BitSet FOLLOW_logicOrExpr_in_ternaryExpr2265 = new BitSet(
			new long[] { 0x0000000008000002L });
	public static final BitSet FOLLOW_QUES_in_ternaryExpr2268 = new BitSet(
			new long[] { 0x8048012C00020000L, 0x00001FC03E200000L });
	public static final BitSet FOLLOW_expr_in_ternaryExpr2271 = new BitSet(
			new long[] { 0x0000200000000000L });
	public static final BitSet FOLLOW_COLON_in_ternaryExpr2273 = new BitSet(
			new long[] { 0x8048012C00020000L, 0x00001FC03E200000L });
	public static final BitSet FOLLOW_logicOrExpr_in_ternaryExpr2276 = new BitSet(
			new long[] { 0x0000000008000002L });
	public static final BitSet FOLLOW_ternaryExpr_in_iterExpr2288 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000000000100L });
	public static final BitSet FOLLOW_ELLIPSIS_in_iterExpr2291 = new BitSet(
			new long[] { 0x8048012C00020000L, 0x00001FC03E200000L });
	public static final BitSet FOLLOW_ternaryExpr_in_iterExpr2294 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000000000100L });
	public static final BitSet FOLLOW_logicAndExpr_in_logicOrExpr2323 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000000000200L });
	public static final BitSet FOLLOW_BARBAR_in_logicOrExpr2327 = new BitSet(
			new long[] { 0x8048012C00020000L, 0x00001FC03E200000L });
	public static final BitSet FOLLOW_logicAndExpr_in_logicOrExpr2330 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000000000200L });
	public static final BitSet FOLLOW_cmpExpr_in_logicAndExpr2351 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000000000400L });
	public static final BitSet FOLLOW_AMPAMP_in_logicAndExpr2355 = new BitSet(
			new long[] { 0x8048012C00020000L, 0x00001FC03E200000L });
	public static final BitSet FOLLOW_cmpExpr_in_logicAndExpr2358 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000000000400L });
	public static final BitSet FOLLOW_bitExpr_in_cmpExpr2372 = new BitSet(
			new long[] { 0x0018000000000002L, 0x0000000000007800L });
	public static final BitSet FOLLOW_EQEQ_in_cmpExpr2377 = new BitSet(
			new long[] { 0x8048012C00020000L, 0x00001FC03E200000L });
	public static final BitSet FOLLOW_BANGEQ_in_cmpExpr2381 = new BitSet(
			new long[] { 0x8048012C00020000L, 0x00001FC03E200000L });
	public static final BitSet FOLLOW_GTEQ_in_cmpExpr2386 = new BitSet(
			new long[] { 0x8048012C00020000L, 0x00001FC03E200000L });
	public static final BitSet FOLLOW_LTEQ_in_cmpExpr2391 = new BitSet(
			new long[] { 0x8048012C00020000L, 0x00001FC03E200000L });
	public static final BitSet FOLLOW_GT_in_cmpExpr2396 = new BitSet(
			new long[] { 0x8048012C00020000L, 0x00001FC03E200000L });
	public static final BitSet FOLLOW_LT_in_cmpExpr2401 = new BitSet(
			new long[] { 0x8048012C00020000L, 0x00001FC03E200000L });
	public static final BitSet FOLLOW_bitExpr_in_cmpExpr2406 = new BitSet(
			new long[] { 0x0018000000000002L, 0x0000000000007800L });
	public static final BitSet FOLLOW_shiftExpr_in_bitExpr2420 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000000038000L });
	public static final BitSet FOLLOW_BAR_in_bitExpr2424 = new BitSet(
			new long[] { 0x8048012C00020000L, 0x00001FC03E200000L });
	public static final BitSet FOLLOW_shiftExpr_in_bitExpr2427 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000000038000L });
	public static final BitSet FOLLOW_AMP_in_bitExpr2431 = new BitSet(
			new long[] { 0x8048012C00020000L, 0x00001FC03E200000L });
	public static final BitSet FOLLOW_shiftExpr_in_bitExpr2434 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000000038000L });
	public static final BitSet FOLLOW_CARET_in_bitExpr2437 = new BitSet(
			new long[] { 0x8048012C00020000L, 0x00001FC03E200000L });
	public static final BitSet FOLLOW_shiftExpr_in_bitExpr2440 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000000038000L });
	public static final BitSet FOLLOW_addExpr_in_shiftExpr2454 = new BitSet(
			new long[] { 0x0010000000000002L, 0x00000000000C0000L });
	public static final BitSet FOLLOW_LTLT_in_shiftExpr2458 = new BitSet(
			new long[] { 0x8048012C00020000L, 0x00001FC03E200000L });
	public static final BitSet FOLLOW_addExpr_in_shiftExpr2462 = new BitSet(
			new long[] { 0x0010000000000002L, 0x00000000000C0000L });
	public static final BitSet FOLLOW_GT_in_shiftExpr2467 = new BitSet(
			new long[] { 0x0010000000000000L });
	public static final BitSet FOLLOW_GT_in_shiftExpr2469 = new BitSet(
			new long[] { 0x8048012C00020000L, 0x00001FC03E200000L });
	public static final BitSet FOLLOW_addExpr_in_shiftExpr2474 = new BitSet(
			new long[] { 0x0010000000000002L, 0x00000000000C0000L });
	public static final BitSet FOLLOW_GTGTGT_in_shiftExpr2478 = new BitSet(
			new long[] { 0x8048012C00020000L, 0x00001FC03E200000L });
	public static final BitSet FOLLOW_addExpr_in_shiftExpr2481 = new BitSet(
			new long[] { 0x0010000000000002L, 0x00000000000C0000L });
	public static final BitSet FOLLOW_multExpr_in_addExpr2495 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000000300000L });
	public static final BitSet FOLLOW_PLUS_in_addExpr2500 = new BitSet(
			new long[] { 0x8048012C00020000L, 0x00001FC03E200000L });
	public static final BitSet FOLLOW_SUB_in_addExpr2505 = new BitSet(
			new long[] { 0x8048012C00020000L, 0x00001FC03E200000L });
	public static final BitSet FOLLOW_multExpr_in_addExpr2509 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000000300000L });
	public static final BitSet FOLLOW_prefixExpr_in_multExpr2523 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000001C00000L });
	public static final BitSet FOLLOW_STAR_in_multExpr2528 = new BitSet(
			new long[] { 0x8048012C00020000L, 0x00001FC03E200000L });
	public static final BitSet FOLLOW_SLASH_in_multExpr2531 = new BitSet(
			new long[] { 0x8048012C00020000L, 0x00001FC03E200000L });
	public static final BitSet FOLLOW_PERCENT_in_multExpr2534 = new BitSet(
			new long[] { 0x8048012C00020000L, 0x00001FC03E200000L });
	public static final BitSet FOLLOW_prefixExpr_in_multExpr2538 = new BitSet(
			new long[] { 0x0000000000000002L, 0x0000000001C00000L });
	public static final BitSet FOLLOW_set_in_prefixExpr2559 = new BitSet(
			new long[] { 0x8048012C00020000L, 0x00001FC03E200000L });
	public static final BitSet FOLLOW_prefixExpr_in_prefixExpr2571 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_newExpr_in_prefixExpr2583 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_cast_in_prefixExpr2595 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_suffixExpr_in_prefixExpr2607 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_value_in_suffixExpr2626 = new BitSet(
			new long[] { 0x0000000800000000L });
	public static final BitSet FOLLOW_LPAREN_in_suffixExpr2628 = new BitSet(
			new long[] { 0x8048013C00020000L, 0x00001FC03E200000L });
	public static final BitSet FOLLOW_exprListOpt_in_suffixExpr2630 = new BitSet(
			new long[] { 0x0000001000000000L });
	public static final BitSet FOLLOW_RPAREN_in_suffixExpr2632 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_value_in_suffixExpr2653 = new BitSet(
			new long[] { 0x0000002000000000L });
	public static final BitSet FOLLOW_LBRACKET_in_suffixExpr2655 = new BitSet(
			new long[] { 0x8048012C00020000L, 0x00001FC03E200000L });
	public static final BitSet FOLLOW_expr_in_suffixExpr2657 = new BitSet(
			new long[] { 0x0000004000000000L });
	public static final BitSet FOLLOW_RBRACKET_in_suffixExpr2659 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_value_in_suffixExpr2664 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000004000000L });
	public static final BitSet FOLLOW_PLUSPLUS_in_suffixExpr2666 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_value_in_suffixExpr2690 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000002000000L });
	public static final BitSet FOLLOW_SUBSUB_in_suffixExpr2692 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_value_in_suffixExpr2715 = new BitSet(
			new long[] { 0x0008000000000000L });
	public static final BitSet FOLLOW_typeParamOpt_in_suffixExpr2717 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_funcLit_in_value2726 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_arrayLit_in_value2732 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_objLit_in_value2747 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_NULL_in_value2762 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_elementarySymbol_in_value2777 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_LPAREN_in_value2792 = new BitSet(
			new long[] { 0xFAC8212C03F30000L, 0x00001FC0BE20001EL });
	public static final BitSet FOLLOW_expr_in_value2796 = new BitSet(
			new long[] { 0x0000001000000000L });
	public static final BitSet FOLLOW_statement_in_value2798 = new BitSet(
			new long[] { 0x0000001000000000L });
	public static final BitSet FOLLOW_RPAREN_in_value2801 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_dotIdent_in_value2814 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_NEW_in_newExpr2861 = new BitSet(
			new long[] { 0x8007800801020000L });
	public static final BitSet FOLLOW_type_in_newExpr2863 = new BitSet(
			new long[] { 0x0000000800000000L });
	public static final BitSet FOLLOW_LPAREN_in_newExpr2865 = new BitSet(
			new long[] { 0x8048013C00020000L, 0x00001FC03E200000L });
	public static final BitSet FOLLOW_exprListOpt_in_newExpr2867 = new BitSet(
			new long[] { 0x0000001000000000L });
	public static final BitSet FOLLOW_RPAREN_in_newExpr2869 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_CAST_in_cast2895 = new BitSet(
			new long[] { 0x0000000800000000L });
	public static final BitSet FOLLOW_LPAREN_in_cast2897 = new BitSet(
			new long[] { 0x8048012C00020000L, 0x00001FC03E200000L });
	public static final BitSet FOLLOW_expr_in_cast2899 = new BitSet(
			new long[] { 0x0000001004000000L });
	public static final BitSet FOLLOW_COMMA_in_cast2902 = new BitSet(
			new long[] { 0x8007C00001020000L });
	public static final BitSet FOLLOW_funcType_in_cast2904 = new BitSet(
			new long[] { 0x0000001000000000L });
	public static final BitSet FOLLOW_RPAREN_in_cast2908 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_CAST_in_cast2926 = new BitSet(
			new long[] { 0x0000000800000000L });
	public static final BitSet FOLLOW_LPAREN_in_cast2928 = new BitSet(
			new long[] { 0x8048012C00020000L, 0x00001FC03E200000L });
	public static final BitSet FOLLOW_expr_in_cast2930 = new BitSet(
			new long[] { 0x0000001000000000L });
	public static final BitSet FOLLOW_RPAREN_in_cast2932 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_classDecl_in_topLevelDecl2964 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_interfaceDecl_in_topLevelDecl2969 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_enumDecl_in_topLevelDecl2981 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_typedefDecl_in_topLevelDecl2986 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ENUM_in_enumDecl2996 = new BitSet(
			new long[] { 0x0000000000020000L });
	public static final BitSet FOLLOW_IDENTIFIER_in_enumDecl2998 = new BitSet(
			new long[] { 0x8008000000000000L });
	public static final BitSet FOLLOW_typeParamOpt_in_enumDecl3000 = new BitSet(
			new long[] { 0x8000000000000000L });
	public static final BitSet FOLLOW_LBRACE_in_enumDecl3002 = new BitSet(
			new long[] { 0x00001E8000020000L, 0x0000000000000001L });
	public static final BitSet FOLLOW_enumBody_in_enumDecl3004 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000001L });
	public static final BitSet FOLLOW_RBRACE_in_enumDecl3006 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_enumValueDecl_in_enumBody3032 = new BitSet(
			new long[] { 0x00001E8000020002L });
	public static final BitSet FOLLOW_IDENTIFIER_in_enumValueDecl3051 = new BitSet(
			new long[] { 0x0000000800000000L });
	public static final BitSet FOLLOW_LPAREN_in_enumValueDecl3053 = new BitSet(
			new long[] { 0x0000001008020000L });
	public static final BitSet FOLLOW_paramList_in_enumValueDecl3055 = new BitSet(
			new long[] { 0x0000001000000000L });
	public static final BitSet FOLLOW_RPAREN_in_enumValueDecl3057 = new BitSet(
			new long[] { 0x0000000000010000L });
	public static final BitSet FOLLOW_SEMI_in_enumValueDecl3059 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_IDENTIFIER_in_enumValueDecl3084 = new BitSet(
			new long[] { 0x0000000000010000L });
	public static final BitSet FOLLOW_SEMI_in_enumValueDecl3086 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_pp_in_enumValueDecl3109 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_varDecl_in_varDeclList3128 = new BitSet(
			new long[] { 0x0000000003F00000L, 0x0000000080000000L });
	public static final BitSet FOLLOW_varDeclList_in_varDeclList3130 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_declAttrList_in_varDecl3142 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000080000000L });
	public static final BitSet FOLLOW_VAR_in_varDecl3146 = new BitSet(
			new long[] { 0x0000000000020000L });
	public static final BitSet FOLLOW_varDeclPartList_in_varDecl3148 = new BitSet(
			new long[] { 0x0000000000010000L });
	public static final BitSet FOLLOW_SEMI_in_varDecl3150 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_varDeclPart_in_varDeclPartList3180 = new BitSet(
			new long[] { 0x0000000004000002L });
	public static final BitSet FOLLOW_COMMA_in_varDeclPartList3183 = new BitSet(
			new long[] { 0x0000000000020000L });
	public static final BitSet FOLLOW_varDeclPart_in_varDeclPartList3186 = new BitSet(
			new long[] { 0x0000000004000002L });
	public static final BitSet FOLLOW_IDENTIFIER_in_varDeclPart3200 = new BitSet(
			new long[] { 0x0000200810000000L });
	public static final BitSet FOLLOW_propDeclOpt_in_varDeclPart3205 = new BitSet(
			new long[] { 0x0000200010000000L });
	public static final BitSet FOLLOW_typeTagOpt_in_varDeclPart3207 = new BitSet(
			new long[] { 0x0000000010000000L });
	public static final BitSet FOLLOW_varInit_in_varDeclPart3209 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_LPAREN_in_propDecl3219 = new BitSet(
			new long[] { 0x0000000001020000L, 0x0000000010000040L });
	public static final BitSet FOLLOW_propAccessor_in_propDecl3223 = new BitSet(
			new long[] { 0x0000000004000000L });
	public static final BitSet FOLLOW_COMMA_in_propDecl3225 = new BitSet(
			new long[] { 0x0000000001020000L, 0x0000000010000040L });
	public static final BitSet FOLLOW_propAccessor_in_propDecl3229 = new BitSet(
			new long[] { 0x0000001000000000L });
	public static final BitSet FOLLOW_RPAREN_in_propDecl3231 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_set_in_propAccessor0 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_propDecl_in_propDeclOpt3291 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_EQ_in_varInit3306 = new BitSet(
			new long[] { 0x8048012C00020000L, 0x00001FC03E200000L });
	public static final BitSet FOLLOW_expr_in_varInit3308 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_declAttrList_in_funcDecl3334 = new BitSet(
			new long[] { 0x0000000400000000L });
	public static final BitSet FOLLOW_FUNCTION_in_funcDecl3337 = new BitSet(
			new long[] { 0x0040000000000000L });
	public static final BitSet FOLLOW_NEW_in_funcDecl3339 = new BitSet(
			new long[] { 0x0000000800000000L });
	public static final BitSet FOLLOW_LPAREN_in_funcDecl3341 = new BitSet(
			new long[] { 0x0000001008020000L });
	public static final BitSet FOLLOW_paramList_in_funcDecl3343 = new BitSet(
			new long[] { 0x0000001000000000L });
	public static final BitSet FOLLOW_RPAREN_in_funcDecl3345 = new BitSet(
			new long[] { 0x8000200000010000L });
	public static final BitSet FOLLOW_typeTagOpt_in_funcDecl3347 = new BitSet(
			new long[] { 0x8000200000010000L });
	public static final BitSet FOLLOW_block_in_funcDecl3349 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_declAttrList_in_funcDecl3382 = new BitSet(
			new long[] { 0x0000000400000000L });
	public static final BitSet FOLLOW_FUNCTION_in_funcDecl3385 = new BitSet(
			new long[] { 0x0000000000020000L });
	public static final BitSet FOLLOW_IDENTIFIER_in_funcDecl3387 = new BitSet(
			new long[] { 0x0008000800000000L });
	public static final BitSet FOLLOW_typeParamOpt_in_funcDecl3389 = new BitSet(
			new long[] { 0x0000000800000000L });
	public static final BitSet FOLLOW_LPAREN_in_funcDecl3391 = new BitSet(
			new long[] { 0x0000001008020000L });
	public static final BitSet FOLLOW_paramList_in_funcDecl3393 = new BitSet(
			new long[] { 0x0000001000000000L });
	public static final BitSet FOLLOW_RPAREN_in_funcDecl3395 = new BitSet(
			new long[] { 0x8000200000010000L });
	public static final BitSet FOLLOW_typeTagOpt_in_funcDecl3397 = new BitSet(
			new long[] { 0x8000200000010000L });
	public static final BitSet FOLLOW_block_in_funcDecl3399 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_declAttrList_in_funcProtoDecl3440 = new BitSet(
			new long[] { 0x0000000400000000L });
	public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl3442 = new BitSet(
			new long[] { 0x0040000000000000L });
	public static final BitSet FOLLOW_NEW_in_funcProtoDecl3444 = new BitSet(
			new long[] { 0x0000000800000000L });
	public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl3446 = new BitSet(
			new long[] { 0x0000001008020000L });
	public static final BitSet FOLLOW_paramList_in_funcProtoDecl3448 = new BitSet(
			new long[] { 0x0000001000000000L });
	public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl3450 = new BitSet(
			new long[] { 0x0000200000010000L });
	public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl3452 = new BitSet(
			new long[] { 0x0000000000010000L });
	public static final BitSet FOLLOW_SEMI_in_funcProtoDecl3454 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_declAttrList_in_funcProtoDecl3481 = new BitSet(
			new long[] { 0x0000000400000000L });
	public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl3483 = new BitSet(
			new long[] { 0x0000000000020000L });
	public static final BitSet FOLLOW_IDENTIFIER_in_funcProtoDecl3485 = new BitSet(
			new long[] { 0x0008000800000000L });
	public static final BitSet FOLLOW_typeParamOpt_in_funcProtoDecl3487 = new BitSet(
			new long[] { 0x0000000800000000L });
	public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl3489 = new BitSet(
			new long[] { 0x0000001008020000L });
	public static final BitSet FOLLOW_paramList_in_funcProtoDecl3491 = new BitSet(
			new long[] { 0x0000001000000000L });
	public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl3493 = new BitSet(
			new long[] { 0x0000200000010000L });
	public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl3495 = new BitSet(
			new long[] { 0x0000000000010000L });
	public static final BitSet FOLLOW_SEMI_in_funcProtoDecl3497 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl3526 = new BitSet(
			new long[] { 0x0040000000000000L });
	public static final BitSet FOLLOW_NEW_in_funcProtoDecl3528 = new BitSet(
			new long[] { 0x0000000800000000L });
	public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl3530 = new BitSet(
			new long[] { 0x0000001008020000L });
	public static final BitSet FOLLOW_paramList_in_funcProtoDecl3532 = new BitSet(
			new long[] { 0x0000001000000000L });
	public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl3534 = new BitSet(
			new long[] { 0x0000200000010000L });
	public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl3536 = new BitSet(
			new long[] { 0x0000000000010000L });
	public static final BitSet FOLLOW_SEMI_in_funcProtoDecl3538 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_FUNCTION_in_funcProtoDecl3562 = new BitSet(
			new long[] { 0x0000000000020000L });
	public static final BitSet FOLLOW_IDENTIFIER_in_funcProtoDecl3564 = new BitSet(
			new long[] { 0x0008000800000000L });
	public static final BitSet FOLLOW_typeParamOpt_in_funcProtoDecl3566 = new BitSet(
			new long[] { 0x0000000800000000L });
	public static final BitSet FOLLOW_LPAREN_in_funcProtoDecl3568 = new BitSet(
			new long[] { 0x0000001008020000L });
	public static final BitSet FOLLOW_paramList_in_funcProtoDecl3570 = new BitSet(
			new long[] { 0x0000001000000000L });
	public static final BitSet FOLLOW_RPAREN_in_funcProtoDecl3572 = new BitSet(
			new long[] { 0x0000200000010000L });
	public static final BitSet FOLLOW_typeTagOpt_in_funcProtoDecl3574 = new BitSet(
			new long[] { 0x0000000000010000L });
	public static final BitSet FOLLOW_SEMI_in_funcProtoDecl3576 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_EXTERN_in_classDecl3609 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000200000000L });
	public static final BitSet FOLLOW_CLASS_in_classDecl3612 = new BitSet(
			new long[] { 0x0000000000020000L });
	public static final BitSet FOLLOW_IDENTIFIER_in_classDecl3614 = new BitSet(
			new long[] { 0x8008000000000000L, 0x0000001800000000L });
	public static final BitSet FOLLOW_typeParamOpt_in_classDecl3616 = new BitSet(
			new long[] { 0x8000000000000000L, 0x0000001800000000L });
	public static final BitSet FOLLOW_inheritListOpt_in_classDecl3618 = new BitSet(
			new long[] { 0x8000000000000000L });
	public static final BitSet FOLLOW_LBRACE_in_classDecl3622 = new BitSet(
			new long[] { 0x00001E8403F00000L, 0x00000000C0000000L });
	public static final BitSet FOLLOW_classBodyScope_in_classDecl3624 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000001L });
	public static final BitSet FOLLOW_RBRACE_in_classDecl3627 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_classBody_in_classBodyScope3673 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_varDecl_in_classBody3697 = new BitSet(
			new long[] { 0x00001E8403F00000L, 0x00000000C0000000L });
	public static final BitSet FOLLOW_classBody_in_classBody3699 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_funcDecl_in_classBody3704 = new BitSet(
			new long[] { 0x00001E8403F00000L, 0x00000000C0000000L });
	public static final BitSet FOLLOW_classBody_in_classBody3706 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_pp_in_classBody3711 = new BitSet(
			new long[] { 0x00001E8403F00000L, 0x00000000C0000000L });
	public static final BitSet FOLLOW_classBody_in_classBody3713 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_enumDecl_in_classBody3718 = new BitSet(
			new long[] { 0x00001E8403F00000L, 0x00000000C0000000L });
	public static final BitSet FOLLOW_classBody_in_classBody3720 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_INTERFACE_in_interfaceDecl3740 = new BitSet(
			new long[] { 0x8007800001020000L, 0x0000001800000000L });
	public static final BitSet FOLLOW_type_in_interfaceDecl3742 = new BitSet(
			new long[] { 0x8000000000000000L, 0x0000001800000000L });
	public static final BitSet FOLLOW_inheritListOpt_in_interfaceDecl3744 = new BitSet(
			new long[] { 0x8000000000000000L });
	public static final BitSet FOLLOW_LBRACE_in_interfaceDecl3746 = new BitSet(
			new long[] { 0x00001E8403F00000L, 0x0000000080000001L });
	public static final BitSet FOLLOW_interfaceBody_in_interfaceDecl3749 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000001L });
	public static final BitSet FOLLOW_RBRACE_in_interfaceDecl3751 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_varDecl_in_interfaceBody3764 = new BitSet(
			new long[] { 0x00001E8403F00000L, 0x0000000080000000L });
	public static final BitSet FOLLOW_interfaceBody_in_interfaceBody3766 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_funcProtoDecl_in_interfaceBody3771 = new BitSet(
			new long[] { 0x00001E8403F00000L, 0x0000000080000000L });
	public static final BitSet FOLLOW_interfaceBody_in_interfaceBody3773 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_pp_in_interfaceBody3778 = new BitSet(
			new long[] { 0x00001E8403F00000L, 0x0000000080000000L });
	public static final BitSet FOLLOW_interfaceBody_in_interfaceBody3780 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_inherit_in_inheritList3801 = new BitSet(
			new long[] { 0x0000000004000002L });
	public static final BitSet FOLLOW_COMMA_in_inheritList3804 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000001800000000L });
	public static final BitSet FOLLOW_inherit_in_inheritList3807 = new BitSet(
			new long[] { 0x0000000004000002L });
	public static final BitSet FOLLOW_inheritList_in_inheritListOpt3825 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_EXTENDS_in_inherit3860 = new BitSet(
			new long[] { 0x8007800001020000L });
	public static final BitSet FOLLOW_type_in_inherit3862 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_IMPLEMENTS_in_inherit3884 = new BitSet(
			new long[] { 0x8007800001020000L });
	public static final BitSet FOLLOW_type_in_inherit3886 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_TYPEDEF_in_typedefDecl3914 = new BitSet(
			new long[] { 0x0000000000020000L });
	public static final BitSet FOLLOW_IDENTIFIER_in_typedefDecl3916 = new BitSet(
			new long[] { 0x0000000010000000L });
	public static final BitSet FOLLOW_EQ_in_typedefDecl3918 = new BitSet(
			new long[] { 0x8007C00001020000L });
	public static final BitSet FOLLOW_funcType_in_typedefDecl3920 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_GT_in_typeExtend3939 = new BitSet(
			new long[] { 0x8007C00001020000L });
	public static final BitSet FOLLOW_funcType_in_typeExtend3941 = new BitSet(
			new long[] { 0x0000000004000000L });
	public static final BitSet FOLLOW_COMMA_in_typeExtend3943 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_LBRACE_in_anonType3954 = new BitSet(
			new long[] { 0x0010000003F20000L, 0x0000000080000001L });
	public static final BitSet FOLLOW_anonTypeFieldList_in_anonType3989 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000001L });
	public static final BitSet FOLLOW_varDeclList_in_anonType4017 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000001L });
	public static final BitSet FOLLOW_typeExtend_in_anonType4046 = new BitSet(
			new long[] { 0x0000000003F20000L, 0x0000000080000001L });
	public static final BitSet FOLLOW_anonTypeFieldList_in_anonType4074 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000001L });
	public static final BitSet FOLLOW_varDeclList_in_anonType4100 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000001L });
	public static final BitSet FOLLOW_RBRACE_in_anonType4144 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_anonTypeField_in_anonTypeFieldList4158 = new BitSet(
			new long[] { 0x0000000004000002L });
	public static final BitSet FOLLOW_COMMA_in_anonTypeFieldList4161 = new BitSet(
			new long[] { 0x0000000000020000L });
	public static final BitSet FOLLOW_anonTypeField_in_anonTypeFieldList4164 = new BitSet(
			new long[] { 0x0000000004000002L });
	public static final BitSet FOLLOW_LBRACE_in_objLit4176 = new BitSet(
			new long[] { 0x0000000000020000L });
	public static final BitSet FOLLOW_objLitElemList_in_objLit4179 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000000000001L });
	public static final BitSet FOLLOW_RBRACE_in_objLit4181 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_IDENTIFIER_in_anonTypeField4193 = new BitSet(
			new long[] { 0x0000200000000000L });
	public static final BitSet FOLLOW_COLON_in_anonTypeField4195 = new BitSet(
			new long[] { 0x8007C00001020000L });
	public static final BitSet FOLLOW_funcType_in_anonTypeField4198 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_objLitElem_in_objLitElemList4214 = new BitSet(
			new long[] { 0x0000000004000002L });
	public static final BitSet FOLLOW_COMMA_in_objLitElemList4217 = new BitSet(
			new long[] { 0x0000000000020000L });
	public static final BitSet FOLLOW_objLitElem_in_objLitElemList4220 = new BitSet(
			new long[] { 0x0000000004000002L });
	public static final BitSet FOLLOW_IDENTIFIER_in_objLitElem4241 = new BitSet(
			new long[] { 0x0000200000000000L });
	public static final BitSet FOLLOW_COLON_in_objLitElem4243 = new BitSet(
			new long[] { 0x8048012C00020000L, 0x00001FC03E200000L });
	public static final BitSet FOLLOW_expr_in_objLitElem4246 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_LONGLITERAL_in_elementarySymbol4258 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_INTLITERAL_in_elementarySymbol4271 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_STRINGLITERAL_in_elementarySymbol4284 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_CHARLITERAL_in_elementarySymbol4297 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_FLOATNUM_in_elementarySymbol4310 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_TRUE_in_elementarySymbol4323 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_FALSE_in_elementarySymbol4337 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_typeTagOpt_in_synpred21_TinyHaxeTry1860 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_COMMA_in_synpred29_TinyHaxeTry11255 = new BitSet(
			new long[] { 0x8007C00001020000L });
	public static final BitSet FOLLOW_funcType_in_synpred29_TinyHaxeTry11258 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_funcType_in_synpred30_TinyHaxeTry11252 = new BitSet(
			new long[] { 0x0000000004000002L });
	public static final BitSet FOLLOW_COMMA_in_synpred30_TinyHaxeTry11255 = new BitSet(
			new long[] { 0x8007C00001020000L });
	public static final BitSet FOLLOW_funcType_in_synpred30_TinyHaxeTry11258 = new BitSet(
			new long[] { 0x0000000004000002L });
	public static final BitSet FOLLOW_COMMA_in_synpred31_TinyHaxeTry11269 = new BitSet(
			new long[] { 0x0000000000020000L });
	public static final BitSet FOLLOW_typeConstraint_in_synpred31_TinyHaxeTry11272 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_MINUS_BIGGER_in_synpred32_TinyHaxeTry11291 = new BitSet(
			new long[] { 0x8007800001020000L });
	public static final BitSet FOLLOW_type_in_synpred32_TinyHaxeTry11294 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_type_in_synpred33_TinyHaxeTry11287 = new BitSet(
			new long[] { 0x0000400000000002L });
	public static final BitSet FOLLOW_MINUS_BIGGER_in_synpred33_TinyHaxeTry11291 = new BitSet(
			new long[] { 0x8007C00001020000L });
	public static final BitSet FOLLOW_type_in_synpred33_TinyHaxeTry11294 = new BitSet(
			new long[] { 0x0000400000000002L });
	public static final BitSet FOLLOW_typeParam_in_synpred40_TinyHaxeTry11334 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_anonType_in_synpred41_TinyHaxeTry11313 = new BitSet(
			new long[] { 0x0008000000000002L });
	public static final BitSet FOLLOW_dotIdent_in_synpred41_TinyHaxeTry11317 = new BitSet(
			new long[] { 0x0008000000000002L });
	public static final BitSet FOLLOW_INT_in_synpred41_TinyHaxeTry11320 = new BitSet(
			new long[] { 0x0008000000000002L });
	public static final BitSet FOLLOW_FLOAT_in_synpred41_TinyHaxeTry11323 = new BitSet(
			new long[] { 0x0008000000000002L });
	public static final BitSet FOLLOW_DYNAMIC_in_synpred41_TinyHaxeTry11326 = new BitSet(
			new long[] { 0x0008000000000002L });
	public static final BitSet FOLLOW_BOOLEAN_in_synpred41_TinyHaxeTry11328 = new BitSet(
			new long[] { 0x0008000000000002L });
	public static final BitSet FOLLOW_VOID_in_synpred41_TinyHaxeTry11330 = new BitSet(
			new long[] { 0x0008000000000002L });
	public static final BitSet FOLLOW_typeParam_in_synpred41_TinyHaxeTry11334 = new BitSet(
			new long[] { 0x0008000000000002L });
	public static final BitSet FOLLOW_type_in_synpred42_TinyHaxeTry11356 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_GT_in_synpred43_TinyHaxeTry11362 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_GTGT_in_synpred44_TinyHaxeTry11365 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_typeParam_in_synpred45_TinyHaxeTry11387 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_block_in_synpred47_TinyHaxeTry11515 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_assignExpr_in_synpred48_TinyHaxeTry11520 = new BitSet(
			new long[] { 0x0000000000010000L });
	public static final BitSet FOLLOW_SEMI_in_synpred48_TinyHaxeTry11522 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_ELSE_in_synpred50_TinyHaxeTry11542 = new BitSet(
			new long[] { 0xFAC8212C03F30000L, 0x00001FC0BE20001EL });
	public static final BitSet FOLLOW_statement_in_synpred50_TinyHaxeTry11546 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_expr_in_synpred58_TinyHaxeTry11754 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_expr_in_synpred65_TinyHaxeTry11848 = new BitSet(
			new long[] { 0x0000000000010000L });
	public static final BitSet FOLLOW_SEMI_in_synpred65_TinyHaxeTry11851 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_IDENTIFIER_in_synpred66_TinyHaxeTry11857 = new BitSet(
			new long[] { 0x0000200000000000L });
	public static final BitSet FOLLOW_COLON_in_synpred66_TinyHaxeTry11859 = new BitSet(
			new long[] { 0xFAC8212C03F30000L, 0x00001FC0BE20001EL });
	public static final BitSet FOLLOW_statement_in_synpred66_TinyHaxeTry11861 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_varDecl_in_synpred69_TinyHaxeTry11963 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_exprList_in_synpred73_TinyHaxeTry12177 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_GT_in_synpred90_TinyHaxeTry12467 = new BitSet(
			new long[] { 0x0010000000000000L });
	public static final BitSet FOLLOW_GT_in_synpred90_TinyHaxeTry12469 = new BitSet(
			new long[] { 0x8048012C00020000L, 0x00001FC03E200000L });
	public static final BitSet FOLLOW_addExpr_in_synpred90_TinyHaxeTry12474 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_set_in_synpred101_TinyHaxeTry12559 = new BitSet(
			new long[] { 0x8048012C00020000L, 0x00001FC03E200000L });
	public static final BitSet FOLLOW_prefixExpr_in_synpred101_TinyHaxeTry12571 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_value_in_synpred104_TinyHaxeTry12626 = new BitSet(
			new long[] { 0x0000000800000000L });
	public static final BitSet FOLLOW_LPAREN_in_synpred104_TinyHaxeTry12628 = new BitSet(
			new long[] { 0x8048013C00020000L, 0x00001FC03E200000L });
	public static final BitSet FOLLOW_exprListOpt_in_synpred104_TinyHaxeTry12630 = new BitSet(
			new long[] { 0x0000001000000000L });
	public static final BitSet FOLLOW_RPAREN_in_synpred104_TinyHaxeTry12632 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_value_in_synpred105_TinyHaxeTry12653 = new BitSet(
			new long[] { 0x0000002000000000L });
	public static final BitSet FOLLOW_LBRACKET_in_synpred105_TinyHaxeTry12655 = new BitSet(
			new long[] { 0x8048012C00020000L, 0x00001FC03E200000L });
	public static final BitSet FOLLOW_expr_in_synpred105_TinyHaxeTry12657 = new BitSet(
			new long[] { 0x0000004000000000L });
	public static final BitSet FOLLOW_RBRACKET_in_synpred105_TinyHaxeTry12659 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_value_in_synpred106_TinyHaxeTry12664 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000004000000L });
	public static final BitSet FOLLOW_PLUSPLUS_in_synpred106_TinyHaxeTry12666 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_value_in_synpred107_TinyHaxeTry12690 = new BitSet(
			new long[] { 0x0000000000000000L, 0x0000000002000000L });
	public static final BitSet FOLLOW_SUBSUB_in_synpred107_TinyHaxeTry12692 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_arrayLit_in_synpred109_TinyHaxeTry12732 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_expr_in_synpred113_TinyHaxeTry12796 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_LPAREN_in_synpred114_TinyHaxeTry12792 = new BitSet(
			new long[] { 0xFAC8212C03F30000L, 0x00001FC0BE20001EL });
	public static final BitSet FOLLOW_expr_in_synpred114_TinyHaxeTry12796 = new BitSet(
			new long[] { 0x0000001000000000L });
	public static final BitSet FOLLOW_statement_in_synpred114_TinyHaxeTry12798 = new BitSet(
			new long[] { 0x0000001000000000L });
	public static final BitSet FOLLOW_RPAREN_in_synpred114_TinyHaxeTry12801 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_CAST_in_synpred117_TinyHaxeTry12895 = new BitSet(
			new long[] { 0x0000000800000000L });
	public static final BitSet FOLLOW_LPAREN_in_synpred117_TinyHaxeTry12897 = new BitSet(
			new long[] { 0x8048012C00020000L, 0x00001FC03E200000L });
	public static final BitSet FOLLOW_expr_in_synpred117_TinyHaxeTry12899 = new BitSet(
			new long[] { 0x0000001004000000L });
	public static final BitSet FOLLOW_COMMA_in_synpred117_TinyHaxeTry12902 = new BitSet(
			new long[] { 0x8007C00001020000L });
	public static final BitSet FOLLOW_funcType_in_synpred117_TinyHaxeTry12904 = new BitSet(
			new long[] { 0x0000001000000000L });
	public static final BitSet FOLLOW_RPAREN_in_synpred117_TinyHaxeTry12908 = new BitSet(
			new long[] { 0x0000000000000002L });

}