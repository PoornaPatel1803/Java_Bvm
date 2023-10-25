import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/*<applet code="Event" width=600 height=600></applet>*/

public class Event extends Applet implements MouseListener, MouseMotionListener {
    String msg = "";
    int mouseX = 0, mouseY = 0;

    public void init() {
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    public void mouseClicked(MouseEvent me) {
        mouseX = 0;
        mouseY = 10;
        msg = "mouse clicked";
        repaint();
    }

    public void mouseEntered(MouseEvent e) {
        mouseX = 0;
        mouseY = 10;
        msg = "mouse entered";
        repaint();
    }

    public void mouseExited(MouseEvent e) {
        mouseX = 0;
        mouseY = 10;
        msg = "mouse Exited";
        repaint();
    }

    public void mousePressed(MouseEvent e) {
        mouseX = 0;
        mouseY = 10;
        msg = "mouse Pressed";
        repaint();
    }

    public void mouseReleased(MouseEvent e) {
        mouseX = 0;
        mouseY = 10;
        msg = "mouse released";
        repaint();
    }

    public void mouseDragged(MouseEvent e) {
        mouseX = 0;
        mouseY = 10;
        msg = "*";
        showStatus("Dragging mouse at " + mouseX + "," + mouseY);
        repaint();
    }

    public void mouseMoved(MouseEvent e) {
        showStatus("Moving mouse at " + e.getX() + ", " + e.getY());
    }

    public void paint(Graphics g) {
        g.drawString(msg, mouseX, mouseY);
    }
}