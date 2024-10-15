public enum SeatStatus {
    FREE(0),
    RESERVED(1),
    BOOKED(2);

    private final int numVal;

    SeatStatus(int numVal) {
        this.numVal = numVal;
    }

    public int getNumVal() {
        return numVal;
    }
}