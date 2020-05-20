<<<<<<< HEAD
<<<<<<< HEAD
//List box demo
import java.awt.*;
import java.awt.event.*;
class Mylist extends Frame implements ItemListener
{
	int[] msg;
	List lst;

	Mylist()
	{
		setLayout(new FlowLayout());

		lst = new List(4, true);

		lst.add("English");
		lst.add("Hindi");
		lst.add("Telugu");
		lst.add("Sanskrit");
		lst.add("French");

		add(lst);

		lst.addItemListener(this);

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
		g.drawString("Selected languages: ",100, 200);

		msg = lst.getSelectedIndexes();

		for(int i=0; i<msg.length; i++)
		{

			String item = lst.getItem(msg[i]);
			g.drawString(item, 100, 220+i*20);
			g.drawString(Integer.toString(msg[i]), 180, 220+i*20);
		}
	}
	public static void main(String[] args) 
	{
		Mylist ml = new Mylist();

		ml.setTitle("My list box");
		ml.setSize(400, 400);
		ml.setVisible(true);	
	}
=======
//List box demo
import java.awt.*;
import java.awt.event.*;
class Mylist extends Frame implements ItemListener
{
	int[] msg;
	List lst;

	Mylist()
	{
		setLayout(new FlowLayout());

		lst = new List(4, true);

		lst.add("English");
		lst.add("Hindi");
		lst.add("Telugu");
		lst.add("Sanskrit");
		lst.add("French");

		add(lst);

		lst.addItemListener(this);

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
		g.drawString("Selected languages: ",100, 200);

		msg = lst.getSelectedIndexes();

		for(int i=0; i<msg.length; i++)
		{

			String item = lst.getItem(msg[i]);
			g.drawString(item, 100, 220+i*20);
			g.drawString(Integer.toString(msg[i]), 180, 220+i*20);
		}
	}
	public static void main(String[] args) 
	{
		Mylist ml = new Mylist();

		ml.setTitle("My list box");
		ml.setSize(400, 400);
		ml.setVisible(true);	
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//List box demo
import java.awt.*;
import java.awt.event.*;
class Mylist extends Frame implements ItemListener
{
	int[] msg;
	List lst;

	Mylist()
	{
		setLayout(new FlowLayout());

		lst = new List(4, true);

		lst.add("English");
		lst.add("Hindi");
		lst.add("Telugu");
		lst.add("Sanskrit");
		lst.add("French");

		add(lst);

		lst.addItemListener(this);

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
		g.drawString("Selected languages: ",100, 200);

		msg = lst.getSelectedIndexes();

		for(int i=0; i<msg.length; i++)
		{

			String item = lst.getItem(msg[i]);
			g.drawString(item, 100, 220+i*20);
			g.drawString(Integer.toString(msg[i]), 180, 220+i*20);
		}
	}
	public static void main(String[] args) 
	{
		Mylist ml = new Mylist();

		ml.setTitle("My list box");
		ml.setSize(400, 400);
		ml.setVisible(true);	
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}