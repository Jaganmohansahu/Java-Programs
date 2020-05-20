<<<<<<< HEAD
<<<<<<< HEAD
//Choice box demo
import java.awt.*;
import java.awt.event.*;
class Mychoice extends Frame implements ItemListener
{
	String msg;
	Choice ch;

	Mychoice()
	{
		setLayout(new FlowLayout());

		ch = new Choice();

		ch.add("English");
		ch.add("Hindi");
		ch.add("Telugu");
		ch.add("Sanskrit");
		ch.add("French");

		add(ch);

		ch.addItemListener(this);

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
		g.drawString("Selected language: ",10, 100);
		msg = ch.getSelectedItem();
		g.drawString(msg, 10, 120);
	}
	public static void main(String[] args) 
	{
		Mychoice mc = new Mychoice();

		mc.setTitle("My Choice Box");
		mc.setSize(400, 350);
		mc.setVisible(true);	
	}
=======
//Choice box demo
import java.awt.*;
import java.awt.event.*;
class Mychoice extends Frame implements ItemListener
{
	String msg;
	Choice ch;

	Mychoice()
	{
		setLayout(new FlowLayout());

		ch = new Choice();

		ch.add("English");
		ch.add("Hindi");
		ch.add("Telugu");
		ch.add("Sanskrit");
		ch.add("French");

		add(ch);

		ch.addItemListener(this);

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
		g.drawString("Selected language: ",10, 100);
		msg = ch.getSelectedItem();
		g.drawString(msg, 10, 120);
	}
	public static void main(String[] args) 
	{
		Mychoice mc = new Mychoice();

		mc.setTitle("My Choice Box");
		mc.setSize(400, 350);
		mc.setVisible(true);	
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//Choice box demo
import java.awt.*;
import java.awt.event.*;
class Mychoice extends Frame implements ItemListener
{
	String msg;
	Choice ch;

	Mychoice()
	{
		setLayout(new FlowLayout());

		ch = new Choice();

		ch.add("English");
		ch.add("Hindi");
		ch.add("Telugu");
		ch.add("Sanskrit");
		ch.add("French");

		add(ch);

		ch.addItemListener(this);

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
		g.drawString("Selected language: ",10, 100);
		msg = ch.getSelectedItem();
		g.drawString(msg, 10, 120);
	}
	public static void main(String[] args) 
	{
		Mychoice mc = new Mychoice();

		mc.setTitle("My Choice Box");
		mc.setSize(400, 350);
		mc.setVisible(true);	
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}