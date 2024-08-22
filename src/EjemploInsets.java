import javax.swing.*;
import java.awt.*;

public class EjemploInsets {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejemplo Insets");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new BorderLayout());

        JButton botonNorte = new JButton("Norte");
        JButton botonSur = new JButton("Sur");
        JButton botonEste = new JButton("Este");
        JButton botonOeste = new JButton("Oeste");
        JButton botonCentro = new JButton("Centro");

        // Aplicar Insets a los botones
        botonNorte.setMargin(new Insets(10, 0, 0, 0));  // 10px de margen superior
        botonSur.setMargin(new Insets(0, 0, 10, 0));    // 10px de margen inferior
        botonEste.setMargin(new Insets(0, 0, 0, 10));   // 10px de margen derecho
        botonOeste.setMargin(new Insets(0, 10, 0, 0));  // 10px de margen izquierdo
        botonCentro.setMargin(new Insets(5, 5, 5, 5));  // 5px de margen en todos los lados

        frame.add(botonNorte, BorderLayout.NORTH);
        frame.add(botonSur, BorderLayout.SOUTH);
        frame.add(botonEste, BorderLayout.EAST);
        frame.add(botonOeste, BorderLayout.WEST);
        frame.add(botonCentro, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}