import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class EjemploJList {
    private JFrame frame;
    private JList<String> lista;
    private JLabel etiqueta;

    public EjemploJList() {
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        frame = new JFrame("Ejemplo JList");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout());

        String[] elementos = {"Elemento 1", "Elemento 2", "Elemento 3", "Elemento 4", "Elemento 5"};
        lista = new JList<>(elementos);
        lista.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        JScrollPane scrollPane = new JScrollPane(lista);
        etiqueta = new JLabel("Selección: ninguna");

        lista.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    String seleccionado = lista.getSelectedValue();
                    etiqueta.setText("Selección: " + seleccionado);
                }
            }
        });

        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(etiqueta, BorderLayout.SOUTH);
    }

    public void mostrar() {
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            EjemploJList app = new EjemploJList();
            app.mostrar();
        });
    }
}