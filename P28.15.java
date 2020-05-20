<<<<<<< HEAD
<<<<<<< HEAD
//JComboBox demo 		//Compile as:- java JComboBoxDemo -Xlint:deprecation
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class JComboBoxDemo extends JFrame implements ItemListener
{
	JComboBox box;
	JLabel lbl;

	JComboBoxDemo()
	{
		Container c = getContentPane();

		c.setLayout(null);

		box = new JComboBox();

		box.addItem("India");
		box.addItem("America");
		box.addItem("Germany");
		box.addItem("Japan");
		box.addItem("France");

		box.setBounds(100, 50, 100, 40);

		c.add(box);

		lbl = new JLabel();

		lbl.setBounds(100, 200, 200, 40);

		c.add(lbl);

		box.addItemListener(this);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		String str = (String)box.getSelectedItem();

		lbl.setText("You selected: "+str);
	}
	public static void main(String[] args) 
	{
		JComboBoxDemo demo = new JComboBoxDemo();

		demo.setTitle("My Combo box");
		demo.setSize(500, 400);
		demo.setVisible(true);	
	}
=======
//JComboBox demo 		//Compile as:- java JComboBoxDemo -Xlint:deprecation
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class JComboBoxDemo extends JFrame implements ItemListener
{
	JComboBox box;
	JLabel lbl;

	JComboBoxDemo()
	{
		Container c = getContentPane();

		c.setLayout(null);

		box = new JComboBox();

		box.addItem("India");
		box.addItem("America");
		box.addItem("Germany");
		box.addItem("Japan");
		box.addItem("France");

		box.setBounds(100, 50, 100, 40);

		c.add(box);

		lbl = new JLabel();

		lbl.setBounds(100, 200, 200, 40);

		c.add(lbl);

		box.addItemListener(this);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		String str = (String)box.getSelectedItem();

		lbl.setText("You selected: "+str);
	}
	public static void main(String[] args) 
	{
		JComboBoxDemo demo = new JComboBoxDemo();

		demo.setTitle("My Combo box");
		demo.setSize(500, 400);
		demo.setVisible(true);	
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//JComboBox demo 		//Compile as:- java JComboBoxDemo -Xlint:deprecation
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class JComboBoxDemo extends JFrame implements ItemListener
{
	JComboBox box;
	JLabel lbl;

	JComboBoxDemo()
	{
		Container c = getContentPane();

		c.setLayout(null);

		box = new JComboBox();

		box.addItem("India");
		box.addItem("America");
		box.addItem("Germany");
		box.addItem("Japan");
		box.addItem("France");

		box.setBounds(100, 50, 100, 40);

		c.add(box);

		lbl = new JLabel();

		lbl.setBounds(100, 200, 200, 40);

		c.add(lbl);

		box.addItemListener(this);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		String str = (String)box.getSelectedItem();

		lbl.setText("You selected: "+str);
	}
	public static void main(String[] args) 
	{
		JComboBoxDemo demo = new JComboBoxDemo();

		demo.setTitle("My Combo box");
		demo.setSize(500, 400);
		demo.setVisible(true);	
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}