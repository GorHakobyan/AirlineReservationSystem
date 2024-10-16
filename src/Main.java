import java.awt.*;

public class Main {
    public static void main(String[] args) {
        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        final int SCREEN_WIDTH = gd.getDisplayMode().getWidth();
        final int SCREEN_HEIGHT = gd.getDisplayMode().getHeight();

        var windowManager = new WindowManager(SCREEN_WIDTH, SCREEN_HEIGHT, "Airline Reservation System");

        var boeing = new Airplane(25,5,5);
        var boeingView = new AirplaneView(boeing);
        windowManager.addPanel(boeingView);
    }
}