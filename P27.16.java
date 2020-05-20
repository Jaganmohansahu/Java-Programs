<<<<<<< HEAD
<<<<<<< HEAD
//Check box demo
import java.awt.*;
import java.awt.event.*;
class Mycheckbox extends Frame implements ItemListener
{
	String msg ;
	Checkbox c1, c2, c3;

	Mycheckbox()
	{
		setLayout(new FlowLayout());

		c1 = new Checkbox("Bold",true);
		c2 = new Checkbox("Italic");
		c3 = new Checkbox("Underline");

		add(c1);
		add(c2);
		add(c3);

		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);

		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString("CURRENT STATE ", 10, 100);
		msg = "Bold: "+c1.getState();
		g.drawString(msg, 10, 120);
		msg = "Italic: "+c2.getState();
		g.drawString(msg, 10, 140);
		msg = "Underline: "+c3.getState();
		g.drawString(msg, 10, 160);
	}
	public static void main(String[] args) 
	{
		Mycheckbox mc = new Mycheckbox();

		mc.setTitle("My CheckBox");
		mc.setSize(400, 400);
		mc.setVisible(true);
	}
=======
//Check box demo
import java.awt.*;
import java.awt.event.*;
class Mycheckbox extends Frame implements ItemListener
{
	String msg ;
	Checkbox c1, c2, c3;

	Mycheckbox()
	{
		setLayout(new FlowLayout());

		c1 = new Checkbox("Bold",true);
		c2 = new Checkbox("Italic");
		c3 = new Checkbox("Underline");

		add(c1);
		add(c2);
		add(c3);

		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);

		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString("CURRENT STATE ", 10, 100);
		msg = "Bold: "+c1.getState();
		g.drawString(msg, 10, 120);
		msg = "Italic: "+c2.getState();
		g.drawString(msg, 10, 140);
		msg = "Underline: "+c3.getState();
		g.drawString(msg, 10, 160);
	}
	public static void main(String[] args) 
	{
		Mycheckbox mc = new Mycheckbox();

		mc.setTitle("My CheckBox");
		mc.setSize(400, 400);
		mc.setVisible(true);
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//Check box demo
import java.awt.*;
import java.awt.event.*;
class Mycheckbox extends Frame implements ItemListener
{
	String msg ;
	Checkbox c1, c2, c3;

	Mycheckbox()
	{
		setLayout(new FlowLayout());

		c1 = new Checkbox("Bold",true);
		c2 = new Checkbox("Italic");
		c3 = new Checkbox("Underline");

		add(c1);
		add(c2);
		add(c3);

		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);

		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString("CURRENT STATE ", 10, 100);
		msg = "Bold: "+c1.getState();
		g.drawString(msg, 10, 120);
		msg = "Italic: "+c2.getState();
		g.drawString(msg, 10, 140);
		msg = "Underline: "+c3.getState();
		g.drawString(msg, 10, 160);
	}
	public static void main(String[] args) 
	{
		Mycheckbox mc = new Mycheckbox();

		mc.setTitle("My CheckBox");
		mc.setSize(400, 400);
		mc.setVisible(true);
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}