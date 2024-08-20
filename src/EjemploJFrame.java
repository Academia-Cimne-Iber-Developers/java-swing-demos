import javax.swing.*;

public class EjemploJFrame {
    private JFrame frame;

    public EjemploJFrame() {
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        // Crear y configurar el JFrame
        frame = new JFrame("Mi Primera Aplicación");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        // Añadir un componente simple
        JLabel etiqueta = new JLabel("Bienvenido a Swing", SwingConstants.RIGHT);
        frame.add(etiqueta);
    }

    public void mostrar() {
        frame.setVisible(true);
    }
}