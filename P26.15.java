<<<<<<< HEAD
<<<<<<< HEAD
//A moving banner using a thread
import java.awt.*;
class Banner extends Frame implements Runnable
{
	String str = "JAGAN MOHAN SAHU";

	Banner()
	{
		setLayout(null);
		setBackground(Color.cyan);
		setForeground(Color.red);
	}
	public void paint(Graphics g)
	{
		Font f = new Font("Courier", Font.BOLD, 40);
		g.setFont(f);
		g.drawString(str, 10, 100);
	}
	public void run()
	{
		for (; ; ) 
		{
			repaint();
			try
			{
				Thread.sleep(400);
			}catch(InterruptedException ie){}

			char ch = str.charAt(0);
			str = str.substring(1, str.length());
			str = str+ch;
		}
	}
	public static void main(String[] args) 
	{
		Banner b = new Banner();
		b.setSize(400, 400);
		b.setTitle("My banner");
		b.setVisible(true);

		Thread t = new Thread(b);
		t.start();	
	}
=======
//A moving banner using a thread
import java.awt.*;
class Banner extends Frame implements Runnable
{
	String str = "JAGAN MOHAN SAHU";

	Banner()
	{
		setLayout(null);
		setBackground(Color.cyan);
		setForeground(Color.red);
	}
	public void paint(Graphics g)
	{
		Font f = new Font("Courier", Font.BOLD, 40);
		g.setFont(f);
		g.drawString(str, 10, 100);
	}
	public void run()
	{
		for (; ; ) 
		{
			repaint();
			try
			{
				Thread.sleep(400);
			}catch(InterruptedException ie){}

			char ch = str.charAt(0);
			str = str.substring(1, str.length());
			str = str+ch;
		}
	}
	public static void main(String[] args) 
	{
		Banner b = new Banner();
		b.setSize(400, 400);
		b.setTitle("My banner");
		b.setVisible(true);

		Thread t = new Thread(b);
		t.start();	
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//A moving banner using a thread
import java.awt.*;
class Banner extends Frame implements Runnable
{
	String str = "JAGAN MOHAN SAHU";

	Banner()
	{
		setLayout(null);
		setBackground(Color.cyan);
		setForeground(Color.red);
	}
	public void paint(Graphics g)
	{
		Font f = new Font("Courier", Font.BOLD, 40);
		g.setFont(f);
		g.drawString(str, 10, 100);
	}
	public void run()
	{
		for (; ; ) 
		{
			repaint();
			try
			{
				Thread.sleep(400);
			}catch(InterruptedException ie){}

			char ch = str.charAt(0);
			str = str.substring(1, str.length());
			str = str+ch;
		}
	}
	public static void main(String[] args) 
	{
		Banner b = new Banner();
		b.setSize(400, 400);
		b.setTitle("My banner");
		b.setVisible(true);

		Thread t = new Thread(b);
		t.start();	
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}