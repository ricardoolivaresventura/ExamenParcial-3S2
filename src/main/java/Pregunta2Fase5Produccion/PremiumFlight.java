package Pregunta2Fase5Produccion;

/*
PREGUNTA 2.9
Agrega la lógica comercial solo para pasajeros VIP en la clase PremiumFlight.
Guarda ese archivo en la carpeta Producción de la Fase 5.
*/

public class PremiumFlight extends Flight {

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

    @Override
    public boolean removePassenger(Passenger passenger) {
        return true;
    }
}
