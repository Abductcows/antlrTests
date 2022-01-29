// Generated from /home/abductcows/IdeaProjects/antlrTests/src/main/antlr4/Builder.g4 by ANTLR 4.9.2
package io.github.abductcows.antlrtests.antlr.builder;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BuilderParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, CLASS_DECLARATION_PREFIX=5, ID=6, NEWLINE=7, 
		WHITESPACE=8;
	public static final int
		RULE_class_declaration = 0, RULE_class_name = 1, RULE_members = 2, RULE_member_line = 3, 
		RULE_type = 4, RULE_required_members = 5, RULE_optional_members = 6, RULE_declaration_separator = 7, 
		RULE_member_separator = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"class_declaration", "class_name", "members", "member_line", "type", 
			"required_members", "optional_members", "declaration_separator", "member_separator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "';'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "CLASS_DECLARATION_PREFIX", "ID", "NEWLINE", 
			"WHITESPACE"
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

	@Override
	public String getGrammarFileName() { return "Builder.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BuilderParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Class_declarationContext extends ParserRuleContext {
		public Class_nameContext class_name() {
			return getRuleContext(Class_nameContext.class,0);
		}
		public Declaration_separatorContext declaration_separator() {
			return getRuleContext(Declaration_separatorContext.class,0);
		}
		public MembersContext members() {
			return getRuleContext(MembersContext.class,0);
		}
		public Class_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BuilderListener ) ((BuilderListener)listener).enterClass_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BuilderListener ) ((BuilderListener)listener).exitClass_declaration(this);
		}
	}

	public final Class_declarationContext class_declaration() throws RecognitionException {
		Class_declarationContext _localctx = new Class_declarationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_class_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			class_name();
			setState(19);
			declaration_separator();
			setState(20);
			members();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_nameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BuilderParser.ID, 0); }
		public TerminalNode CLASS_DECLARATION_PREFIX() { return getToken(BuilderParser.CLASS_DECLARATION_PREFIX, 0); }
		public Class_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BuilderListener ) ((BuilderListener)listener).enterClass_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BuilderListener ) ((BuilderListener)listener).exitClass_name(this);
		}
	}

	public final Class_nameContext class_name() throws RecognitionException {
		Class_nameContext _localctx = new Class_nameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_class_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLASS_DECLARATION_PREFIX) {
				{
				setState(22);
				match(CLASS_DECLARATION_PREFIX);
				}
			}

			setState(25);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MembersContext extends ParserRuleContext {
		public List<Member_lineContext> member_line() {
			return getRuleContexts(Member_lineContext.class);
		}
		public Member_lineContext member_line(int i) {
			return getRuleContext(Member_lineContext.class,i);
		}
		public List<Declaration_separatorContext> declaration_separator() {
			return getRuleContexts(Declaration_separatorContext.class);
		}
		public Declaration_separatorContext declaration_separator(int i) {
			return getRuleContext(Declaration_separatorContext.class,i);
		}
		public MembersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_members; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BuilderListener ) ((BuilderListener)listener).enterMembers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BuilderListener ) ((BuilderListener)listener).exitMembers(this);
		}
	}

	public final MembersContext members() throws RecognitionException {
		MembersContext _localctx = new MembersContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_members);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(27);
				member_line();
				setState(28);
				declaration_separator();
				}
				}
				setState(32); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Member_lineContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<Member_separatorContext> member_separator() {
			return getRuleContexts(Member_separatorContext.class);
		}
		public Member_separatorContext member_separator(int i) {
			return getRuleContext(Member_separatorContext.class,i);
		}
		public List<Required_membersContext> required_members() {
			return getRuleContexts(Required_membersContext.class);
		}
		public Required_membersContext required_members(int i) {
			return getRuleContext(Required_membersContext.class,i);
		}
		public List<Optional_membersContext> optional_members() {
			return getRuleContexts(Optional_membersContext.class);
		}
		public Optional_membersContext optional_members(int i) {
			return getRuleContext(Optional_membersContext.class,i);
		}
		public Member_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BuilderListener ) ((BuilderListener)listener).enterMember_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BuilderListener ) ((BuilderListener)listener).exitMember_line(this);
		}
	}

	public final Member_lineContext member_line() throws RecognitionException {
		Member_lineContext _localctx = new Member_lineContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_member_line);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			type();
			setState(41); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(37);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ID:
						{
						setState(35);
						required_members();
						}
						break;
					case T__0:
						{
						setState(36);
						optional_members();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(39);
					member_separator();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(43); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BuilderParser.ID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BuilderListener ) ((BuilderListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BuilderListener ) ((BuilderListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Required_membersContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(BuilderParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(BuilderParser.ID, i);
		}
		public List<Member_separatorContext> member_separator() {
			return getRuleContexts(Member_separatorContext.class);
		}
		public Member_separatorContext member_separator(int i) {
			return getRuleContext(Member_separatorContext.class,i);
		}
		public Required_membersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_required_members; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BuilderListener ) ((BuilderListener)listener).enterRequired_members(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BuilderListener ) ((BuilderListener)listener).exitRequired_members(this);
		}
	}

	public final Required_membersContext required_members() throws RecognitionException {
		Required_membersContext _localctx = new Required_membersContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_required_members);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(49); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(47);
					match(ID);
					setState(48);
					member_separator();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(51); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Optional_membersContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(BuilderParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(BuilderParser.ID, i);
		}
		public List<Member_separatorContext> member_separator() {
			return getRuleContexts(Member_separatorContext.class);
		}
		public Member_separatorContext member_separator(int i) {
			return getRuleContext(Member_separatorContext.class,i);
		}
		public Optional_membersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optional_members; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BuilderListener ) ((BuilderListener)listener).enterOptional_members(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BuilderListener ) ((BuilderListener)listener).exitOptional_members(this);
		}
	}

	public final Optional_membersContext optional_members() throws RecognitionException {
		Optional_membersContext _localctx = new Optional_membersContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_optional_members);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(T__0);
			setState(56); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(54);
				match(ID);
				setState(55);
				member_separator();
				}
				}
				setState(58); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(60);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaration_separatorContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(BuilderParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(BuilderParser.NEWLINE, i);
		}
		public Declaration_separatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_separator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BuilderListener ) ((BuilderListener)listener).enterDeclaration_separator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BuilderListener ) ((BuilderListener)listener).exitDeclaration_separator(this);
		}
	}

	public final Declaration_separatorContext declaration_separator() throws RecognitionException {
		Declaration_separatorContext _localctx = new Declaration_separatorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declaration_separator);
		int _la;
		try {
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEWLINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(63); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(62);
					match(NEWLINE);
					}
					}
					setState(65); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				match(T__2);
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(68);
					match(NEWLINE);
					}
					}
					setState(73);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case EOF:
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Member_separatorContext extends ParserRuleContext {
		public Member_separatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_separator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BuilderListener ) ((BuilderListener)listener).enterMember_separator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BuilderListener ) ((BuilderListener)listener).exitMember_separator(this);
		}
	}

	public final Member_separatorContext member_separator() throws RecognitionException {
		Member_separatorContext _localctx = new Member_separatorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_member_separator);
		try {
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\nT\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\3\2\3\3\5\3\32\n\3\3\3\3\3\3\4\3\4\3\4\6\4!\n\4\r\4\16\4\"\3\5\3\5\3"+
		"\5\5\5(\n\5\3\5\3\5\6\5,\n\5\r\5\16\5-\3\6\3\6\3\7\3\7\6\7\64\n\7\r\7"+
		"\16\7\65\3\b\3\b\3\b\6\b;\n\b\r\b\16\b<\3\b\3\b\3\t\6\tB\n\t\r\t\16\t"+
		"C\3\t\3\t\7\tH\n\t\f\t\16\tK\13\t\3\t\5\tN\n\t\3\n\3\n\5\nR\n\n\3\n\2"+
		"\2\13\2\4\6\b\n\f\16\20\22\2\2\2U\2\24\3\2\2\2\4\31\3\2\2\2\6 \3\2\2\2"+
		"\b$\3\2\2\2\n/\3\2\2\2\f\63\3\2\2\2\16\67\3\2\2\2\20M\3\2\2\2\22Q\3\2"+
		"\2\2\24\25\5\4\3\2\25\26\5\20\t\2\26\27\5\6\4\2\27\3\3\2\2\2\30\32\7\7"+
		"\2\2\31\30\3\2\2\2\31\32\3\2\2\2\32\33\3\2\2\2\33\34\7\b\2\2\34\5\3\2"+
		"\2\2\35\36\5\b\5\2\36\37\5\20\t\2\37!\3\2\2\2 \35\3\2\2\2!\"\3\2\2\2\""+
		" \3\2\2\2\"#\3\2\2\2#\7\3\2\2\2$+\5\n\6\2%(\5\f\7\2&(\5\16\b\2\'%\3\2"+
		"\2\2\'&\3\2\2\2()\3\2\2\2)*\5\22\n\2*,\3\2\2\2+\'\3\2\2\2,-\3\2\2\2-+"+
		"\3\2\2\2-.\3\2\2\2.\t\3\2\2\2/\60\7\b\2\2\60\13\3\2\2\2\61\62\7\b\2\2"+
		"\62\64\5\22\n\2\63\61\3\2\2\2\64\65\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2"+
		"\2\66\r\3\2\2\2\67:\7\3\2\289\7\b\2\29;\5\22\n\2:8\3\2\2\2;<\3\2\2\2<"+
		":\3\2\2\2<=\3\2\2\2=>\3\2\2\2>?\7\4\2\2?\17\3\2\2\2@B\7\t\2\2A@\3\2\2"+
		"\2BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2DN\3\2\2\2EI\7\5\2\2FH\7\t\2\2GF\3\2\2"+
		"\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JN\3\2\2\2KI\3\2\2\2LN\3\2\2\2MA\3\2\2"+
		"\2ME\3\2\2\2ML\3\2\2\2N\21\3\2\2\2OR\7\6\2\2PR\3\2\2\2QO\3\2\2\2QP\3\2"+
		"\2\2R\23\3\2\2\2\f\31\"\'-\65<CIMQ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}