import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

public class InterfazProyecto extends JFrame {

    private JTextArea textArea1;
    private JTextArea textArea2;
    private JTextArea lineNumbersTextArea;
    private JButton button;

    public InterfazProyecto() {
        setTitle("Analizador codigo Python");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(1500, 700));

        JPanel contentPane = new JPanel(new BorderLayout());
        contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
        contentPane.setBackground(Color.decode("#1e2227")); // Cambiar el fondo del panel de contenido principal

        setContentPane(contentPane);

        JPanel textAreaPanel = new JPanel(new BorderLayout());

        lineNumbersTextArea = new JTextArea();
        lineNumbersTextArea.setBackground(Color.LIGHT_GRAY);
        lineNumbersTextArea.setEditable(false);
        lineNumbersTextArea.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));

        JScrollPane scrollPane = new JScrollPane(lineNumbersTextArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        scrollPane.setPreferredSize(new Dimension(40, 0));

        textAreaPanel.add(scrollPane, BorderLayout.WEST);

        JPanel textAreasPanel = new JPanel(new GridLayout(1, 3));

        textArea1 = new JTextArea();
        textArea1.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));
        textArea1.setBackground(Color.decode("#23272e")); // Cambiar el fondo del segundo JTextArea
        textArea1.setForeground(Color.white); // Establecer el color del texto en verde utilizando valor hexadecimal

        JScrollPane scrollPane1 = new JScrollPane(textArea1);

        textAreasPanel.add(scrollPane1);

        textArea2 = new JTextArea();
        textArea2.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));
        textArea2.setEditable(false); // Deshabilitar el segundo JTextArea
        textArea2.setBackground(Color.decode("#23272e")); // Cambiar el fondo del segundo JTextArea
        textArea2.setForeground(Color.decode("#6f8d5f")); // Establecer el color del texto en verde utilizando valor hexadecimal


        JScrollPane scrollPane2 = new JScrollPane(textArea2);

        textAreasPanel.add(scrollPane2);

        // Columna vacía
        JPanel emptyPanel = new JPanel();
        emptyPanel.setBackground(Color.decode("#1e2227")); // Cambiar el fondo del panel de contenido principal

        textAreasPanel.add(emptyPanel);

        textAreaPanel.add(textAreasPanel, BorderLayout.CENTER);

        contentPane.add(textAreaPanel, BorderLayout.CENTER);

        button = new JButton("Analizar Codigo");
        contentPane.add(button, BorderLayout.SOUTH);

        // Agregar listeners para detectar cambios en el texto
        textArea1.getDocument().addDocumentListener(new TextChangeListener());

        pack();
        setLocationRelativeTo(null);
    }

    private void updateLineNumbers() {
        String text = textArea1.getText();
        int lines = textArea1.getLineCount();

        StringBuilder numbers = new StringBuilder();
        for (int i = 1; i <= lines; i++) {
            numbers.append(String.format("%-3d", i)).append("\n");
        }

        lineNumbersTextArea.setText(numbers.toString());
    }

    private class TextChangeListener implements DocumentListener {
        @Override
        public void insertUpdate(DocumentEvent e) {
            updateLineNumbers();
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            updateLineNumbers();
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            updateLineNumbers();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            InterfazProyecto example = new InterfazProyecto();
            example.setVisible(true);
        });
    }
}
