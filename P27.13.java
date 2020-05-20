<<<<<<< HEAD
<<<<<<< HEAD
//Displaying an image in the frame and also in the title bar
import java.awt.*;
import java.awt.event.*;
class Images extends Frame 
{
	static Image img;
	Images()
	{
		img = Toolkit.getDefaultToolkit().getImage("IIITlogo.png");

		MediaTracker track = new MediaTracker(this);

		track.addImage(img, 0);
		try
		{
			track.waitForID(0);
		}catch(InterruptedException ie){}

		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}
	public void paint(Graphics g)
	{
		g.drawImage(img, 50, 50, null);
	}
	public static void main(String[] args) 
	{
		Images i = new Images();

		i.setSize(500, 400);
		i.setTitle("My Images");
		i.setIconImage(img);
		i.setVisible(true);	
	}
=======
//Displaying an image in the frame and also in the title bar
import java.awt.*;
import java.awt.event.*;
class Images extends Frame 
{
	static Image img;
	Images()
	{
		img = Toolkit.getDefaultToolkit().getImage("IIITlogo.png");

		MediaTracker track = new MediaTracker(this);

		track.addImage(img, 0);
		try
		{
			track.waitForID(0);
		}catch(InterruptedException ie){}

		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}
	public void paint(Graphics g)
	{
		g.drawImage(img, 50, 50, null);
	}
	public static void main(String[] args) 
	{
		Images i = new Images();

		i.setSize(500, 400);
		i.setTitle("My Images");
		i.setIconImage(img);
		i.setVisible(true);	
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//Displaying an image in the frame and also in the title bar
import java.awt.*;
import java.awt.event.*;
class Images extends Frame 
{
	static Image img;
	Images()
	{
		img = Toolkit.getDefaultToolkit().getImage("IIITlogo.png");

		MediaTracker track = new MediaTracker(this);

		track.addImage(img, 0);
		try
		{
			track.waitForID(0);
		}catch(InterruptedException ie){}

		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}
	public void paint(Graphics g)
	{
		g.drawImage(img, 50, 50, null);
	}
	public static void main(String[] args) 
	{
		Images i = new Images();

		i.setSize(500, 400);
		i.setTitle("My Images");
		i.setIconImage(img);
		i.setVisible(true);	
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}