<<<<<<< HEAD
<<<<<<< HEAD
//Animation in applets
import java.awt.*;
import java.applet.*;
 class Animate extends Applet 
{
	public void paint(Graphics g)
	{
		Image img = getImage(getDocumentBase(), "plane.gif");

		for(int x=0; x<800; x++)
		{
			g.drawImage(img, x, 0, null);
			try
			{
				Thread.sleep(20);
			}catch(InterruptedException ie){}
		}
	}
=======
//Animation in applets
import java.awt.*;
import java.applet.*;
 class Animate extends Applet 
{
	public void paint(Graphics g)
	{
		Image img = getImage(getDocumentBase(), "plane.gif");

		for(int x=0; x<800; x++)
		{
			g.drawImage(img, x, 0, null);
			try
			{
				Thread.sleep(20);
			}catch(InterruptedException ie){}
		}
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//Animation in applets
import java.awt.*;
import java.applet.*;
 class Animate extends Applet 
{
	public void paint(Graphics g)
	{
		Image img = getImage(getDocumentBase(), "plane.gif");

		for(int x=0; x<800; x++)
		{
			g.drawImage(img, x, 0, null);
			try
			{
				Thread.sleep(20);
			}catch(InterruptedException ie){}
		}
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}