import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EjemploToolBar {
    private JFrame frame;
    private JToolBar toolBar;
    private JTextArea areaTexto;

    public EjemploToolBar() {
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        frame = new JFrame("Ejemplo de ToolBar");
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear el área de texto
        areaTexto = new JTextArea();
        frame.add(new JScrollPane(areaTexto), BorderLayout.CENTER);

        // Crear la barra de herramientas
        toolBar = new JToolBar();
        toolBar.setFloatable(false); // Permite que la barra sea movible

        // Botón Nuevo
        JButton btnNuevo = new JButton("Nuevo", new ImageIcon("assets/new.png"));
        btnNuevo.setToolTipText("Nuevo");
        btnNuevo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                areaTexto.setText("");
            }
        });

        // Botón Copiar
        JButton btnCopiar = new JButton(new ImageIcon("assets/copy.png"));
        btnCopiar.setToolTipText("Copiar");
        btnCopiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                areaTexto.copy();
            }
        });

        // Botón Pegar
        JButton btnPegar = new JButton(new ImageIcon("assets/paste.png"));
        btnPegar.setToolTipText("Pegar");
        btnPegar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                areaTexto.paste();
            }
        });

        // Añadir botones a la barra de herramientas
        toolBar.add(btnNuevo);
        toolBar.addSeparator();
        toolBar.add(btnCopiar);
        toolBar.add(btnPegar);

        // Añadir un componente personalizado (JComboBox)
        String[] estilos = {"Normal", "Negrita", "Cursiva"};
        JComboBox<String> comboEstilos = new JComboBox<>(estilos);
        comboEstilos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String estilo = (String) comboEstilos.getSelectedItem();
                cambiarEstiloTexto(estilo);
            }
        });
        toolBar.addSeparator();
        toolBar.add(comboEstilos);

        // Añadir la barra de herramientas al frame
        frame.add(toolBar, BorderLayout.NORTH);
    }

    private void cambiarEstiloTexto(String estilo) {
        Font currentFont = areaTexto.getFont();
        Font newFont;
        switch (estilo) {
            case "Negrita":
                newFont = currentFont.deriveFont(Font.BOLD);
                break;
            case "Cursiva":
                newFont = currentFont.deriveFont(Font.ITALIC);
                break;
            default:
                newFont = currentFont.deriveFont(Font.PLAIN);
        }
        areaTexto.setFont(newFont);
    }

    public void mostrar() {
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            EjemploToolBar app = new EjemploToolBar();
            app.mostrar();
        });
    }
}