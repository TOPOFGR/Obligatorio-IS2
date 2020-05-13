package dominio;

import java.io.Serializable;

public final class ComposicionAlimento implements Serializable {

    private String nutriente;
    private float proporcion;

    public ComposicionAlimento(String unNutriente, float unaProporcion) {
        this.setNutriente(unNutriente);
        this.setProporcion(unaProporcion);
    }

    public String getNutriente() {
        return this.nutriente;
    }

    public void setNutriente(String unNutriente) {
        this.nutriente = unNutriente;


    }

    public float getProporcion() {
        return this.proporcion;
    }

    public void setProporcion(float unaProporcion) {
        if (unaProporcion <= 0) {
            this.proporcion = 1;
        } else {
            this.proporcion = unaProporcion;
        }
    }

}
