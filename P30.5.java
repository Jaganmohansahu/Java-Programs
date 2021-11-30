//Continues animation
import java.awt.*;
import java.applet.*;
public class Animate extends Applet 
{
	public void paint(Graphics g)
	{
		Image img1 = getImage(getDocumentBase(), "fig1.gif");
		Image img2 = getImage(getDocumentBase(), "fig2.gif");
		Image img3 = getImage(getDocumentBase(), "fig3.gif");

		for (; ; )
	    {
			try
			{
				g.drawImage(img1, 50, 50, null);
				Thread.sleep(200);

				g.drawImage(img2, 50, 50, null);
				Thread.sleep(200);

				g.drawImage(img3, 50, 50, null);
				Thread.sleep(200);

				g.drawImage(img2, 50, 50, null);
				Thread.sleep(200);
			}catch(InterruptedException ie){}
		}
	}
}