import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTests {

    ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(20, "Lets have a kiki");
    }

    @Test
    public void conferenceRoomHasCapacity(){
        assertEquals(20, conferenceRoom.getCapacity());
    }
}
