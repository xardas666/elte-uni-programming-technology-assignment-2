package gottfried;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.util.Calendar;

class ClockPanel extends JPanel implements Runnable {

    private static final long serialVersionUID = 1L;
    Thread t = new Thread(this);

    int xHandSec, yHandSec, xHandMin, yHandMin, xHandHour, yHandHour;

    private final int HORIZONTAL_SIZE = 200;
    private final int VERTICAL_SIZE = 200;

    private final int secondHandLength = HORIZONTAL_SIZE / 2 - 50;
    private final int minuteHandLength = HORIZONTAL_SIZE / 2 - 70;
    private final int hourHandLength = HORIZONTAL_SIZE / 2 - 100;

    private final int DISTANCE_DOT_FROM_ORIGIN = HORIZONTAL_SIZE / 2 - 40;

    private final int DIAMETER_BIG_DOT = 8;
    private final int DIAMETER_SMALL_DOT = 4;

    private final static Color GREY_COLOR = new Color(160, 160, 160);

    public ClockPanel() {
        setMinimumSize(new Dimension(HORIZONTAL_SIZE, VERTICAL_SIZE));
        setMaximumSize(new Dimension(HORIZONTAL_SIZE, VERTICAL_SIZE));
        setPreferredSize(new Dimension(HORIZONTAL_SIZE, VERTICAL_SIZE));
        setLayout(null);
        t.start();
    }

    public void run() {
        while (true) {
            try {
                int currentSecond = Calendar.getInstance().get(Calendar.SECOND);
                int currentMinute = Calendar.getInstance().get(Calendar.MINUTE);
                int currentHour = Calendar.getInstance().get(Calendar.HOUR);

                xHandSec = minToLocation(currentSecond, secondHandLength).x;
                yHandSec = minToLocation(currentSecond, secondHandLength).y;
                xHandMin = minToLocation(currentMinute, minuteHandLength).x;
                yHandMin = minToLocation(currentMinute, minuteHandLength).y;
                xHandHour = minToLocation(currentHour * 5 + getRelativeHour(currentMinute), hourHandLength).x;
                yHandHour = minToLocation(currentHour * 5 + getRelativeHour(currentMinute), hourHandLength).y;
                repaint();
                Thread.sleep(500);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }

    private int getRelativeHour(int min) {
        return min / 12;
    }

    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2.clearRect(0, 0, getWidth(), getHeight());

        // Draw the dots
        g2.setColor(GREY_COLOR);
        for (int i = 0; i < 60; i++) {

            Point dotCoordinates = minToLocation(i, DISTANCE_DOT_FROM_ORIGIN);
            g2.setColor((i <= Calendar.getInstance().get(Calendar.SECOND)) ? Color.white : GREY_COLOR);

            if (i % 5 == 0) {
                // big dot
                g2.fillOval(dotCoordinates.x - (DIAMETER_BIG_DOT / 2),
                        dotCoordinates.y - (DIAMETER_BIG_DOT / 2),
                        DIAMETER_BIG_DOT,
                        DIAMETER_BIG_DOT);
            } else {
                // small dot
                g2.fillOval(dotCoordinates.x - (DIAMETER_SMALL_DOT / 2),
                        dotCoordinates.y - (DIAMETER_SMALL_DOT / 2),
                        DIAMETER_SMALL_DOT,
                        DIAMETER_SMALL_DOT);
            }
        }

        // Draw the clock hands
        g2.setColor(Color.black);
        g2.drawLine(HORIZONTAL_SIZE / 2, VERTICAL_SIZE / 2, xHandSec, yHandSec);
        g2.drawLine(HORIZONTAL_SIZE / 2, VERTICAL_SIZE / 2, xHandMin, yHandMin);
        g2.drawLine(HORIZONTAL_SIZE / 2, VERTICAL_SIZE / 2, xHandHour, yHandHour);
    }

    private Point minToLocation(int timeStep, int radius) {
        double t = 2 * Math.PI * (timeStep - 15) / 60;
        int x = (int) (HORIZONTAL_SIZE / 2 + radius * Math.cos(t));
        int y = (int) (VERTICAL_SIZE / 2 + radius * Math.sin(t));
        return new Point(x, y);
    }
}
