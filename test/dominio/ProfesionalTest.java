package dominio;

import javax.swing.ImageIcon;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ProfesionalTest {

    public ProfesionalTest() {
    }

    @Test
    public void testGetsSetsDatosCorrectosGraduacion() {
        String nombre = "Martin";
        String apellido = "Gómez";
        String fechaNacimiento = "11/02/98";
        ImageIcon fotoPerfil = null;
        String tituloProf = "Doctor";
        String fechaGrad = "11/02/2016";
        String paisGraduacion = "Uruguay";
        Profesional prof = new Profesional(nombre, apellido, fechaNacimiento, fotoPerfil,
                tituloProf, fechaGrad, paisGraduacion);
        assertEquals(prof.getFechaGraduacion(), fechaGrad);
    }

    @Test
    public void testGetsDatosCorrectossVaciosPais() {
        String nombre = "Martin";
        String apellido = "Gómez";
        String fechaNacimiento = "11/02/98";
        ImageIcon fotoPerfil = null;
        String tituloProf = "Doctor";
        String fechaGrad = "11/02/2016";
        String paisGraduacion = "Uruguay";
        Profesional prof = new Profesional(nombre, apellido, fechaNacimiento, fotoPerfil,
                tituloProf, fechaGrad, paisGraduacion);
        assertEquals(prof.getPaisGraduacion(), paisGraduacion);
    }

    @Test
    public void testGetsSetsDatosCorrectosTitulo() {
        String nombre = "Martin";
        String apellido = "Gómez";
        String fechaNacimiento = "11/02/98";
        ImageIcon fotoPerfil = null;
        String tituloProf = "Doctor";
        String fechaGrad = "11/02/2016";
        String paisGraduacion = "Uruguay";
        Profesional prof = new Profesional(nombre, apellido, fechaNacimiento, fotoPerfil,
                tituloProf, fechaGrad, paisGraduacion);
        assertEquals(prof.getTituloProfesional(), tituloProf);
    }

    @Test
    public void testToStringDatosCorrectos() {
        String nombre = "Martin";
        String apellido = "Gómez";
        String fechaNacimiento = "11/02/98";
        ImageIcon fotoPerfil = null;
        String tituloProf = "Doctor";
        String fechaGrad = "11/02/2016";
        String paisGraduacion = "Uruguay";
        Profesional prof = new Profesional(nombre, apellido, fechaNacimiento, fotoPerfil,
                tituloProf, fechaGrad, paisGraduacion);
        String toStringEperado = nombre + " " + apellido;
        assertEquals(prof.toString(), toStringEperado);
    }

    @Test
    public void testToStringDatosNull() {
        String nombre = null;
        String apellido = null;
        String fechaNacimiento = null;
        ImageIcon fotoPerfil = null;
        String tituloProf = null;
        String fechaGrad = null;
        String paisGraduacion = null;
        Profesional prof = new Profesional(nombre, apellido, fechaNacimiento, fotoPerfil,
                tituloProf, fechaGrad, paisGraduacion);
        String toStringEperado = "Nombre no ingresado";
        assertEquals(prof.toString(), toStringEperado);
    }

    public void testToStringDatosVacios() {
        String nombre = "";
        String apellido = "";
        String fechaNacimiento = "";
        ImageIcon fotoPerfil = null;
        String tituloProf = "";
        String fechaGrad = "";
        String paisGraduacion = "";
        Profesional prof = new Profesional(nombre, apellido, fechaNacimiento, fotoPerfil,
                tituloProf, fechaGrad, paisGraduacion);
        String toStringEperado = "Nombre no ingresado";
        assertEquals(prof.toString(), toStringEperado);
    }
}
