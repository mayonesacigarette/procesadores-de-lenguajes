// Generated from D:/etsii/etsii 5/PL/LABORATORIO/CALCPROG/src/Analex.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class Analex extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BLANCO=1, TABULADOR=2, FIN_LINEA=3, IDENT=4, NUM=5, PC=6, PA=7, PYC=8, 
		COMA=9, IGUAL=10, MAS=11, MENOS=12, POR=13, DIV=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BLANCO", "TABULADOR", "FIN_LINEA", "DIGITO", "LETRA", "IDENT", "NUM", 
			"PC", "PA", "PYC", "COMA", "IGUAL", "MAS", "MENOS", "POR", "DIV"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'\\t'", null, null, null, "')'", "'('", "';'", "','", "'='", 
			"'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BLANCO", "TABULADOR", "FIN_LINEA", "IDENT", "NUM", "PC", "PA", 
			"PYC", "COMA", "IGUAL", "MAS", "MENOS", "POR", "DIV"
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


	public Analex(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Analex.g4"; }

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
		"\u0004\u0000\u000eS\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0003\u0002+\b"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u00058\b\u0005\n\u0005\f\u0005;\t\u0005\u0001\u0006\u0004\u0006>\b\u0006"+
		"\u000b\u0006\f\u0006?\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t"+
		"\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0000\u0000"+
		"\u0010\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0000\t\u0000\u000b\u0004"+
		"\r\u0005\u000f\u0006\u0011\u0007\u0013\b\u0015\t\u0017\n\u0019\u000b\u001b"+
		"\f\u001d\r\u001f\u000e\u0001\u0000\u0002\u0001\u000009\u0002\u0000AZa"+
		"zT\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0001"+
		"!\u0001\u0000\u0000\u0000\u0003%\u0001\u0000\u0000\u0000\u0005*\u0001"+
		"\u0000\u0000\u0000\u00070\u0001\u0000\u0000\u0000\t2\u0001\u0000\u0000"+
		"\u0000\u000b4\u0001\u0000\u0000\u0000\r=\u0001\u0000\u0000\u0000\u000f"+
		"A\u0001\u0000\u0000\u0000\u0011C\u0001\u0000\u0000\u0000\u0013E\u0001"+
		"\u0000\u0000\u0000\u0015G\u0001\u0000\u0000\u0000\u0017I\u0001\u0000\u0000"+
		"\u0000\u0019K\u0001\u0000\u0000\u0000\u001bM\u0001\u0000\u0000\u0000\u001d"+
		"O\u0001\u0000\u0000\u0000\u001fQ\u0001\u0000\u0000\u0000!\"\u0005 \u0000"+
		"\u0000\"#\u0001\u0000\u0000\u0000#$\u0006\u0000\u0000\u0000$\u0002\u0001"+
		"\u0000\u0000\u0000%&\u0005\t\u0000\u0000&\'\u0001\u0000\u0000\u0000\'"+
		"(\u0006\u0001\u0000\u0000(\u0004\u0001\u0000\u0000\u0000)+\u0005\r\u0000"+
		"\u0000*)\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+,\u0001\u0000"+
		"\u0000\u0000,-\u0005\n\u0000\u0000-.\u0001\u0000\u0000\u0000./\u0006\u0002"+
		"\u0000\u0000/\u0006\u0001\u0000\u0000\u000001\u0007\u0000\u0000\u0000"+
		"1\b\u0001\u0000\u0000\u000023\u0007\u0001\u0000\u00003\n\u0001\u0000\u0000"+
		"\u000049\u0003\t\u0004\u000058\u0003\t\u0004\u000068\u0003\u0007\u0003"+
		"\u000075\u0001\u0000\u0000\u000076\u0001\u0000\u0000\u00008;\u0001\u0000"+
		"\u0000\u000097\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:\f\u0001"+
		"\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000<>\u0003\u0007\u0003\u0000"+
		"=<\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000"+
		"\u0000?@\u0001\u0000\u0000\u0000@\u000e\u0001\u0000\u0000\u0000AB\u0005"+
		")\u0000\u0000B\u0010\u0001\u0000\u0000\u0000CD\u0005(\u0000\u0000D\u0012"+
		"\u0001\u0000\u0000\u0000EF\u0005;\u0000\u0000F\u0014\u0001\u0000\u0000"+
		"\u0000GH\u0005,\u0000\u0000H\u0016\u0001\u0000\u0000\u0000IJ\u0005=\u0000"+
		"\u0000J\u0018\u0001\u0000\u0000\u0000KL\u0005+\u0000\u0000L\u001a\u0001"+
		"\u0000\u0000\u0000MN\u0005-\u0000\u0000N\u001c\u0001\u0000\u0000\u0000"+
		"OP\u0005*\u0000\u0000P\u001e\u0001\u0000\u0000\u0000QR\u0005/\u0000\u0000"+
		"R \u0001\u0000\u0000\u0000\u0005\u0000*79?\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}