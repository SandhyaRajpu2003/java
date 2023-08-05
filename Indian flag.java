//Applet program for Indian flag. 

import java.applet.Applet;
import java.awt.*;

public class flag extends Applet
{
    public void paint(Graphics g)
    {
		g.setColor(Color.orange);
		g.fillRect(100,50,170,40);
		g.setColor(Color.white);
		g.fillRect(100,90,170,40);
		g.setColor(Color.green);
		g.fillRect(100,130,170,40);
		g.setColor(Color.black);
        g.drawRect(95,40,5,280);
        g.fillOval(93,35,10,10);
        g.setColor(Color.blue);
        g.fillOval(160,90,40,40);

	}
}
