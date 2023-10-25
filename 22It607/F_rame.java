import java.awt.event.*;
import java.awt.*;
import java.applet.*;

public class F_rame extends Frame {
    public F_rame() {
        setSize(300, 300);
    }

    public void paint(Graphics g) {
        g.drawLine(10, 10, 10, 100);
        g.drawLine(10, 10, 100, 10);
        g.drawLine(100, 10, 10, 100);
        g.drawLine(100, 10, 100, 100);
        g.drawLine(10, 100, 100, 100);
        g.drawLine(10, 10, 100, 100);
    }

    public static void main(String[] args) {
        F_rame f = new F_rame();
        f.setVisible(true);
    }
}