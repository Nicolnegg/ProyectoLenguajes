import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.DefaultCaret;
import java.awt.*;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class InterfazProyecto extends JFrame {

    private JTextArea textArea1;
    private JPanel variablesPanel;

    private int lineCounter = 0;

    public static String lineaActual;
    private JPanel buttonPanel;
    private JTextArea lineNumbersTextArea;
    private JPanel pythonTutorPanel;
    public static JButton button;

    public static JButton flechaButton;

    public static JTextArea textAreaResult;

    private Map<String, Object> variables = new HashMap<>();
    private PrintStream consolePrintStream;

    public InterfazProyecto() throws IOException, FontFormatException {
        setTitle("Analizador código Python");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(1500, 700));

        JPanel contentPane = new JPanel(new BorderLayout());
        contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
        contentPane.setBackground(Color.decode("#FFFFFF"));

        setContentPane(contentPane);

        // Crear un objeto ImageIcon con la ruta de la imagen
        ImageIcon icono = new ImageIcon("imagenes/Logo.png");
        ImageIcon python = new ImageIcon("imagenes/PythonLogo.png");
        Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File("imagenes/Snowstorm.otf"));


        // Crear un JPanel con BoxLayout horizontal
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));


        JLabel iconoLabel = new JLabel(icono);
        JLabel textLabel = new JLabel("ANALIZA Y ENTIENDE TU CODIGO DE PYTHON");
        textLabel.setForeground(Color.decode("#306998"));
        textLabel.setFont(customFont.deriveFont(Font.PLAIN, 30));
        JLabel logoLabel = new JLabel(python);

        panel.add(iconoLabel);
        panel.add(textLabel);
        panel.add(Box.createHorizontalGlue());
        panel.add(logoLabel);


        contentPane.add(panel, BorderLayout.NORTH);

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

        // Reemplazar el panel vacío con un JScrollPane que contiene un JTextArea
        JScrollPane scrollPane2 = new JScrollPane();
        textAreaResult = new JTextArea();
        scrollPane2.setViewportView(textAreaResult);
        textAreaResult.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));
        textAreaResult.setBackground(Color.decode("#23272e"));
        textAreaResult.setForeground(Color.white);
        textAreaResult.setEditable(false);

        textAreasPanel.add(scrollPane2);

        variablesPanel = new JPanel();
        variablesPanel.setLayout(new BoxLayout(variablesPanel, BoxLayout.Y_AXIS));
        JScrollPane scrollPane3 = new JScrollPane(variablesPanel);
        textAreasPanel.add(scrollPane3);

        textAreaPanel.add(textAreasPanel, BorderLayout.CENTER);

        pythonTutorPanel = new JPanel();
        pythonTutorPanel.setBackground(Color.decode("#23272e"));
        textAreaPanel.add(pythonTutorPanel, BorderLayout.EAST);

        contentPane.add(textAreaPanel, BorderLayout.CENTER);

        button = new JButton("Analizar Código");

        ImageIcon iconoFlecha = new ImageIcon("imagenes/flecha.png");

        Image imagenOriginal = iconoFlecha.getImage();

        int nuevoAncho = 23; // Especifica el nuevo ancho en píxeles
        int nuevoAlto = 16; // Especifica el nuevo alto en píxeles
        Image imagenRedimensionada = imagenOriginal.getScaledInstance(nuevoAncho, nuevoAlto, Image.SCALE_SMOOTH);
        ImageIcon iconoRedimensionado = new ImageIcon(imagenRedimensionada);
        flechaButton = new JButton(iconoRedimensionado);

        flechaButton.addActionListener(e -> leerSiguienteLinea());

        buttonPanel = new JPanel(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0; // El botón "button" ocupa más espacio horizontalmente
        gbc.fill = GridBagConstraints.HORIZONTAL;
        buttonPanel.add(button, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 0.0; // El botón "flechaButton" no se expande horizontalmente
        buttonPanel.add(flechaButton, gbc);

        button.addActionListener(e -> analizarCodigo());
        contentPane.add(buttonPanel, BorderLayout.SOUTH);

        textArea1.getDocument().addDocumentListener(new TextChangeListener());

        pack();
        setLocationRelativeTo(null);

        // Redirigir la salida estándar a textAreaResult
        consolePrintStream = new PrintStream(new OutputStream() {
            @Override
            public void write(int b) throws IOException {
                textAreaResult.append(String.valueOf((char) b));
                textAreaResult.setCaretPosition(textAreaResult.getDocument().getLength());
            }
        });
        System.setOut(consolePrintStream);
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

    private void leerSiguienteLinea() {
        String[] lineas = textArea1.getText().split("\\n");

        if (lineCounter < lineas.length) {
            lineaActual = lineas[lineCounter];
            lineCounter++;
        } else {
            lineaActual = "no hay lineas";
        }

        Linea lineaclass = new Linea();

        lineaclass.analizarlinea(lineaActual);



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
                        String valorElemento = elemento.toString();
                        JLabel valueBox = new JLabel(valorElemento);
                        valueBox.setOpaque(true);
                        valueBox.setBackground(getRandomPastelColor());
                        valueBox.setBorder(BorderFactory.createLineBorder(Color.black));
                        valueBox.setHorizontalAlignment(SwingConstants.CENTER);
                        variablePanel.add(valueBox);

                        // Ajustar el tamaño de la caja del valueBox al contenido
                        FontMetrics fontMetrics = valueBox.getFontMetrics(valueBox.getFont());
                        int textWidth = fontMetrics.stringWidth(valorElemento);
                        int textHeight = fontMetrics.getHeight();
                        int boxWidth = textWidth + 20; // Aumentar el ancho en 10 píxeles para dar espacio adicional
                        int boxHeight = textHeight + 20; // Aumentar la altura en 10 píxeles para dar espacio adicional
                        valueBox.setPreferredSize(new Dimension(boxWidth, boxHeight));
                    }
                } else {
                    JLabel valueBox = new JLabel(valor);
                    valueBox.setOpaque(true);
                    valueBox.setBackground(getRandomPastelColor());
                    valueBox.setBorder(BorderFactory.createLineBorder(Color.black));
                    valueBox.setHorizontalAlignment(SwingConstants.CENTER);
                    variablePanel.add(valueBox);

                    // Ajustar el tamaño de la caja del valueBox al contenido
                    FontMetrics fontMetrics = valueBox.getFontMetrics(valueBox.getFont());
                    int textWidth = fontMetrics.stringWidth(valor);
                    int textHeight = fontMetrics.getHeight();
                    int boxWidth = textWidth + 20; // Aumentar el ancho en 10 píxeles para dar espacio adicional
                    int boxHeight = textHeight + 20; // Aumentar la altura en 10 píxeles para dar espacio adicional
                    valueBox.setPreferredSize(new Dimension(boxWidth, boxHeight));
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

    public String getTextoTextArea1() {
        return textArea1.getText();
    }


    public String getLineaActual() {
        return lineaActual;
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            InterfazProyecto example = null;
            try {
                example = new InterfazProyecto();
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (FontFormatException e) {
                throw new RuntimeException(e);
            }
            example.setVisible(true);
        });
    }
}
