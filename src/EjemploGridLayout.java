import javax.swing.*;
import java.awt.*;

public class EjemploGridLayout {
    private JFrame frame;

    public EjemploGridLayout() {
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        frame = new JFrame("Ejemplo GridLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(300, 200);

        // Crear un panel con GridLayout de 3 filas y 2 columnas
        JPanel panel = new JPanel(new GridLayout(2, 3, 5, 5)); // 5 píxeles de espacio horizontal y vertical

        // Añadir botones al panel
        for (int i = 1; i <= 6; i++) {
            JButton boton = new JButton("Botón " + i);
            panel.add(boton);
        }

        // Añadir el panel al frame
        frame.add(panel);
    }

    public void mostrar() {
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            EjemploGridLayout ejemplo = new EjemploGridLayout();
            ejemplo.mostrar();
        });
    }
}