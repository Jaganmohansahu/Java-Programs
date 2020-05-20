<<<<<<< HEAD
<<<<<<< HEAD
//Frame with background color and message
import java.awt.*;
import java.awt.event.*;
class Message extends Frame
{
	Message()
	{
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
		this.setBackground(new Color(100, 20, 20));

		Font f = new Font("Arial", Font.BOLD+Font.ITALIC,30);
		g.setFont(f);

		g.setColor(Color.green);

		g.drawString("HELLO !!",100, 100);
	}
	public static void main(String[] args) 
	{
		Message m = new Message();

		m.setSize(400, 300);
		m.setTitle("This is my text");
		m.setVisible(true);	
	}
=======
//Frame with background color and message
import java.awt.*;
import java.awt.event.*;
class Message extends Frame
{
	Message()
	{
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
		this.setBackground(new Color(100, 20, 20));

		Font f = new Font("Arial", Font.BOLD+Font.ITALIC,30);
		g.setFont(f);

		g.setColor(Color.green);

		g.drawString("HELLO !!",100, 100);
	}
	public static void main(String[] args) 
	{
		Message m = new Message();

		m.setSize(400, 300);
		m.setTitle("This is my text");
		m.setVisible(true);	
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//Frame with background color and message
import java.awt.*;
import java.awt.event.*;
class Message extends Frame
{
	Message()
	{
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
		this.setBackground(new Color(100, 20, 20));

		Font f = new Font("Arial", Font.BOLD+Font.ITALIC,30);
		g.setFont(f);

		g.setColor(Color.green);

		g.drawString("HELLO !!",100, 100);
	}
	public static void main(String[] args) 
	{
		Message m = new Message();

		m.setSize(400, 300);
		m.setTitle("This is my text");
		m.setVisible(true);	
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}