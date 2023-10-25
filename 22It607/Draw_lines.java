import java.awt.*;
import java.applet.*;

/*
<applet code="Draw_lines" width=300 height=200>
</applet>
*/
public class Draw_lines extends Applet {
    public void paint(Graphics g) {
        g.drawLine(10, 10, 10, 100);
        g.drawLine(10, 10, 100, 10);
        g.drawLine(100, 10, 10, 100);
        g.drawLine(100, 10, 100, 100);
        g.drawLine(10, 100, 100, 100);
        g.drawLine(10, 10, 100, 100);
    }
}