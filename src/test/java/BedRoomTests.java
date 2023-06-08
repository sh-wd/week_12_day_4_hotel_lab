import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedRoomTests {

    BedRoom bedRoom;
    Guest guest1;
    Guest guest2;
    Guest guest3;
    Guest guest4;


    @Before
    public void before(){
        ArrayList<Guest> testGuests = new ArrayList<>();
        testGuests.add(guest1);
        testGuests.add(guest2);
        testGuests.add(guest3);
        testGuests.add(guest4);
        bedRoom = new BedRoom(4, RoomType.WIZARDOFOZ);
    }
    @Test
    public void bedRoomHasCapacity(){
        assertEquals(4, bedRoom.getCapacity());
    }

    @Test
    public void canGetRoomType(){
        assertEquals(RoomType.WIZARDOFOZ, bedRoom.getRoomTypes());
    }

}