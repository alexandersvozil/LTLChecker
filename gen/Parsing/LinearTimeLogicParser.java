// Generated from /home/alexander/Dropbox/LTLChecker/LTL/LinearTimeLogic.g4 by ANTLR 4.5
package Parsing;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LinearTimeLogicParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, ATOM=13, WS=14;
	public static final int
		RULE_formula = 0, RULE_literal = 1, RULE_vliteral = 2, RULE_fliteral = 3, 
		RULE_negatom = 4, RULE_atom = 5, RULE_negatedformula = 6, RULE_orformula = 7, 
		RULE_andformula = 8, RULE_xformula = 9, RULE_gformula = 10, RULE_fformula = 11, 
		RULE_uformula = 12, RULE_vformula = 13;
	public static final String[] ruleNames = {
		"formula", "literal", "vliteral", "fliteral", "negatom", "atom", "negatedformula", 
		"orformula", "andformula", "xformula", "gformula", "fformula", "uformula", 
		"vformula"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'VERUM'", "'FALSUM'", "'~'", "'('", "'|'", "')'", "'&'", "'X'", 
		"'G'", "'F'", "'U'", "'V'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "ATOM", "WS"
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
		public NegatedformulaContext negatedformula() {
			return getRuleContext(NegatedformulaContext.class,0);
		}
		public GformulaContext gformula() {
			return getRuleContext(GformulaContext.class,0);
		}
		public FformulaContext fformula() {
			return getRuleContext(FformulaContext.class,0);
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
			setState(37);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(28); 
				andformula();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(29); 
				orformula();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(30); 
				xformula();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(31); 
				uformula();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(32); 
				vformula();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(33); 
				literal();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(34); 
				negatedformula();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(35); 
				gformula();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(36); 
				fformula();
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
			setState(43);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(39); 
				vliteral();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(40); 
				fliteral();
				}
				break;
			case ATOM:
				enterOuterAlt(_localctx, 3);
				{
				setState(41); 
				atom();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 4);
				{
				setState(42); 
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
			setState(45); 
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
			setState(47); 
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
			setState(49); 
			match(T__2);
			setState(50); 
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
			setState(52); 
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

	public static class NegatedformulaContext extends ParserRuleContext {
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public NegatedformulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negatedformula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinearTimeLogicListener ) ((LinearTimeLogicListener)listener).enterNegatedformula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinearTimeLogicListener ) ((LinearTimeLogicListener)listener).exitNegatedformula(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinearTimeLogicVisitor ) return ((LinearTimeLogicVisitor<? extends T>)visitor).visitNegatedformula(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NegatedformulaContext negatedformula() throws RecognitionException {
		NegatedformulaContext _localctx = new NegatedformulaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_negatedformula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54); 
			match(T__2);
			setState(55); 
			formula();
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
		enterRule(_localctx, 14, RULE_orformula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57); 
			match(T__3);
			setState(58); 
			formula();
			setState(59); 
			match(T__4);
			setState(60); 
			formula();
			setState(61); 
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
		enterRule(_localctx, 16, RULE_andformula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63); 
			match(T__3);
			setState(64); 
			formula();
			setState(65); 
			match(T__6);
			setState(66); 
			formula();
			setState(67); 
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
		enterRule(_localctx, 18, RULE_xformula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69); 
			match(T__3);
			setState(70); 
			match(T__7);
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

	public static class GformulaContext extends ParserRuleContext {
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public GformulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gformula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinearTimeLogicListener ) ((LinearTimeLogicListener)listener).enterGformula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinearTimeLogicListener ) ((LinearTimeLogicListener)listener).exitGformula(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinearTimeLogicVisitor ) return ((LinearTimeLogicVisitor<? extends T>)visitor).visitGformula(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GformulaContext gformula() throws RecognitionException {
		GformulaContext _localctx = new GformulaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_gformula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74); 
			match(T__3);
			setState(75); 
			match(T__8);
			setState(76); 
			formula();
			setState(77); 
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

	public static class FformulaContext extends ParserRuleContext {
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public FformulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fformula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinearTimeLogicListener ) ((LinearTimeLogicListener)listener).enterFformula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinearTimeLogicListener ) ((LinearTimeLogicListener)listener).exitFformula(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinearTimeLogicVisitor ) return ((LinearTimeLogicVisitor<? extends T>)visitor).visitFformula(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FformulaContext fformula() throws RecognitionException {
		FformulaContext _localctx = new FformulaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_fformula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79); 
			match(T__3);
			setState(80); 
			match(T__9);
			setState(81); 
			formula();
			setState(82); 
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
		enterRule(_localctx, 24, RULE_uformula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84); 
			match(T__3);
			setState(85); 
			formula();
			setState(86); 
			match(T__10);
			setState(87); 
			formula();
			setState(88); 
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
		enterRule(_localctx, 26, RULE_vformula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90); 
			match(T__3);
			setState(91); 
			formula();
			setState(92); 
			match(T__11);
			setState(93); 
			formula();
			setState(94); 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\20c\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\5\2(\n\2\3\3\3\3\3\3\3\3\5\3.\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\2\2\20\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\2\2_\2\'\3\2\2\2\4-\3\2\2\2\6/\3\2\2\2\b\61\3"+
		"\2\2\2\n\63\3\2\2\2\f\66\3\2\2\2\168\3\2\2\2\20;\3\2\2\2\22A\3\2\2\2\24"+
		"G\3\2\2\2\26L\3\2\2\2\30Q\3\2\2\2\32V\3\2\2\2\34\\\3\2\2\2\36(\5\22\n"+
		"\2\37(\5\20\t\2 (\5\24\13\2!(\5\32\16\2\"(\5\34\17\2#(\5\4\3\2$(\5\16"+
		"\b\2%(\5\26\f\2&(\5\30\r\2\'\36\3\2\2\2\'\37\3\2\2\2\' \3\2\2\2\'!\3\2"+
		"\2\2\'\"\3\2\2\2\'#\3\2\2\2\'$\3\2\2\2\'%\3\2\2\2\'&\3\2\2\2(\3\3\2\2"+
		"\2).\5\6\4\2*.\5\b\5\2+.\5\f\7\2,.\5\n\6\2-)\3\2\2\2-*\3\2\2\2-+\3\2\2"+
		"\2-,\3\2\2\2.\5\3\2\2\2/\60\7\3\2\2\60\7\3\2\2\2\61\62\7\4\2\2\62\t\3"+
		"\2\2\2\63\64\7\5\2\2\64\65\7\17\2\2\65\13\3\2\2\2\66\67\7\17\2\2\67\r"+
		"\3\2\2\289\7\5\2\29:\5\2\2\2:\17\3\2\2\2;<\7\6\2\2<=\5\2\2\2=>\7\7\2\2"+
		">?\5\2\2\2?@\7\b\2\2@\21\3\2\2\2AB\7\6\2\2BC\5\2\2\2CD\7\t\2\2DE\5\2\2"+
		"\2EF\7\b\2\2F\23\3\2\2\2GH\7\6\2\2HI\7\n\2\2IJ\5\2\2\2JK\7\b\2\2K\25\3"+
		"\2\2\2LM\7\6\2\2MN\7\13\2\2NO\5\2\2\2OP\7\b\2\2P\27\3\2\2\2QR\7\6\2\2"+
		"RS\7\f\2\2ST\5\2\2\2TU\7\b\2\2U\31\3\2\2\2VW\7\6\2\2WX\5\2\2\2XY\7\r\2"+
		"\2YZ\5\2\2\2Z[\7\b\2\2[\33\3\2\2\2\\]\7\6\2\2]^\5\2\2\2^_\7\16\2\2_`\5"+
		"\2\2\2`a\7\b\2\2a\35\3\2\2\2\4\'-";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}