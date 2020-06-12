package dominio;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import java.io.File;

public final class Usuario extends Persona {

    private String nacionalidad;
    private ArrayList<String> preferencias;
    private ArrayList<String> restricciones;
    public ArrayList<Ingesta> alimentosIngeridos;

    public Usuario(String unNombre,
            String unApellido,
            String unaFechaNacimiento,
            ImageIcon unaFotoDePerfil,
            String unaNacionalidad,
            ArrayList<String> listaPreferencias,
            ArrayList<String> listaRestricciones,
            ArrayList<Ingesta> listaAlimentos) {

        this.setNombre(unNombre);
        this.setApellido(unApellido);
        this.setFechaNacimiento(unaFechaNacimiento);
        this.setFotoDePerfil(unaFotoDePerfil);
        this.setNacionalidad(unaNacionalidad);
        this.setPreferencias(listaPreferencias);
        this.setRestricciones(listaRestricciones);
        this.setAlimentosIngeridos(listaAlimentos);
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String unaNacionalidad) {
       
        nacionalidad = unaNacionalidad;
       
    }

    public ArrayList<String> getPreferencias() {
        return this.preferencias;
    }

    public void setPreferencias(ArrayList<String> listaPreferencias) {
        if (listaPreferencias == null) {
            this.preferencias = new ArrayList<>();
        } else {
            this.preferencias = listaPreferencias;
        }
    }

    public ArrayList<String> getRestricciones() {
        return this.restricciones;
    }

    public void setRestricciones(ArrayList<String> listaRestricciones) {
        if (listaRestricciones == null) {
            this.restricciones = new ArrayList<>();
        } else {
            this.restricciones = listaRestricciones;
        }
    }

    public ArrayList<Ingesta> getAlimentosIngeridos() {
        return this.alimentosIngeridos;
    }

    public void setAlimentosIngeridos(ArrayList<Ingesta> listaAlimentos) {
        if (listaAlimentos == null) {
            this.alimentosIngeridos = new ArrayList<>();
        } else {
            this.alimentosIngeridos = listaAlimentos;
        }

    }

    public String[] getArrayAlimentosIngeridos() {
        String[] retorno = new String[getAlimentosIngeridos().size()];
        for (int i = 0; i < getAlimentosIngeridos().size(); i++) {
            retorno[i] = getAlimentosIngeridos().get(i).toString();
        }
        return retorno;
    }

    public String[] getArrayRestricciones() {
        String[] retorno = new String[getRestricciones().size()];
        for (int i = 0; i < getRestricciones().size(); i++) {
            retorno[i] = getRestricciones().get(i);
        }
        return retorno;
    }

    public String[] getArrayPreferencias() {
        String[] retorno = new String[getPreferencias().size()];
        for (int i = 0; i < getPreferencias().size(); i++) {
            retorno[i] = getPreferencias().get(i);
        }
        return retorno;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void actualizarPreferenciasUsuario(Usuario usuario, ArrayList<String> pr) {
        usuario.setPreferencias(pr);
    }

    public void actualizarRestriccionesUsuario(Usuario usuario, ArrayList<String> restricciones) {
        usuario.setRestricciones(restricciones);
    }
}
