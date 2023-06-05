import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Linea {

    private static InterfazProyecto interfazProyecto;


    public static List<String> variables_global = new ArrayList<>();
    public static List<Object> valores_global = new ArrayList<>();

    public static List<String> variables_temporales = new ArrayList<>();
    public static List<Object> valores_temporales = new ArrayList<>();
    public static VisitorsComentarios visitor = new VisitorsComentarios();

    public static void main(String[] args) throws Exception {
        // Walk the tree created during the parse, trigger callbacks


        String linea = interfazProyecto.getLineaActual();


        analizarlinea(linea);
    }


    public static void analizarlinea(String linea) {

        PythonLexer lexer;

        lexer = new PythonLexer(CharStreams.fromString(linea));

        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // create a parser that feeds off the tokens buffer
        PythonParser parser = new PythonParser(tokens);

        ParseTree tree;

        char espacio=linea.charAt(0);
        if(espacio==' '){
            tree = parser.suite(); // begin parsing at init rule
        }
        else{
            tree = parser.stmt(); // begin parsing at init rule
        }


        visitor.visit(tree);
        System.out.println(); // print a \n after translation


        valores_global = visitor.getValores_global();
        variables_global = visitor.getVariables_global();


        valores_temporales = visitor.getValores_temporales();
        variables_temporales = visitor.getVariables_temporales();

    }
}