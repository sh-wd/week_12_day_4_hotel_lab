import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTests {

    Hotel hotel;

    BedRoom bedRoom;

    ConferenceRoom conferenceRoom;

    Guest guest;

    @Before
    public void before(){
        hotel = new Hotel();
        bedRoom = new BedRoom(1, RoomType.WIZARDOFOZ);
        conferenceRoom = new ConferenceRoom(20, "Let's Have A Kiki");
        guest = new Guest("DorothyBear");
    }

    @Test
    public void canGetBedrooms(){
        assertEquals(0, hotel.getBedRooms().size());
    }

    @Test
    public void canGetConferenceRooms(){
        assertEquals(0, hotel.getConferenceRooms().size());
    }

    @Test
    public void canAddGuestToBedroom(){
        ArrayList<Guest> guests = new ArrayList<Guest>();
        guests.add(guest);
        hotel.checkInGuestToBedroom(guests, bedRoom);
        assertEquals(1, bedRoom.guestListSize());
    }

    @Test
    public void canRemoveGuestFromBedroom(){
        ArrayList<Guest> guests = new ArrayList<Guest>();
        guests.add(guest);
        hotel.checkInGuestToBedroom(guests, bedRoom);
        hotel.removeGuestFromBedroom(guest, bedRoom);
        assertEquals(0, bedRoom.guestListSize());
    }

    @Test
    public void canAddGuestToConferenceRoom(){
        ArrayList<Guest> guests = new ArrayList<Guest>();
        guests.add(guest);
        hotel.checkInGuestToConferenceRoom(guests, conferenceRoom);
        assertEquals(1, conferenceRoom.guestListSize());
    }

    @Test
    public void canRemoveGuestFromConferenceRoom(){
        ArrayList<Guest> guests = new ArrayList<Guest>();
        guests.add(guest);
        hotel.checkInGuestToConferenceRoom(guests, conferenceRoom);
        hotel.removeGuestFromConferenceRoom(guest, conferenceRoom);
        assertEquals(0, conferenceRoom.guestListSize());
    }
}
