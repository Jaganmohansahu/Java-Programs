//My Home
import java.awt.*;
import java.awt.event.*;
class Home extends Frame 
{
	Home()
	{
		this.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});	
	}
	public void paint(Graphics g)
	{
		int x[] = {375, 275, 475};
		int y[] = {125, 200, 200};
		int n = 3;

		this.setBackground(Color.gray);

		g.setColor(Color.yellow);
		g.fillRect(300, 200, 150, 100);

		g.setColor(Color.blue);
		g.fillRect(350, 210, 50, 60);

		g.setColor(Color.darkGray);
		g.fillPolygon(x, y, n);

		g.setColor(Color.cyan);
		g.fillOval(100, 100, 60, 60);

		g.setColor(Color.green);
		g.fillArc(50, 250, 150, 100, 0, 180);
		g.fillArc(150, 250, 150, 100, 0, 180);
		g.fillArc(450, 250, 150, 100, 0, 180);

		g.drawLine(50, 300, 600, 300);

		g.setColor(Color.red);
		g.drawString("My Happy Home", 275, 350);
	}
	public static void main(String[] args) 
	{
		Home h = new Home();

		h.setSize(500, 400);
		h.setTitle("My Home");
		h.setVisible(true);	
	}
}