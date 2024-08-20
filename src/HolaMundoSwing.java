import javax.swing.*;

public class HolaMundoSwing {
    public static void main(String[] args) {
        // Aseguramos que la GUI se cree en el Event Dispatch Thread
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                crearYMostrarGUI();
            }
        });
    }

    private static void crearYMostrarGUI() {
        // Crear el frame principal
        JFrame frame = new JFrame("Hola Mundo Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        // Crear una etiqueta
        JLabel label = new JLabel("¡Hola, Mundo!");
        frame.getContentPane().add(label);

        // Ajustar el tamaño y hacer visible
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}