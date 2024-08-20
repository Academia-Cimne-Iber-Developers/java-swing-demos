import javax.swing.*;
import java.awt.*;

public class EjemploJTextArea {
    private JFrame frame;
    private JTextArea areaTexto;

    public EjemploJTextArea() {
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        frame = new JFrame("Ejemplo JTextArea");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setLocationRelativeTo(null); // Centrar la ventana en la pantalla

        // Crear y configurar JTextArea
        areaTexto = new JTextArea(10, 30);
        areaTexto.setLineWrap(true);
        areaTexto.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(areaTexto);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Botón para añadir texto
        JButton botonAñadir = new JButton("Añadir Texto");
        frame.add(botonAñadir, BorderLayout.SOUTH);

        botonAñadir.addActionListener(e -> {
            areaTexto.append("Nueva línea de texto añadida.\n");
        });
    }

    public void mostrar() {
        frame.setVisible(true);
    }
}