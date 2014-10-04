// Generated from SimpleSQL.g4 by ANTLR 4.4

    package SimpleSQL;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleSQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__7=1, T__6=2, T__5=3, T__4=4, T__3=5, T__2=6, T__1=7, T__0=8, SELECT=9, 
		FROM=10, WHERE=11, AND=12, COMMA=13, STRING=14, IDENTIFIER=15, S=16;
	public static final String[] tokenNames = {
		"<INVALID>", "'<='", "'*'", "'>='", "';'", "'<'", "'='", "'.'", "'>'", 
		"SELECT", "FROM", "WHERE", "AND", "','", "STRING", "IDENTIFIER", "S"
	};
	public static final int
		RULE_statement = 0, RULE_projections = 1, RULE_projectionFragment = 2, 
		RULE_relations = 3, RULE_relationFragment = 4, RULE_selections = 5, RULE_selection = 6, 
		RULE_fieldComparison = 7, RULE_joinStatement = 8, RULE_fieldIdentifier = 9, 
		RULE_selectionFragment = 10, RULE_comparison = 11, RULE_qualifiedField = 12, 
		RULE_tablePrefix = 13, RULE_tableField = 14;
	public static final String[] ruleNames = {
		"statement", "projections", "projectionFragment", "relations", "relationFragment", 
		"selections", "selection", "fieldComparison", "joinStatement", "fieldIdentifier", 
		"selectionFragment", "comparison", "qualifiedField", "tablePrefix", "tableField"
	};

	@Override
	public String getGrammarFileName() { return "SimpleSQL.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpleSQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StatementContext extends ParserRuleContext {
		public TerminalNode S(int i) {
			return getToken(SimpleSQLParser.S, i);
		}
		public ProjectionsContext projections() {
			return getRuleContext(ProjectionsContext.class,0);
		}
		public SelectionsContext selections() {
			return getRuleContext(SelectionsContext.class,0);
		}
		public RelationsContext relations() {
			return getRuleContext(RelationsContext.class,0);
		}
		public List<TerminalNode> S() { return getTokens(SimpleSQLParser.S); }
		public TerminalNode WHERE() { return getToken(SimpleSQLParser.WHERE, 0); }
		public TerminalNode FROM() { return getToken(SimpleSQLParser.FROM, 0); }
		public TerminalNode SELECT() { return getToken(SimpleSQLParser.SELECT, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleSQLListener ) ((SimpleSQLListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleSQLListener ) ((SimpleSQLListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30); match(SELECT);
			setState(31); match(S);
			setState(32); projections();
			setState(33); match(S);
			setState(34); match(FROM);
			setState(35); match(S);
			setState(36); relations();
			setState(37); match(S);
			setState(41);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(38); match(WHERE);
				setState(39); match(S);
				setState(40); selections();
				}
			}

			setState(44);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(43); match(T__4);
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

	public static class ProjectionsContext extends ParserRuleContext {
		public TerminalNode S(int i) {
			return getToken(SimpleSQLParser.S, i);
		}
		public List<ProjectionFragmentContext> projectionFragment() {
			return getRuleContexts(ProjectionFragmentContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimpleSQLParser.COMMA); }
		public ProjectionFragmentContext projectionFragment(int i) {
			return getRuleContext(ProjectionFragmentContext.class,i);
		}
		public List<TerminalNode> S() { return getTokens(SimpleSQLParser.S); }
		public TerminalNode COMMA(int i) {
			return getToken(SimpleSQLParser.COMMA, i);
		}
		public ProjectionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projections; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleSQLListener ) ((SimpleSQLListener)listener).enterProjections(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleSQLListener ) ((SimpleSQLListener)listener).exitProjections(this);
		}
	}

	public final ProjectionsContext projections() throws RecognitionException {
		ProjectionsContext _localctx = new ProjectionsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_projections);
		int _la;
		try {
			int _alt;
			setState(61);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(46); match(T__6);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(47); projectionFragment();
				setState(58);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(49);
						_la = _input.LA(1);
						if (_la==S) {
							{
							setState(48); match(S);
							}
						}

						setState(51); match(COMMA);
						setState(53);
						_la = _input.LA(1);
						if (_la==S) {
							{
							setState(52); match(S);
							}
						}

						setState(55); projectionFragment();
						}
						} 
					}
					setState(60);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class ProjectionFragmentContext extends ParserRuleContext {
		public QualifiedFieldContext qualifiedField() {
			return getRuleContext(QualifiedFieldContext.class,0);
		}
		public ProjectionFragmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projectionFragment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleSQLListener ) ((SimpleSQLListener)listener).enterProjectionFragment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleSQLListener ) ((SimpleSQLListener)listener).exitProjectionFragment(this);
		}
	}

	public final ProjectionFragmentContext projectionFragment() throws RecognitionException {
		ProjectionFragmentContext _localctx = new ProjectionFragmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_projectionFragment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63); qualifiedField();
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

	public static class RelationsContext extends ParserRuleContext {
		public TerminalNode S(int i) {
			return getToken(SimpleSQLParser.S, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SimpleSQLParser.COMMA); }
		public List<TerminalNode> S() { return getTokens(SimpleSQLParser.S); }
		public RelationFragmentContext relationFragment(int i) {
			return getRuleContext(RelationFragmentContext.class,i);
		}
		public List<RelationFragmentContext> relationFragment() {
			return getRuleContexts(RelationFragmentContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(SimpleSQLParser.COMMA, i);
		}
		public RelationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleSQLListener ) ((SimpleSQLListener)listener).enterRelations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleSQLListener ) ((SimpleSQLListener)listener).exitRelations(this);
		}
	}

	public final RelationsContext relations() throws RecognitionException {
		RelationsContext _localctx = new RelationsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_relations);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(65); relationFragment();
			setState(76);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(67);
					_la = _input.LA(1);
					if (_la==S) {
						{
						setState(66); match(S);
						}
					}

					setState(69); match(COMMA);
					setState(71);
					_la = _input.LA(1);
					if (_la==S) {
						{
						setState(70); match(S);
						}
					}

					setState(73); relationFragment();
					}
					} 
				}
				setState(78);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class RelationFragmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SimpleSQLParser.IDENTIFIER, 0); }
		public RelationFragmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationFragment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleSQLListener ) ((SimpleSQLListener)listener).enterRelationFragment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleSQLListener ) ((SimpleSQLListener)listener).exitRelationFragment(this);
		}
	}

	public final RelationFragmentContext relationFragment() throws RecognitionException {
		RelationFragmentContext _localctx = new RelationFragmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_relationFragment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79); match(IDENTIFIER);
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

	public static class SelectionsContext extends ParserRuleContext {
		public TerminalNode S(int i) {
			return getToken(SimpleSQLParser.S, i);
		}
		public TerminalNode AND(int i) {
			return getToken(SimpleSQLParser.AND, i);
		}
		public List<SelectionContext> selection() {
			return getRuleContexts(SelectionContext.class);
		}
		public SelectionContext selection(int i) {
			return getRuleContext(SelectionContext.class,i);
		}
		public List<TerminalNode> S() { return getTokens(SimpleSQLParser.S); }
		public List<TerminalNode> AND() { return getTokens(SimpleSQLParser.AND); }
		public SelectionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selections; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleSQLListener ) ((SimpleSQLListener)listener).enterSelections(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleSQLListener ) ((SimpleSQLListener)listener).exitSelections(this);
		}
	}

	public final SelectionsContext selections() throws RecognitionException {
		SelectionsContext _localctx = new SelectionsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_selections);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81); selection();
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==S) {
				{
				{
				setState(82); match(S);
				setState(83); match(AND);
				setState(84); match(S);
				setState(85); selection();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class SelectionContext extends ParserRuleContext {
		public FieldComparisonContext fieldComparison() {
			return getRuleContext(FieldComparisonContext.class,0);
		}
		public JoinStatementContext joinStatement() {
			return getRuleContext(JoinStatementContext.class,0);
		}
		public SelectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleSQLListener ) ((SimpleSQLListener)listener).enterSelection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleSQLListener ) ((SimpleSQLListener)listener).exitSelection(this);
		}
	}

	public final SelectionContext selection() throws RecognitionException {
		SelectionContext _localctx = new SelectionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_selection);
		try {
			setState(93);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(91); fieldComparison();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(92); joinStatement();
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

	public static class FieldComparisonContext extends ParserRuleContext {
		public TerminalNode S(int i) {
			return getToken(SimpleSQLParser.S, i);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public List<TerminalNode> S() { return getTokens(SimpleSQLParser.S); }
		public FieldIdentifierContext fieldIdentifier() {
			return getRuleContext(FieldIdentifierContext.class,0);
		}
		public SelectionFragmentContext selectionFragment() {
			return getRuleContext(SelectionFragmentContext.class,0);
		}
		public FieldComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldComparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleSQLListener ) ((SimpleSQLListener)listener).enterFieldComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleSQLListener ) ((SimpleSQLListener)listener).exitFieldComparison(this);
		}
	}

	public final FieldComparisonContext fieldComparison() throws RecognitionException {
		FieldComparisonContext _localctx = new FieldComparisonContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_fieldComparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95); fieldIdentifier();
			setState(97);
			_la = _input.LA(1);
			if (_la==S) {
				{
				setState(96); match(S);
				}
			}

			setState(99); comparison();
			setState(101);
			_la = _input.LA(1);
			if (_la==S) {
				{
				setState(100); match(S);
				}
			}

			setState(103); selectionFragment();
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

	public static class JoinStatementContext extends ParserRuleContext {
		public TerminalNode S(int i) {
			return getToken(SimpleSQLParser.S, i);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public FieldIdentifierContext fieldIdentifier(int i) {
			return getRuleContext(FieldIdentifierContext.class,i);
		}
		public List<TerminalNode> S() { return getTokens(SimpleSQLParser.S); }
		public List<FieldIdentifierContext> fieldIdentifier() {
			return getRuleContexts(FieldIdentifierContext.class);
		}
		public JoinStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleSQLListener ) ((SimpleSQLListener)listener).enterJoinStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleSQLListener ) ((SimpleSQLListener)listener).exitJoinStatement(this);
		}
	}

	public final JoinStatementContext joinStatement() throws RecognitionException {
		JoinStatementContext _localctx = new JoinStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_joinStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105); fieldIdentifier();
			setState(107);
			_la = _input.LA(1);
			if (_la==S) {
				{
				setState(106); match(S);
				}
			}

			setState(109); comparison();
			setState(111);
			_la = _input.LA(1);
			if (_la==S) {
				{
				setState(110); match(S);
				}
			}

			setState(113); fieldIdentifier();
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

	public static class FieldIdentifierContext extends ParserRuleContext {
		public QualifiedFieldContext qualifiedField() {
			return getRuleContext(QualifiedFieldContext.class,0);
		}
		public FieldIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleSQLListener ) ((SimpleSQLListener)listener).enterFieldIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleSQLListener ) ((SimpleSQLListener)listener).exitFieldIdentifier(this);
		}
	}

	public final FieldIdentifierContext fieldIdentifier() throws RecognitionException {
		FieldIdentifierContext _localctx = new FieldIdentifierContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_fieldIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115); qualifiedField();
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

	public static class SelectionFragmentContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(SimpleSQLParser.STRING, 0); }
		public SelectionFragmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionFragment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleSQLListener ) ((SimpleSQLListener)listener).enterSelectionFragment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleSQLListener ) ((SimpleSQLListener)listener).exitSelectionFragment(this);
		}
	}

	public final SelectionFragmentContext selectionFragment() throws RecognitionException {
		SelectionFragmentContext _localctx = new SelectionFragmentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_selectionFragment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117); match(STRING);
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

	public static class ComparisonContext extends ParserRuleContext {
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleSQLListener ) ((SimpleSQLListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleSQLListener ) ((SimpleSQLListener)listener).exitComparison(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__5) | (1L << T__3) | (1L << T__2) | (1L << T__0))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class QualifiedFieldContext extends ParserRuleContext {
		public TablePrefixContext tablePrefix() {
			return getRuleContext(TablePrefixContext.class,0);
		}
		public TableFieldContext tableField() {
			return getRuleContext(TableFieldContext.class,0);
		}
		public QualifiedFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleSQLListener ) ((SimpleSQLListener)listener).enterQualifiedField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleSQLListener ) ((SimpleSQLListener)listener).exitQualifiedField(this);
		}
	}

	public final QualifiedFieldContext qualifiedField() throws RecognitionException {
		QualifiedFieldContext _localctx = new QualifiedFieldContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_qualifiedField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121); tablePrefix();
			setState(122); match(T__1);
			setState(123); tableField();
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

	public static class TablePrefixContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SimpleSQLParser.IDENTIFIER, 0); }
		public TablePrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePrefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleSQLListener ) ((SimpleSQLListener)listener).enterTablePrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleSQLListener ) ((SimpleSQLListener)listener).exitTablePrefix(this);
		}
	}

	public final TablePrefixContext tablePrefix() throws RecognitionException {
		TablePrefixContext _localctx = new TablePrefixContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tablePrefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125); match(IDENTIFIER);
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

	public static class TableFieldContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SimpleSQLParser.IDENTIFIER, 0); }
		public TableFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleSQLListener ) ((SimpleSQLListener)listener).enterTableField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleSQLListener ) ((SimpleSQLListener)listener).exitTableField(this);
		}
	}

	public final TableFieldContext tableField() throws RecognitionException {
		TableFieldContext _localctx = new TableFieldContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tableField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127); match(IDENTIFIER);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\22\u0084\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2,\n\2\3\2\5\2/\n\2\3\3\3\3\3\3\5\3\64\n"+
		"\3\3\3\3\3\5\38\n\3\3\3\7\3;\n\3\f\3\16\3>\13\3\5\3@\n\3\3\4\3\4\3\5\3"+
		"\5\5\5F\n\5\3\5\3\5\5\5J\n\5\3\5\7\5M\n\5\f\5\16\5P\13\5\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\7\7Y\n\7\f\7\16\7\\\13\7\3\b\3\b\5\b`\n\b\3\t\3\t\5\td"+
		"\n\t\3\t\3\t\5\th\n\t\3\t\3\t\3\n\3\n\5\nn\n\n\3\n\3\n\5\nr\n\n\3\n\3"+
		"\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3"+
		"\20\2\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\3\6\2\3\3\5\5\7\b"+
		"\n\n\u0083\2 \3\2\2\2\4?\3\2\2\2\6A\3\2\2\2\bC\3\2\2\2\nQ\3\2\2\2\fS\3"+
		"\2\2\2\16_\3\2\2\2\20a\3\2\2\2\22k\3\2\2\2\24u\3\2\2\2\26w\3\2\2\2\30"+
		"y\3\2\2\2\32{\3\2\2\2\34\177\3\2\2\2\36\u0081\3\2\2\2 !\7\13\2\2!\"\7"+
		"\22\2\2\"#\5\4\3\2#$\7\22\2\2$%\7\f\2\2%&\7\22\2\2&\'\5\b\5\2\'+\7\22"+
		"\2\2()\7\r\2\2)*\7\22\2\2*,\5\f\7\2+(\3\2\2\2+,\3\2\2\2,.\3\2\2\2-/\7"+
		"\6\2\2.-\3\2\2\2./\3\2\2\2/\3\3\2\2\2\60@\7\4\2\2\61<\5\6\4\2\62\64\7"+
		"\22\2\2\63\62\3\2\2\2\63\64\3\2\2\2\64\65\3\2\2\2\65\67\7\17\2\2\668\7"+
		"\22\2\2\67\66\3\2\2\2\678\3\2\2\289\3\2\2\29;\5\6\4\2:\63\3\2\2\2;>\3"+
		"\2\2\2<:\3\2\2\2<=\3\2\2\2=@\3\2\2\2><\3\2\2\2?\60\3\2\2\2?\61\3\2\2\2"+
		"@\5\3\2\2\2AB\5\32\16\2B\7\3\2\2\2CN\5\n\6\2DF\7\22\2\2ED\3\2\2\2EF\3"+
		"\2\2\2FG\3\2\2\2GI\7\17\2\2HJ\7\22\2\2IH\3\2\2\2IJ\3\2\2\2JK\3\2\2\2K"+
		"M\5\n\6\2LE\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\t\3\2\2\2PN\3\2\2\2"+
		"QR\7\21\2\2R\13\3\2\2\2SZ\5\16\b\2TU\7\22\2\2UV\7\16\2\2VW\7\22\2\2WY"+
		"\5\16\b\2XT\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\r\3\2\2\2\\Z\3\2\2"+
		"\2]`\5\20\t\2^`\5\22\n\2_]\3\2\2\2_^\3\2\2\2`\17\3\2\2\2ac\5\24\13\2b"+
		"d\7\22\2\2cb\3\2\2\2cd\3\2\2\2de\3\2\2\2eg\5\30\r\2fh\7\22\2\2gf\3\2\2"+
		"\2gh\3\2\2\2hi\3\2\2\2ij\5\26\f\2j\21\3\2\2\2km\5\24\13\2ln\7\22\2\2m"+
		"l\3\2\2\2mn\3\2\2\2no\3\2\2\2oq\5\30\r\2pr\7\22\2\2qp\3\2\2\2qr\3\2\2"+
		"\2rs\3\2\2\2st\5\24\13\2t\23\3\2\2\2uv\5\32\16\2v\25\3\2\2\2wx\7\20\2"+
		"\2x\27\3\2\2\2yz\t\2\2\2z\31\3\2\2\2{|\5\34\17\2|}\7\t\2\2}~\5\36\20\2"+
		"~\33\3\2\2\2\177\u0080\7\21\2\2\u0080\35\3\2\2\2\u0081\u0082\7\21\2\2"+
		"\u0082\37\3\2\2\2\21+.\63\67<?EINZ_cgmq";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}