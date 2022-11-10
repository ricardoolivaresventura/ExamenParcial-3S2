package org.example;

/**
 * Pregunta 1.c
 * ¿Qué lambda puede reemplazar a la clase Secret1
 * para devolver el mismo valor?
 */

interface Secret{
    String magic(double d);
}

public class Secret1 implements Secret{

    public static void main(String[] args) {

    }

    @Override
    public String magic(double d) {
        return "Poog";
    }
}
