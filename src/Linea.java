import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Linea {
    public static void main(String[] args) throws Exception {
        String linea= "a+=3";
        // create a CharStream that reads from standard input / file
        // create a lexer that feeds off of input CharStream
        PythonLexer lexer;

        lexer = new PythonLexer(CharStreams.fromString(linea));

        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // create a parser that feeds off the tokens buffer
        PythonParser parser = new PythonParser(tokens);
        ParseTree tree = parser.stmt(); // begin parsing at init rule


        // Walk the tree created during the parse, trigger callbacks
        VisitorsComentarios visitor = new VisitorsComentarios();
        visitor.visit(tree);
        System.out.println(); // print a \n after translation

    }
}