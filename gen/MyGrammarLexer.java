// Generated from D:/Trabajos UN/2023-1/Lenguajes de programación/ProyectoLenguajes/grammar\MyGrammar.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MyGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, ID=83, ESP=84, NEWLINE=85;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
			"T__41", "T__42", "T__43", "T__44", "T__45", "T__46", "T__47", "T__48", 
			"T__49", "T__50", "T__51", "T__52", "T__53", "T__54", "T__55", "T__56", 
			"T__57", "T__58", "T__59", "T__60", "T__61", "T__62", "T__63", "T__64", 
			"T__65", "T__66", "T__67", "T__68", "T__69", "T__70", "T__71", "T__72", 
			"T__73", "T__74", "T__75", "T__76", "T__77", "T__78", "T__79", "T__80", 
			"T__81", "ID", "ESP", "NEWLINE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'hola'", "','", "'@'", "'def'", "':'", "'('", "')'", "'/'", "'*'", 
			"'**'", "';'", "'='", "'+='", "'-='", "'*='", "'@='", "'/='", "'%='", 
			"'&='", "'|='", "'^='", "'<<='", "'>>='", "'**='", "'//='", "'del'", 
			"'pass'", "'break'", "'continue'", "'return'", "'raise'", "'import'", 
			"'from'", "'.'", "'...'", "'as'", "'global'", "'nonlocal'", "'assert'", 
			"'if'", "'elif'", "'else'", "'while'", "'for'", "'in'", "'try'", "'finally'", 
			"'with'", "'except'", "'lambda'", "'or'", "'and'", "'not'", "'<'", "'>'", 
			"'=='", "'>='", "'<='", "'<>'", "'!='", "'is'", "'|'", "'^'", "'&'", 
			"'<<'", "'>>'", "'+'", "'-'", "'%'", "'//'", "'~'", "'['", "']'", "'{'", 
			"'}'", "'None'", "'True'", "'False'", "'class'", "':='", "'yield'", "'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "ID", 
			"ESP", "NEWLINE"
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


	public MyGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MyGrammar.g4"; }

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
		"\u0004\u0000U\u01f1\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u0007"+
		"5\u00026\u00076\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007"+
		":\u0002;\u0007;\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007"+
		"?\u0002@\u0007@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007"+
		"D\u0002E\u0007E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007"+
		"I\u0002J\u0007J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007"+
		"N\u0002O\u0007O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007"+
		"S\u0002T\u0007T\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001"+
		"\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001+\u0001+\u0001"+
		"+\u0001+\u0001,\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00011\u0001"+
		"1\u00011\u00011\u00011\u00011\u00011\u00012\u00012\u00012\u00013\u0001"+
		"3\u00013\u00013\u00014\u00014\u00014\u00014\u00015\u00015\u00016\u0001"+
		"6\u00017\u00017\u00017\u00018\u00018\u00018\u00019\u00019\u00019\u0001"+
		":\u0001:\u0001:\u0001;\u0001;\u0001;\u0001<\u0001<\u0001<\u0001=\u0001"+
		"=\u0001>\u0001>\u0001?\u0001?\u0001@\u0001@\u0001@\u0001A\u0001A\u0001"+
		"A\u0001B\u0001B\u0001C\u0001C\u0001D\u0001D\u0001E\u0001E\u0001E\u0001"+
		"F\u0001F\u0001G\u0001G\u0001H\u0001H\u0001I\u0001I\u0001J\u0001J\u0001"+
		"K\u0001K\u0001K\u0001K\u0001K\u0001L\u0001L\u0001L\u0001L\u0001L\u0001"+
		"M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001N\u0001N\u0001N\u0001N\u0001"+
		"N\u0001N\u0001O\u0001O\u0001O\u0001P\u0001P\u0001P\u0001P\u0001P\u0001"+
		"P\u0001Q\u0001Q\u0001Q\u0001R\u0004R\u01e2\bR\u000bR\fR\u01e3\u0001S\u0004"+
		"S\u01e7\bS\u000bS\fS\u01e8\u0001S\u0001S\u0001T\u0003T\u01ee\bT\u0001"+
		"T\u0001T\u0000\u0000U\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'"+
		"\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d"+
		";\u001e=\u001f? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_0a1c2e3g4i5k6m7o8q9s"+
		":u;w<y={>}?\u007f@\u0081A\u0083B\u0085C\u0087D\u0089E\u008bF\u008dG\u008f"+
		"H\u0091I\u0093J\u0095K\u0097L\u0099M\u009bN\u009dO\u009fP\u00a1Q\u00a3"+
		"R\u00a5S\u00a7T\u00a9U\u0001\u0000\u0002\u0002\u0000AZaz\u0003\u0000\t"+
		"\n\r\r  \u01f3\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u0000"+
		"3\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001"+
		"\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000"+
		"\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000"+
		"A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000E\u0001"+
		"\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000I\u0001\u0000\u0000"+
		"\u0000\u0000K\u0001\u0000\u0000\u0000\u0000M\u0001\u0000\u0000\u0000\u0000"+
		"O\u0001\u0000\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000\u0000S\u0001"+
		"\u0000\u0000\u0000\u0000U\u0001\u0000\u0000\u0000\u0000W\u0001\u0000\u0000"+
		"\u0000\u0000Y\u0001\u0000\u0000\u0000\u0000[\u0001\u0000\u0000\u0000\u0000"+
		"]\u0001\u0000\u0000\u0000\u0000_\u0001\u0000\u0000\u0000\u0000a\u0001"+
		"\u0000\u0000\u0000\u0000c\u0001\u0000\u0000\u0000\u0000e\u0001\u0000\u0000"+
		"\u0000\u0000g\u0001\u0000\u0000\u0000\u0000i\u0001\u0000\u0000\u0000\u0000"+
		"k\u0001\u0000\u0000\u0000\u0000m\u0001\u0000\u0000\u0000\u0000o\u0001"+
		"\u0000\u0000\u0000\u0000q\u0001\u0000\u0000\u0000\u0000s\u0001\u0000\u0000"+
		"\u0000\u0000u\u0001\u0000\u0000\u0000\u0000w\u0001\u0000\u0000\u0000\u0000"+
		"y\u0001\u0000\u0000\u0000\u0000{\u0001\u0000\u0000\u0000\u0000}\u0001"+
		"\u0000\u0000\u0000\u0000\u007f\u0001\u0000\u0000\u0000\u0000\u0081\u0001"+
		"\u0000\u0000\u0000\u0000\u0083\u0001\u0000\u0000\u0000\u0000\u0085\u0001"+
		"\u0000\u0000\u0000\u0000\u0087\u0001\u0000\u0000\u0000\u0000\u0089\u0001"+
		"\u0000\u0000\u0000\u0000\u008b\u0001\u0000\u0000\u0000\u0000\u008d\u0001"+
		"\u0000\u0000\u0000\u0000\u008f\u0001\u0000\u0000\u0000\u0000\u0091\u0001"+
		"\u0000\u0000\u0000\u0000\u0093\u0001\u0000\u0000\u0000\u0000\u0095\u0001"+
		"\u0000\u0000\u0000\u0000\u0097\u0001\u0000\u0000\u0000\u0000\u0099\u0001"+
		"\u0000\u0000\u0000\u0000\u009b\u0001\u0000\u0000\u0000\u0000\u009d\u0001"+
		"\u0000\u0000\u0000\u0000\u009f\u0001\u0000\u0000\u0000\u0000\u00a1\u0001"+
		"\u0000\u0000\u0000\u0000\u00a3\u0001\u0000\u0000\u0000\u0000\u00a5\u0001"+
		"\u0000\u0000\u0000\u0000\u00a7\u0001\u0000\u0000\u0000\u0000\u00a9\u0001"+
		"\u0000\u0000\u0000\u0001\u00ab\u0001\u0000\u0000\u0000\u0003\u00b0\u0001"+
		"\u0000\u0000\u0000\u0005\u00b2\u0001\u0000\u0000\u0000\u0007\u00b4\u0001"+
		"\u0000\u0000\u0000\t\u00b8\u0001\u0000\u0000\u0000\u000b\u00ba\u0001\u0000"+
		"\u0000\u0000\r\u00bc\u0001\u0000\u0000\u0000\u000f\u00be\u0001\u0000\u0000"+
		"\u0000\u0011\u00c0\u0001\u0000\u0000\u0000\u0013\u00c2\u0001\u0000\u0000"+
		"\u0000\u0015\u00c5\u0001\u0000\u0000\u0000\u0017\u00c7\u0001\u0000\u0000"+
		"\u0000\u0019\u00c9\u0001\u0000\u0000\u0000\u001b\u00cc\u0001\u0000\u0000"+
		"\u0000\u001d\u00cf\u0001\u0000\u0000\u0000\u001f\u00d2\u0001\u0000\u0000"+
		"\u0000!\u00d5\u0001\u0000\u0000\u0000#\u00d8\u0001\u0000\u0000\u0000%"+
		"\u00db\u0001\u0000\u0000\u0000\'\u00de\u0001\u0000\u0000\u0000)\u00e1"+
		"\u0001\u0000\u0000\u0000+\u00e4\u0001\u0000\u0000\u0000-\u00e8\u0001\u0000"+
		"\u0000\u0000/\u00ec\u0001\u0000\u0000\u00001\u00f0\u0001\u0000\u0000\u0000"+
		"3\u00f4\u0001\u0000\u0000\u00005\u00f8\u0001\u0000\u0000\u00007\u00fd"+
		"\u0001\u0000\u0000\u00009\u0103\u0001\u0000\u0000\u0000;\u010c\u0001\u0000"+
		"\u0000\u0000=\u0113\u0001\u0000\u0000\u0000?\u0119\u0001\u0000\u0000\u0000"+
		"A\u0120\u0001\u0000\u0000\u0000C\u0125\u0001\u0000\u0000\u0000E\u0127"+
		"\u0001\u0000\u0000\u0000G\u012b\u0001\u0000\u0000\u0000I\u012e\u0001\u0000"+
		"\u0000\u0000K\u0135\u0001\u0000\u0000\u0000M\u013e\u0001\u0000\u0000\u0000"+
		"O\u0145\u0001\u0000\u0000\u0000Q\u0148\u0001\u0000\u0000\u0000S\u014d"+
		"\u0001\u0000\u0000\u0000U\u0152\u0001\u0000\u0000\u0000W\u0158\u0001\u0000"+
		"\u0000\u0000Y\u015c\u0001\u0000\u0000\u0000[\u015f\u0001\u0000\u0000\u0000"+
		"]\u0163\u0001\u0000\u0000\u0000_\u016b\u0001\u0000\u0000\u0000a\u0170"+
		"\u0001\u0000\u0000\u0000c\u0177\u0001\u0000\u0000\u0000e\u017e\u0001\u0000"+
		"\u0000\u0000g\u0181\u0001\u0000\u0000\u0000i\u0185\u0001\u0000\u0000\u0000"+
		"k\u0189\u0001\u0000\u0000\u0000m\u018b\u0001\u0000\u0000\u0000o\u018d"+
		"\u0001\u0000\u0000\u0000q\u0190\u0001\u0000\u0000\u0000s\u0193\u0001\u0000"+
		"\u0000\u0000u\u0196\u0001\u0000\u0000\u0000w\u0199\u0001\u0000\u0000\u0000"+
		"y\u019c\u0001\u0000\u0000\u0000{\u019f\u0001\u0000\u0000\u0000}\u01a1"+
		"\u0001\u0000\u0000\u0000\u007f\u01a3\u0001\u0000\u0000\u0000\u0081\u01a5"+
		"\u0001\u0000\u0000\u0000\u0083\u01a8\u0001\u0000\u0000\u0000\u0085\u01ab"+
		"\u0001\u0000\u0000\u0000\u0087\u01ad\u0001\u0000\u0000\u0000\u0089\u01af"+
		"\u0001\u0000\u0000\u0000\u008b\u01b1\u0001\u0000\u0000\u0000\u008d\u01b4"+
		"\u0001\u0000\u0000\u0000\u008f\u01b6\u0001\u0000\u0000\u0000\u0091\u01b8"+
		"\u0001\u0000\u0000\u0000\u0093\u01ba\u0001\u0000\u0000\u0000\u0095\u01bc"+
		"\u0001\u0000\u0000\u0000\u0097\u01be\u0001\u0000\u0000\u0000\u0099\u01c3"+
		"\u0001\u0000\u0000\u0000\u009b\u01c8\u0001\u0000\u0000\u0000\u009d\u01ce"+
		"\u0001\u0000\u0000\u0000\u009f\u01d4\u0001\u0000\u0000\u0000\u00a1\u01d7"+
		"\u0001\u0000\u0000\u0000\u00a3\u01dd\u0001\u0000\u0000\u0000\u00a5\u01e1"+
		"\u0001\u0000\u0000\u0000\u00a7\u01e6\u0001\u0000\u0000\u0000\u00a9\u01ed"+
		"\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005h\u0000\u0000\u00ac\u00ad\u0005"+
		"o\u0000\u0000\u00ad\u00ae\u0005l\u0000\u0000\u00ae\u00af\u0005a\u0000"+
		"\u0000\u00af\u0002\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005,\u0000\u0000"+
		"\u00b1\u0004\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005@\u0000\u0000\u00b3"+
		"\u0006\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005d\u0000\u0000\u00b5\u00b6"+
		"\u0005e\u0000\u0000\u00b6\u00b7\u0005f\u0000\u0000\u00b7\b\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b9\u0005:\u0000\u0000\u00b9\n\u0001\u0000\u0000"+
		"\u0000\u00ba\u00bb\u0005(\u0000\u0000\u00bb\f\u0001\u0000\u0000\u0000"+
		"\u00bc\u00bd\u0005)\u0000\u0000\u00bd\u000e\u0001\u0000\u0000\u0000\u00be"+
		"\u00bf\u0005/\u0000\u0000\u00bf\u0010\u0001\u0000\u0000\u0000\u00c0\u00c1"+
		"\u0005*\u0000\u0000\u00c1\u0012\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005"+
		"*\u0000\u0000\u00c3\u00c4\u0005*\u0000\u0000\u00c4\u0014\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c6\u0005;\u0000\u0000\u00c6\u0016\u0001\u0000\u0000\u0000"+
		"\u00c7\u00c8\u0005=\u0000\u0000\u00c8\u0018\u0001\u0000\u0000\u0000\u00c9"+
		"\u00ca\u0005+\u0000\u0000\u00ca\u00cb\u0005=\u0000\u0000\u00cb\u001a\u0001"+
		"\u0000\u0000\u0000\u00cc\u00cd\u0005-\u0000\u0000\u00cd\u00ce\u0005=\u0000"+
		"\u0000\u00ce\u001c\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005*\u0000\u0000"+
		"\u00d0\u00d1\u0005=\u0000\u0000\u00d1\u001e\u0001\u0000\u0000\u0000\u00d2"+
		"\u00d3\u0005@\u0000\u0000\u00d3\u00d4\u0005=\u0000\u0000\u00d4 \u0001"+
		"\u0000\u0000\u0000\u00d5\u00d6\u0005/\u0000\u0000\u00d6\u00d7\u0005=\u0000"+
		"\u0000\u00d7\"\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005%\u0000\u0000"+
		"\u00d9\u00da\u0005=\u0000\u0000\u00da$\u0001\u0000\u0000\u0000\u00db\u00dc"+
		"\u0005&\u0000\u0000\u00dc\u00dd\u0005=\u0000\u0000\u00dd&\u0001\u0000"+
		"\u0000\u0000\u00de\u00df\u0005|\u0000\u0000\u00df\u00e0\u0005=\u0000\u0000"+
		"\u00e0(\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005^\u0000\u0000\u00e2\u00e3"+
		"\u0005=\u0000\u0000\u00e3*\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005<"+
		"\u0000\u0000\u00e5\u00e6\u0005<\u0000\u0000\u00e6\u00e7\u0005=\u0000\u0000"+
		"\u00e7,\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005>\u0000\u0000\u00e9\u00ea"+
		"\u0005>\u0000\u0000\u00ea\u00eb\u0005=\u0000\u0000\u00eb.\u0001\u0000"+
		"\u0000\u0000\u00ec\u00ed\u0005*\u0000\u0000\u00ed\u00ee\u0005*\u0000\u0000"+
		"\u00ee\u00ef\u0005=\u0000\u0000\u00ef0\u0001\u0000\u0000\u0000\u00f0\u00f1"+
		"\u0005/\u0000\u0000\u00f1\u00f2\u0005/\u0000\u0000\u00f2\u00f3\u0005="+
		"\u0000\u0000\u00f32\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005d\u0000\u0000"+
		"\u00f5\u00f6\u0005e\u0000\u0000\u00f6\u00f7\u0005l\u0000\u0000\u00f74"+
		"\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005p\u0000\u0000\u00f9\u00fa\u0005"+
		"a\u0000\u0000\u00fa\u00fb\u0005s\u0000\u0000\u00fb\u00fc\u0005s\u0000"+
		"\u0000\u00fc6\u0001\u0000\u0000\u0000\u00fd\u00fe\u0005b\u0000\u0000\u00fe"+
		"\u00ff\u0005r\u0000\u0000\u00ff\u0100\u0005e\u0000\u0000\u0100\u0101\u0005"+
		"a\u0000\u0000\u0101\u0102\u0005k\u0000\u0000\u01028\u0001\u0000\u0000"+
		"\u0000\u0103\u0104\u0005c\u0000\u0000\u0104\u0105\u0005o\u0000\u0000\u0105"+
		"\u0106\u0005n\u0000\u0000\u0106\u0107\u0005t\u0000\u0000\u0107\u0108\u0005"+
		"i\u0000\u0000\u0108\u0109\u0005n\u0000\u0000\u0109\u010a\u0005u\u0000"+
		"\u0000\u010a\u010b\u0005e\u0000\u0000\u010b:\u0001\u0000\u0000\u0000\u010c"+
		"\u010d\u0005r\u0000\u0000\u010d\u010e\u0005e\u0000\u0000\u010e\u010f\u0005"+
		"t\u0000\u0000\u010f\u0110\u0005u\u0000\u0000\u0110\u0111\u0005r\u0000"+
		"\u0000\u0111\u0112\u0005n\u0000\u0000\u0112<\u0001\u0000\u0000\u0000\u0113"+
		"\u0114\u0005r\u0000\u0000\u0114\u0115\u0005a\u0000\u0000\u0115\u0116\u0005"+
		"i\u0000\u0000\u0116\u0117\u0005s\u0000\u0000\u0117\u0118\u0005e\u0000"+
		"\u0000\u0118>\u0001\u0000\u0000\u0000\u0119\u011a\u0005i\u0000\u0000\u011a"+
		"\u011b\u0005m\u0000\u0000\u011b\u011c\u0005p\u0000\u0000\u011c\u011d\u0005"+
		"o\u0000\u0000\u011d\u011e\u0005r\u0000\u0000\u011e\u011f\u0005t\u0000"+
		"\u0000\u011f@\u0001\u0000\u0000\u0000\u0120\u0121\u0005f\u0000\u0000\u0121"+
		"\u0122\u0005r\u0000\u0000\u0122\u0123\u0005o\u0000\u0000\u0123\u0124\u0005"+
		"m\u0000\u0000\u0124B\u0001\u0000\u0000\u0000\u0125\u0126\u0005.\u0000"+
		"\u0000\u0126D\u0001\u0000\u0000\u0000\u0127\u0128\u0005.\u0000\u0000\u0128"+
		"\u0129\u0005.\u0000\u0000\u0129\u012a\u0005.\u0000\u0000\u012aF\u0001"+
		"\u0000\u0000\u0000\u012b\u012c\u0005a\u0000\u0000\u012c\u012d\u0005s\u0000"+
		"\u0000\u012dH\u0001\u0000\u0000\u0000\u012e\u012f\u0005g\u0000\u0000\u012f"+
		"\u0130\u0005l\u0000\u0000\u0130\u0131\u0005o\u0000\u0000\u0131\u0132\u0005"+
		"b\u0000\u0000\u0132\u0133\u0005a\u0000\u0000\u0133\u0134\u0005l\u0000"+
		"\u0000\u0134J\u0001\u0000\u0000\u0000\u0135\u0136\u0005n\u0000\u0000\u0136"+
		"\u0137\u0005o\u0000\u0000\u0137\u0138\u0005n\u0000\u0000\u0138\u0139\u0005"+
		"l\u0000\u0000\u0139\u013a\u0005o\u0000\u0000\u013a\u013b\u0005c\u0000"+
		"\u0000\u013b\u013c\u0005a\u0000\u0000\u013c\u013d\u0005l\u0000\u0000\u013d"+
		"L\u0001\u0000\u0000\u0000\u013e\u013f\u0005a\u0000\u0000\u013f\u0140\u0005"+
		"s\u0000\u0000\u0140\u0141\u0005s\u0000\u0000\u0141\u0142\u0005e\u0000"+
		"\u0000\u0142\u0143\u0005r\u0000\u0000\u0143\u0144\u0005t\u0000\u0000\u0144"+
		"N\u0001\u0000\u0000\u0000\u0145\u0146\u0005i\u0000\u0000\u0146\u0147\u0005"+
		"f\u0000\u0000\u0147P\u0001\u0000\u0000\u0000\u0148\u0149\u0005e\u0000"+
		"\u0000\u0149\u014a\u0005l\u0000\u0000\u014a\u014b\u0005i\u0000\u0000\u014b"+
		"\u014c\u0005f\u0000\u0000\u014cR\u0001\u0000\u0000\u0000\u014d\u014e\u0005"+
		"e\u0000\u0000\u014e\u014f\u0005l\u0000\u0000\u014f\u0150\u0005s\u0000"+
		"\u0000\u0150\u0151\u0005e\u0000\u0000\u0151T\u0001\u0000\u0000\u0000\u0152"+
		"\u0153\u0005w\u0000\u0000\u0153\u0154\u0005h\u0000\u0000\u0154\u0155\u0005"+
		"i\u0000\u0000\u0155\u0156\u0005l\u0000\u0000\u0156\u0157\u0005e\u0000"+
		"\u0000\u0157V\u0001\u0000\u0000\u0000\u0158\u0159\u0005f\u0000\u0000\u0159"+
		"\u015a\u0005o\u0000\u0000\u015a\u015b\u0005r\u0000\u0000\u015bX\u0001"+
		"\u0000\u0000\u0000\u015c\u015d\u0005i\u0000\u0000\u015d\u015e\u0005n\u0000"+
		"\u0000\u015eZ\u0001\u0000\u0000\u0000\u015f\u0160\u0005t\u0000\u0000\u0160"+
		"\u0161\u0005r\u0000\u0000\u0161\u0162\u0005y\u0000\u0000\u0162\\\u0001"+
		"\u0000\u0000\u0000\u0163\u0164\u0005f\u0000\u0000\u0164\u0165\u0005i\u0000"+
		"\u0000\u0165\u0166\u0005n\u0000\u0000\u0166\u0167\u0005a\u0000\u0000\u0167"+
		"\u0168\u0005l\u0000\u0000\u0168\u0169\u0005l\u0000\u0000\u0169\u016a\u0005"+
		"y\u0000\u0000\u016a^\u0001\u0000\u0000\u0000\u016b\u016c\u0005w\u0000"+
		"\u0000\u016c\u016d\u0005i\u0000\u0000\u016d\u016e\u0005t\u0000\u0000\u016e"+
		"\u016f\u0005h\u0000\u0000\u016f`\u0001\u0000\u0000\u0000\u0170\u0171\u0005"+
		"e\u0000\u0000\u0171\u0172\u0005x\u0000\u0000\u0172\u0173\u0005c\u0000"+
		"\u0000\u0173\u0174\u0005e\u0000\u0000\u0174\u0175\u0005p\u0000\u0000\u0175"+
		"\u0176\u0005t\u0000\u0000\u0176b\u0001\u0000\u0000\u0000\u0177\u0178\u0005"+
		"l\u0000\u0000\u0178\u0179\u0005a\u0000\u0000\u0179\u017a\u0005m\u0000"+
		"\u0000\u017a\u017b\u0005b\u0000\u0000\u017b\u017c\u0005d\u0000\u0000\u017c"+
		"\u017d\u0005a\u0000\u0000\u017dd\u0001\u0000\u0000\u0000\u017e\u017f\u0005"+
		"o\u0000\u0000\u017f\u0180\u0005r\u0000\u0000\u0180f\u0001\u0000\u0000"+
		"\u0000\u0181\u0182\u0005a\u0000\u0000\u0182\u0183\u0005n\u0000\u0000\u0183"+
		"\u0184\u0005d\u0000\u0000\u0184h\u0001\u0000\u0000\u0000\u0185\u0186\u0005"+
		"n\u0000\u0000\u0186\u0187\u0005o\u0000\u0000\u0187\u0188\u0005t\u0000"+
		"\u0000\u0188j\u0001\u0000\u0000\u0000\u0189\u018a\u0005<\u0000\u0000\u018a"+
		"l\u0001\u0000\u0000\u0000\u018b\u018c\u0005>\u0000\u0000\u018cn\u0001"+
		"\u0000\u0000\u0000\u018d\u018e\u0005=\u0000\u0000\u018e\u018f\u0005=\u0000"+
		"\u0000\u018fp\u0001\u0000\u0000\u0000\u0190\u0191\u0005>\u0000\u0000\u0191"+
		"\u0192\u0005=\u0000\u0000\u0192r\u0001\u0000\u0000\u0000\u0193\u0194\u0005"+
		"<\u0000\u0000\u0194\u0195\u0005=\u0000\u0000\u0195t\u0001\u0000\u0000"+
		"\u0000\u0196\u0197\u0005<\u0000\u0000\u0197\u0198\u0005>\u0000\u0000\u0198"+
		"v\u0001\u0000\u0000\u0000\u0199\u019a\u0005!\u0000\u0000\u019a\u019b\u0005"+
		"=\u0000\u0000\u019bx\u0001\u0000\u0000\u0000\u019c\u019d\u0005i\u0000"+
		"\u0000\u019d\u019e\u0005s\u0000\u0000\u019ez\u0001\u0000\u0000\u0000\u019f"+
		"\u01a0\u0005|\u0000\u0000\u01a0|\u0001\u0000\u0000\u0000\u01a1\u01a2\u0005"+
		"^\u0000\u0000\u01a2~\u0001\u0000\u0000\u0000\u01a3\u01a4\u0005&\u0000"+
		"\u0000\u01a4\u0080\u0001\u0000\u0000\u0000\u01a5\u01a6\u0005<\u0000\u0000"+
		"\u01a6\u01a7\u0005<\u0000\u0000\u01a7\u0082\u0001\u0000\u0000\u0000\u01a8"+
		"\u01a9\u0005>\u0000\u0000\u01a9\u01aa\u0005>\u0000\u0000\u01aa\u0084\u0001"+
		"\u0000\u0000\u0000\u01ab\u01ac\u0005+\u0000\u0000\u01ac\u0086\u0001\u0000"+
		"\u0000\u0000\u01ad\u01ae\u0005-\u0000\u0000\u01ae\u0088\u0001\u0000\u0000"+
		"\u0000\u01af\u01b0\u0005%\u0000\u0000\u01b0\u008a\u0001\u0000\u0000\u0000"+
		"\u01b1\u01b2\u0005/\u0000\u0000\u01b2\u01b3\u0005/\u0000\u0000\u01b3\u008c"+
		"\u0001\u0000\u0000\u0000\u01b4\u01b5\u0005~\u0000\u0000\u01b5\u008e\u0001"+
		"\u0000\u0000\u0000\u01b6\u01b7\u0005[\u0000\u0000\u01b7\u0090\u0001\u0000"+
		"\u0000\u0000\u01b8\u01b9\u0005]\u0000\u0000\u01b9\u0092\u0001\u0000\u0000"+
		"\u0000\u01ba\u01bb\u0005{\u0000\u0000\u01bb\u0094\u0001\u0000\u0000\u0000"+
		"\u01bc\u01bd\u0005}\u0000\u0000\u01bd\u0096\u0001\u0000\u0000\u0000\u01be"+
		"\u01bf\u0005N\u0000\u0000\u01bf\u01c0\u0005o\u0000\u0000\u01c0\u01c1\u0005"+
		"n\u0000\u0000\u01c1\u01c2\u0005e\u0000\u0000\u01c2\u0098\u0001\u0000\u0000"+
		"\u0000\u01c3\u01c4\u0005T\u0000\u0000\u01c4\u01c5\u0005r\u0000\u0000\u01c5"+
		"\u01c6\u0005u\u0000\u0000\u01c6\u01c7\u0005e\u0000\u0000\u01c7\u009a\u0001"+
		"\u0000\u0000\u0000\u01c8\u01c9\u0005F\u0000\u0000\u01c9\u01ca\u0005a\u0000"+
		"\u0000\u01ca\u01cb\u0005l\u0000\u0000\u01cb\u01cc\u0005s\u0000\u0000\u01cc"+
		"\u01cd\u0005e\u0000\u0000\u01cd\u009c\u0001\u0000\u0000\u0000\u01ce\u01cf"+
		"\u0005c\u0000\u0000\u01cf\u01d0\u0005l\u0000\u0000\u01d0\u01d1\u0005a"+
		"\u0000\u0000\u01d1\u01d2\u0005s\u0000\u0000\u01d2\u01d3\u0005s\u0000\u0000"+
		"\u01d3\u009e\u0001\u0000\u0000\u0000\u01d4\u01d5\u0005:\u0000\u0000\u01d5"+
		"\u01d6\u0005=\u0000\u0000\u01d6\u00a0\u0001\u0000\u0000\u0000\u01d7\u01d8"+
		"\u0005y\u0000\u0000\u01d8\u01d9\u0005i\u0000\u0000\u01d9\u01da\u0005e"+
		"\u0000\u0000\u01da\u01db\u0005l\u0000\u0000\u01db\u01dc\u0005d\u0000\u0000"+
		"\u01dc\u00a2\u0001\u0000\u0000\u0000\u01dd\u01de\u0005-\u0000\u0000\u01de"+
		"\u01df\u0005>\u0000\u0000\u01df\u00a4\u0001\u0000\u0000\u0000\u01e0\u01e2"+
		"\u0007\u0000\u0000\u0000\u01e1\u01e0\u0001\u0000\u0000\u0000\u01e2\u01e3"+
		"\u0001\u0000\u0000\u0000\u01e3\u01e1\u0001\u0000\u0000\u0000\u01e3\u01e4"+
		"\u0001\u0000\u0000\u0000\u01e4\u00a6\u0001\u0000\u0000\u0000\u01e5\u01e7"+
		"\u0007\u0001\u0000\u0000\u01e6\u01e5\u0001\u0000\u0000\u0000\u01e7\u01e8"+
		"\u0001\u0000\u0000\u0000\u01e8\u01e6\u0001\u0000\u0000\u0000\u01e8\u01e9"+
		"\u0001\u0000\u0000\u0000\u01e9\u01ea\u0001\u0000\u0000\u0000\u01ea\u01eb"+
		"\u0006S\u0000\u0000\u01eb\u00a8\u0001\u0000\u0000\u0000\u01ec\u01ee\u0005"+
		"\r\u0000\u0000\u01ed\u01ec\u0001\u0000\u0000\u0000\u01ed\u01ee\u0001\u0000"+
		"\u0000\u0000\u01ee\u01ef\u0001\u0000\u0000\u0000\u01ef\u01f0\u0005\n\u0000"+
		"\u0000\u01f0\u00aa\u0001\u0000\u0000\u0000\u0004\u0000\u01e3\u01e8\u01ed"+
		"\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}