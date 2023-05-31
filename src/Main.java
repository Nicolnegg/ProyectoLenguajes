import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.*;
import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {
        // create a CharStream that reads from standard input / file
        // create a lexer that feeds off of input CharStream
        MyGrammarLexer lexer;

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                InterfazProyecto Primer = new InterfazProyecto();
                Primer.setVisible(true);
            }
        });

        if (args.length>0)
            lexer = new MyGrammarLexer(CharStreams.fromFileName(args[0]));
        else
            lexer = new MyGrammarLexer(CharStreams.fromStream(System.in));
        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // create a parser that feeds off the tokens buffer
        MyGrammarParser parser = new MyGrammarParser(tokens);
        ParseTree tree = parser.single_input(); // begin parsing at init rule

        // Create a generic parse tree walker that can trigger callbacks
        ParseTreeWalker walker = new ParseTreeWalker();
        // Walk the tree created during the parse, trigger callbacks
        walker.walk(new ListenersComentarios(), tree);
        System.out.println(); // print a \n after translation



    }
}