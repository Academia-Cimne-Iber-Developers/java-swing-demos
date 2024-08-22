import javax.swing.*;
import java.awt.*;

public class EjemploGridBagLayout extends JFrame {
    public EjemploGridBagLayout() {
        setTitle("Ejemplo de GridBagLayout");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Componente 1: ocupa la primera fila completa
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(new JButton("Botón 1"), gbc);

        // Componente 2: primera columna de la segunda fila
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.weighty = 0.3;
        gbc.fill = GridBagConstraints.BOTH;
        panel.add(new JButton("Botón 2"), gbc);

        // Componente 3: segunda columna de la segunda fila
        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(new JButton("Botón 3"), gbc);

        // Componente 4: ocupa la tercera fila y se expande
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weighty = 0.7; // Este componente tomará todo el espacio vertical extra
        panel.add(new JButton("Botón 4"), gbc);

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new EjemploGridBagLayout().setVisible(true);
        });
    }
}