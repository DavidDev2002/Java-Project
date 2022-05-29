package cat.institutmvm.applicacio.entities;

abstract class AnimalBase {
    /**
     * Clase AnimalBase que sirve para que las demás clases extiendan de esta
     */
    private String especie, habitat, tiempoNavegacion, genero, horaLlegada, viento,nubosidad, direccionViento;
    private float tamano,embarcaciones;

    /**
     * Constructor principal de la clase AnimalBase
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

    public AnimalBase(String especie, String habitat, String tiempoNavegacion, String genero, String horaLlegada, String viento, String nubosidad, String direccionViento, float embarcaciones, float tamano) {
        this.setEspecie(especie);
        this.setHabitat(habitat);
        this.setTiempoNavegacion(tiempoNavegacion);
        this.setGenero(genero);
        this.setHoraLlegada(horaLlegada);
        this.setViento(viento);
        this.setNubosidad(nubosidad);
        this.setDireccionViento(direccionViento);
        this.setEmbarcaciones(embarcaciones);
        this.setTamano(tamano);
    }

    /**
     * Getters y Setters de la clase AnimalBase
     * @return
     */

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getTiempoNavegacion() {
        return tiempoNavegacion;
    }

    public void setTiempoNavegacion(String tiempoNavegacion) {
        this.tiempoNavegacion = tiempoNavegacion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(String horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public String getViento() {
        return viento;
    }

    public void setViento(String viento) {
        this.viento = viento;
    }

    public String getNubosidad() {
        return nubosidad;
    }

    public void setNubosidad(String nubosidad) {
        this.nubosidad = nubosidad;
    }

    public String getDireccionViento() {
        return direccionViento;
    }

    public void setDireccionViento(String direccionViento) {
        this.direccionViento = direccionViento;
    }

    public float getTamano() {
        return tamano;
    }

    public void setTamano(float tamano) {
        this.tamano = tamano;
    }

    public float getEmbarcaciones() {
        return embarcaciones;
    }

    public void setEmbarcaciones(float embarcaciones) {
        this.embarcaciones = embarcaciones;
    }
}
