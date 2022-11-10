package org.example;

/**
 * Pregunta 1.b:
 * ¿Cuál es el resultado del siguiente código?
 */

/**
 * Climb es un lambda, ya que, es una interface con un
 * solo método
 */
interface Climb{
    boolean isTooHigh(int height, int limit);
}

public class Climber {

    /**
     * RESPUESTA:
     * El código tiene un error en la línea donde se ha escrito
     * "h.append(m)". Este error ocurre, porque el método append
     * es de la clase String y el parámetro "h" es un entero al igual que
     * el parámetro m
     */

    public static void main(String[] args) {
        check((h, m) -> h.append(m).isEmpty(), 5);
    }

    private static void check(Climb climb, int height) {
        if (climb.isTooHigh(height, 10)){
            System.out.println("too high");
        }
        else{
            System.out.println("ok");
        }
    }
}
