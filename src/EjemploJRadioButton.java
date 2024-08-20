import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EjemploJRadioButton {
    private JFrame frame;
    private JRadioButton radioBoton1, radioBoton2, radioBoton3;
    private JLabel etiqueta;

    public EjemploJRadioButton() {
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        frame = new JFrame("Ejemplo JRadioButton");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new FlowLayout());

        radioBoton1 = new JRadioButton("Opción 1");
        radioBoton2 = new JRadioButton("Opción 2");
        radioBoton3 = new JRadioButton("Opción 3");

        ButtonGroup grupo = new ButtonGroup();
        grupo.add(radioBoton1);
        grupo.add(radioBoton2);
        grupo.add(radioBoton3);

        etiqueta = new JLabel("Ninguna opción seleccionada");

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JRadioButton seleccionado = (JRadioButton) e.getSource();
                etiqueta.setText("Seleccionado: " + seleccionado.getText());
            }
        };

        radioBoton1.addActionListener(listener);
        radioBoton2.addActionListener(listener);
        radioBoton3.addActionListener(listener);

        frame.add(radioBoton1);
        frame.add(radioBoton2);
        frame.add(radioBoton3);
        frame.add(etiqueta);
    }

    public void mostrar() {
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            EjemploJRadioButton app = new EjemploJRadioButton();
            app.mostrar();
        });
    }
}