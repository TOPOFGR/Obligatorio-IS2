package InicioSistema;

import Dominio.Sistema;
import Interfaz.VentanaMenuPrincipal;
import Interfaz.VentanaSPA;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {

    public static void main(String[] args) {
        Sistema sistema;

        try {
            try (FileInputStream f = new FileInputStream("Sistema.data")) {
                sistema = (Sistema) new ObjectInputStream(new BufferedInputStream(f)).readObject();
            }
        } catch (IOException | ClassNotFoundException e) {
            sistema = new Sistema();
        }
        VentanaSPA ventana = new VentanaSPA(sistema);
        ventana.setVisible(true);
    }

}
