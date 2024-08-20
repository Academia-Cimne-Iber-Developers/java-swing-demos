import javax.swing.*;
import java.awt.*;

public class EjemploJPanel {
    private JFrame frame;

    public EjemploJPanel() {
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        frame = new JFrame("Ejemplo JPanel");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout());

        // Crear y configurar paneles
        JPanel panelSuperior = crearPanelSuperior();
        JPanel panelCentral = crearPanelCentral();
        JPanel panelInferior = crearPanelInferior();

        // Añadir paneles al frame
        frame.add(panelSuperior, BorderLayout.NORTH);
        frame.add(panelCentral, BorderLayout.CENTER);
        frame.add(panelInferior, BorderLayout.SOUTH);
    }

    private JPanel crearPanelSuperior() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.add(new JLabel("Panel Superior"));
        return panel;
    }

    private JPanel crearPanelCentral() {
        JPanel panel = new JPanel(new GridLayout(2, 2, 20, 20));
        for (int i = 1; i <= 4; i++) {
            panel.add(new JButton("Botón " + i));
        }
        return panel;
    }

    private JPanel crearPanelInferior() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);
        panel.add(new JButton("Aceptar"));
        panel.add(new JButton("Cancelar"));
        return panel;
    }

    public void mostrar() {
        frame.setVisible(true);
    }

}