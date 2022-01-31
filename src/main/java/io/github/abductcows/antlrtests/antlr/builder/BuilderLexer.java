// Generated from /home/abductcows/IdeaProjects/antlrTests/src/main/antlr4/Builder.g4 by ANTLR 4.9.2
package io.github.abductcows.antlrtests.antlr.builder;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BuilderLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, ID=6, NUMBER=7, NEWLINE=8, SPACES=9, 
		COMMENT=10, QUOTED_VALUE=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "LETTER", "ID_SPECIAL_CHAR", 
			"ID", "NUMBER", "NEWLINE", "SPACES", "COMMENT", "QUOTED_VALUE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'='", "';'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "ID", "NUMBER", "NEWLINE", "SPACES", 
			"COMMENT", "QUOTED_VALUE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public BuilderLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Builder.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\rv\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\5\t.\n\t\3\t\3\t\3\t\7\t\63\n\t\f\t\16\t\66\13"+
		"\t\3\n\5\n9\n\n\3\n\7\n<\n\n\f\n\16\n?\13\n\3\n\5\nB\n\n\3\n\6\nE\n\n"+
		"\r\n\16\nF\3\n\3\n\5\nK\n\n\3\n\6\nN\n\n\r\n\16\nO\5\nR\n\n\3\13\3\13"+
		"\3\13\5\13W\n\13\3\f\6\fZ\n\f\r\f\16\f[\3\f\3\f\3\r\3\r\3\r\7\rc\n\r\f"+
		"\r\16\rf\13\r\3\r\3\r\5\rj\n\r\3\r\3\r\3\16\3\16\7\16p\n\16\f\16\16\16"+
		"s\13\16\3\16\3\16\4dq\2\17\3\3\5\4\7\5\t\6\13\7\r\2\17\2\21\b\23\t\25"+
		"\n\27\13\31\f\33\r\3\2\t\4\2C\\c|\4\2&&aa\3\2\62;\4\2--//\3\2\60\60\4"+
		"\2GGgg\4\2\13\13\"\"\2\u0083\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2"+
		"\2\2\31\3\2\2\2\2\33\3\2\2\2\3\35\3\2\2\2\5\37\3\2\2\2\7!\3\2\2\2\t#\3"+
		"\2\2\2\13%\3\2\2\2\r\'\3\2\2\2\17)\3\2\2\2\21-\3\2\2\2\238\3\2\2\2\25"+
		"V\3\2\2\2\27Y\3\2\2\2\31_\3\2\2\2\33m\3\2\2\2\35\36\7*\2\2\36\4\3\2\2"+
		"\2\37 \7+\2\2 \6\3\2\2\2!\"\7?\2\2\"\b\3\2\2\2#$\7=\2\2$\n\3\2\2\2%&\7"+
		".\2\2&\f\3\2\2\2\'(\t\2\2\2(\16\3\2\2\2)*\t\3\2\2*\20\3\2\2\2+.\5\r\7"+
		"\2,.\5\17\b\2-+\3\2\2\2-,\3\2\2\2.\64\3\2\2\2/\63\5\r\7\2\60\63\t\4\2"+
		"\2\61\63\5\17\b\2\62/\3\2\2\2\62\60\3\2\2\2\62\61\3\2\2\2\63\66\3\2\2"+
		"\2\64\62\3\2\2\2\64\65\3\2\2\2\65\22\3\2\2\2\66\64\3\2\2\2\679\t\5\2\2"+
		"8\67\3\2\2\289\3\2\2\29=\3\2\2\2:<\t\4\2\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2"+
		"\2=>\3\2\2\2>A\3\2\2\2?=\3\2\2\2@B\t\6\2\2A@\3\2\2\2AB\3\2\2\2BD\3\2\2"+
		"\2CE\t\4\2\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2GQ\3\2\2\2HJ\t\7\2"+
		"\2IK\t\5\2\2JI\3\2\2\2JK\3\2\2\2KM\3\2\2\2LN\t\4\2\2ML\3\2\2\2NO\3\2\2"+
		"\2OM\3\2\2\2OP\3\2\2\2PR\3\2\2\2QH\3\2\2\2QR\3\2\2\2R\24\3\2\2\2SW\7\f"+
		"\2\2TU\7\17\2\2UW\7\f\2\2VS\3\2\2\2VT\3\2\2\2W\26\3\2\2\2XZ\t\b\2\2YX"+
		"\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]^\b\f\2\2^\30\3\2\2"+
		"\2_`\7\61\2\2`d\7\61\2\2ac\13\2\2\2ba\3\2\2\2cf\3\2\2\2de\3\2\2\2db\3"+
		"\2\2\2ei\3\2\2\2fd\3\2\2\2gj\5\25\13\2hj\7\2\2\3ig\3\2\2\2ih\3\2\2\2j"+
		"k\3\2\2\2kl\b\r\2\2l\32\3\2\2\2mq\7$\2\2np\13\2\2\2on\3\2\2\2ps\3\2\2"+
		"\2qr\3\2\2\2qo\3\2\2\2rt\3\2\2\2sq\3\2\2\2tu\7$\2\2u\34\3\2\2\2\22\2-"+
		"\62\648=AFJOQV[diq\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}