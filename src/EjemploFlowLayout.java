import javax.swing.*;
import java.awt.*;

public class EjemploFlowLayout {
    private JFrame frame;

    public EjemploFlowLayout() {
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        frame = new JFrame("Ejemplo FlowLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(300, 200);

        // Crear un panel con FlowLayout
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));

        // Añadir botones al panel
        panel.add(new JButton("Botón 1"));
        panel.add(new JButton("Botón 2"));
        panel.add(new JButton("Botón 3"));
        panel.add(new JButton("Botón 4"));
        panel.add(new JButton("Botón 5"));
        Box horizontalBox = Box.createVerticalBox();
        horizontalBox.add(new JButton("Botón Caja 1"));
        horizontalBox.add(Box.createRigidArea(new Dimension(50, 10))); // Espacio horizontal
        horizontalBox.add(new JButton("Botón Caja 2"));

        panel.add(horizontalBox);


        // Añadir el panel al frame
        frame.add(panel);
    }

    public void mostrar() {
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            EjemploFlowLayout ejemplo = new EjemploFlowLayout();
            ejemplo.mostrar();
        });
    }
}