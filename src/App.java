import javax.swing.SwingUtilities;

public class App {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            EjemploToolBar ventana = new EjemploToolBar();
            ventana.mostrar();
        });
    }
}