public class Airplane {
    private final int SEAT_COUNT;
    private final int ROWS_COUNT;
    private final int COLUMNS_COUNT;
    private Seat[] seats;

    public Airplane(final int seatCount, final int rowsCount, final int columnsCount) {
        SEAT_COUNT = seatCount;
        ROWS_COUNT = rowsCount;
        COLUMNS_COUNT = columnsCount;

        initAirplane();
    }

    public Seat[] getSeats() {
        return seats;
    }

    public int getRowsCount() {
        return ROWS_COUNT;
    }

    public int getColumnsCount() {
        return COLUMNS_COUNT;
    }

    private void initAirplane() {
        seats = new Seat[SEAT_COUNT];
        for(int i = 0; i < SEAT_COUNT; ++i) {
            seats[i] = new Seat(i);
        }
    }
}
