package Pregunta2Fase4Produccion;

/*
PREGUNTA 2.7
Escribe el diseño inicial de la clase llamada PremiumFlight y agrega a la Fase 4 en
        la carpeta producción.
*/

public class PremiumFlight extends Flight{

    // Diseño inicial de la clase  PremiumFlight. Pregunta 2.7
    public PremiumFlight(String id){
        super(id);
    }

    @Override
    public boolean addPassenger(Passenger passenger) {
        if(passenger.isVip()){
            return passengers.add(passenger);
        }
        return false;
    }

    /**
     * Cualquier pasajero que esté en un vuelo premium puede ser removido
     */
    @Override
    public boolean removePassenger(Passenger passenger) {
        return true;
    }

}
