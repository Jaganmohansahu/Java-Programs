<<<<<<< HEAD
<<<<<<< HEAD
//Drawing a group of dots on black screen
import java.awt.*;
import java.awt.event.*;
class Points extends Frame
{	
	public void paint(Graphics g)
	{
		g.setColor(Color.white);

		for (; ; )
		{
			int x = (int) (Math.random()*800);
			int y = (int) (Math.random()*600);

			g.drawLine(x, y, x, y);
			try
			{
				Thread.sleep(20);
			}catch(InterruptedException ie){}
		}
	}
	public static void main(String[] args) 
	{
		Points obj = new Points();
		obj.setBackground(Color.black);
		obj.setSize(500, 400);
		obj.setTitle("Random DOTS");	
		obj.setVisible(true);
	}
=======
//Drawing a group of dots on black screen
import java.awt.*;
import java.awt.event.*;
class Points extends Frame
{	
	public void paint(Graphics g)
	{
		g.setColor(Color.white);

		for (; ; )
		{
			int x = (int) (Math.random()*800);
			int y = (int) (Math.random()*600);

			g.drawLine(x, y, x, y);
			try
			{
				Thread.sleep(20);
			}catch(InterruptedException ie){}
		}
	}
	public static void main(String[] args) 
	{
		Points obj = new Points();
		obj.setBackground(Color.black);
		obj.setSize(500, 400);
		obj.setTitle("Random DOTS");	
		obj.setVisible(true);
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//Drawing a group of dots on black screen
import java.awt.*;
import java.awt.event.*;
class Points extends Frame
{	
	public void paint(Graphics g)
	{
		g.setColor(Color.white);

		for (; ; )
		{
			int x = (int) (Math.random()*800);
			int y = (int) (Math.random()*600);

			g.drawLine(x, y, x, y);
			try
			{
				Thread.sleep(20);
			}catch(InterruptedException ie){}
		}
	}
	public static void main(String[] args) 
	{
		Points obj = new Points();
		obj.setBackground(Color.black);
		obj.setSize(500, 400);
		obj.setTitle("Random DOTS");	
		obj.setVisible(true);
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}