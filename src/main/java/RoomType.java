public enum RoomType {
    CASTAWAY(1),
    BROKEBACK(2),
    CRUISING(10),
    WIZARDOFOZ(4),
    BOYSDONTCRY(5);

    private final int capacity;

    RoomType(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
