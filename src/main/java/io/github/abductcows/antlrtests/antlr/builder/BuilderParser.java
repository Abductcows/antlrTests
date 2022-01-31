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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, ID=6, NUMBER=7, NEWLINE=8, SPACES=9, 
		COMMENT=10, QUOTED_VALUE=11;
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
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
			setState(32);
			member_line();
			setState(36); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(33);
				declaration_separator();
				setState(34);
				member_line();
				}
				}
				setState(38); 
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
			setState(40);
			type();
			setState(47); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(43);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(41);
					required_members();
					}
					break;
				case T__0:
					{
					setState(42);
					optional_members();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(45);
				member_separator();
				}
				}
				setState(49); 
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
			setState(51);
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
			setState(53);
			required_member();
			setState(59);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(54);
					member_separator();
					setState(55);
					required_member();
					}
					} 
				}
				setState(61);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
			setState(62);
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
			setState(64);
			match(T__0);
			setState(65);
			optional_member();
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4 || _la==ID) {
				{
				{
				setState(66);
				member_separator();
				setState(67);
				optional_member();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
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
			setState(76);
			match(ID);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(77);
				match(T__2);
				setState(78);
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
		public TerminalNode QUOTED_VALUE() { return getToken(BuilderParser.QUOTED_VALUE, 0); }
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
			setState(81);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << NUMBER) | (1L << QUOTED_VALUE))) != 0)) ) {
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
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(83);
					match(T__3);
					}
				}

				setState(87); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(86);
					match(NEWLINE);
					}
					}
					setState(89); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
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
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\re\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\5\2\37\n\2\3\3\3\3\3\4\3\4\3\4\3\4\6\4"+
		"\'\n\4\r\4\16\4(\3\5\3\5\3\5\5\5.\n\5\3\5\3\5\6\5\62\n\5\r\5\16\5\63\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\7\7<\n\7\f\7\16\7?\13\7\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\7\tH\n\t\f\t\16\tK\13\t\3\t\3\t\3\n\3\n\3\n\5\nR\n\n\3\13\3\13\3"+
		"\f\5\fW\n\f\3\f\6\fZ\n\f\r\f\16\f[\3\f\5\f_\n\f\3\r\3\r\5\rc\n\r\3\r\2"+
		"\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\3\4\2\b\t\r\r\2c\2\32\3\2\2\2\4"+
		" \3\2\2\2\6\"\3\2\2\2\b*\3\2\2\2\n\65\3\2\2\2\f\67\3\2\2\2\16@\3\2\2\2"+
		"\20B\3\2\2\2\22N\3\2\2\2\24S\3\2\2\2\26^\3\2\2\2\30b\3\2\2\2\32\36\5\4"+
		"\3\2\33\34\5\26\f\2\34\35\5\6\4\2\35\37\3\2\2\2\36\33\3\2\2\2\36\37\3"+
		"\2\2\2\37\3\3\2\2\2 !\7\b\2\2!\5\3\2\2\2\"&\5\b\5\2#$\5\26\f\2$%\5\b\5"+
		"\2%\'\3\2\2\2&#\3\2\2\2\'(\3\2\2\2(&\3\2\2\2()\3\2\2\2)\7\3\2\2\2*\61"+
		"\5\n\6\2+.\5\f\7\2,.\5\20\t\2-+\3\2\2\2-,\3\2\2\2./\3\2\2\2/\60\5\30\r"+
		"\2\60\62\3\2\2\2\61-\3\2\2\2\62\63\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2"+
		"\64\t\3\2\2\2\65\66\7\b\2\2\66\13\3\2\2\2\67=\5\16\b\289\5\30\r\29:\5"+
		"\16\b\2:<\3\2\2\2;8\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\r\3\2\2\2?"+
		"=\3\2\2\2@A\7\b\2\2A\17\3\2\2\2BC\7\3\2\2CI\5\22\n\2DE\5\30\r\2EF\5\22"+
		"\n\2FH\3\2\2\2GD\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KI\3\2"+
		"\2\2LM\7\4\2\2M\21\3\2\2\2NQ\7\b\2\2OP\7\5\2\2PR\5\24\13\2QO\3\2\2\2Q"+
		"R\3\2\2\2R\23\3\2\2\2ST\t\2\2\2T\25\3\2\2\2UW\7\6\2\2VU\3\2\2\2VW\3\2"+
		"\2\2WY\3\2\2\2XZ\7\n\2\2YX\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\_\3"+
		"\2\2\2]_\7\6\2\2^V\3\2\2\2^]\3\2\2\2_\27\3\2\2\2`c\7\7\2\2ac\3\2\2\2b"+
		"`\3\2\2\2ba\3\2\2\2c\31\3\2\2\2\r\36(-\63=IQV[^b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}