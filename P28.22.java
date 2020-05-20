<<<<<<< HEAD
<<<<<<< HEAD
//JColorChooser Demo
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class JColorChooserDemo extends JFrame implements ActionListener
{
	JButton b;
	Container c;

	JColorChooserDemo()
	{
		c = getContentPane();
		c.setLayout(new FlowLayout());

		b = new JButton("Select a Color");

		c.add(b);

		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		//Color selectedcolor = null;

		Color color = JColorChooser.showDialog(this, "Select", null);//null canreplace Color.pink

		if(color != null)
		{
			Color selectedcolor = color;
		}
		c.setBackground(color);
	}
	public static void main(String[] args) 
	{
		JColorChooserDemo demo = new JColorChooserDemo();

		demo.setSize(400, 400);
		demo.setTitle("Color Chooser");
		demo.setVisible(true);
		demo.setDefaultCloseOperation(EXIT_ON_CLOSE);	
	}
=======
//JColorChooser Demo
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class JColorChooserDemo extends JFrame implements ActionListener
{
	JButton b;
	Container c;

	JColorChooserDemo()
	{
		c = getContentPane();
		c.setLayout(new FlowLayout());

		b = new JButton("Select a Color");

		c.add(b);

		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		//Color selectedcolor = null;

		Color color = JColorChooser.showDialog(this, "Select", null);//null canreplace Color.pink

		if(color != null)
		{
			Color selectedcolor = color;
		}
		c.setBackground(color);
	}
	public static void main(String[] args) 
	{
		JColorChooserDemo demo = new JColorChooserDemo();

		demo.setSize(400, 400);
		demo.setTitle("Color Chooser");
		demo.setVisible(true);
		demo.setDefaultCloseOperation(EXIT_ON_CLOSE);	
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//JColorChooser Demo
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class JColorChooserDemo extends JFrame implements ActionListener
{
	JButton b;
	Container c;

	JColorChooserDemo()
	{
		c = getContentPane();
		c.setLayout(new FlowLayout());

		b = new JButton("Select a Color");

		c.add(b);

		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		//Color selectedcolor = null;

		Color color = JColorChooser.showDialog(this, "Select", null);//null canreplace Color.pink

		if(color != null)
		{
			Color selectedcolor = color;
		}
		c.setBackground(color);
	}
	public static void main(String[] args) 
	{
		JColorChooserDemo demo = new JColorChooserDemo();

		demo.setSize(400, 400);
		demo.setTitle("Color Chooser");
		demo.setVisible(true);
		demo.setDefaultCloseOperation(EXIT_ON_CLOSE);	
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}