package org.example;

/**
 * Clase que contiene la información de los objetos Record
 */
public class Record {

    private String nombre;
    private String idioma;
    private int puntos;
    private String completado;

    public Record() {
    }

    public Record(String nombre, String idioma, int puntos, String completado) {
        this.nombre = nombre;
        this.idioma = idioma;
        this.puntos = puntos;
        this.completado = completado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public String getCompletado() {
        return completado;
    }

    public void setCompletado(String completado) {
        this.completado = completado;
    }

    @Override
    public String toString() {
        return ("\nJugador / " + "\033[3mPlayer => \033[0m\\" + nombre +
                "\nIdioma / " + "\033[3mLanguage => \033[0m\\" + idioma +
                "\nPuntuación / " + "\033[3mScore => \033[0m\\" + puntos +
                "\nJuego completado / " + "\033[3mGame completed => \033[0m\\" + completado +
                "\n\n---------------").replace("\\", "");
    }
}
