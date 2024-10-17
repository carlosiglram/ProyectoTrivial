package org.example;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Clase que contiene la información de los objetos Pregunta
 */
public class Pregunta implements Serializable {
    private int id;
    private String texto;
    private String tema;
    private ArrayList<Opcion> opciones;

    public Pregunta() {

    }

    public Pregunta(int id, String texto, String tema, ArrayList<Opcion> opciones) {
        this.id = id;
        this.texto = texto;
        this.tema = tema;
        this.opciones = opciones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public ArrayList<Opcion> getOpciones() {
        return opciones;
    }

    public void setOpciones(ArrayList<Opcion> opciones) {
        this.opciones = opciones;
    }

    @Override
    public String toString() {
        return "Pregunta{" +
                "id=" + id +
                ", texto='" + texto + '\'' +
                ", tema='" + tema + '\'' +
                ", opciones=" + opciones +
                '}';
    }
}
