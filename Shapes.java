/Applet program for different shapes. 

import java.applet.Applet;
import java.awt.*;

public class shapes extends Applet
{
    public void paint(Graphics g)
    {
    g.setColor(Color.black);
    g.fillRect(20,20,80,40);
    g.drawString("FillRect",30,80);
    g.drawRect(150,20,70,70);
    g.drawString("drawSquare",140,120);
    g.drawOval(250,20,90,90);
    g.drawString("drawCircle",250,130);
    g.fillOval(40,180,160,70);
    g.drawString("fillOval",70,270);
    g.fillOval(230,180,90,90);
    g.drawString("fillCircle",250,300);
    }
    }
