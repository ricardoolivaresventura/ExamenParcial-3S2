package Pregunta2Fase1Pruebas;
import Pregunta2Anterior.Flight;
import Pregunta2Anterior.Passenger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * Pregunta 2.2. Si ejecutamos las pruebas con cobertura
 * desde Intellij IDEA. ¿Cuáles son los resultados que se muestran?
 * ¿Por qué crees que la cobertura del código no es del 100%?
 *
 * - Al inicio el test fallaba, ya que, se estaba creando un vuelo de tipo "Business",
 * pero la clase Flight solo soporta en español (Económio y Negocios)
 *
 * - Luego de cambiar Business por Negocios y ejecutando los test with coverage, obtenemos
 * un coverage de Class(100%), Method(100%) y Line(100%). Este resultado del 100%, nos dice
 * que con estas pruebas unitarias estamos ejecutando el 100% del código fuente
 */

/**
 * Pregunta 2.3. ¿Por qué John tiene la necesidad de refactorizar la aplicación?
 * La refactorización es muy importante en el desarrollo de aplicaciones, sobre todo
 * en este caso que se trata de un software de gestión de vuelos, el cual
 * cuenta con mucha información sensible. Y debido a que los
 * desarrolladores anteriores programaron sin pruebas unitarias, entonces
 * cabe la posibilidad de que dicho código falle en muchos otros
 * escenarios. Por ello, la refactorización en este caso sería
 * muy valioso, además de esta manera se puede evitar que salgan issues
 * en producción.
 */

public class AirportTest {

    @DisplayName("Dado que hay un vuelo economico")
    @Nested
    class EconomyFlightTest {

        private Flight economyFlight;

        @BeforeEach
        void setUp() {
            economyFlight = new Flight("1", "Economico");
        }

        @Test
        public void testEconomyFlightRegularPassenger() {
            Passenger jessica = new Passenger("Jessica", false);

            assertEquals("1", economyFlight.getId());
            assertEquals(true, economyFlight.addPassenger(jessica));
            assertEquals(1, economyFlight.getPassengersList().size());
            assertEquals("Jessica", economyFlight.getPassengersList().get(0).getName());

            assertEquals(true, economyFlight.removePassenger(jessica));
            assertEquals(0, economyFlight.getPassengersList().size());
        }

        @Test
        public void testEconomyFlightVipPassenger() {
            Passenger cesar = new Passenger("Cesar", true);

            assertEquals("1", economyFlight.getId());
            assertEquals(true, economyFlight.addPassenger(cesar));
            assertEquals(1, economyFlight.getPassengersList().size());
            assertEquals("Cesar", economyFlight.getPassengersList().get(0).getName());

            assertEquals(false, economyFlight.removePassenger(cesar));
            assertEquals(1, economyFlight.getPassengersList().size());
        }
    }

    @DisplayName("Dado que hay un vuelo de negocios")
    @Nested
    class BusinessFlightTest {
        private Flight businessFlight;

        @BeforeEach
        void setUp() {
            businessFlight = new Flight("2", "Negocios");
        }

        @Test
        public void testBusinessFlightRegularPassenger() {
            Passenger jessica = new Passenger("Jessica", false);

            assertEquals(false, businessFlight.addPassenger(jessica));
            assertEquals(0, businessFlight.getPassengersList().size());
            assertEquals(false, businessFlight.removePassenger(jessica));
            assertEquals(0, businessFlight.getPassengersList().size());

        }

        @Test
        public void testBusinessFlightVipPassenger() {
            Passenger cesar = new Passenger("Cesar", true);

            assertEquals(true, businessFlight.addPassenger(cesar));
            assertEquals(1, businessFlight.getPassengersList().size());
            assertEquals(false, businessFlight.removePassenger(cesar));
            assertEquals(1, businessFlight.getPassengersList().size());

        }
    }
}
