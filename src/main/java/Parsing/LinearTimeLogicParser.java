// Generated from /home/alexander/Dropbox/LTLChecker/LTL/LinearTimeLogic.g4 by ANTLR 4.5
package Parsing;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LinearTimeLogicParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, ATOM=11, WS=12;
	public static final int
		RULE_formula = 0, RULE_literal = 1, RULE_vliteral = 2, RULE_fliteral = 3, 
		RULE_negatom = 4, RULE_atom = 5, RULE_orformula = 6, RULE_andformula = 7, 
		RULE_xformula = 8, RULE_uformula = 9, RULE_vformula = 10;
	public static final String[] ruleNames = {
		"formula", "literal", "vliteral", "fliteral", "negatom", "atom", "orformula", 
		"andformula", "xformula", "uformula", "vformula"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'VERUM'", "'FALSUM'", "'~'", "'('", "'|'", "')'", "'&'", "'X'", 
		"'U'", "'V'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "ATOM", 
		"WS"
	};
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
	@NotNull
	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "LinearTimeLogic.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LinearTimeLogicParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FormulaContext extends ParserRuleContext {
		public AndformulaContext andformula() {
			return getRuleContext(AndformulaContext.class,0);
		}
		public OrformulaContext orformula() {
			return getRuleContext(OrformulaContext.class,0);
		}
		public XformulaContext xformula() {
			return getRuleContext(XformulaContext.class,0);
		}
		public UformulaContext uformula() {
			return getRuleContext(UformulaContext.class,0);
		}
		public VformulaContext vformula() {
			return getRuleContext(VformulaContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public FormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinearTimeLogicListener ) ((LinearTimeLogicListener)listener).enterFormula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinearTimeLogicListener ) ((LinearTimeLogicListener)listener).exitFormula(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinearTimeLogicVisitor ) return ((LinearTimeLogicVisitor<? extends T>)visitor).visitFormula(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormulaContext formula() throws RecognitionException {
		FormulaContext _localctx = new FormulaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_formula);
		try {
			setState(28);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(22); 
				andformula();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(23); 
				orformula();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(24); 
				xformula();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(25); 
				uformula();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(26); 
				vformula();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(27); 
				literal();
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

	public static class LiteralContext extends ParserRuleContext {
		public VliteralContext vliteral() {
			return getRuleContext(VliteralContext.class,0);
		}
		public FliteralContext fliteral() {
			return getRuleContext(FliteralContext.class,0);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public NegatomContext negatom() {
			return getRuleContext(NegatomContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinearTimeLogicListener ) ((LinearTimeLogicListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinearTimeLogicListener ) ((LinearTimeLogicListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinearTimeLogicVisitor ) return ((LinearTimeLogicVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_literal);
		try {
			setState(34);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(30); 
				vliteral();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(31); 
				fliteral();
				}
				break;
			case ATOM:
				enterOuterAlt(_localctx, 3);
				{
				setState(32); 
				atom();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 4);
				{
				setState(33); 
				negatom();
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

	public static class VliteralContext extends ParserRuleContext {
		public VliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vliteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinearTimeLogicListener ) ((LinearTimeLogicListener)listener).enterVliteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinearTimeLogicListener ) ((LinearTimeLogicListener)listener).exitVliteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinearTimeLogicVisitor ) return ((LinearTimeLogicVisitor<? extends T>)visitor).visitVliteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VliteralContext vliteral() throws RecognitionException {
		VliteralContext _localctx = new VliteralContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_vliteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36); 
			match(T__0);
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

	public static class FliteralContext extends ParserRuleContext {
		public FliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fliteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinearTimeLogicListener ) ((LinearTimeLogicListener)listener).enterFliteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinearTimeLogicListener ) ((LinearTimeLogicListener)listener).exitFliteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinearTimeLogicVisitor ) return ((LinearTimeLogicVisitor<? extends T>)visitor).visitFliteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FliteralContext fliteral() throws RecognitionException {
		FliteralContext _localctx = new FliteralContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fliteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38); 
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

	public static class NegatomContext extends ParserRuleContext {
		public TerminalNode ATOM() { return getToken(LinearTimeLogicParser.ATOM, 0); }
		public NegatomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negatom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinearTimeLogicListener ) ((LinearTimeLogicListener)listener).enterNegatom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinearTimeLogicListener ) ((LinearTimeLogicListener)listener).exitNegatom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinearTimeLogicVisitor ) return ((LinearTimeLogicVisitor<? extends T>)visitor).visitNegatom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NegatomContext negatom() throws RecognitionException {
		NegatomContext _localctx = new NegatomContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_negatom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40); 
			match(T__2);
			setState(41); 
			match(ATOM);
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

	public static class AtomContext extends ParserRuleContext {
		public TerminalNode ATOM() { return getToken(LinearTimeLogicParser.ATOM, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinearTimeLogicListener ) ((LinearTimeLogicListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinearTimeLogicListener ) ((LinearTimeLogicListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinearTimeLogicVisitor ) return ((LinearTimeLogicVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_atom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43); 
			match(ATOM);
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

	public static class OrformulaContext extends ParserRuleContext {
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public OrformulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orformula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinearTimeLogicListener ) ((LinearTimeLogicListener)listener).enterOrformula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinearTimeLogicListener ) ((LinearTimeLogicListener)listener).exitOrformula(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinearTimeLogicVisitor ) return ((LinearTimeLogicVisitor<? extends T>)visitor).visitOrformula(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrformulaContext orformula() throws RecognitionException {
		OrformulaContext _localctx = new OrformulaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_orformula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45); 
			match(T__3);
			setState(46); 
			formula();
			setState(47); 
			match(T__4);
			setState(48); 
			formula();
			setState(49); 
			match(T__5);
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

	public static class AndformulaContext extends ParserRuleContext {
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public AndformulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andformula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinearTimeLogicListener ) ((LinearTimeLogicListener)listener).enterAndformula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinearTimeLogicListener ) ((LinearTimeLogicListener)listener).exitAndformula(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinearTimeLogicVisitor ) return ((LinearTimeLogicVisitor<? extends T>)visitor).visitAndformula(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndformulaContext andformula() throws RecognitionException {
		AndformulaContext _localctx = new AndformulaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_andformula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51); 
			match(T__3);
			setState(52); 
			formula();
			setState(53); 
			match(T__6);
			setState(54); 
			formula();
			setState(55); 
			match(T__5);
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

	public static class XformulaContext extends ParserRuleContext {
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public XformulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xformula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinearTimeLogicListener ) ((LinearTimeLogicListener)listener).enterXformula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinearTimeLogicListener ) ((LinearTimeLogicListener)listener).exitXformula(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinearTimeLogicVisitor ) return ((LinearTimeLogicVisitor<? extends T>)visitor).visitXformula(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XformulaContext xformula() throws RecognitionException {
		XformulaContext _localctx = new XformulaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_xformula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57); 
			match(T__3);
			setState(58); 
			match(T__7);
			setState(59); 
			formula();
			setState(60); 
			match(T__5);
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

	public static class UformulaContext extends ParserRuleContext {
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public UformulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uformula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinearTimeLogicListener ) ((LinearTimeLogicListener)listener).enterUformula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinearTimeLogicListener ) ((LinearTimeLogicListener)listener).exitUformula(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinearTimeLogicVisitor ) return ((LinearTimeLogicVisitor<? extends T>)visitor).visitUformula(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UformulaContext uformula() throws RecognitionException {
		UformulaContext _localctx = new UformulaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_uformula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62); 
			match(T__3);
			setState(63); 
			formula();
			setState(64); 
			match(T__8);
			setState(65); 
			formula();
			setState(66); 
			match(T__5);
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

	public static class VformulaContext extends ParserRuleContext {
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public VformulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vformula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinearTimeLogicListener ) ((LinearTimeLogicListener)listener).enterVformula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinearTimeLogicListener ) ((LinearTimeLogicListener)listener).exitVformula(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinearTimeLogicVisitor ) return ((LinearTimeLogicVisitor<? extends T>)visitor).visitVformula(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VformulaContext vformula() throws RecognitionException {
		VformulaContext _localctx = new VformulaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_vformula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68); 
			match(T__3);
			setState(69); 
			formula();
			setState(70); 
			match(T__9);
			setState(71); 
			formula();
			setState(72); 
			match(T__5);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\16M\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\3\2\3\2\3\2\3\2\3\2\5\2\37\n\2\3\3\3\3\3\3\3\3\5\3%\n\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\2I\2\36\3\2\2\2"+
		"\4$\3\2\2\2\6&\3\2\2\2\b(\3\2\2\2\n*\3\2\2\2\f-\3\2\2\2\16/\3\2\2\2\20"+
		"\65\3\2\2\2\22;\3\2\2\2\24@\3\2\2\2\26F\3\2\2\2\30\37\5\20\t\2\31\37\5"+
		"\16\b\2\32\37\5\22\n\2\33\37\5\24\13\2\34\37\5\26\f\2\35\37\5\4\3\2\36"+
		"\30\3\2\2\2\36\31\3\2\2\2\36\32\3\2\2\2\36\33\3\2\2\2\36\34\3\2\2\2\36"+
		"\35\3\2\2\2\37\3\3\2\2\2 %\5\6\4\2!%\5\b\5\2\"%\5\f\7\2#%\5\n\6\2$ \3"+
		"\2\2\2$!\3\2\2\2$\"\3\2\2\2$#\3\2\2\2%\5\3\2\2\2&\'\7\3\2\2\'\7\3\2\2"+
		"\2()\7\4\2\2)\t\3\2\2\2*+\7\5\2\2+,\7\r\2\2,\13\3\2\2\2-.\7\r\2\2.\r\3"+
		"\2\2\2/\60\7\6\2\2\60\61\5\2\2\2\61\62\7\7\2\2\62\63\5\2\2\2\63\64\7\b"+
		"\2\2\64\17\3\2\2\2\65\66\7\6\2\2\66\67\5\2\2\2\678\7\t\2\289\5\2\2\29"+
		":\7\b\2\2:\21\3\2\2\2;<\7\6\2\2<=\7\n\2\2=>\5\2\2\2>?\7\b\2\2?\23\3\2"+
		"\2\2@A\7\6\2\2AB\5\2\2\2BC\7\13\2\2CD\5\2\2\2DE\7\b\2\2E\25\3\2\2\2FG"+
		"\7\6\2\2GH\5\2\2\2HI\7\f\2\2IJ\5\2\2\2JK\7\b\2\2K\27\3\2\2\2\4\36$";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}