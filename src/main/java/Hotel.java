import java.util.ArrayList;

public class Hotel {

    private ArrayList<BedRoom> bedRooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel() {
        this.bedRooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
    }

    public ArrayList<BedRoom> getBedRooms() {
        return bedRooms;
    }

    public void setBedRooms(ArrayList<BedRoom> bedRooms) {
        this.bedRooms = bedRooms;
    }

    public ArrayList<ConferenceRoom> getConferenceRooms() {
        return conferenceRooms;
    }

    public void setConferenceRooms(ArrayList<ConferenceRoom> conferenceRooms) {
        this.conferenceRooms = conferenceRooms;
    }

    public void checkInGuestToBedroom(ArrayList<Guest> guests, BedRoom bedRoom){
        for(Guest guest: guests) {
            bedRoom.addGuestToRoom(guest);
        }
    }

    public void removeGuestFromBedroom(Guest guest, BedRoom bedRoom) {
        bedRoom.removeGuestFromRoom(guest);
    }

    public void checkInGuestToConferenceRoom(ArrayList<Guest> guests, ConferenceRoom conferenceRoom){
        for(Guest guest: guests) {
            conferenceRoom.addGuestToRoom(guest);
        }
    }

    public void removeGuestFromConferenceRoom(Guest guest, ConferenceRoom conferenceRoom) {
        conferenceRoom.removeGuestFromRoom(guest);
    }
}
