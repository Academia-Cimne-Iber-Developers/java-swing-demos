import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EjemploMenu {
    private JFrame frame;
    private JMenuBar menuBar;
    private JTextArea areaTexto;

    public EjemploMenu() {
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        frame = new JFrame("Ejemplo de Menú");
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear el área de texto
        areaTexto = new JTextArea();
        frame.add(new JScrollPane(areaTexto), BorderLayout.CENTER);

        // Crear la barra de menú
        menuBar = new JMenuBar();

        // Menú Archivo
        JMenu menuArchivo = new JMenu("Archivo");
        JMenuItem itemNuevo = new JMenuItem("Nuevo");
        JMenuItem itemSalir = new JMenuItem("Salir");

        itemNuevo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                areaTexto.setText("");
            }
        });

        itemSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        menuArchivo.add(itemNuevo);
        menuArchivo.addSeparator();
        menuArchivo.add(itemSalir);

        // Menú Editar
        JMenu menuEditar = new JMenu("Editar");
        JMenuItem itemCopiar = new JMenuItem("Copiar");
        JMenuItem itemPegar = new JMenuItem("Pegar");

        itemCopiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                areaTexto.copy();
            }
        });

        itemPegar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                areaTexto.paste();
            }
        });

        menuEditar.add(itemCopiar);
        menuEditar.add(itemPegar);

        // Añadir menús a la barra de menú
        menuBar.add(menuArchivo);
        menuBar.add(menuEditar);

        // Establecer la barra de menú en el frame
        frame.setJMenuBar(menuBar);
    }

    public void mostrar() {
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            EjemploMenu app = new EjemploMenu();
            app.mostrar();
        });
    }
}