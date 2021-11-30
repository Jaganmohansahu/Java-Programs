//A simple applet
import java.awt.*;
import java.applet.*;
public class MyApp extends Applet
{
	public void init()
	{
		setBackground(Color.yellow);
	}
	public void paint(Graphics g)
	{
		g.drawString("Hello Applets!!", 50, 100);
	}
}