<<<<<<< HEAD
<<<<<<< HEAD
//This is Frame1
import java.awt.*;
import java.awt.event.*;
class Frame1 extends Frame implements ActionListener
{
	Button b1, b2;
	Frame1()
	{
		setLayout(new FlowLayout());

		b1 = new Button("Next");
		b2 = new Button("Close");

		

		add(b1);
		add(b2);

		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == b1)
		{
			Frame2 f2 = new Frame2();
			f2.setSize(200, 200);
			f2.setTitle("Second Frame");
			f2.setVisible(true);
		}
		else
		{
			System.exit(0);
		}
	}
	public static void main(String[] args) 
	{
		Frame1 f1 = new Frame1();
		f1.setSize(200, 200);
		f1.setTitle("First Frame");
		f1.setVisible(true);	
	}
=======
//This is Frame1
import java.awt.*;
import java.awt.event.*;
class Frame1 extends Frame implements ActionListener
{
	Button b1, b2;
	Frame1()
	{
		setLayout(new FlowLayout());

		b1 = new Button("Next");
		b2 = new Button("Close");

		

		add(b1);
		add(b2);

		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == b1)
		{
			Frame2 f2 = new Frame2();
			f2.setSize(200, 200);
			f2.setTitle("Second Frame");
			f2.setVisible(true);
		}
		else
		{
			System.exit(0);
		}
	}
	public static void main(String[] args) 
	{
		Frame1 f1 = new Frame1();
		f1.setSize(200, 200);
		f1.setTitle("First Frame");
		f1.setVisible(true);	
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//This is Frame1
import java.awt.*;
import java.awt.event.*;
class Frame1 extends Frame implements ActionListener
{
	Button b1, b2;
	Frame1()
	{
		setLayout(new FlowLayout());

		b1 = new Button("Next");
		b2 = new Button("Close");

		

		add(b1);
		add(b2);

		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == b1)
		{
			Frame2 f2 = new Frame2();
			f2.setSize(200, 200);
			f2.setTitle("Second Frame");
			f2.setVisible(true);
		}
		else
		{
			System.exit(0);
		}
	}
	public static void main(String[] args) 
	{
		Frame1 f1 = new Frame1();
		f1.setSize(200, 200);
		f1.setTitle("First Frame");
		f1.setVisible(true);	
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}