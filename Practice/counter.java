import java.applet.Applet;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class counter extends Applet implements FocusListener {
    int initct = 0;
    int startct = 0;
    int stopct = 0;
    int destct = 0;
    int focusct = 0;

    public void init() {
        initct++;
        addFocusListener(this);
    }

    public void start() {
        startct++;
    }

    public void stop() {
        stopct++;
    }

    public void destroy() {
        destct++;
    }

    public void focusGained(FocusEvent e) {
        focusct++;
    }

    public void focusLost(FocusEvent e) {
    }

    public void paint(Graphics g) {
        g.drawString("Init " + initct, 20, 20);
        g.drawString("start " + startct, 20, 40);
        g.drawString("stop " + stopct, 20, 60);
        g.drawString("destroy " + destct, 20, 80);
        g.drawString("focus gained " + focusct, 20, 100);
    }
}

/*
 * <applet code="counter" height=500 width=500>
 * </applet>
 */
