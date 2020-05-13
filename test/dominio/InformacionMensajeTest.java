package dominio;

import org.junit.Test;
import static org.junit.Assert.*;

public class InformacionMensajeTest {

    public InformacionMensajeTest() {
    }

    @Test
    public void testGetsSetsNullRemitente() {
        String remitente = null;
        String destinatario = null;
        String mensaje = null;
        InformacionMensaje info = new InformacionMensaje(remitente, destinatario, mensaje);
        assertEquals(info.getRemitente(), "Remitente no ingresado");
    }

    @Test
    public void testGetsSetsNullMensaje() {
        String remitente = null;
        String destinatario = null;
        String mensaje = null;
        InformacionMensaje info = new InformacionMensaje(remitente, destinatario, mensaje);
        assertEquals(info.getMensaje(), mensaje);
    }

    @Test
    public void testGetsSetsNullToString() {
        String remitente = null;
        String destinatario = null;
        String mensaje = null;
        InformacionMensaje info = new InformacionMensaje(remitente, destinatario, mensaje);
        String esperadoToString = "Remitente no ingresado" + ": \n" + mensaje;
        assertEquals(info.toString(), esperadoToString);
    }

    @Test
    public void testGetsSetsStringsVaciosRemitente() {
        String remitente = "";
        String destinatario = "";
        String mensaje = "";
        InformacionMensaje info = new InformacionMensaje(remitente, destinatario, mensaje);
        assertEquals(info.getRemitente(), "Remitente no ingresado");
    }

    @Test
    public void testGetsSetsStringsVaciosDestinatario() {
        String remitente = "";
        String destinatario = "";
        String mensaje = "";
        InformacionMensaje info = new InformacionMensaje(remitente, destinatario, mensaje);
        assertEquals(info.getDestinatario(), "Destinatario no ingresado");
    }

    @Test
    public void testGetsSetsStringsVaciosMensaje() {
        String remitente = "";
        String destinatario = "";
        String mensaje = "";
        InformacionMensaje info = new InformacionMensaje(remitente, destinatario, mensaje);
        assertEquals(info.getMensaje(), mensaje);
    }

    @Test
    public void testGetsSetsStringsVaciosToString() {
        String remitente = "";
        String destinatario = "";
        String mensaje = "";
        InformacionMensaje info = new InformacionMensaje(remitente, destinatario, mensaje);
        String esperadoToString = "Remitente no ingresado" + ": \n" + mensaje;
        assertEquals(info.toString(), esperadoToString);
    }

}
