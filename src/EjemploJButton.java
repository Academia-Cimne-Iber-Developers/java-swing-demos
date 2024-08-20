import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EjemploJButton {
    private JFrame frame;
    private JButton boton;
    private JLabel etiqueta;
    private int conteo = 0;

    public EjemploJButton() {
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        frame = new JFrame("Ejemplo JButton");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setLocationRelativeTo(null);

        boton = new JButton("Haz clic aquí");
        etiqueta = new JLabel("Esperando clic...");

        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiqueta.setText("¡Botón presionado! " + (++conteo));
            }
        });

        frame.add(boton);
        frame.add(etiqueta);
    }

    public void mostrar() {
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            EjemploJButton app = new EjemploJButton();
            app.mostrar();
        });
    }
}