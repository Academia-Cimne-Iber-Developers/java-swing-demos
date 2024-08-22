import javax.swing.*;
import java.awt.*;

public class EjemploCardLayout extends JFrame {
    private CardLayout cardLayout;
    private JPanel cardPanel;

    public EjemploCardLayout() {
        setTitle("Ejemplo de CardLayout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(300, 200);

        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        // Crear y añadir "cartas"
        cardPanel.add(crearPanel("Rojo", Color.RED), "ROJO");
        cardPanel.add(crearPanel("Verde", Color.GREEN), "VERDE");
        cardPanel.add(crearPanel("Azul", Color.BLUE), "AZUL");

        add(cardPanel, BorderLayout.CENTER);

        // Panel de botones para cambiar entre cartas
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(crearBotonCambio("Rojo", "ROJO"));
        buttonPanel.add(crearBotonCambio("Verde", "VERDE"));
        buttonPanel.add(crearBotonCambio("Azul", "AZUL"));

        add(buttonPanel, BorderLayout.SOUTH);
    }

    private JPanel crearPanel(String texto, Color color) {
        JPanel panel = new JPanel();
        panel.setBackground(color);
        panel.add(new JLabel(texto));
        return panel;
    }

    private JButton crearBotonCambio(String texto, String nombreCarta) {
        JButton boton = new JButton(texto);
        boton.addActionListener(e -> cardLayout.show(cardPanel, nombreCarta));
        return boton;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new EjemploCardLayout().setVisible(true);
        });
    }
}