package dominio;

import javax.swing.ImageIcon;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlanAlimentacionTest {

    public PlanAlimentacionTest() {
    }

    @Test
    public void testGetsSetsNullToString() {
        String nombrePlan = null;
        Usuario usuario = null;
        Profesional profesional = null;
        boolean fueAtendido = false;
        String[][] planDiaADia = null;
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia);
        assertEquals(planATestear.toString(), "Plan de alimentación");
    }

    @Test
    public void testGetsSetsDatosVaciosNombre() {
        String nombrePlan = "";
        Usuario usuario = new Usuario(null, null, null, null, null, null, null, null);
        Profesional profesional = new Profesional(null, null, null, null, null, null, null);
        boolean fueAtendido = true;
        String[][] planDiaADia = new String[0][0];
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia);
        assertEquals(planATestear.getNombreDelPlan(), "Plan de alimentación");
    }

    @Test
    public void testGetsSetsDatosVaciosUsuario() {
        String nombrePlan = "";
        Usuario usuario = new Usuario(null, null, null, null, null, null, null, null);
        Profesional profesional = new Profesional(null, null, null, null, null, null, null);
        boolean fueAtendido = true;
        String[][] planDiaADia = new String[0][0];
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia);
        Usuario usuarioEsperado = new Usuario("", "", null, null, null, null, null, null);
        assertEquals(planATestear.getUsuario(), usuarioEsperado);
    }

    @Test
    public void testGetsSetsDatosVaciosProfesional() {
        String nombrePlan = "";
        Usuario usuario = new Usuario(null, null, null, null, null, null, null, null);
        Profesional profesional = new Profesional(null, null, null, null, null, null, null);
        boolean fueAtendido = true;
        String[][] planDiaADia = new String[0][0];
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia);
        Profesional profesionalEsperado = new Profesional("", "", null, null, null, null, null);
        assertEquals(planATestear.getProfesional(), profesionalEsperado);
    }

    @Test
    public void testGetsSetsDatosVaciosFueAtendido() {
        String nombrePlan = "";
        Usuario usuario = new Usuario(null, null, null, null, null, null, null, null);
        Profesional profesional = new Profesional(null, null, null, null, null, null, null);
        boolean fueAtendido = true;
        String[][] planDiaADia = new String[0][0];
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia);
        assertEquals(planATestear.getFueAtendidoElPlan(), fueAtendido);
    }

    @Test
    public void testGetsSetsDatosVaciosPlanDiaADia() {
        String nombrePlan = "";
        Usuario usuario = new Usuario(null, null, null, null, null, null, null, null);
        Profesional profesional = new Profesional(null, null, null, null, null, null, null);
        boolean fueAtendido = true;
        String[][] planDiaADia = new String[0][0];
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia);
        String[][] planEsperado = new String[0][0];
        Assert.assertArrayEquals(planATestear.getPlanDiaADia(), planEsperado);
    }

    @Test
    public void testGetsSetsDatosVaciosToString() {
        String nombrePlan = "";
        Usuario usuario = new Usuario(null, null, null, null, null, null, null, null);
        Profesional profesional = new Profesional(null, null, null, null, null, null, null);
        boolean fueAtendido = true;
        String[][] planDiaADia = new String[0][0];
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia);
        assertEquals(planATestear.toString(), "Plan de alimentación");
    }

    @Test
    public void testGetsSetsDatosCorrectosNombre() {
        String nombrePlan = "Plan 2 Dias DOWN";
        Usuario usuario = new Usuario("Martin", "Gómez", "11/02/98", new ImageIcon("Imagenes/fotoDeUsuarioStandard.png"), "Uruguayo", null, null, null);
        Profesional profesional = new Profesional("Alejandro", "Fernandez", null, null, null, null, null);
        boolean fueAtendido = true;
        String[][] planDiaADia = new String[2][2];
        planDiaADia[0][0] = "Manzana";
        planDiaADia[0][1] = "Manzana";
        planDiaADia[1][0] = "Manzana";
        planDiaADia[1][1] = "Manzana";
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia);
        assertEquals(planATestear.getNombreDelPlan(), nombrePlan);
    }

    @Test
    public void testGetsSetsDatosCorrectosProfesional() {
        String nombrePlan = "Plan 2 Dias DOWN";
        Usuario usuario = new Usuario("Martin", "Gómez", "11/02/98", new ImageIcon("Imagenes/fotoDeUsuarioStandard.png"), "Uruguayo", null, null, null);
        Profesional profesional = new Profesional("Alejandro", "Fernandez", null, null, null, null, null);
        boolean fueAtendido = true;
        String[][] planDiaADia = new String[2][2];
        planDiaADia[0][0] = "Manzana";
        planDiaADia[0][1] = "Manzana";
        planDiaADia[1][0] = "Manzana";
        planDiaADia[1][1] = "Manzana";
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia);
        Profesional profesionalEsperado = new Profesional("Alejandro", "Fernandez", null, null, null, null, null);
        assertEquals(planATestear.getProfesional(), profesionalEsperado);
    }

    @Test
    public void testGetsSetsDatosCorrectosFueAtendido() {
        String nombrePlan = "Plan 2 Dias DOWN";
        Usuario usuario = new Usuario("Martin", "Gómez", "11/02/98", new ImageIcon("Imagenes/fotoDeUsuarioStandard.png"), "Uruguayo", null, null, null);
        Profesional profesional = new Profesional("Alejandro", "Fernandez", null, null, null, null, null);
        boolean fueAtendido = true;
        String[][] planDiaADia = new String[2][2];
        planDiaADia[0][0] = "Manzana";
        planDiaADia[0][1] = "Manzana";
        planDiaADia[1][0] = "Manzana";
        planDiaADia[1][1] = "Manzana";
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia);
        assertEquals(planATestear.getFueAtendidoElPlan(), fueAtendido);
    }

    @Test
    public void testGetsSetsDatosCorrectosUsuario() {
        String nombrePlan = "Plan 2 Dias DOWN";
        Usuario usuario = new Usuario("Martin", "Gómez", "11/02/98", new ImageIcon("Imagenes/fotoDeUsuarioStandard.png"), "Uruguayo", null, null, null);
        Profesional profesional = new Profesional("Alejandro", "Fernandez", null, null, null, null, null);
        boolean fueAtendido = true;
        String[][] planDiaADia = new String[2][2];
        planDiaADia[0][0] = "Manzana";
        planDiaADia[0][1] = "Manzana";
        planDiaADia[1][0] = "Manzana";
        planDiaADia[1][1] = "Manzana";
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia);
        Usuario usuarioEsperado = new Usuario("Martin", "Gómez", "11/02/98", new ImageIcon("Imagenes/fotoDeUsuarioStandard.png"), "Uruguayo", null, null, null);
        assertEquals(planATestear.getUsuario(), usuarioEsperado);
    }

    @Test
    public void testGetsSetsDatosCorrectosPlanDiaADia() {
        String nombrePlan = "Plan 2 Dias DOWN";
        Usuario usuario = new Usuario("Martin", "Gómez", "11/02/98", new ImageIcon("Imagenes/fotoDeUsuarioStandard.png"), "Uruguayo", null, null, null);
        Profesional profesional = new Profesional("Alejandro", "Fernandez", null, null, null, null, null);
        boolean fueAtendido = true;
        String[][] planDiaADia = new String[2][2];
        planDiaADia[0][0] = "Manzana";
        planDiaADia[0][1] = "Manzana";
        planDiaADia[1][0] = "Manzana";
        planDiaADia[1][1] = "Manzana";
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia);
        Assert.assertArrayEquals(planATestear.getPlanDiaADia(), planDiaADia);
    }

    @Test
    public void testGetsSetsDatosCorrectosToString() {
        String nombrePlan = "Plan 2 Dias DOWN";
        Usuario usuario = new Usuario("Martin", "Gómez", "11/02/98", new ImageIcon("Imagenes/fotoDeUsuarioStandard.png"), "Uruguayo", null, null, null);
        Profesional profesional = new Profesional("Alejandro", "Fernandez", null, null, null, null, null);
        boolean fueAtendido = true;
        String[][] planDiaADia = new String[2][2];
        planDiaADia[0][0] = "Manzana";
        planDiaADia[0][1] = "Manzana";
        planDiaADia[1][0] = "Manzana";
        planDiaADia[1][1] = "Manzana";
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia);
        assertEquals(planATestear.toString(), nombrePlan);
    }

    @Test
    public void testEqualsIguales() {
        String nombrePlan = "Plan 2 Dias DOWN";
        Usuario usuario = new Usuario("Martin", "Gómez", "11/02/98", new ImageIcon("Imagenes/fotoDeUsuarioStandard.png"), "Uruguayo", null, null, null);
        Profesional profesional = new Profesional("Alejandro", "Fernandez", null, null, null, null, null);
        boolean fueAtendido = true;
        String[][] planDiaADia = new String[2][2];
        planDiaADia[0][0] = "Manzana";
        planDiaADia[0][1] = "Manzana";
        planDiaADia[1][0] = "Manzana";
        planDiaADia[1][1] = "Manzana";
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia);
        PlanAlimentacion planAComparar = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia);
        assertEquals(planATestear, planAComparar);
    }

    @Test
    public void testEqualsDiferentes() {
        String nombrePlan = "Plan 2 Dias DOWN";
        Usuario usuario = new Usuario("Martin", "Gómez", "11/02/98", new ImageIcon("Imagenes/fotoDeUsuarioStandard.png"), "Uruguayo", null, null, null);
        Profesional profesional = new Profesional("Alejandro", "Fernandez", null, null, null, null, null);
        boolean fueAtendido = true;
        String[][] planDiaADia = new String[2][2];
        planDiaADia[0][0] = "Manzana";
        planDiaADia[0][1] = "Manzana";
        planDiaADia[1][0] = "Manzana";
        planDiaADia[1][1] = "Manzana";
        PlanAlimentacion planATestear = new PlanAlimentacion(nombrePlan, usuario, profesional,
                fueAtendido, planDiaADia);
        String nombrePlan2 = "Plan 2 Dias UP";
        PlanAlimentacion planAComparar = new PlanAlimentacion(nombrePlan2, usuario, profesional,
                fueAtendido, planDiaADia);
        assertNotEquals(planATestear, planAComparar);
    }
}
