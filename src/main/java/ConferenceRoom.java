public class ConferenceRoom extends Room {

    private String conferenceRoomName;

    public ConferenceRoom(int capacity, String conferenceRoomName) {
        super(capacity);

        this.conferenceRoomName = conferenceRoomName;
    }

    public String getConferenceRoomName() {
        return conferenceRoomName;
    }

    public void setConferenceRoomName(String conferenceRoomName) {
        this.conferenceRoomName = conferenceRoomName;
    }
}
