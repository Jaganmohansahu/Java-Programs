<<<<<<< HEAD
<<<<<<< HEAD
//This is Frame2
import java.awt.*;
import java.awt.event.*;
class Frame2 extends Frame implements ActionListener
{
	Button b;

	Frame2()
	{
		setLayout(new FlowLayout());

		b = new Button("Back");

		add(b);

		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		this.dispose();
	}
=======
//This is Frame2
import java.awt.*;
import java.awt.event.*;
class Frame2 extends Frame implements ActionListener
{
	Button b;

	Frame2()
	{
		setLayout(new FlowLayout());

		b = new Button("Back");

		add(b);

		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		this.dispose();
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//This is Frame2
import java.awt.*;
import java.awt.event.*;
class Frame2 extends Frame implements ActionListener
{
	Button b;

	Frame2()
	{
		setLayout(new FlowLayout());

		b = new Button("Back");

		add(b);

		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		this.dispose();
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}