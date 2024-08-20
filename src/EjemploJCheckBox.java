import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class EjemploJCheckBox {
    private JFrame frame;
    private JCheckBox checkBox;
    private JLabel etiqueta;

    public EjemploJCheckBox() {
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        frame = new JFrame("Ejemplo JCheckBox");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new FlowLayout());

        checkBox = new JCheckBox("Activar opción");
        etiqueta = new JLabel("Marque la opción");

        checkBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    etiqueta.setText("Opción activada");
                } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                    etiqueta.setText("Opción desactivada");
                }
            }
        });

        frame.add(checkBox);
        frame.add(etiqueta);
    }

    public void mostrar() {
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            EjemploJCheckBox app = new EjemploJCheckBox();
            app.mostrar();
        });
    }
}