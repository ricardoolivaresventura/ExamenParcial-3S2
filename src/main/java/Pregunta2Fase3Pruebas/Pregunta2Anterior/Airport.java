package Pregunta2Fase3Pruebas.Pregunta2Anterior;

public class Airport {
    public static void main(String[] args) {
        Flight economyFlight = new Flight("1", "Economico");
        Flight businessFlight = new Flight("2", "Negocios");

        Passenger cesar = new Passenger("Cesar", true);
        Passenger jessica = new Passenger("Jessica", false);

        businessFlight.addPassenger(cesar);
        businessFlight.removePassenger(cesar);
        businessFlight.addPassenger(jessica);
        economyFlight.addPassenger(jessica);

        System.out.println("Lista de pasajeros de vuelos de negocios:");
        for (Passenger passenger : businessFlight.getPassengersList()) {
            System.out.println(passenger.getName());
        }

        System.out.println("Lista de pasajeros de vuelos economicos:");
        for (Passenger passenger : economyFlight.getPassengersList()) {
            System.out.println(passenger.getName());
        }

        /**
         * Pregunta 2.1. Ejecuta el programa y presenta los resultados y exaplica
         * qué sucede.
         *
         * El resultado por consola es:
         * ------------------------------------------
         * Lista de pasajeros de vuelos de negocios:
         * Cesar
         * Lista de pasajeros de vuelos economicos:
         * Jessica
         * ------------------------------------------
         *
         * Esto ocurrió porque César es un pasajero VIP, en cambio Jessica no.
         * Por este motivo, a césar sí se le pudo agregar al vuelo de Negocios,
         * en cambio a Jessica no se le pudo agregar porque no es VIP.
         *
         * Además, vemos que en el código se intentó eliminar a césar del vuelo,
         * pero como César es VIP, entonces no se le pude eliminar.
         *
         * También, vemos que a Jessica sí se le pudo agregar al vuelo económico, ya que,
         * para este tipo de vuelo no hay ninguna restricción
         *
         */
    }
}
