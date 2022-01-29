// Generated from /home/abductcows/IdeaProjects/antlrTests/src/main/antlr4/Declaration.g4 by ANTLR 4.9.2
package io.github.abductcows.antlrtests.antlr.declaration;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DeclarationLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, TYPE=3, ID=4, NEWLINE=5, WHITESPACE=6;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "LETTER", "DIGIT", "TYPE", "ID", "NEWLINE", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "TYPE", "ID", "NEWLINE", "WHITESPACE"
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


	public DeclarationLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Declaration.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\bL\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\3\3\3"+
		"\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\66\n\6\3\7\3\7"+
		"\5\7:\n\7\3\7\3\7\3\7\7\7?\n\7\f\7\16\7B\13\7\3\b\3\b\3\b\5\bG\n\b\3\t"+
		"\3\t\3\t\3\t\2\2\n\3\3\5\4\7\2\t\2\13\5\r\6\17\7\21\b\3\2\5\4\2C\\c|\3"+
		"\2\62;\4\2\13\13\"\"\2S\2\3\3\2\2\2\2\5\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\3\23\3\2\2\2\5\25\3\2\2\2\7\27\3\2\2\2\t"+
		"\31\3\2\2\2\13\65\3\2\2\2\r9\3\2\2\2\17F\3\2\2\2\21H\3\2\2\2\23\24\7."+
		"\2\2\24\4\3\2\2\2\25\26\7=\2\2\26\6\3\2\2\2\27\30\t\2\2\2\30\b\3\2\2\2"+
		"\31\32\t\3\2\2\32\n\3\2\2\2\33\34\7e\2\2\34\35\7j\2\2\35\36\7c\2\2\36"+
		"\66\7t\2\2\37 \7d\2\2 !\7{\2\2!\"\7v\2\2\"\66\7g\2\2#$\7k\2\2$%\7p\2\2"+
		"%\66\7v\2\2&\'\7n\2\2\'(\7q\2\2()\7p\2\2)\66\7i\2\2*+\7h\2\2+,\7n\2\2"+
		",-\7q\2\2-.\7c\2\2.\66\7v\2\2/\60\7f\2\2\60\61\7q\2\2\61\62\7w\2\2\62"+
		"\63\7d\2\2\63\64\7n\2\2\64\66\7g\2\2\65\33\3\2\2\2\65\37\3\2\2\2\65#\3"+
		"\2\2\2\65&\3\2\2\2\65*\3\2\2\2\65/\3\2\2\2\66\f\3\2\2\2\67:\5\7\4\28:"+
		"\7a\2\29\67\3\2\2\298\3\2\2\2:@\3\2\2\2;?\5\7\4\2<?\5\t\5\2=?\7a\2\2>"+
		";\3\2\2\2><\3\2\2\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\16\3\2\2"+
		"\2B@\3\2\2\2CG\7\f\2\2DE\7\17\2\2EG\7\f\2\2FC\3\2\2\2FD\3\2\2\2G\20\3"+
		"\2\2\2HI\t\4\2\2IJ\3\2\2\2JK\b\t\2\2K\22\3\2\2\2\b\2\659>@F\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}