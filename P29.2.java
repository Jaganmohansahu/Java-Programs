<<<<<<< HEAD
<<<<<<< HEAD
//BorderLayout demo
import java.awt.*;
import javax.swing.*;
class BorderLayoutDemo extends JFrame
{
	BorderLayoutDemo()
	{
		Container c = getContentPane();

		BorderLayout obj = new BorderLayout(10, 10);

		c.setLayout(obj);

		JButton b1, b2, b3, b4;
		b1 = new JButton("Button1");
		b2 = new JButton("Button2");
		b3 = new JButton("Button3");
		b4 = new JButton("Button4");

		c.add("North", b1);
		c.add("East", b2);
		c.add("South", b3);
		c.add("Center", b4);

/*
		c.add(b1, BorderLayout.NORTH);
		c.add(b2, BorderLayout.EAST);
		c.add(b3, BorderLayout.SOUTH);
		c.add(b4, BorderLayout.CENTER);
*/
	}
	public static void main(String[] args) 
	{
		BorderLayoutDemo demo = new BorderLayoutDemo();

		demo.setSize(400, 400);
		demo.setVisible(true);
		demo.setTitle("Border Layout");
		demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
=======
//BorderLayout demo
import java.awt.*;
import javax.swing.*;
class BorderLayoutDemo extends JFrame
{
	BorderLayoutDemo()
	{
		Container c = getContentPane();

		BorderLayout obj = new BorderLayout(10, 10);

		c.setLayout(obj);

		JButton b1, b2, b3, b4;
		b1 = new JButton("Button1");
		b2 = new JButton("Button2");
		b3 = new JButton("Button3");
		b4 = new JButton("Button4");

		c.add("North", b1);
		c.add("East", b2);
		c.add("South", b3);
		c.add("Center", b4);

/*
		c.add(b1, BorderLayout.NORTH);
		c.add(b2, BorderLayout.EAST);
		c.add(b3, BorderLayout.SOUTH);
		c.add(b4, BorderLayout.CENTER);
*/
	}
	public static void main(String[] args) 
	{
		BorderLayoutDemo demo = new BorderLayoutDemo();

		demo.setSize(400, 400);
		demo.setVisible(true);
		demo.setTitle("Border Layout");
		demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//BorderLayout demo
import java.awt.*;
import javax.swing.*;
class BorderLayoutDemo extends JFrame
{
	BorderLayoutDemo()
	{
		Container c = getContentPane();

		BorderLayout obj = new BorderLayout(10, 10);

		c.setLayout(obj);

		JButton b1, b2, b3, b4;
		b1 = new JButton("Button1");
		b2 = new JButton("Button2");
		b3 = new JButton("Button3");
		b4 = new JButton("Button4");

		c.add("North", b1);
		c.add("East", b2);
		c.add("South", b3);
		c.add("Center", b4);

/*
		c.add(b1, BorderLayout.NORTH);
		c.add(b2, BorderLayout.EAST);
		c.add(b3, BorderLayout.SOUTH);
		c.add(b4, BorderLayout.CENTER);
*/
	}
	public static void main(String[] args) 
	{
		BorderLayoutDemo demo = new BorderLayoutDemo();

		demo.setSize(400, 400);
		demo.setVisible(true);
		demo.setTitle("Border Layout");
		demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}