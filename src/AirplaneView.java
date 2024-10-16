import javax.swing.*;
import java.awt.*;

public class AirplaneView extends JPanel {
    private final Airplane AIRPLANE;
    private SeatView[] seatViews;

    public AirplaneView(final Airplane airplane) {
        super(new GridLayout(airplane.getRowsCount(), airplane.getColumnsCount(), 10,10));
        AIRPLANE = airplane;

        init();
    }

    private void init() {
        createSeatViews();
        addSeatViews();
    }

    private void addSeatViews() {
        for(var seatView : seatViews) {
            add(seatView);
        }
    }

    private void createSeatViews() {
        var seats = AIRPLANE.getSeats();
        seatViews = new SeatView[seats.length];
        for(int i = 0; i < seats.length; ++i) {
            seatViews[i] = new SeatView(seats[i]);
        }
    }
}
