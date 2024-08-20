import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EjemploJComboBox {
    private JFrame frame;
    private JComboBox<String> comboBox;
    private JLabel etiqueta;

    public EjemploJComboBox() {
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        frame = new JFrame("Ejemplo JComboBox");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new FlowLayout());

        String[] opciones = {"Rojo", "Verde", "Azul"};
        comboBox = new JComboBox<>(opciones);

        etiqueta = new JLabel("Selección: ninguna");

        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String seleccionado = (String) comboBox.getSelectedItem();
                etiqueta.setText("Selección: " + seleccionado);
            }
        });

        frame.add(comboBox);
        frame.add(etiqueta);
    }

    public void mostrar() {
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            EjemploJComboBox app = new EjemploJComboBox();
            app.mostrar();
        });
    }
}