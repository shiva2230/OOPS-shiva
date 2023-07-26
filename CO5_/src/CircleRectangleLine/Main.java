package CircleRectangleLine;

import java.applet.*;
import java.awt.*;

public class Main extends Applet {

    @Override
    public void paint(Graphics g) {
        // Set the color and draw a circle
        g.setColor(Color.RED);
        g.drawOval(50, 50, 100, 100);

        // Set the color and draw a rectangle
        g.setColor(Color.GREEN);
        g.drawRect(200, 50, 150, 100);

        // Set the color and draw a line
        g.setColor(Color.BLUE);
        g.drawLine(50, 200, 350, 200);
    }


}

