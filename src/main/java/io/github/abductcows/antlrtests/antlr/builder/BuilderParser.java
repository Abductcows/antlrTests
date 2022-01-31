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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, CLASS_DECLARATION_PREFIX=6, ID=7, 
		NUMBER=8, NEWLINE=9, SPACES=10, ANY_IN_QUOTES=11;
	public static final int
		RULE_class_declaration = 0, RULE_class_name = 1, RULE_members = 2, RULE_member_line = 3, 
		RULE_type = 4, RULE_required_members = 5, RULE_required_member = 6, RULE_optional_members = 7, 
		RULE_optional_member = 8, RULE_default_value = 9, RULE_declaration_separator = 10, 
		RULE_member_separator = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"class_declaration", "class_name", "members", "member_line", "type", 
			"required_members", "required_member", "optional_members", "optional_member", 
			"default_value", "declaration_separator", "member_separator"
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
			null, null, null, null, null, null, "CLASS_DECLARATION_PREFIX", "ID", 
			"NUMBER", "NEWLINE", "SPACES", "ANY_IN_QUOTES"
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			class_name();
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3 || _la==NEWLINE) {
				{
				setState(25);
				declaration_separator();
				setState(26);
				members();
				}
			}

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
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLASS_DECLARATION_PREFIX) {
				{
				setState(30);
				match(CLASS_DECLARATION_PREFIX);
				}
			}

			setState(33);
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
			setState(35);
			member_line();
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(36);
				declaration_separator();
				setState(37);
				member_line();
				}
				}
				setState(41); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__3 || _la==NEWLINE );
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			type();
			setState(50); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(46);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(44);
					required_members();
					}
					break;
				case T__0:
					{
					setState(45);
					optional_members();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(48);
				member_separator();
				}
				}
				setState(52); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 || _la==ID );
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
			setState(54);
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
		public List<Required_memberContext> required_member() {
			return getRuleContexts(Required_memberContext.class);
		}
		public Required_memberContext required_member(int i) {
			return getRuleContext(Required_memberContext.class,i);
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
			setState(56);
			required_member();
			setState(62);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(57);
					member_separator();
					setState(58);
					required_member();
					}
					} 
				}
				setState(64);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
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

	public static class Required_memberContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BuilderParser.ID, 0); }
		public Required_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_required_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BuilderListener ) ((BuilderListener)listener).enterRequired_member(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BuilderListener ) ((BuilderListener)listener).exitRequired_member(this);
		}
	}

	public final Required_memberContext required_member() throws RecognitionException {
		Required_memberContext _localctx = new Required_memberContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_required_member);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
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

	public static class Optional_membersContext extends ParserRuleContext {
		public List<Optional_memberContext> optional_member() {
			return getRuleContexts(Optional_memberContext.class);
		}
		public Optional_memberContext optional_member(int i) {
			return getRuleContext(Optional_memberContext.class,i);
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
		enterRule(_localctx, 14, RULE_optional_members);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(T__0);
			setState(68);
			optional_member();
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4 || _la==ID) {
				{
				{
				setState(69);
				member_separator();
				setState(70);
				optional_member();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
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

	public static class Optional_memberContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BuilderParser.ID, 0); }
		public Default_valueContext default_value() {
			return getRuleContext(Default_valueContext.class,0);
		}
		public Optional_memberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optional_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BuilderListener ) ((BuilderListener)listener).enterOptional_member(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BuilderListener ) ((BuilderListener)listener).exitOptional_member(this);
		}
	}

	public final Optional_memberContext optional_member() throws RecognitionException {
		Optional_memberContext _localctx = new Optional_memberContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_optional_member);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(ID);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(80);
				match(T__2);
				setState(81);
				default_value();
				}
			}

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

	public static class Default_valueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BuilderParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(BuilderParser.NUMBER, 0); }
		public TerminalNode ANY_IN_QUOTES() { return getToken(BuilderParser.ANY_IN_QUOTES, 0); }
		public Default_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BuilderListener ) ((BuilderListener)listener).enterDefault_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BuilderListener ) ((BuilderListener)listener).exitDefault_value(this);
		}
	}

	public final Default_valueContext default_value() throws RecognitionException {
		Default_valueContext _localctx = new Default_valueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_default_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << NUMBER) | (1L << ANY_IN_QUOTES))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
		enterRule(_localctx, 20, RULE_declaration_separator);
		int _la;
		try {
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(86);
					match(T__3);
					}
				}

				setState(90); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(89);
					match(NEWLINE);
					}
					}
					setState(92); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				match(T__3);
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
		enterRule(_localctx, 22, RULE_member_separator);
		try {
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				match(T__4);
				}
				break;
			case EOF:
			case T__0:
			case T__3:
			case ID:
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\rh\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\5\2\37\n\2\3\3\5\3\"\n\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\6\4*\n\4\r\4\16\4+\3\5\3\5\3\5\5\5\61\n\5\3\5\3\5\6\5\65\n"+
		"\5\r\5\16\5\66\3\6\3\6\3\7\3\7\3\7\3\7\7\7?\n\7\f\7\16\7B\13\7\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\7\tK\n\t\f\t\16\tN\13\t\3\t\3\t\3\n\3\n\3\n\5\nU"+
		"\n\n\3\13\3\13\3\f\5\fZ\n\f\3\f\6\f]\n\f\r\f\16\f^\3\f\5\fb\n\f\3\r\3"+
		"\r\5\rf\n\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\3\4\2\t\n\r\r\2"+
		"g\2\32\3\2\2\2\4!\3\2\2\2\6%\3\2\2\2\b-\3\2\2\2\n8\3\2\2\2\f:\3\2\2\2"+
		"\16C\3\2\2\2\20E\3\2\2\2\22Q\3\2\2\2\24V\3\2\2\2\26a\3\2\2\2\30e\3\2\2"+
		"\2\32\36\5\4\3\2\33\34\5\26\f\2\34\35\5\6\4\2\35\37\3\2\2\2\36\33\3\2"+
		"\2\2\36\37\3\2\2\2\37\3\3\2\2\2 \"\7\b\2\2! \3\2\2\2!\"\3\2\2\2\"#\3\2"+
		"\2\2#$\7\t\2\2$\5\3\2\2\2%)\5\b\5\2&\'\5\26\f\2\'(\5\b\5\2(*\3\2\2\2)"+
		"&\3\2\2\2*+\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\7\3\2\2\2-\64\5\n\6\2.\61\5\f"+
		"\7\2/\61\5\20\t\2\60.\3\2\2\2\60/\3\2\2\2\61\62\3\2\2\2\62\63\5\30\r\2"+
		"\63\65\3\2\2\2\64\60\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2"+
		"\67\t\3\2\2\289\7\t\2\29\13\3\2\2\2:@\5\16\b\2;<\5\30\r\2<=\5\16\b\2="+
		"?\3\2\2\2>;\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\r\3\2\2\2B@\3\2\2\2"+
		"CD\7\t\2\2D\17\3\2\2\2EF\7\3\2\2FL\5\22\n\2GH\5\30\r\2HI\5\22\n\2IK\3"+
		"\2\2\2JG\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2NL\3\2\2\2OP\7"+
		"\4\2\2P\21\3\2\2\2QT\7\t\2\2RS\7\5\2\2SU\5\24\13\2TR\3\2\2\2TU\3\2\2\2"+
		"U\23\3\2\2\2VW\t\2\2\2W\25\3\2\2\2XZ\7\6\2\2YX\3\2\2\2YZ\3\2\2\2Z\\\3"+
		"\2\2\2[]\7\13\2\2\\[\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_b\3\2\2\2"+
		"`b\7\6\2\2aY\3\2\2\2a`\3\2\2\2b\27\3\2\2\2cf\7\7\2\2df\3\2\2\2ec\3\2\2"+
		"\2ed\3\2\2\2f\31\3\2\2\2\16\36!+\60\66@LTY^ae";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}