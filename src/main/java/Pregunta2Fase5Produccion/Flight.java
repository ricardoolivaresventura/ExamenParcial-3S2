package Pregunta2Fase5Produccion;

import java.util.*;
public abstract class Flight {

    private String id;
    Set<Passenger> passengers = new HashSet<>();
    // List<Passenger> passengers = new ArrayList<Passenger>();

    public Flight(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public Set<Passenger> getPassengersSet() {
        return Collections.unmodifiableSet(passengers);
    }

    /* public List<Passenger> getPassengersList() {
        return Collections.unmodifiableList(passengers);
    } */

    public abstract boolean addPassenger(Passenger passenger);

    public abstract boolean removePassenger(Passenger passenger);

}
