package org.example;

import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;
import org.neodatis.odb.Objects;

/**
 * Clase para crear la base de datos con las preguntas
 */
public class IniPreguntas {

    /**
     * Método main
     * @param args
     */
    public static void main(String[] args) {
        borrar();
//        preguntasES();
//        preguntasEN();
    }

    /**
     * Método que almacena las preguntas en español
     */
    public static void preguntasES() {
        Methods.almacenar(1, "¿Cuándo se celebró el primer Mundial de fútbol?", "Deportes", "1930", "1950", "1920", "1940", true, false, false, false);
        Methods.almacenar(2, "¿Cuál es el estadio de fútbol con mayor capacidad del mundo?", "Deportes", "Michigan Stadium", "Santiago Bernabéu", "Rungrado Primero de Mayo", "Spotify Camp Nou", false, false, true, false);
        Methods.almacenar(3, "¿Qué número llevaba a la espalda Raúl González en el Real Madrid?", "Deportes", "10", "7", "14", "9", false, true, false, false);
        Methods.almacenar(4, "¿Cuál es el apodo del Leicester City?", "Deportes", "Foxes", "Gunners", "Reds", "Citizens", true, false, false, false);
        Methods.almacenar(5, "¿En qué club italiano jugó Diego Maradona?", "Deportes", "Juventus", "Atalanta", "AC Milan", "Napoli", false, false, false, true);

        Methods.almacenar(6, "¿Con qué nombre se conoce el miedo a las alturas?", "Ciencia", "Acrofobia", "Altifobia", "Abisfobia", "Agorafobia", true, false, false, false);
        Methods.almacenar(7, "¿Con qué nombre se denominan las células nerviosas?", "Ciencia", "Nervionas", "Eucariotas", "Neuronas", "Procariotas", false, false, true, false);
        Methods.almacenar(8, "¿Cuál de los siguientes es el ave vivo más grande en la actualidad?", "Ciencia", "Buitre leonado", "Halcón peregrino", "Águila real", "Albatros viajero", false, false, false, true);
        Methods.almacenar(9, "Alnilam, Alnitak y Mintaka son las estrellas que dibujan una línea vista desde la Tierra. ¿Cómo se llama esta línea?", "Ciencia", "Vía Láctea", "Cinturón de Orión", "Osa Menor", "Osa Mayor", false, true, false, false);
        Methods.almacenar(10, "La claustrofobia es el nombre técnico del miedo que tienen ciertas personas... ¿a qué?", "Ciencia", "A las monjas", "A los museos", "A los espacios cerrados", "A los espacios abiertos", false, false, true, false);

        Methods.almacenar(11, "¿El asesinato de quién fue el detonante de la Primera Guerra Mundial?", "Historia", "Winston Churchill", "Francisco Fernando de Habsburgo", "J. Robert Oppenheimer", "Nicolás II de Rusia", false, true, false, false);
        Methods.almacenar(12, "¿Quién fue el primer presidente de Estados Unidos?", "Historia", "George Washington", "Thomas Jefferson", "Abraham Lincoln", "Theodore Roosevelt", true, false, false, false);
        Methods.almacenar(13, "¿Qué caravela no regresó tras el primer viaje de Colón a América?", "Historia", "La Pinta", "La Niña", "La Santa María", "Todas regresaron", false, false, true, false);
        Methods.almacenar(14, "¿En qué isla estuvo preso Napoleón?", "Historia", "Tortuga", "Madeira", "Tenerife", "Santa Elena", false, false, false, true);
        Methods.almacenar(15, "¿En qué año pisó el hombre la Luna por primera vez?", "Historia", "1969", "1971", "1975", "1979", true, false, false, false);

        Methods.almacenar(16, "¿En qué película se cantaba 'Bajo el mar'?", "Cine", "La Sirenita", "Avatar: El Sentido del Agua", "Buscando a Nemo", "Master and Commander", true, false, false, false);
        Methods.almacenar(17, "¿Qué personaje de los X-MEN se cura rápidamente?", "Cine", "Cíclope", "Lobezno", "Bestia", "Tormenta", false, true, false, false);
        Methods.almacenar(18, "¿Cuántas casas existen en Hogwarts, el colegio mágico de la saga de Harry Potter?", "Cine", "2", "3", "4", "5", false, false, true, false);
        Methods.almacenar(19, "¿Cuál es la película que más Oscars ha ganado en la historia?", "Cine", "Titanic", "El Señor de los Anillos: El Retorno del Rey", "Ben Hur", "Todas las anteriores son correctas", false, false, false, true);
        Methods.almacenar(20, "¿Qué actor interpreta a Harry Hart en la saga Kingsman?", "Cine", "Michael Caine", "Colin Firth", "Ralph Fiennes", "George Clooney", false, true, false, false);

        Methods.almacenar(21, "¿Cuál es el río más largo de la Península Ibérica?", "Geografía", "Tajo", "Ebro", "Miño", "Guadalquivir", true, false, false, false);
        Methods.almacenar(22, "¿Cuál es el país más pequeño del mundo?", "Geografía", "Mónaco", "Ciudad del Vaticano", "Nauru", "San Marino", false, true, false, false);
        Methods.almacenar(23, "¿Cuántos océanos hay en la Tierra?", "Geografía", "3", "4", "5", "6", false, false, true, false);
        Methods.almacenar(24, "¿Qué río pasa por más países?", "Geografía", "Rin", "Volga", "Po", "Danubio", false, false, false, true);
        Methods.almacenar(25, "¿Dónde se encuentra el arrecife de coral más grande?", "Geografía", "Australia", "EEUU", "Brasil", "Madagascar", true, false, false, false);
    }

    /**
     * Método que almacena las preguntas en inglés
     */
    public static void preguntasEN() {
        Methods.store(1, "What country has competed the most times in the Summer Olympics yet hasn't won any kind of medal?", "Sports", "Italy", "Australia", "Liechtenstein", "Hungary", false, false, true, false);
        Methods.store(2, "The Olympics are held every how many years?", "Sports", "2", "4", "6", "8", false, true, false, false);
        Methods.store(3, "Which MLS franchise team does David Beckham own?", "Sports", "Inter Miami", "LA FC", "LA Galaxy", "DC United", true, false, false, false);
        Methods.store(4, "How many medals did China win at the Beijing Olympics?", "Sports", "92", "97", "100", "103", false, false, true, false);
        Methods.store(5, "In meters, how big is an Olympic-sized swimming pool?", "Sports", "50 meters long and 25 meters wide.", "55 meters long and 30 meters wide.", "40 meters long and 20 meters wide.", "60 meters long and 30 meters wide.", true, false, false, false);

        Methods.store(6, "What is measured with the Richter scale?", "Science", "Earthquakes", "Tornados", "Tsunamis", "Nuclear explosions", true, false, false, false);
        Methods.store(7, "What is the nearest planet to the Sun?", "Science", "Venus", "Mars", "Mercury", "Those three are at the same distance from the Sun", false, false, true, false);
        Methods.store(8, "How many elements are there in the periodic table?", "Science", "101", "128", "112", "118", false, false, false, true);
        Methods.store(9, "Dolly the Ewe's birth in 1996 and subsequent life helped prove the viability of what scientific and technological process?", "Science", "Teleporting", "Resurrection", "Cloning", "Travelling to the Moon", false, false, true, false);
        Methods.store(10, "GUI is short for what well-known three-word tech term?", "Science", "Graphical Unique Item", "Graphical User Interface", "Generic User Item", "Generic Unique Interface", false, true, false, false);

        Methods.store(11, "How many years did the 100 years war last?", "History", "99", "100", "110", "116", false, false, false, true);
        Methods.store(12, "In which year did Hitler commit suicide?", "History", "1940", "1945", "1946", "1949", false, true, false, false);
        Methods.store(13, "In which year was John F. Kennedy assassinated?", "History", "1963", "1966", "1970", "1972", true, false, false, false);
        Methods.store(14, "Greenland was a colony of which country until 1981?", "History", "United Kingdom", "Finland", "Sweden", "Denmark", false, false, false, true);
        Methods.store(15, "How many U.S. presidents have been assassinated?", "History", "1", "2", "3", "4", false, false, false, true);

        Methods.store(16, "What are the dying words of Charles Foster Kane in Citizen Kane?", "Cinema", "That was all, folks", "Goodbye", "Rosebud", "Mary Jane", false, false, true, false);
        Methods.store(17, "What was the first feature-length animated movie ever released?", "Cinema", "Cinderella", "Snow White and the Seven Dwarfs", "The Sleeping Beauty", "Pinnochio", false, true, false, false);
        Methods.store(18, "In The Matrix, does Neo take the blue pill or the red pill?", "Cinema", "Red", "Blue", "None of them", "Both of them", true, false, false, false);
        Methods.store(19, "The head of what kind of animal is front-and-center in an infamous scene from The Godfather?", "Cinema", "Bear", "Horse", "Cat", "Bird", false, true, false, false);
        Methods.store(20, "For what movie did Tom Hanks score his first Academy Award nomination?", "Cinema", "Forrest Gump", "Saving Private Ryan", "Cast Away", "Big", false, false, false, true);

        Methods.store(21, "What is the name of the tallest mountain in the world?", "Geography", "Kilimanjaro", "Everest", "K2", "Matterhorn", false, true, false, false);
        Methods.store(22, "Which country has the largest population in the world?", "Geography", "China", "India", "Japan", "Indonesia", true, false, false, false);
        Methods.store(23, "What is the name of the longest river in Africa?", "Geography", "Ebro", "Mississipi", "Amazon", "Nile", false, false, false, true);
        Methods.store(24, "What American city is the Golden Gate Bridge located in?", "Geography", "San Francisco", "Chicago", "Dallas", "New York", true, false, false, false);
        Methods.store(25, "What is the name of the largest country in the world?", "Geography", "USA", "China", "Russia", "France", false, false, true, false);
    }

    /**
     * Método que borra todos los registros en las bases de datos de las preguntas en español, en inglés y los records
     */
    public static void borrar() {

        Objects<Object> preguntas = null;
        Objects<Object> opciones = null;
        Objects<Object> records = null;
        ODB odb = null;

        try {
            odb = ODBFactory.open("src\\databases\\NeodatisPreguntas.db");
            preguntas = odb.getObjects(Pregunta.class);
            opciones = odb.getObjects(Opcion.class);
            for (Object o : preguntas) {
                odb.delete(o);
            }
            for (Object o : opciones) {
                odb.delete(o);
            }
        } finally {
            if (odb != null) odb.close();
        }

        try {
            odb = ODBFactory.open("src\\databases\\NeodatisQuestions.db");
            preguntas = odb.getObjects(Pregunta.class);
            opciones = odb.getObjects(Opcion.class);
            for (Object o : preguntas) {
                odb.delete(o);
            }
            for (Object o : opciones) {
                odb.delete(o);
            }
        } finally {
            if (odb != null) odb.close();
        }

        try {
            odb = ODBFactory.open("src\\databases\\NeodatisRecords.db");
            records = odb.getObjects(Record.class);
            for (Object o : records) {
                odb.delete(o);
            }
        } finally {
            if (odb != null) odb.close();
        }
    }
}

