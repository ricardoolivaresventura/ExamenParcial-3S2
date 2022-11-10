package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class RestoDeItemsPregunta1 {

    /**
     * Completa sin causar un error de compilación
     */

    public void remove(List<Character> chars){
        /**
         * Este método busca eliminar aquellos elementos de la
         * lista chars que cumplan que están después del caractér 'a'
         * y antes del caractér 'z'
         */
        char end = 'a';
        boolean result = chars.removeIf(c -> {
            char start = 'a'; return start <= c && c <= end; });
        //Insetar código
        if(result){
            System.out.println("Se eliminaron algunos elementos: "+chars);
        }
        else{
            System.out.println("No se eliminó ningún elemento");
        }
    }

    /**
     * ¿Qué puedes decir del siguiente código?
     */

    public void methodWithSupplier(){
        int length = 3;
        for(int i=0; i<3; i++){
            if(i%2 == 0){
                //0,2
                Supplier<Integer> supplier = () -> length; // A
                System.out.println(supplier.get()); // B
            }
            else{
                //1
                int j = i;
                Supplier<Integer> supplier = () -> j; // C
                System.out.println(supplier.get()); // D
            }
        }

        /**
         * La interfaz supplier no toma ningún argumento, pero producto algún
         * valor de tipo T
         *
         * A: En este caso, la interfaz supplier va a generar un valor de tipo Integer,
         * el cual es "length"
         * B: Luego, obtenemos dicho valor usando el método .get()
         *
         * C: En esta caso es similar que en el caso "A", con la diferencia
         * en que ahora el valor que se produce es el valor de "j"
         *
         * D: Luego, se obtiene el valor de "j" con .get() y se muestra por consola
         */

    }

    /**
     * Inserta código sin causar error de compilación
     */

    public void remove2(List<Character> chars){
        /**
         * Este método busca eliminar aquellos elementos de la
         * lista chars que cumplan que están después del caractér 'a'
         * y antes del caractér 'z'
         */
        char end = 'z';
        //Insertar código
        System.out.println("Lista inicial: "+chars);
        char start = 'a';
        boolean result = chars.removeIf(c -> {
            return start <= c && c <= end; });
        if(result){
            System.out.println("Se eliminaron algunos elementos: "+chars);
        }
        else{
            System.out.println("No se eliminó ningún elemento");
        }
    }

    public static void main(String[] args) {
        ArrayList<Character> chars = new ArrayList<Character>();
        chars.add('a');
        chars.add('b');
        chars.add('c');
        chars.add('d');
        chars.add('e');
        chars.add('f');
        chars.add('g');
        chars.add('h');
        chars.add('i');
        chars.add('j');
        chars.add('k');
        chars.add('l');
        chars.add('z');
        RestoDeItemsPregunta1 restoDeItemsPregunta1 = new RestoDeItemsPregunta1();
        //restoDeItemsPregunta1.remove(chars);

        ArrayList<Character> chars2 = new ArrayList<Character>();
        chars2.add('a');
        chars2.add('b');
        chars2.add('c');
        chars2.add('d');
        chars2.add('e');
        chars2.add('f');
        chars2.add('g');
        chars2.add('h');
        chars2.add('i');
        chars2.add('j');
        chars2.add('k');
        chars2.add('l');
        chars2.add('z');

        //restoDeItemsPregunta1.remove(chars2);
        restoDeItemsPregunta1.methodWithSupplier();
    }

}
