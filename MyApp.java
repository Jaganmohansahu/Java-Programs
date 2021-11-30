import java.applet.Applet;
import java.awt.*;

public class MyApp extends Applet
{
    public void init()
    {
        setBackground(Color.yellow);
    }
    
    public void paint(Graphics g)
    {
       g.drawString("Hello applet how are you!!", 50, 25);
    }
}