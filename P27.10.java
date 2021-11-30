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
}