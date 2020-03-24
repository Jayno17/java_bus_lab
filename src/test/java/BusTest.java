import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;

    @Before
    public void setUp(){
        bus = new Bus("Newhaven", 30);
        person = new Person();
    }

    @Test
    public void startsWithNoPassengers(){
        assertEquals(0, bus.getNumberOfPassengers());
    }

    @Test
    public void canAddPassenger(){
        bus.addPassenger(person);
        assertEquals(1, bus.getNumberOfPassengers());
    }

    @Test
    public void cannotAddPassengerIfFull(){
        Bus minibus = new Bus ("Java Town", 1);
        minibus.addPassenger(person);
        minibus.addPassenger(person);
        assertEquals(1, minibus.getNumberOfPassengers());

    }

    @Test
    public void canRemovePassenger(){
        bus.addPassenger(person);
        bus.removePassenger();
        assertEquals(0, bus.getNumberOfPassengers());
    }
    @Test
    public void canPickUpPassengerfromQueue(){
        bus.pickUpPassenger(person);
        assertEquals(1, bus.getNumberOfPassengers());
    }

}
