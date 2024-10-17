package org.example;

import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;
import org.neodatis.odb.Objects;
import org.neodatis.odb.core.query.IQuery;
import org.neodatis.odb.impl.core.query.criteria.CriteriaQuery;

import java.util.*;

/**
 * Clase con todos los métodos necesarios en el proyecto
 */
public class Methods {

    /**
     * El jugador debe introducir un número comprendido entre 1 y un valor máximo
     * @param max valor máximo
     * @return
     */
    public static int numInput(int max) {
        int numero = 0;
        boolean validar = false;

        do {
            System.out.print("\nTu elección: ");
            Scanner scanner = new Scanner(System.in);

            try {

                do {
                    numero = scanner.nextInt();
                    if (numero > max || numero <= 0) {
                        System.out.print("Introduce el número asignado a una de las opciones.\nTu elección: ");
                    }
                } while (numero > max || numero <= 0);
                validar = true;

            } catch (Exception e) {
                System.out.print("Introduce el número asignado a una de las opciones.");
                validar = false;
            }
        } while (!validar);
        return numero;
    }

    /**
     * El jugador debe introducir una letra comprendida entre la 'a' y la 'd'
     * @return
     */
    public static String respuestaJugador() {
        Scanner teclado = new Scanner(System.in);
        String opcion = "";

        do {
            opcion = teclado.next();

            if (!(opcion.equals("a") || opcion.equals("b") || opcion.equals("c") || opcion.equals("d"))) {
                System.out.print("ERROR: La letra introducida debe ser minúscula y estar entre la 'a' y la 'd'\n\nIntroduce tu respuesta: ");
            }
        } while (!(opcion.equals("a") || opcion.equals("b") || opcion.equals("c") || opcion.equals("d")));
        return opcion;
    }

    public static String respuestaJugadorEN() {
        Scanner teclado = new Scanner(System.in);
        String opcion = "";

        do {
            opcion = teclado.next();

            if (!(opcion.equals("a") || opcion.equals("b") || opcion.equals("c") || opcion.equals("d"))) {
                System.out.print("ERROR: The letter entered should be lower-case and it has to be between 'a' and 'd'\n\nEnter your answer: ");
            }
        } while (!(opcion.equals("a") || opcion.equals("b") || opcion.equals("c") || opcion.equals("d")));
        return opcion;
    }

    /**
     * Muestra el menú
     * @return
     */
    public static int showMenu() {
        System.out.println("\n\033[1m--- MENÚ ---\033[0m\n" +
                "1 - Información\n" +
                "2 - Jugar\n" +
                "3 - Partidas\n" +
                "4 - Salir");
        return numInput(4);
    }

    /**
     * Muestra la información del juego
     */
    public static void showInfo() {
        System.out.println("\n\033[1m--- INFORMACIÓN ---\033[0m\n" +
                "El jugador deberá responder 25 preguntas divididas en 5 categorías diferentes.\n" +
                "Cada pregunta tiene asignadas 4 respuestas y sólo una es correcta.\n" +
                "Si el jugador responde correctamente, al menos, una pregunta de cada categoría, completará el juego.\n" +
                "Con cada acierto sumará un punto y, al final de la partida, se registrará junto al nombre del jugador, el resultado en puntos y si ha completado el juego o no.\n" +
                "¡A jugar!");
    }

    /**
     * Almacena las preguntas en español
     * @param id ID asignada a cada pregunta
     * @param textoPregunta texto correspondiente a cada pregunta
     * @param tematica tema o categoría de la pregunta
     * @param opcion1 primera opción
     * @param opcion2 segunda opción
     * @param opcion3 tercera opción
     * @param opcion4 cuarta opción
     * @param esAcierto1 determina si la primera opción es correcta o no
     * @param esAcierto2 determina si la segunda opción es correcta o no
     * @param esAcierto3 determina si la tercera opción es correcta o no
     * @param esAcierto4 determina si la cuarta opción es correcta o no
     */
    public static void almacenar(int id, String textoPregunta, String tematica, String opcion1, String opcion2, String opcion3, String opcion4, boolean esAcierto1, boolean esAcierto2, boolean esAcierto3, boolean esAcierto4) {

        ArrayList<Opcion> listaOpciones = new ArrayList<>();
        Pregunta pregunta = new Pregunta(id, textoPregunta, tematica, listaOpciones);

        Opcion o1 = new Opcion("a", opcion1, esAcierto1);
        Opcion o2 = new Opcion("b", opcion2, esAcierto2);
        Opcion o3 = new Opcion("c", opcion3, esAcierto3);
        Opcion o4 = new Opcion("d", opcion4, esAcierto4);

        listaOpciones.add(o1);
        listaOpciones.add(o2);
        listaOpciones.add(o3);
        listaOpciones.add(o4);

        ODB odb = null;

        try {
            odb = ODBFactory.open("src\\databases\\NeodatisPreguntas.db");
            odb.store(pregunta);

        } finally {
            if (odb != null) {
                odb.close();
            }
        }
    }

    /**
     * Almacena las preguntas en inglés
     * @param id ID asignada a cada pregunta
     * @param textoPregunta texto correspondiente a cada pregunta
     * @param tematica tema o categoría de la pregunta
     * @param opcion1 primera opción
     * @param opcion2 segunda opción
     * @param opcion3 tercera opción
     * @param opcion4 cuarta opción
     * @param esAcierto1 determina si la primera opción es correcta o no
     * @param esAcierto2 determina si la segunda opción es correcta o no
     * @param esAcierto3 determina si la tercera opción es correcta o no
     * @param esAcierto4 determina si la cuarta opción es correcta o no
     */
    public static void store(int id, String textoPregunta, String tematica, String opcion1, String opcion2, String opcion3, String opcion4, boolean esAcierto1, boolean esAcierto2, boolean esAcierto3, boolean esAcierto4) {

        ArrayList<Opcion> listaOpciones = new ArrayList<>();
        Pregunta pregunta = new Pregunta(id, textoPregunta, tematica, listaOpciones);

        Opcion o1 = new Opcion("a", opcion1, esAcierto1);
        Opcion o2 = new Opcion("b", opcion2, esAcierto2);
        Opcion o3 = new Opcion("c", opcion3, esAcierto3);
        Opcion o4 = new Opcion("d", opcion4, esAcierto4);

        listaOpciones.add(o1);
        listaOpciones.add(o2);
        listaOpciones.add(o3);
        listaOpciones.add(o4);

        ODB odb = null;

        try {
            odb = ODBFactory.open("src\\databases\\NeodatisQuestions.db");
            odb.store(pregunta);

        } finally {
            if (odb != null) {
                odb.close();
            }
        }
    }

    /**
     * Lista las preguntas en español
     * @return
     */
    public static ArrayList<Pregunta> listarPregunta() {

        ODB odb = null;
        ArrayList<Pregunta> listaPreguntas = new ArrayList<>();

        try {
            odb = ODBFactory.open("src\\databases\\NeodatisPreguntas.db");
            Objects preguntas = odb.getObjects(Pregunta.class);

            while (preguntas.hasNext()) {
                listaPreguntas.add((Pregunta) preguntas.next());
            }
            return listaPreguntas;
        } finally {
            if (odb != null) {
                odb.close();
            }
        }
    }

    /**
     * Lista las preguntas en inglés
     * @return
     */
    public static ArrayList<Pregunta> listarPreguntaEN() {

        ODB odb = null;
        ArrayList<Pregunta> listaPreguntas = new ArrayList<>();

        try {
            odb = ODBFactory.open("src\\databases\\NeodatisQuestions.db");
            Objects preguntas = odb.getObjects(Pregunta.class);

            while (preguntas.hasNext()) {
                listaPreguntas.add((Pregunta) preguntas.next());
            }
            return listaPreguntas;
        } finally {
            if (odb != null) {
                odb.close();
            }
        }
    }

    /**
     * Guarda los registros de la partida
     * @param nombre nombre del jugador
     * @param idioma idioma en el que se ha jugado
     * @param puntos puntuación final
     * @param completado determina si se ha completado el juego o no
     */
    public static void guardarRecord(String nombre, String idioma, int puntos, String completado) {

        Record record = new Record(nombre, idioma, puntos, completado);

        ODB odb = null;

        try {
            odb = ODBFactory.open("src\\databases\\NeodatisRecords.db");
            odb.store(record);

        } finally {
            if (odb != null) {
                odb.close();
            }
        }
    }

    /**
     * Lista los registros de partidas almacenados
     */
    public static void listarRecord() {
        ODB odb = null;

        try {
            odb = ODBFactory.open("src\\databases\\NeodatisRecords.db");
            IQuery query = new CriteriaQuery(Record.class);
            Objects records = odb.getObjects(Record.class);
            while (records.hasNext()) {
                System.out.println(records.next());
            }
        } finally {
            if (odb != null) {
                odb.close();
            }
        }
    }
}
