import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class EjemploBorderFactory {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejemplo BorderFactory");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(2, 2, 10, 10));

        // Panel con borde simple
        JPanel panel1 = new JPanel();
        panel1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel1.add(new JLabel("Borde Simple"));

        // Panel con borde con título
        JPanel panel2 = new JPanel();
        panel2.setBorder(BorderFactory.createTitledBorder("Título del Panel"));
        panel2.add(new JLabel("Borde Con Título"));

        // Panel con borde compuesto
        JPanel panel3 = new JPanel();
        Border lineBorder = BorderFactory.createLineBorder(Color.BLUE);
        Border emptyBorder = BorderFactory.createEmptyBorder(20, 30, 10, 10);
        panel3.setBorder(BorderFactory.createCompoundBorder(emptyBorder, lineBorder));
        panel3.add(new JLabel("Borde Compuesto"));

        // Panel con borde biselado
        JPanel panel4 = new JPanel();
        panel4.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        panel4.add(new JLabel("Borde Biselado"));

        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);

        frame.setVisible(true);
    }
}