import javax.swing.*;
import java.awt.*;

public class TamanoPreferido {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejemplo de Tamaños Preferidos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setSize(300, 200);
        JButton botonNormal = new JButton("Normal");

        JButton botonPersonalizado = new JButton("Personalizado");
        botonPersonalizado.setPreferredSize(new Dimension(150, 40));

        JTextField campoTexto = new JTextField(20); // 20 columnas de ancho

        JTextArea areaTexto = new JTextArea(5, 20); // 5 filas, 20 columnas
        areaTexto.setLineWrap(true);

        frame.add(botonNormal);
        frame.add(botonPersonalizado);
        frame.add(campoTexto);
        frame.add(new JScrollPane(areaTexto)); // Envolvemos el JTextArea en un JScrollPane

        frame.pack(); // Ajusta el tamaño del frame basado en los tamaños preferidos
        frame.setVisible(true);
    }
}