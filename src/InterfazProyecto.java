import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class InterfazProyecto extends JFrame {

    private JTextArea textArea1;
    private JPanel variablesPanel;
    private JTextArea lineNumbersTextArea;
    private JPanel pythonTutorPanel;
    private JButton button;

    private Map<String, Object> variables = new HashMap<>();

    public InterfazProyecto() {
        setTitle("Analizador código Python");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(1500, 700));

        JPanel contentPane = new JPanel(new BorderLayout());
        contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
        contentPane.setBackground(Color.decode("#1e2227"));

        setContentPane(contentPane);

        // Agregar el texto "Bienvenidos a un analizador de Python Tutor" en la parte superior
        JLabel welcomeLabel = new JLabel("ANALIZADOR CODIGO PYTHON");
        welcomeLabel.setForeground(Color.WHITE);
        welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 18));
        contentPane.add(welcomeLabel, BorderLayout.NORTH);

        // Agregar el mensaje de información
        JLabel infoLabel = new JLabel("Aquí puedes hacer bla bla bla");
        infoLabel.setForeground(Color.WHITE);
        infoLabel.setHorizontalAlignment(SwingConstants.CENTER);
        infoLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        contentPane.add(infoLabel, BorderLayout.CENTER);

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
        textArea1.setBackground(Color.decode("#23272e"));
        textArea1.setForeground(Color.white);

        JScrollPane scrollPane1 = new JScrollPane(textArea1);
        textAreasPanel.add(scrollPane1);

        JPanel emptyPanel = new JPanel();
        emptyPanel.setBackground(Color.decode("#1e2227"));
        textAreasPanel.add(emptyPanel);

        variablesPanel = new JPanel();
        variablesPanel.setLayout(new BoxLayout(variablesPanel, BoxLayout.Y_AXIS));
        JScrollPane scrollPane2 = new JScrollPane(variablesPanel);
        textAreasPanel.add(scrollPane2);

        textAreaPanel.add(textAreasPanel, BorderLayout.CENTER);

        pythonTutorPanel = new JPanel();
        pythonTutorPanel.setBackground(Color.decode("#23272e"));
        textAreaPanel.add(pythonTutorPanel, BorderLayout.EAST);

        contentPane.add(textAreaPanel, BorderLayout.CENTER);

        button = new JButton("Analizar Código");

        button.addActionListener(e -> analizarCodigo());
        contentPane.add(button, BorderLayout.SOUTH);

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

    private void analizarCodigo() {
        String codigo = textArea1.getText();
        variables.clear();
        variablesPanel.removeAll();

        // Analizar el código y extraer las asignaciones de variables
        // Aquí debes implementar tu lógica para analizar el código y extraer las variables

        // Ejemplo: Extraer las asignaciones de variables utilizando expresiones regulares
        String pattern = "\\b(\\w+)\\s*=\\s*(.+)";
        String[] lines = codigo.split("\\n");
        for (String line : lines) {
            line = line.trim();
            if (line.matches(pattern)) {
                String variable = line.replaceAll(pattern, "$1");
                String valor = line.replaceAll(pattern, "$2");

                // Verificar si es una lista en Python
                if (valor.startsWith("[") && valor.endsWith("]")) {
                    valor = valor.substring(1, valor.length() - 1);
                    String[] elementos = valor.split(",");
                    List<Object> lista = new ArrayList<>();
                    for (String elemento : elementos) {
                        elemento = elemento.trim();
                        lista.add(elemento);
                    }
                    variables.put(variable, lista);
                } else {
                    variables.put(variable, valor);
                }

                JPanel variablePanel = new JPanel();
                variablePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
                variablePanel.setMaximumSize(new Dimension(300, 30));

                JLabel nameLabel = new JLabel(variable);
                variablePanel.add(nameLabel);

                JLabel valueLabel = new JLabel(" = ");
                variablePanel.add(valueLabel);

                if (variables.get(variable) instanceof List) {
                    List<Object> lista = (List<Object>) variables.get(variable);
                    for (Object elemento : lista) {
                        JLabel valueBox = new JLabel(elemento.toString());
                        valueBox.setPreferredSize(new Dimension(30, 30));
                        valueBox.setOpaque(true);
                        valueBox.setBackground(getRandomPastelColor());
                        valueBox.setBorder(BorderFactory.createLineBorder(Color.black));
                        valueBox.setHorizontalAlignment(SwingConstants.CENTER);
                        variablePanel.add(valueBox);
                    }
                } else {
                    JLabel valueBox = new JLabel(valor);
                    valueBox.setPreferredSize(new Dimension(30, 30));
                    valueBox.setOpaque(true);
                    valueBox.setBackground(getRandomPastelColor());
                    valueBox.setBorder(BorderFactory.createLineBorder(Color.black));
                    valueBox.setHorizontalAlignment(SwingConstants.CENTER);
                    variablePanel.add(valueBox);
                }

                variablesPanel.add(variablePanel);
            }
        }

        variablesPanel.revalidate();
        variablesPanel.repaint();

        updatePythonTutorPanel();
    }

    private void updatePythonTutorPanel() {
        pythonTutorPanel.revalidate();
        pythonTutorPanel.repaint();
    }

    private Color getRandomPastelColor() {
        Random random = new Random();
        int red = 128 + random.nextInt(128);
        int green = 128 + random.nextInt(128);
        int blue = 128 + random.nextInt(128);
        return new Color(red, green, blue);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            InterfazProyecto example = new InterfazProyecto();
            example.setVisible(true);
        });
    }
}
