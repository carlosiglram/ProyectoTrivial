package org.example;

import java.io.Serializable;


/**
 * Clase que contiene la información de los objetos Opcion
 */
public class Opcion implements Serializable {
    private String respuesta;
    private String texto;
    private boolean acierto;

    public Opcion(String texto) {
    }

    public Opcion(String respuesta, String texto, boolean acierto) {
        this.respuesta = respuesta;
        this.texto = texto;
        this.acierto = acierto;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public boolean isAcierto() {
        return acierto;
    }

    public void setAcierto(boolean acierto) {
        this.acierto = acierto;
    }

    @Override
    public String toString() {
        return "Opcion{" +
                "respuesta=" + respuesta +
                ", texto='" + texto + '\'' +
                ", acierto=" + acierto +
                '}';
    }
}
