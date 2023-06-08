public class BedRoom extends Room{

    private RoomType roomType;
    public BedRoom(int roomNumber, RoomType roomType) {
        super(roomType.getCapacity());

        this.roomType = roomType;
    }

    public RoomType getRoomTypes() {
        return roomType;
    }
}
