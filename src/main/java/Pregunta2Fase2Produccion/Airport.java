package Pregunta2Fase2Produccion;

/**
 * Pregunta 2.4 Revisa la Fase 2 de la evaluación y realiza
 * La diferencia entre esta clase Airport de la Fase 2 y la clase Airport de
 * la carpeta Anterior de la pregunta 2, es que en esta Fase 2 se está utilizando
 * polimorfismo, siendo la Flight la clase abstracta base.
 *
 * Además, tenemos clases, que heredan de la clase Flight, para cada uno de los
 * tipos de vuelos. Por ejemplo, tenemos la clase BusinessFlight y EconomyFlight.
 *
 * Por ello, al momento de instanciar un vuelo económico, simplemente instanciamos
 * un objeto de la clase EconomyFlight y ya no tenemos que pasarle como parámetro un
 * string que indique el tipo de vuelo. Y para el caso de un vuelo de negocios,
 * tenemos que instanciar un objeto de la clase BusinessFlight y tampoco tenemos
 * que pasarle un string que indique el tipo de vuelo.
 *
 * Esto hace que el código sea más mantenible, porque podemos tener la lógica de
 * cada tipo de vuelo separada en su propia clase y además, dentro de la clase Flight,
 * podemos tener todas aquellas funciones, atributos, etc que compartan los vuelos,
 * para que de esta manera podamos reutilizar código
 */

public class Airport {
    public static void main(String[] args) {
        Flight economyFlight = new EconomyFlight("1");
        Flight businessFlight = new BusinessFlight("2");

        Passenger cesar = new Passenger("Cesar", true);
        Passenger jessica = new Passenger("Jessica", false);

        businessFlight.addPassenger(cesar);
        businessFlight.removePassenger(cesar);
        businessFlight.addPassenger(jessica);
        economyFlight.addPassenger(jessica);

        System.out.println("Lista de pasajeros de vuelos de negocios:");
        for (Passenger passenger : businessFlight.getPassengers()) {
            System.out.println(passenger.getName());
        }

        System.out.println("Lista de pasajeros de vuelos economicos:");
        for (Passenger passenger : economyFlight.getPassengers()) {
            System.out.println(passenger.getName());
        }

    }
}
