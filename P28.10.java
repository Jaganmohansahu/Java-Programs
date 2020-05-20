<<<<<<< HEAD
<<<<<<< HEAD
//Chnging the look and feel of components
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.*;
class LookFeel extends JFrame implements ItemListener
{
	JButton b;
	JCheckBox cb;
	JTextField t;
	JRadioButton r1, r2, r3;
	ButtonGroup bg;
	Container c;

	LookFeel()
	{
		c = this.getContentPane();

		c.setLayout(null);

		b = new JButton("Button");
		cb = new JCheckBox("CheckBox");
		t = new JTextField("TextField", 15);
		r1 = new JRadioButton("Metal");
		r2 = new JRadioButton("Motif");
		r3 = new JRadioButton("Windows");

		bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);

		b.setBounds(100, 50, 75, 40);
		cb.setBounds(100, 100, 100, 40);
		t.setBounds(100, 150, 100, 40);
		r1.setBounds(50, 250, 100, 30);
		r2.setBounds(150, 250, 100, 30);
		r3.setBounds(250, 250, 100, 30);

		c.add(b);
		c.add(cb);
		c.add(t);
		c.add(r1);
		c.add(r2);
		c.add(r3);

		r1.addItemListener(this);
		r2.addItemListener(this);
		r3.addItemListener(this);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		try
		{
			if(r1.getModel().isSelected())
				UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
			if(r2.getModel().isSelected())
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
			if(r3.getModel().isSelected())
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

			SwingUtilities.updateComponentTreeUI(c);
		}catch(Exception e){}
	}
	public static void main(String[] args) 
	{
		LookFeel lf = new LookFeel();
		lf.setSize(400, 400);
		lf.setTitle("Look and Feel");
		lf.setVisible(true);	
	}
=======
//Chnging the look and feel of components
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.*;
class LookFeel extends JFrame implements ItemListener
{
	JButton b;
	JCheckBox cb;
	JTextField t;
	JRadioButton r1, r2, r3;
	ButtonGroup bg;
	Container c;

	LookFeel()
	{
		c = this.getContentPane();

		c.setLayout(null);

		b = new JButton("Button");
		cb = new JCheckBox("CheckBox");
		t = new JTextField("TextField", 15);
		r1 = new JRadioButton("Metal");
		r2 = new JRadioButton("Motif");
		r3 = new JRadioButton("Windows");

		bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);

		b.setBounds(100, 50, 75, 40);
		cb.setBounds(100, 100, 100, 40);
		t.setBounds(100, 150, 100, 40);
		r1.setBounds(50, 250, 100, 30);
		r2.setBounds(150, 250, 100, 30);
		r3.setBounds(250, 250, 100, 30);

		c.add(b);
		c.add(cb);
		c.add(t);
		c.add(r1);
		c.add(r2);
		c.add(r3);

		r1.addItemListener(this);
		r2.addItemListener(this);
		r3.addItemListener(this);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		try
		{
			if(r1.getModel().isSelected())
				UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
			if(r2.getModel().isSelected())
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
			if(r3.getModel().isSelected())
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

			SwingUtilities.updateComponentTreeUI(c);
		}catch(Exception e){}
	}
	public static void main(String[] args) 
	{
		LookFeel lf = new LookFeel();
		lf.setSize(400, 400);
		lf.setTitle("Look and Feel");
		lf.setVisible(true);	
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//Chnging the look and feel of components
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.*;
class LookFeel extends JFrame implements ItemListener
{
	JButton b;
	JCheckBox cb;
	JTextField t;
	JRadioButton r1, r2, r3;
	ButtonGroup bg;
	Container c;

	LookFeel()
	{
		c = this.getContentPane();

		c.setLayout(null);

		b = new JButton("Button");
		cb = new JCheckBox("CheckBox");
		t = new JTextField("TextField", 15);
		r1 = new JRadioButton("Metal");
		r2 = new JRadioButton("Motif");
		r3 = new JRadioButton("Windows");

		bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);

		b.setBounds(100, 50, 75, 40);
		cb.setBounds(100, 100, 100, 40);
		t.setBounds(100, 150, 100, 40);
		r1.setBounds(50, 250, 100, 30);
		r2.setBounds(150, 250, 100, 30);
		r3.setBounds(250, 250, 100, 30);

		c.add(b);
		c.add(cb);
		c.add(t);
		c.add(r1);
		c.add(r2);
		c.add(r3);

		r1.addItemListener(this);
		r2.addItemListener(this);
		r3.addItemListener(this);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		try
		{
			if(r1.getModel().isSelected())
				UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
			if(r2.getModel().isSelected())
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
			if(r3.getModel().isSelected())
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

			SwingUtilities.updateComponentTreeUI(c);
		}catch(Exception e){}
	}
	public static void main(String[] args) 
	{
		LookFeel lf = new LookFeel();
		lf.setSize(400, 400);
		lf.setTitle("Look and Feel");
		lf.setVisible(true);	
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}