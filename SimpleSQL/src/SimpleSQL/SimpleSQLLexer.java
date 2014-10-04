// Generated from SimpleSQL.g4 by ANTLR 4.4

    package SimpleSQL;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleSQLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__7=1, T__6=2, T__5=3, T__4=4, T__3=5, T__2=6, T__1=7, T__0=8, SELECT=9, 
		FROM=10, WHERE=11, AND=12, COMMA=13, STRING=14, IDENTIFIER=15, S=16;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'"
	};
	public static final String[] ruleNames = {
		"T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "SELECT", 
		"FROM", "WHERE", "AND", "COMMA", "STRING", "IDENTIFIER", "S"
	};


	public SimpleSQLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SimpleSQL.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\22\u008a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3"+
		"\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5"+
		"\nH\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5"+
		"\13V\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\5\fg\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\rr\n\r\3\16\3\16\3\17"+
		"\3\17\6\17x\n\17\r\17\16\17y\3\17\3\17\3\20\6\20\177\n\20\r\20\16\20\u0080"+
		"\3\21\3\21\3\21\3\21\6\21\u0087\n\21\r\21\16\21\u0088\2\2\22\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"\3\2\5\b\2\"\"//\62;C\\aac|\6\2\62;C\\aac|\4\2\f\f\17\17\u0096\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2\5&\3"+
		"\2\2\2\7(\3\2\2\2\t+\3\2\2\2\13-\3\2\2\2\r/\3\2\2\2\17\61\3\2\2\2\21\63"+
		"\3\2\2\2\23G\3\2\2\2\25U\3\2\2\2\27f\3\2\2\2\31q\3\2\2\2\33s\3\2\2\2\35"+
		"u\3\2\2\2\37~\3\2\2\2!\u0086\3\2\2\2#$\7>\2\2$%\7?\2\2%\4\3\2\2\2&\'\7"+
		",\2\2\'\6\3\2\2\2()\7@\2\2)*\7?\2\2*\b\3\2\2\2+,\7=\2\2,\n\3\2\2\2-.\7"+
		">\2\2.\f\3\2\2\2/\60\7?\2\2\60\16\3\2\2\2\61\62\7\60\2\2\62\20\3\2\2\2"+
		"\63\64\7@\2\2\64\22\3\2\2\2\65\66\7u\2\2\66\67\7g\2\2\678\7n\2\289\7g"+
		"\2\29:\7e\2\2:H\7v\2\2;<\7U\2\2<=\7g\2\2=>\7n\2\2>?\7g\2\2?@\7e\2\2@H"+
		"\7v\2\2AB\7U\2\2BC\7G\2\2CD\7N\2\2DE\7G\2\2EF\7E\2\2FH\7V\2\2G\65\3\2"+
		"\2\2G;\3\2\2\2GA\3\2\2\2H\24\3\2\2\2IJ\7h\2\2JK\7t\2\2KL\7q\2\2LV\7o\2"+
		"\2MN\7H\2\2NO\7t\2\2OP\7q\2\2PV\7o\2\2QR\7H\2\2RS\7T\2\2ST\7Q\2\2TV\7"+
		"O\2\2UI\3\2\2\2UM\3\2\2\2UQ\3\2\2\2V\26\3\2\2\2WX\7y\2\2XY\7j\2\2YZ\7"+
		"g\2\2Z[\7t\2\2[g\7g\2\2\\]\7Y\2\2]^\7j\2\2^_\7g\2\2_`\7t\2\2`g\7g\2\2"+
		"ab\7Y\2\2bc\7J\2\2cd\7G\2\2de\7T\2\2eg\7G\2\2fW\3\2\2\2f\\\3\2\2\2fa\3"+
		"\2\2\2g\30\3\2\2\2hi\7c\2\2ij\7p\2\2jr\7f\2\2kl\7C\2\2lm\7p\2\2mr\7f\2"+
		"\2no\7C\2\2op\7P\2\2pr\7F\2\2qh\3\2\2\2qk\3\2\2\2qn\3\2\2\2r\32\3\2\2"+
		"\2st\7.\2\2t\34\3\2\2\2uw\7$\2\2vx\t\2\2\2wv\3\2\2\2xy\3\2\2\2yw\3\2\2"+
		"\2yz\3\2\2\2z{\3\2\2\2{|\7$\2\2|\36\3\2\2\2}\177\t\3\2\2~}\3\2\2\2\177"+
		"\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081 \3\2\2\2\u0082"+
		"\u0087\7\"\2\2\u0083\u0084\7\17\2\2\u0084\u0087\7\f\2\2\u0085\u0087\t"+
		"\4\2\2\u0086\u0082\3\2\2\2\u0086\u0083\3\2\2\2\u0086\u0085\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\"\3\2\2\2"+
		"\13\2GUfqy\u0080\u0086\u0088\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}