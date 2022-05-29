package cat.institutmvm.applicacio.entities;

public class Tiburon extends AnimalBase{
    /**
     * Clase Tiburon  que extiende de AnimalBase
     */
    private String heridas,edad;


    /**
     * Constuctor de la clase Tiburon
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
     * @param heridas
     * @param edad
     */
    public Tiburon(String especie, String habitat, String tiempoNavegacion, String genero, String horaLlegada, String viento, String nubosidad, String direccionViento, float embarcaciones, float tamano, String heridas, String edad) {
        super(especie, habitat, tiempoNavegacion, genero, horaLlegada, viento, nubosidad, direccionViento, embarcaciones, tamano);
        this.setHeridas(heridas);
        this.setEdad(edad);
    }

    /**
     * Getters y Setters de la clase Tiburon
     */
    public String getHeridas() {
        return heridas;
    }

    public void setHeridas(String heridas) {
        this.heridas = heridas;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
}
