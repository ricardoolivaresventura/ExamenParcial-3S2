package Preguna2Fase3Produccion;

import Pregunta2Fase2Produccion.BusinessFlight;
import Pregunta2Fase2Produccion.EconomyFlight;
import Pregunta2Fase2Produccion.Flight;
import Pregunta2Fase2Produccion.Passenger;

public class Airport {
    public static void main(String[] args) {
        Pregunta2Fase2Produccion.Flight economyFlight = new EconomyFlight("1");
        Flight businessFlight = new BusinessFlight("2");

        Pregunta2Fase2Produccion.Passenger cesar = new Pregunta2Fase2Produccion.Passenger("Cesar", true);
        Pregunta2Fase2Produccion.Passenger jessica = new Pregunta2Fase2Produccion.Passenger("Jessica", false);

        businessFlight.addPassenger(cesar);
        businessFlight.removePassenger(cesar);
        businessFlight.addPassenger(jessica);
        economyFlight.addPassenger(jessica);

        System.out.println("Lista de pasajeros de vuelos de negocios:");
        for (Pregunta2Fase2Produccion.Passenger passenger : businessFlight.getPassengers()) {
            System.out.println(passenger.getName());
        }

        System.out.println("Lista de pasajeros de vuelos economicos:");
        for (Passenger passenger : economyFlight.getPassengers()) {
            System.out.println(passenger.getName());
        }

    }
}
