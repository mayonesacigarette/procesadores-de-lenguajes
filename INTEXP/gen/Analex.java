// Generated from D:/etsii/etsii 5/PL/LABORATORIO/INTEXP/src/Analex.g4 by ANTLR 4.13.2
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
		BLANCO=1, TABULADOR=2, FIN_LINEA=3, PC=4, PA=5, PYC=6, COMA=7, IGUAL=8, 
		MAS=9, MENOS=10, POR=11, DIV=12, VARIABLES=13, INSTRUCCIONES=14, IDENT=15, 
		NUM=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BLANCO", "TABULADOR", "FIN_LINEA", "PC", "PA", "PYC", "COMA", "IGUAL", 
			"MAS", "MENOS", "POR", "DIV", "VARIABLES", "INSTRUCCIONES", "DIGITO", 
			"LETRA", "IDENT", "NUM"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'\\t'", null, "')'", "'('", "';'", "','", "'='", "'+'", 
			"'-'", "'*'", "'/'", "'VARIABLES'", "'INSTRUCCIONES'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BLANCO", "TABULADOR", "FIN_LINEA", "PC", "PA", "PYC", "COMA", 
			"IGUAL", "MAS", "MENOS", "POR", "DIV", "VARIABLES", "INSTRUCCIONES", 
			"IDENT", "NUM"
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
		"\u0004\u0000\u0010o\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0003\u0002/\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0005\u0010f\b\u0010\n\u0010\f\u0010i\t\u0010\u0001\u0011\u0004\u0011"+
		"l\b\u0011\u000b\u0011\f\u0011m\u0000\u0000\u0012\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u0000\u001f\u0000!\u000f"+
		"#\u0010\u0001\u0000\u0002\u0001\u000009\u0002\u0000AZazp\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0001%\u0001\u0000\u0000\u0000\u0003)"+
		"\u0001\u0000\u0000\u0000\u0005.\u0001\u0000\u0000\u0000\u00074\u0001\u0000"+
		"\u0000\u0000\t6\u0001\u0000\u0000\u0000\u000b8\u0001\u0000\u0000\u0000"+
		"\r:\u0001\u0000\u0000\u0000\u000f<\u0001\u0000\u0000\u0000\u0011>\u0001"+
		"\u0000\u0000\u0000\u0013@\u0001\u0000\u0000\u0000\u0015B\u0001\u0000\u0000"+
		"\u0000\u0017D\u0001\u0000\u0000\u0000\u0019F\u0001\u0000\u0000\u0000\u001b"+
		"P\u0001\u0000\u0000\u0000\u001d^\u0001\u0000\u0000\u0000\u001f`\u0001"+
		"\u0000\u0000\u0000!b\u0001\u0000\u0000\u0000#k\u0001\u0000\u0000\u0000"+
		"%&\u0005 \u0000\u0000&\'\u0001\u0000\u0000\u0000\'(\u0006\u0000\u0000"+
		"\u0000(\u0002\u0001\u0000\u0000\u0000)*\u0005\t\u0000\u0000*+\u0001\u0000"+
		"\u0000\u0000+,\u0006\u0001\u0000\u0000,\u0004\u0001\u0000\u0000\u0000"+
		"-/\u0005\r\u0000\u0000.-\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000"+
		"/0\u0001\u0000\u0000\u000001\u0005\n\u0000\u000012\u0001\u0000\u0000\u0000"+
		"23\u0006\u0002\u0000\u00003\u0006\u0001\u0000\u0000\u000045\u0005)\u0000"+
		"\u00005\b\u0001\u0000\u0000\u000067\u0005(\u0000\u00007\n\u0001\u0000"+
		"\u0000\u000089\u0005;\u0000\u00009\f\u0001\u0000\u0000\u0000:;\u0005,"+
		"\u0000\u0000;\u000e\u0001\u0000\u0000\u0000<=\u0005=\u0000\u0000=\u0010"+
		"\u0001\u0000\u0000\u0000>?\u0005+\u0000\u0000?\u0012\u0001\u0000\u0000"+
		"\u0000@A\u0005-\u0000\u0000A\u0014\u0001\u0000\u0000\u0000BC\u0005*\u0000"+
		"\u0000C\u0016\u0001\u0000\u0000\u0000DE\u0005/\u0000\u0000E\u0018\u0001"+
		"\u0000\u0000\u0000FG\u0005V\u0000\u0000GH\u0005A\u0000\u0000HI\u0005R"+
		"\u0000\u0000IJ\u0005I\u0000\u0000JK\u0005A\u0000\u0000KL\u0005B\u0000"+
		"\u0000LM\u0005L\u0000\u0000MN\u0005E\u0000\u0000NO\u0005S\u0000\u0000"+
		"O\u001a\u0001\u0000\u0000\u0000PQ\u0005I\u0000\u0000QR\u0005N\u0000\u0000"+
		"RS\u0005S\u0000\u0000ST\u0005T\u0000\u0000TU\u0005R\u0000\u0000UV\u0005"+
		"U\u0000\u0000VW\u0005C\u0000\u0000WX\u0005C\u0000\u0000XY\u0005I\u0000"+
		"\u0000YZ\u0005O\u0000\u0000Z[\u0005N\u0000\u0000[\\\u0005E\u0000\u0000"+
		"\\]\u0005S\u0000\u0000]\u001c\u0001\u0000\u0000\u0000^_\u0007\u0000\u0000"+
		"\u0000_\u001e\u0001\u0000\u0000\u0000`a\u0007\u0001\u0000\u0000a \u0001"+
		"\u0000\u0000\u0000bg\u0003\u001f\u000f\u0000cf\u0003\u001f\u000f\u0000"+
		"df\u0003\u001d\u000e\u0000ec\u0001\u0000\u0000\u0000ed\u0001\u0000\u0000"+
		"\u0000fi\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000"+
		"\u0000\u0000h\"\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000jl\u0003"+
		"\u001d\u000e\u0000kj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000"+
		"mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000n$\u0001\u0000\u0000"+
		"\u0000\u0005\u0000.egm\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}