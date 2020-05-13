package dominio;

import java.io.Serializable;
import java.util.Date;
        
public final class InformacionMensaje implements Serializable {

    private String mensaje;
    public String destinatario;
    private String remitente;

    public InformacionMensaje(String elRemitente, String dst, String elMensaje) {
        setRemitente(elRemitente);
        setDestinatario(dst);
        setMensaje(elMensaje);
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String elMensaje) {
        mensaje = elMensaje;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String elDestinatario) {
        destinatario = elDestinatario;

    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String elRemitente) {
        this.remitente = elRemitente;
    }

    public void intercambiarRemitente() {
        String aux = destinatario;
        destinatario = remitente;
        remitente = aux;
    }

    @Override
    public String toString() {
        return getRemitente() + ": \n" + getMensaje();
    }

}
