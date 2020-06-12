package dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
import javax.swing.ImageIcon;
import java.util.Currency;

public final class Alimento implements Serializable {

    private String nombre;
    private String tipoAlimento;
    private ArrayList<ComposicionAlimento> listaNutrientesConProporcion;
    public ImageIcon fotoDelAlimento;

    public Alimento(String unNombre,
            String unTipoAlimento,
            ArrayList<ComposicionAlimento> listaNutrientes,
            ImageIcon foto) {

        this.setNombre(unNombre);
        this.setTipoAlimento(unTipoAlimento);
        this.setListaNutrientesConProporcion(listaNutrientes);
        this.setFotoDelAlimento(foto);
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String unNombre) {
        if (unNombre == null || unNombre.isEmpty()) {
            this.nombre = "Nombre de alimento no ingresado";
        } else {
            this.nombre = unNombre;
        }
    }

    public String getTipoAlimento() {
        return this.tipoAlimento;
    }

    public void setTipoAlimento(String TA) {
        tipoAlimento = TA;
        
    }

    public ArrayList<ComposicionAlimento> getListaNutrientesConProporcion() {
        if (this.listaNutrientesConProporcion.isEmpty()) {
            return new ArrayList<>();
        } else {
            return this.listaNutrientesConProporcion;
        }
    }

    public void setListaNutrientesConProporcion(ArrayList<ComposicionAlimento> listaNutrientes) {
        if (listaNutrientes == null) {
            this.listaNutrientesConProporcion = new ArrayList<>();
        } else {
            this.listaNutrientesConProporcion = listaNutrientes;
        }
    }

    public ImageIcon getFotoDelAlimento() {
        return this.fotoDelAlimento;
    }

    public void setFotoDelAlimento(ImageIcon foto) {
        if (foto == null) {
            this.fotoDelAlimento = new ImageIcon(getClass().getResource("/Imagenes/fotoDelAlimentoEstandar.png"));
        } else {
            this.fotoDelAlimento = foto;
        }
    }

    @Override
    public String toString() {
        return this.getNombre();
    }

    @Override
    public boolean equals(Object obj) {
        Alimento otroAlimento = (Alimento) obj;
        return (this.getNombre().equals(otroAlimento.getNombre()));
    }

}
