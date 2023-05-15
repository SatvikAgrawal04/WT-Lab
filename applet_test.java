import java.applet.Applet;
import java.awt.Graphics;

public class applet_test extends Applet {
    public void paint(Graphics g) {
        g.drawString("Hello world!", 50, 25);
    }
}
/*
 * <applet code="applet_test.class" height=300 width=200>
 * </applet>
 */