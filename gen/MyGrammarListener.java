// Generated from C:/Users/princ/IdeaProjects/ProyectoLenguajes/grammar\MyGrammar.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyGrammarParser}.
 */
public interface MyGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterInicio(MyGrammarParser.InicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitInicio(MyGrammarParser.InicioContext ctx);
}