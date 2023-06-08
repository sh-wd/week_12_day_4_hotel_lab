import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private ArrayList<Guest> guests;

    public Room(int capacity) {
        this.capacity = capacity;
        this.guests = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public void setGuests(ArrayList<Guest> guests) {
        this.guests = guests;
    }

    public int guestListSize(){
        return guests.size();
    }
    public void addGuestToRoom(Guest guest){
        guests.add(guest);
    }

    public void removeGuestFromRoom(Guest guest) {
        guests.remove(guest);
    }
}
