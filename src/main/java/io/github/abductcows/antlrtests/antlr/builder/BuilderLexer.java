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
		QUOTED_VALUE=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "LETTER", "ID_SPECIAL_CHAR", 
			"ID", "NUMBER", "NEWLINE", "SPACES", "QUOTED_VALUE"
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
			"QUOTED_VALUE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\ff\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\5\t,\n\t\3\t\3\t\3\t\7\t\61\n\t\f\t\16\t\64\13\t\3\n\5"+
		"\n\67\n\n\3\n\7\n:\n\n\f\n\16\n=\13\n\3\n\5\n@\n\n\3\n\6\nC\n\n\r\n\16"+
		"\nD\3\n\3\n\5\nI\n\n\3\n\6\nL\n\n\r\n\16\nM\5\nP\n\n\3\13\3\13\3\13\5"+
		"\13U\n\13\3\f\6\fX\n\f\r\f\16\fY\3\f\3\f\3\r\3\r\7\r`\n\r\f\r\16\rc\13"+
		"\r\3\r\3\r\3a\2\16\3\3\5\4\7\5\t\6\13\7\r\2\17\2\21\b\23\t\25\n\27\13"+
		"\31\f\3\2\t\4\2C\\c|\4\2&&aa\3\2\62;\4\2--//\3\2\60\60\4\2GGgg\4\2\13"+
		"\13\"\"\2q\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\3"+
		"\33\3\2\2\2\5\35\3\2\2\2\7\37\3\2\2\2\t!\3\2\2\2\13#\3\2\2\2\r%\3\2\2"+
		"\2\17\'\3\2\2\2\21+\3\2\2\2\23\66\3\2\2\2\25T\3\2\2\2\27W\3\2\2\2\31]"+
		"\3\2\2\2\33\34\7*\2\2\34\4\3\2\2\2\35\36\7+\2\2\36\6\3\2\2\2\37 \7?\2"+
		"\2 \b\3\2\2\2!\"\7=\2\2\"\n\3\2\2\2#$\7.\2\2$\f\3\2\2\2%&\t\2\2\2&\16"+
		"\3\2\2\2\'(\t\3\2\2(\20\3\2\2\2),\5\r\7\2*,\5\17\b\2+)\3\2\2\2+*\3\2\2"+
		"\2,\62\3\2\2\2-\61\5\r\7\2.\61\t\4\2\2/\61\5\17\b\2\60-\3\2\2\2\60.\3"+
		"\2\2\2\60/\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\22\3\2"+
		"\2\2\64\62\3\2\2\2\65\67\t\5\2\2\66\65\3\2\2\2\66\67\3\2\2\2\67;\3\2\2"+
		"\28:\t\4\2\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<?\3\2\2\2=;\3\2\2"+
		"\2>@\t\6\2\2?>\3\2\2\2?@\3\2\2\2@B\3\2\2\2AC\t\4\2\2BA\3\2\2\2CD\3\2\2"+
		"\2DB\3\2\2\2DE\3\2\2\2EO\3\2\2\2FH\t\7\2\2GI\t\5\2\2HG\3\2\2\2HI\3\2\2"+
		"\2IK\3\2\2\2JL\t\4\2\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2"+
		"\2OF\3\2\2\2OP\3\2\2\2P\24\3\2\2\2QU\7\f\2\2RS\7\17\2\2SU\7\f\2\2TQ\3"+
		"\2\2\2TR\3\2\2\2U\26\3\2\2\2VX\t\b\2\2WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2Y"+
		"Z\3\2\2\2Z[\3\2\2\2[\\\b\f\2\2\\\30\3\2\2\2]a\7$\2\2^`\13\2\2\2_^\3\2"+
		"\2\2`c\3\2\2\2ab\3\2\2\2a_\3\2\2\2bd\3\2\2\2ca\3\2\2\2de\7$\2\2e\32\3"+
		"\2\2\2\20\2+\60\62\66;?DHMOTYa\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}