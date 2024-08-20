import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EjemploJTextField {
    private JFrame frame;
    private JTextField campoTexto;
    private JLabel etiquetaResultado;

    public EjemploJTextField() {
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        frame = new JFrame("Ejemplo JTextField");
        frame.setSize(500, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setLocationRelativeTo(null);

        // Crear y configurar JTextField
        campoTexto = new JTextField(20);
        frame.add(new JLabel("Nombre:"));
        frame.add(campoTexto);

        // Botón para procesar el texto
        JButton boton = new JButton("Saludar");
        frame.add(boton);

        // Etiqueta para mostrar el resultado
        etiquetaResultado = new JLabel("Resultado: ");
        frame.add(etiquetaResultado);

        // Añadir acción al botón
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = campoTexto.getText();
                etiquetaResultado.setText("Resultado: Hola, " + nombre + "!");
            }
        });
    }

    public void mostrar() {
        frame.setVisible(true);
    }
}