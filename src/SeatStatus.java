public enum SeatStatus {
    FREE(0),
    BOOKED(1);

    private final int numVal;

    SeatStatus(int numVal) {
        this.numVal = numVal;
    }

    public int getNumVal() {
        return numVal;
    }
}