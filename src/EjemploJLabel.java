import javax.swing.*;
import java.awt.*;

public class EjemploJLabel {
    private JFrame frame;

    public EjemploJLabel() {
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        frame = new JFrame("Ejemplo JLabel");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setLocationRelativeTo(null); // Centrar la ventana en la pantalla

        // JLabel simple
        JLabel labelSimple = new JLabel("Etiqueta Simple");
        frame.add(labelSimple);

        // JLabel con fuente personalizada
        JLabel labelConFuente = new JLabel("Etiqueta con Fuente");
        labelConFuente.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(labelConFuente);

        // JLabel con HTML
        JLabel labelHTML = new JLabel("<html><b>Etiqueta</b> con <i>formato</i> HTML</html>");
        labelHTML.setFont(new Font("Times New Roman", Font.PLAIN, 44));
        frame.add(labelHTML);
    }

    public void mostrar() {
        frame.setVisible(true);
    }
}