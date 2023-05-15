import java.applet.Applet;
import java.awt.*;

public class q5 extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.fillOval(80, 80, 200, 200);
        g.setColor(Color.black);
        g.fillOval(130, 120, 30, 50);
        g.fillOval(200, 120, 30, 50);
        g.setColor(Color.red);
        g.drawLine(150, 220, 210, 220);
        g.fillArc(150, 200, 60, 40, 180, 180);
    }
}

/*
 * <applet code="q5" height=500 width=500>
 * </applet>
 */
