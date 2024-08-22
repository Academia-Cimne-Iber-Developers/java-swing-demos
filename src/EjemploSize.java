import javax.swing.*;
import java.awt.*;

public class EjemploSize {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejemplo Insets");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new BorderLayout());

        JButton boton = new JButton("Botón");
        boton.setPreferredSize(new Dimension(200, 80));
        boton.setMinimumSize(new Dimension(50, 20));
        boton.setMaximumSize(new Dimension(300, 40));

        JButton boton2 = new JButton("Botón 2");

        frame.add(boton2, BorderLayout.CENTER);
        frame.add(boton, BorderLayout.SOUTH);
        System.out.println(frame.getMaximumSize());

        frame.setVisible(true);
    }
}