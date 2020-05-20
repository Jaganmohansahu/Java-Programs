<<<<<<< HEAD
<<<<<<< HEAD
//Menu Creation
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MyMenu extends JFrame implements ActionListener
{
	JMenuBar mb;
	JMenu file, edit, font;
	JMenuItem op, sa, cl, pt, f1, f2, cp;
	JCheckBoxMenuItem pr;

	MyMenu()
	{
		Container c = getContentPane();
		c.setLayout(new BorderLayout());

		mb = new JMenuBar();

		c.add("North", mb);

		file = new JMenu("File");
		edit = new JMenu("Edit");
		mb.add(file);
		mb.add(edit);

		op = new JMenuItem("Open");
		sa = new JMenuItem("Save");
		cl = new JMenuItem("Close");
		cp = new JMenuItem("Copy");
		pt = new JMenuItem("Paste");

		file.add(op);
		file.add(sa);
		file.add(cl);
		edit.add(cp);
		edit.add(pt);

		cl.setEnabled(false);

		pr = new JCheckBoxMenuItem("Print");
		file.add(pr);

		file.addSeparator();

		font = new JMenu("Font");
		file.add(font);

		f1 = new JMenuItem("Arial");
		f2 = new JMenuItem("Times New Roman");

		font.add(f1);
		font.add(f2);

		op.addActionListener(this);
		sa.addActionListener(this);
		cl.addActionListener(this);
		cp.addActionListener(this);
		pt.addActionListener(this);
		pr.addActionListener(this);
		f1.addActionListener(this);
		f2.addActionListener(this);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(op.isArmed())	System.out.println("Open is selected");
		if(sa.isArmed())	System.out.println("Save is selected");
		if(cl.isArmed())	System.out.println("Close is selected");
		if(cp.isArmed())	System.out.println("Copy is selected");
		if(pt.isArmed())	System.out.println("Paste is selected");

		if(pr.getModel().isSelected())	System.out.println("Printing on...");
		else	System.out.println("Printing off...");

		if(f1.isArmed())	System.out.println("Arial Font is selected");
		if(f2.isArmed())	System.out.println("Times New Roman is selected");
	}

	public static void main(String[] args) 
	{
		MyMenu mm = new MyMenu();

		mm.setTitle("JMenu demo");
		mm.setSize(500, 400);
		mm.setVisible(true);	
	}
=======
//Menu Creation
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MyMenu extends JFrame implements ActionListener
{
	JMenuBar mb;
	JMenu file, edit, font;
	JMenuItem op, sa, cl, pt, f1, f2, cp;
	JCheckBoxMenuItem pr;

	MyMenu()
	{
		Container c = getContentPane();
		c.setLayout(new BorderLayout());

		mb = new JMenuBar();

		c.add("North", mb);

		file = new JMenu("File");
		edit = new JMenu("Edit");
		mb.add(file);
		mb.add(edit);

		op = new JMenuItem("Open");
		sa = new JMenuItem("Save");
		cl = new JMenuItem("Close");
		cp = new JMenuItem("Copy");
		pt = new JMenuItem("Paste");

		file.add(op);
		file.add(sa);
		file.add(cl);
		edit.add(cp);
		edit.add(pt);

		cl.setEnabled(false);

		pr = new JCheckBoxMenuItem("Print");
		file.add(pr);

		file.addSeparator();

		font = new JMenu("Font");
		file.add(font);

		f1 = new JMenuItem("Arial");
		f2 = new JMenuItem("Times New Roman");

		font.add(f1);
		font.add(f2);

		op.addActionListener(this);
		sa.addActionListener(this);
		cl.addActionListener(this);
		cp.addActionListener(this);
		pt.addActionListener(this);
		pr.addActionListener(this);
		f1.addActionListener(this);
		f2.addActionListener(this);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(op.isArmed())	System.out.println("Open is selected");
		if(sa.isArmed())	System.out.println("Save is selected");
		if(cl.isArmed())	System.out.println("Close is selected");
		if(cp.isArmed())	System.out.println("Copy is selected");
		if(pt.isArmed())	System.out.println("Paste is selected");

		if(pr.getModel().isSelected())	System.out.println("Printing on...");
		else	System.out.println("Printing off...");

		if(f1.isArmed())	System.out.println("Arial Font is selected");
		if(f2.isArmed())	System.out.println("Times New Roman is selected");
	}

	public static void main(String[] args) 
	{
		MyMenu mm = new MyMenu();

		mm.setTitle("JMenu demo");
		mm.setSize(500, 400);
		mm.setVisible(true);	
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//Menu Creation
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MyMenu extends JFrame implements ActionListener
{
	JMenuBar mb;
	JMenu file, edit, font;
	JMenuItem op, sa, cl, pt, f1, f2, cp;
	JCheckBoxMenuItem pr;

	MyMenu()
	{
		Container c = getContentPane();
		c.setLayout(new BorderLayout());

		mb = new JMenuBar();

		c.add("North", mb);

		file = new JMenu("File");
		edit = new JMenu("Edit");
		mb.add(file);
		mb.add(edit);

		op = new JMenuItem("Open");
		sa = new JMenuItem("Save");
		cl = new JMenuItem("Close");
		cp = new JMenuItem("Copy");
		pt = new JMenuItem("Paste");

		file.add(op);
		file.add(sa);
		file.add(cl);
		edit.add(cp);
		edit.add(pt);

		cl.setEnabled(false);

		pr = new JCheckBoxMenuItem("Print");
		file.add(pr);

		file.addSeparator();

		font = new JMenu("Font");
		file.add(font);

		f1 = new JMenuItem("Arial");
		f2 = new JMenuItem("Times New Roman");

		font.add(f1);
		font.add(f2);

		op.addActionListener(this);
		sa.addActionListener(this);
		cl.addActionListener(this);
		cp.addActionListener(this);
		pt.addActionListener(this);
		pr.addActionListener(this);
		f1.addActionListener(this);
		f2.addActionListener(this);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(op.isArmed())	System.out.println("Open is selected");
		if(sa.isArmed())	System.out.println("Save is selected");
		if(cl.isArmed())	System.out.println("Close is selected");
		if(cp.isArmed())	System.out.println("Copy is selected");
		if(pt.isArmed())	System.out.println("Paste is selected");

		if(pr.getModel().isSelected())	System.out.println("Printing on...");
		else	System.out.println("Printing off...");

		if(f1.isArmed())	System.out.println("Arial Font is selected");
		if(f2.isArmed())	System.out.println("Times New Roman is selected");
	}

	public static void main(String[] args) 
	{
		MyMenu mm = new MyMenu();

		mm.setTitle("JMenu demo");
		mm.setSize(500, 400);
		mm.setVisible(true);	
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}