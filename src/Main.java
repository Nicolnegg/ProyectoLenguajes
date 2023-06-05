import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    private static InterfazProyecto interfazProyecto;

    public static void main(String[] args) throws Exception {
        PythonLexer lexer;

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                interfazProyecto = null;
                try {
                    interfazProyecto = new InterfazProyecto();
                    InterfazProyecto.button.addActionListener(e -> {
                        String texto = interfazProyecto.getTextoTextArea1();
                        InterfazProyecto.textAreaResult.setText("");

                        CharStream input = CharStreams.fromString(texto);
                        PythonLexer lexer = new PythonLexer(input);
                        CommonTokenStream tokens = new CommonTokenStream(lexer);
                        PythonParser parser = new PythonParser(tokens);
                        ParseTree tree = parser.root();

                        TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
                        viewer.open();

                        ParseTreeWalker walker = new ParseTreeWalker();
                        walker.walk(new ListenersComentarios(parser), tree);
                        System.out.println();

                        VisitorsComentarios visitor = new VisitorsComentarios();
                        visitor.visit(tree);

                        // Otras acciones con el resultado obtenido


                    });
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (FontFormatException e) {
                    throw new RuntimeException(e);
                }
                interfazProyecto.setVisible(true);
            }
        });

    }
}
