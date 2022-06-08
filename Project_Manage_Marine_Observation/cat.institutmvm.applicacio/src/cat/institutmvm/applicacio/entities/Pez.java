package cat.institutmvm.applicacio.entities;

public class Pez extends AnimalBase{
    /**
     * Clase Pez  que extiende de AnimalBase
     */
    private int profundidad,n_anzuelos;
    private boolean anzuelos;
    private String t_anzuelo;


    /**
     * Constructor de la clase Pez
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

    public Pez(String especie, String habitat, String tiempoNavegacion, String genero, String horaLlegada, String viento, String nubosidad, String direccionViento, float embarcaciones, float tamano) {
        super(especie, habitat, tiempoNavegacion, genero, horaLlegada, viento, nubosidad, direccionViento, embarcaciones, tamano);
        this.setProfundidad(profundidad);
        this.setN_anzuelos(n_anzuelos);
        this.setAnzuelos(anzuelos);
        this.setT_anzuelo(t_anzuelo);
    }

    /**
     * Getters y Setters de la clase Pez
     * @return
     */
    public int getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(int profundidad) {
        this.profundidad = profundidad;
    }

    public int getN_anzuelos() {
        return n_anzuelos;
    }

    public void setN_anzuelos(int n_anzuelos) {
        this.n_anzuelos = n_anzuelos;
    }

    public boolean getAnzuelos() {
        return anzuelos;
    }

    public void setAnzuelos(boolean anzuelos) {
        this.anzuelos = anzuelos;
    }

    public String getT_anzuelo() {
        return t_anzuelo;
    }

    public void setT_anzuelo(String t_anzuelo) {
        this.t_anzuelo = t_anzuelo;
    }
}
