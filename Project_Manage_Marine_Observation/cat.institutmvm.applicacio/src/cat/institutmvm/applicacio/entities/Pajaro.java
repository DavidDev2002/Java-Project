package cat.institutmvm.applicacio.entities;

public class Pajaro extends AnimalBase{

    /**
     * Clase Pajaro  que extiende de AnimalBase
     */

    private boolean parasitos;

    /**
     * Constructor de la clase Pajaro
     * @param especie
     * @param habitat
     * @param tiempoNavegacion
     * @param genero
     * @param horaLlegada
     * @param viento
     * @param nubosidad
     * @param direccionViento
     * @param embarcaciones
     * @param tamano
     */
    public Pajaro(String especie, String habitat, String tiempoNavegacion, String genero, String horaLlegada, String viento, String nubosidad, String direccionViento, float embarcaciones, float tamano) {
        super(especie, habitat, tiempoNavegacion, genero, horaLlegada, viento, nubosidad, direccionViento, embarcaciones, tamano);
        this.setParasitos(parasitos);
    }

    /**
     * Getters y Setters
     * @return
     */
    public boolean getParasitos() {
        return parasitos;
    }

    public void setParasitos(boolean parasitos) {
        this.parasitos = parasitos;
    }
}
