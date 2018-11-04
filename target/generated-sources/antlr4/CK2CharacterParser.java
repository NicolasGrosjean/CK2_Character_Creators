// Generated from CK2Character.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CK2CharacterParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__3=1, T__2=2, T__1=3, T__0=4, STRING=5, NUMBER=6, DATE=7, WS=8, COMMENT=9;
	public static final String[] tokenNames = {
		"<INVALID>", "'\"'", "'{'", "'}'", "'='", "STRING", "NUMBER", "DATE", 
		"WS", "COMMENT"
	};
	public static final int
		RULE_characters = 0, RULE_character = 1, RULE_attribute = 2, RULE_date_attribute = 3, 
		RULE_value = 4;
	public static final String[] ruleNames = {
		"characters", "character", "attribute", "date_attribute", "value"
	};

	@Override
	public String getGrammarFileName() { return "CK2Character.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CK2CharacterParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CharactersContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CK2CharacterParser.EOF, 0); }
		public CharacterContext character(int i) {
			return getRuleContext(CharacterContext.class,i);
		}
		public List<CharacterContext> character() {
			return getRuleContexts(CharacterContext.class);
		}
		public CharactersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CK2CharacterListener ) ((CK2CharacterListener)listener).enterCharacters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CK2CharacterListener ) ((CK2CharacterListener)listener).exitCharacters(this);
		}
	}

	public final CharactersContext characters() throws RecognitionException {
		CharactersContext _localctx = new CharactersContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_characters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10); character();
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			setState(15); match(EOF);
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

	public static class CharacterContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public Date_attributeContext date_attribute(int i) {
			return getRuleContext(Date_attributeContext.class,i);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public TerminalNode NUMBER() { return getToken(CK2CharacterParser.NUMBER, 0); }
		public List<Date_attributeContext> date_attribute() {
			return getRuleContexts(Date_attributeContext.class);
		}
		public CharacterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CK2CharacterListener ) ((CK2CharacterListener)listener).enterCharacter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CK2CharacterListener ) ((CK2CharacterListener)listener).exitCharacter(this);
		}
	}

	public final CharacterContext character() throws RecognitionException {
		CharacterContext _localctx = new CharacterContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_character);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17); match(NUMBER);
			setState(18); match(T__0);
			setState(19); match(T__2);
			setState(22); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(22);
				switch (_input.LA(1)) {
				case STRING:
					{
					setState(20); attribute();
					}
					break;
				case DATE:
					{
					setState(21); date_attribute();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(24); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING || _la==DATE );
			setState(26); match(T__1);
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

	public static class AttributeContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode STRING() { return getToken(CK2CharacterParser.STRING, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CK2CharacterListener ) ((CK2CharacterListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CK2CharacterListener ) ((CK2CharacterListener)listener).exitAttribute(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28); match(STRING);
			setState(29); match(T__0);
			setState(30); value();
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

	public static class Date_attributeContext extends ParserRuleContext {
		public TerminalNode STRING(int i) {
			return getToken(CK2CharacterParser.STRING, i);
		}
		public List<TerminalNode> STRING() { return getTokens(CK2CharacterParser.STRING); }
		public TerminalNode DATE() { return getToken(CK2CharacterParser.DATE, 0); }
		public Date_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CK2CharacterListener ) ((CK2CharacterListener)listener).enterDate_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CK2CharacterListener ) ((CK2CharacterListener)listener).exitDate_attribute(this);
		}
	}

	public final Date_attributeContext date_attribute() throws RecognitionException {
		Date_attributeContext _localctx = new Date_attributeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_date_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32); match(DATE);
			setState(33); match(T__0);
			setState(34); match(T__2);
			setState(35); match(STRING);
			setState(36); match(T__0);
			setState(37); match(STRING);
			setState(38); match(T__1);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(CK2CharacterParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(CK2CharacterParser.NUMBER, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CK2CharacterListener ) ((CK2CharacterListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CK2CharacterListener ) ((CK2CharacterListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_value);
		try {
			setState(45);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(40); match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(41); match(STRING);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(42); match(T__3);
				setState(43); match(STRING);
				setState(44); match(T__3);
				}
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\13\62\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\6\2\16\n\2\r\2\16\2\17\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\6\3\31\n\3\r\3\16\3\32\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6\60\n\6\3\6\2\2\7\2\4"+
		"\6\b\n\2\2\61\2\r\3\2\2\2\4\23\3\2\2\2\6\36\3\2\2\2\b\"\3\2\2\2\n/\3\2"+
		"\2\2\f\16\5\4\3\2\r\f\3\2\2\2\16\17\3\2\2\2\17\r\3\2\2\2\17\20\3\2\2\2"+
		"\20\21\3\2\2\2\21\22\7\2\2\3\22\3\3\2\2\2\23\24\7\b\2\2\24\25\7\6\2\2"+
		"\25\30\7\4\2\2\26\31\5\6\4\2\27\31\5\b\5\2\30\26\3\2\2\2\30\27\3\2\2\2"+
		"\31\32\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\34\3\2\2\2\34\35\7\5\2\2"+
		"\35\5\3\2\2\2\36\37\7\7\2\2\37 \7\6\2\2 !\5\n\6\2!\7\3\2\2\2\"#\7\t\2"+
		"\2#$\7\6\2\2$%\7\4\2\2%&\7\7\2\2&\'\7\6\2\2\'(\7\7\2\2()\7\5\2\2)\t\3"+
		"\2\2\2*\60\7\b\2\2+\60\7\7\2\2,-\7\3\2\2-.\7\7\2\2.\60\7\3\2\2/*\3\2\2"+
		"\2/+\3\2\2\2/,\3\2\2\2\60\13\3\2\2\2\6\17\30\32/";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}