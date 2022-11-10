package org.example;
import java.util.function.*;

/**
 * Pregunta 1:
 * ¿Cuál es el resultado de la siguiente clase?
 */

public class Panda {
    int age;

    public static void main(String[] args) {
        Panda p1 = new Panda();
        p1.age = 1;
        check(p1, p -> p.age < 5);
    }

    /**
     * El método check espera como parámetro un objeto de tipo panda
     * y una expresión lambada, la cual se evalú después con el método
     * "test" del parámetro "pred".
     *
     * Para este caso, lo que queremos comprobar es si la edad
     * del panda es menor a 5, por lo tanto, en el segundo
     * parámetro se hace la comparación entre la edad de dicho panda
     * con el número "5". Esto se comprueba en el método "test" de "pred",
     * en caso que "test" devuelva "true", entonces se muestra en consola
     * "match" (El panda sí tiene menos de 5), caso contrario se muestra
     * "not match" (El panta tiene más de 5)
     *
     * En resumen: EL RESULTADO DE LA SIGUIENTE CLASE
     * ES MATCH
     *
     */

    private static void check(Panda panda, Predicate<Panda>pred){
        String result = pred.test(panda) ? "match" : "not match";
        System.out.println(result);
    }
}
