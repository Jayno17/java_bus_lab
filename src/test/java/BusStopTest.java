import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BusStopTest {

    private BusStop busStop;
    private Person person;

    @Before
    public void setUp() {
        busStop = new BusStop("Elm Row");
        person = new Person();
    }

    @Test
    public void startsWithNoQueue() {
        assertEquals(0, busStop.getQueueAtBusStop());
        }
    @Test
    public void canAddPersonToQueue(){
        busStop.addPersonToQueue(person);
        assertEquals(1, busStop.getQueueAtBusStop());
    }
    @Test
    public void canRemovePersonFromQueue(){
        busStop.addPersonToQueue(person);
        busStop.removePersonFromQueue();
        assertEquals(0, busStop.getQueueAtBusStop());
    }

}
