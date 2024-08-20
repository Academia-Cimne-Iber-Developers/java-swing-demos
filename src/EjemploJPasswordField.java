import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EjemploJPasswordField {
    private JFrame frame;
    private JPasswordField campoPassword;
    private JToggleButton toggleButton;

    private char defaultEchoChar;

    public EjemploJPasswordField() {
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        frame = new JFrame("Ejemplo JPasswordField");
        frame.setSize(400, 120);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setLocationRelativeTo(null); // Centrar la ventana en la pantalla

        // Crear y configurar JPasswordField
        campoPassword = new JPasswordField(20);
        defaultEchoChar = campoPassword.getEchoChar();

        frame.add(new JLabel("Contraseña:"));
        frame.add(campoPassword);

        toggleButton = new JToggleButton("Ver");
        toggleButton.setFocusPainted(false);

        toggleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (toggleButton.isSelected()) {
                    campoPassword.setEchoChar((char) 0);
                } else {
                    campoPassword.setEchoChar(defaultEchoChar);
                }
            }
        });
        frame.add(toggleButton);

        // Botón para verificar la contraseña
        JButton botonVerificar = new JButton("Verificar");
        frame.add(botonVerificar);

        botonVerificar.addActionListener(e -> {
            char[] password = campoPassword.getPassword();
            if (Arrays.equals(password, "passwordseguro".toCharArray())) {
                JOptionPane.showMessageDialog(frame, "Contraseña correcta!");
            } else {
                JOptionPane.showMessageDialog(frame, "Contraseña incorrecta.");
            }
            // Limpiar la contraseña de la memoria
            Arrays.fill(password, '0');
        });
    }

    public void mostrar() {
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            EjemploJPasswordField app = new EjemploJPasswordField();
            app.mostrar();
        });
    }
}