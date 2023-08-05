//Applet program for human face. 

import java.applet.Applet;
import java.awt.*;

public class face extends Applet
{
    public void paint(Graphics g)
    {

		g.drawOval(70,20,250,250);
		g.fillOval(115,70,50,30);
		g.fillOval(225,70,50,30);
		g.drawLine(195,120,195,160);
        g.fillArc(150,140,90,90,180,180);

	}
}
