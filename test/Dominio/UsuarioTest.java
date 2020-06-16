package Dominio;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class UsuarioTest {

    public UsuarioTest() {
    }

    @Test
    public void testGetsSetsVaciosListaAlimentos() {
        Usuario usuario = new Usuario("", "", "", null, "", null, null, null);
        assertEquals(usuario.getAlimentosIngeridos().size(), 0);
    }

    @Test
    public void testGetsSetsVaciosRestricciones() {
        Usuario usuario = new Usuario("", "", "", null, "", null, null, null);
        assertEquals(usuario.getRestricciones().size(), 0);
    }

    @Test
    public void testGetsSetsVaciosPreferencias() {
        Usuario usuario = new Usuario("", "", "", null, "", null, null, null);
        assertEquals(usuario.getPreferencias().size(), 0);
    }

    @Test
    public void testGetsSetsNullNombre() {
        Usuario usuario = new Usuario(null, null, null, null, null, null, null, null);
        assertEquals(usuario.getNombre(), "Nombre no ingresado");
    }

    @Test
    public void testGetsSetsNullApellido() {
        Usuario usuario = new Usuario(null, null, null, null, null, null, null, null);
        assertEquals(usuario.getApellido(), "Apellido no ingresado");
    }

    @Test
    public void testGetsSetsNullFechaNacimiento() {
        Usuario usuario = new Usuario(null, null, null, null, null, null, null, null);
        assertEquals(usuario.getFechaNacimiento(), "Fecha no ingresada");
    }

    @Test
    public void testGetsSetsNullNacionalidad() {
        Usuario usuario = new Usuario(null, null, null, null, null, null, null, null);
        assertEquals(usuario.getNacionalidad(), "Nacionalidad no ingresada");
    }

    @Test
    public void testGetsSetsNullListaAlimentos() {
        Usuario usuario = new Usuario(null, null, null, null, null, null, null, null);
        assertEquals(usuario.getAlimentosIngeridos().size(), 0);
    }

    @Test
    public void testGetsSetsNullRestricciones() {
        Usuario usuario = new Usuario(null, null, null, null, null, null, null, null);
        assertEquals(usuario.getRestricciones().size(), 0);
    }

    @Test
    public void testGetsSetsNullPreferencias() {
        Usuario usuario = new Usuario(null, null, null, null, null, null, null, null);
        assertEquals(usuario.getPreferencias().size(), 0);
    }
    
    @Test
    public void testGetArrayRestricciones(){
        Usuario usuario = new Usuario(null, null, null, null, null, null, null, null);
        ArrayList<String> restricciones = new ArrayList<>();
        usuario.actualizarRestriccionesUsuario(usuario, restricciones);
        usuario.getRestricciones().add("Banana");
        usuario.getRestricciones().add("Manzana");
        usuario.getRestricciones().add("Naranja");
        String[] resEsperado = restricciones.toArray(new String[restricciones.size()]);
        assertEquals(resEsperado, usuario.getArrayRestricciones());
    }
    
    @Test
    public void testGetArrayPreferencias(){
        Usuario usuario = new Usuario(null, null, null, null, null, null, null, null);
        ArrayList<String> preferencias = new ArrayList<>();
        usuario.actualizarPreferenciasUsuario(usuario, preferencias);
        usuario.getPreferencias().add("Banana");
        usuario.getPreferencias().add("Manzana");
        usuario.getPreferencias().add("Naranja");
        String[] resEsperado = preferencias.toArray(new String[preferencias.size()]);
        assertEquals(resEsperado, usuario.getArrayPreferencias());
    }
}
