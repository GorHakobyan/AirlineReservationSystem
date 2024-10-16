import javax.swing.*;
import java.util.ArrayList;

public class WindowManager {

    private final int m_width;
    private final int m_height;
    private final String m_name;
    private final JFrame m_window;
    private ArrayList<JPanel> m_panels;

    public WindowManager(final int width, final int height, final String name) {
        m_width = width;
        m_height = height;
        m_name = name;
        m_window = new JFrame();
        m_panels = new ArrayList<>();

        initWindow();
    }

    public void addPanel(JPanel panel) {
        m_panels.add(panel);
        m_window.add(panel);
        drawWindow();
    }

    private void drawWindow() {
        m_window.setVisible(true);
    }

    private void initWindow() {
        m_window.setSize(m_width, m_height);
        m_window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        m_window.setTitle(m_name);
        drawWindow();
    }
}
