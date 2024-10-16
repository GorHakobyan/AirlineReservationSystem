public class Seat {
    final int NUMBER;
    private SeatStatus m_status = SeatStatus.FREE;

    public Seat(final int number) {
        NUMBER = number;
    }

    public SeatStatus getStatus() {
        return m_status;
    }

    public void book() {
        m_status = SeatStatus.BOOKED;
    }

    public void cancelBooking() {
        m_status = SeatStatus.FREE;    }
}
