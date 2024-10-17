package org.example;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase principal que ejecuta el juego
 */
public class App {

    /**
     * Método main
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

//        Definir Scanner y variables
        Scanner teclado = new Scanner(System.in);
        int ronda = 0;
        int puntos = 0;
        String correcta = "";

        int opMenu = 0;
        int opIdioma = 0;

        boolean deportes = false;
        boolean tecnologia = false;
        boolean historia = false;
        boolean cine = false;
        boolean geografia = false;

        ArrayList<Pregunta> totalPreguntas = Methods.listarPregunta();
        ArrayList<Pregunta> showPreguntas = Methods.listarPregunta();
        ArrayList<Pregunta> repetidas = new ArrayList<>();

        ArrayList<Pregunta> totalPreguntasEN = Methods.listarPreguntaEN();
        ArrayList<Pregunta> showPreguntasEN = Methods.listarPreguntaEN();
        ArrayList<Pregunta> repetidasEN = new ArrayList<>();

//        Bucle para mostrar el menú
        do {
            opMenu = Methods.showMenu();

//            Opción 1 - muestra la información del juego
            if (opMenu == 1) {
                Methods.showInfo();

//                Opción 2 - Inicia el juego - Elegir entre dos idiomas
            } else if (opMenu == 2) {

                do {
                    System.out.println("\nElige tu idioma / " +
                            "\033[3mChoose your language:\033[0m\n" +
                            "1 - Español\n2 - English");
                    opIdioma = Methods.numInput(2);

//                    Ejecuta el juego en español
                    if (opIdioma == 1) {
                        juegoES(teclado, puntos, ronda, deportes, tecnologia, historia, cine, geografia, correcta, totalPreguntas, showPreguntas, repetidas);
                    }
//                    Ejecuta el juego en inglés
                    if (opIdioma == 2) {
                        juegoEN(teclado, puntos, ronda, deportes, tecnologia, historia, cine, geografia, correcta, totalPreguntasEN, showPreguntasEN, repetidasEN);
                    }

                } while (opIdioma != 1 && opIdioma != 2);

//                Opción 3 - Muestra registro de partidas
            } else if (opMenu == 3) {
                System.out.println("\n\033[1m--- PARTIDAS ---\033[0m");
                Methods.listarRecord();

            } else {
            }

        } while (opMenu == 1 || opMenu == 3);
    }

    /**
     * Método que ejecuta el juego en español
     * @param teclado permite escribir por consola
     * @param puntos puntuación del jugador en cada partida
     * @param ronda ronda actual
     * @param deportes define si se ha acertado al menos una pregunta de la categoría Deportes
     * @param tecnologia define si se ha acertado al menos una pregunta de la categoría Tecnología
     * @param historia define si se ha acertado al menos una pregunta de la categoría Historia
     * @param cine define si se ha acertado al menos una pregunta de la categoría Cine
     * @param geografia define si se ha acertado al menos una pregunta de la categoría Geografía
     * @param correcta para validar opción correcta
     * @param totalPreguntas preguntas totales
     * @param showPreguntas preguntas que se van mostrando
     * @param repetidas preguntas que se hacen y se van eliminando de showPreguntas
     * @throws InterruptedException
     */
    public static void juegoES(Scanner teclado, int puntos, int ronda, boolean deportes, boolean tecnologia, boolean historia, boolean cine, boolean geografia, String correcta, ArrayList<Pregunta> totalPreguntas, ArrayList<Pregunta> showPreguntas, ArrayList<Pregunta> repetidas) throws InterruptedException {
        String nombre;
        String opcion;

        System.out.print("Introduce tu nombre: ");

//        Bucle para introducir nombre
        do {
            nombre = teclado.nextLine();
            if (nombre.isEmpty()) {
                System.out.print("ERROR: Debes introducir un nombre.\n\nIntroduce tu nombre: ");
            }

        } while (nombre.isEmpty());

//        Bucle del juego
        do {
            for (int i = 0; i < totalPreguntas.size(); i++) {

//                Muestra la ronda
                ronda++;
                System.out.println("\n\033[1m--- RONDA " + ronda + " ---\033[0m");

                Pregunta pregunta = showPreguntas.get((int) (Math.random() * (showPreguntas.size() - 0)) + 0);
                repetidas.add(pregunta);
                showPreguntas.remove(pregunta);

//                Muestra el tema
                System.out.println("\033[1mTema: " + pregunta.getTema() + "\033[0m\n");

//                Muestra la pregunta
                System.out.println(pregunta.getTexto());

//                Muestra las opciones
                for (int j = 0; j < pregunta.getOpciones().size(); j++) {
                    System.out.println(pregunta.getOpciones().get(j).getRespuesta() + ") " + pregunta.getOpciones().get(j).getTexto());

                    if (pregunta.getOpciones().get(j).isAcierto()) {
                        correcta = pregunta.getOpciones().get(j).getRespuesta();
                    }
                }

//                Respuesta del jugador
                System.out.print("\nIntroduce tu respuesta: ");
                opcion = Methods.respuestaJugador();

//                Determinar si la respuesta es correcta o no y qué categoría se ha acertado
                if (opcion.equals(correcta)) {
                    puntos++;
                    System.out.println("¡Correcto!\nPuntos: " + puntos);
                    if (pregunta.getTema().matches("Deportes")) deportes = true;
                    if (pregunta.getTema().matches("Ciencia")) tecnologia = true;
                    if (pregunta.getTema().matches("Historia")) historia = true;
                    if (pregunta.getTema().matches("Cine")) cine = true;
                    if (pregunta.getTema().matches("Geografía")) geografia = true;

                } else {
                    System.out.println("¡Incorrecto!\nPuntos: " + puntos);
                }
            }

//            Guardar registro de la partida
            if (deportes && tecnologia && historia && cine && geografia) {
                Methods.guardarRecord(nombre, "Español", puntos, "Sí");
            } else {
                Methods.guardarRecord(nombre, "Español", puntos, "No");
            }

        } while ((!deportes && !tecnologia && !historia && !cine && !geografia) || !showPreguntas.isEmpty());
    }

    /**
     * Método que ejecuta el juego en inglés
     * @param teclado permite escribir por consola
     * @param puntos puntuación del jugador en cada partida
     * @param ronda ronda actual
     * @param deportes define si se ha acertado al menos una pregunta de la categoría Deportes
     * @param tecnologia define si se ha acertado al menos una pregunta de la categoría Tecnología
     * @param historia define si se ha acertado al menos una pregunta de la categoría Historia
     * @param cine define si se ha acertado al menos una pregunta de la categoría Cine
     * @param geografia define si se ha acertado al menos una pregunta de la categoría Geografía
     * @param correcta para validar opción correcta
     * @param totalPreguntasEN preguntas totales
     * @param showPreguntasEN preguntas que se van mostrando
     * @param repetidasEN preguntas que se hacen y se van eliminando de showPreguntasEN
     * @throws InterruptedException
     */
    public static void juegoEN(Scanner teclado, int puntos, int ronda, boolean deportes, boolean tecnologia, boolean historia, boolean cine, boolean geografia, String correcta, ArrayList<Pregunta> totalPreguntasEN, ArrayList<Pregunta> showPreguntasEN, ArrayList<Pregunta> repetidasEN) throws InterruptedException {
        String nombre;
        String opcion;

        System.out.print("Enter your name: ");

        do {
            nombre = teclado.nextLine();
            if (nombre.isEmpty()) {
                System.out.print("ERROR: You should write a name.\n\nEnter your name: ");
            }

        } while (nombre.isEmpty());

        do {
            for (int i = 0; i < totalPreguntasEN.size(); i++) {

                ronda++;
                System.out.println("\n\033[1m--- ROUND " + ronda + " ---\033[0m");

                Pregunta pregunta = showPreguntasEN.get((int) (Math.random() * (showPreguntasEN.size() - 0)) + 0);
                repetidasEN.add(pregunta);
                showPreguntasEN.remove(pregunta);

                System.out.println("\033[1mCategory: " + pregunta.getTema() + "\033[0m\n");

                System.out.println(pregunta.getTexto());

                for (int j = 0; j < pregunta.getOpciones().size(); j++) {
                    System.out.println(pregunta.getOpciones().get(j).getRespuesta() + ") " + pregunta.getOpciones().get(j).getTexto());

                    if (pregunta.getOpciones().get(j).isAcierto()) {
                        correcta = pregunta.getOpciones().get(j).getRespuesta();
                    }
                }

                System.out.print("\nEnter your answer: ");
                opcion = Methods.respuestaJugadorEN();

                if (opcion.equals(correcta)) {
                    puntos++;
                    System.out.println("Correct!\nScore: " + puntos);
                    if (pregunta.getTema().matches("Sports")) deportes = true;
                    if (pregunta.getTema().matches("Science")) tecnologia = true;
                    if (pregunta.getTema().matches("History")) historia = true;
                    if (pregunta.getTema().matches("Cinema")) cine = true;
                    if (pregunta.getTema().matches("Geography")) geografia = true;

                } else {
                    System.out.println("Incorrect!\nScore: " + puntos);
                }
            }

            if (deportes && tecnologia && historia && cine && geografia) {
                Methods.guardarRecord(nombre, "English", puntos, "Yes");
            } else {
                Methods.guardarRecord(nombre, "English", puntos, "No");
            }

        } while ((!deportes && !tecnologia && !historia && !cine && !geografia) || !showPreguntasEN.isEmpty());
    }


}
