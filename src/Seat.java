public class Seat {
    final int NUMBER;
    private SeatStatus m_status = SeatStatus.FREE;

    public Seat(final int number) {
        NUMBER = number;
    }

    public void reserve() {
        m_status = SeatStatus.RESERVED;
    }

    public void book() {
        m_status = SeatStatus.BOOKED;
    }

    public void cancelReservation() {
        m_status = SeatStatus.FREE;
    }

    public void cancelBooking() {
        cancelReservation();
    }
}
