<<<<<<< HEAD
<<<<<<< HEAD
//Radio buttons demo
import java.awt.*;
import java.awt.event.*;
class Myradio extends Frame implements ItemListener
{
	String msg = "";
	CheckboxGroup cbg;
	Checkbox y, n;

	Myradio()
	{
		setLayout(new FlowLayout());

		cbg = new CheckboxGroup();

		y = new Checkbox("Yes", cbg, true);
		n = new Checkbox("No", cbg, false);

		add(y);
		add(n);

		y.addItemListener(this);
		n.addItemListener(this);

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
		msg = "Current selection: ";
		msg += cbg.getSelectedCheckbox().getLabel();
		g.drawString(msg, 10, 100);
	}
	public static void main(String[] args) 
	{
		Myradio mr = new Myradio();

		mr.setTitle("My radio buttons");
		mr.setSize(400, 400);
		mr.setVisible(true);	
	}
=======
//Radio buttons demo
import java.awt.*;
import java.awt.event.*;
class Myradio extends Frame implements ItemListener
{
	String msg = "";
	CheckboxGroup cbg;
	Checkbox y, n;

	Myradio()
	{
		setLayout(new FlowLayout());

		cbg = new CheckboxGroup();

		y = new Checkbox("Yes", cbg, true);
		n = new Checkbox("No", cbg, false);

		add(y);
		add(n);

		y.addItemListener(this);
		n.addItemListener(this);

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
		msg = "Current selection: ";
		msg += cbg.getSelectedCheckbox().getLabel();
		g.drawString(msg, 10, 100);
	}
	public static void main(String[] args) 
	{
		Myradio mr = new Myradio();

		mr.setTitle("My radio buttons");
		mr.setSize(400, 400);
		mr.setVisible(true);	
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//Radio buttons demo
import java.awt.*;
import java.awt.event.*;
class Myradio extends Frame implements ItemListener
{
	String msg = "";
	CheckboxGroup cbg;
	Checkbox y, n;

	Myradio()
	{
		setLayout(new FlowLayout());

		cbg = new CheckboxGroup();

		y = new Checkbox("Yes", cbg, true);
		n = new Checkbox("No", cbg, false);

		add(y);
		add(n);

		y.addItemListener(this);
		n.addItemListener(this);

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
		msg = "Current selection: ";
		msg += cbg.getSelectedCheckbox().getLabel();
		g.drawString(msg, 10, 100);
	}
	public static void main(String[] args) 
	{
		Myradio mr = new Myradio();

		mr.setTitle("My radio buttons");
		mr.setSize(400, 400);
		mr.setVisible(true);	
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}