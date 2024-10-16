import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SeatView extends JButton {

    private final Seat SEAT;

    public SeatView(Seat seat) {
        super(String.valueOf(seat.NUMBER));
        SEAT = seat;

        init();
    }

    public void updateStatus() {
        setColor(SEAT.getStatus());
        setClickable(SEAT.getStatus());
    }

    private void init() {
        updateStatus();
        addActionListener(_ -> handleSeatBooking());
    }

    private void handleSeatBooking() {

        int response = JOptionPane.showConfirmDialog(this,
                "Do you want to book " + getText() + "?",
                "Confirm Booking",
                JOptionPane.YES_NO_OPTION);

        if (response == JOptionPane.YES_OPTION) {
            SEAT.book();
            updateStatus();
        }
    }

    private void setColor(SeatStatus status) {
        switch (status) {
            case FREE -> {
                setBackground(Color.GREEN);
            }
            case BOOKED -> {
                setBackground(Color.RED);
            }
        }
    }

    private void setClickable(SeatStatus status) {
        switch (status) {
            case FREE -> {
                setEnabled(true);
            }
            case BOOKED -> {
                setEnabled(false);
            }
        }
    }
}
