<<<<<<< HEAD
<<<<<<< HEAD
//Menu creation
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
class MyMenu extends JFrame implements ActionListener
{
	JMenuBar mb;
	JMenu file, edit, font;
	JMenuItem op, sa, cl, cp, pt, f1, f2;
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
		file.add(cp);
		file.add(pt);

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
		//cl.addActionListener(this);
		cp.addActionListener(this);
		pt.addActionListener(this);
		pr.addActionListener(this);
		f1.addActionListener(this);
		f2.addActionListener(this);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(op.isArmed())	this.openFile();
		if(sa.isArmed())	//this.saveFile();

		if(cl.isArmed())	System.out.println("Close is selected");
		if(cp.isArmed())	System.out.println("Copy is selected");
		if(pt.isArmed())	System.out.println("Paste is selected");

		if(pr.getModel().isSelected())	System.out.println("Printing on...");
		else	System.out.println("Printing off...");

		if(f1.isArmed())	System.out.println("Arial Font is selected");
		if(f2.isArmed())	System.out.println("Times New Roman is selected");
	}
	void openFile()
	{
		JFileChooser fc = new JFileChooser();
		int i = fc.showOpenDialog(this);

		if(i == JFileChooser.APPROVE_OPTION)
		{
			File f = fc.getSelectedFile();

			String fname = f.getPath();

		OpenFrame of = new OpenFrame(fname);

			of.setSize(500, 400);
			of.setVisible(true);
		}
	}
	public static void main(String[] args) 
	{
		MyMenu mm = new MyMenu();

		mm.setTitle("JMenu Demo");
		mm.setSize(500, 400);
		mm.setVisible(true);	
	}
}
class OpenFrame extends JFrame
{
	OpenFrame(String fname)
	{
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		TextArea ta = new TextArea(22, 60);
		c.add(ta);

		String str = "";
		String str1 = "";

		try
		{
			BufferedReader br = new BufferedReader(new FileReader(fname));

			while((str = br.readLine()) != null)
				str1 += str+"\n";

			ta.setText(str1);

			br.close();
		}catch(Exception e){}
	}
=======
//Menu creation
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
class MyMenu extends JFrame implements ActionListener
{
	JMenuBar mb;
	JMenu file, edit, font;
	JMenuItem op, sa, cl, cp, pt, f1, f2;
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
		file.add(cp);
		file.add(pt);

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
		//cl.addActionListener(this);
		cp.addActionListener(this);
		pt.addActionListener(this);
		pr.addActionListener(this);
		f1.addActionListener(this);
		f2.addActionListener(this);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(op.isArmed())	this.openFile();
		if(sa.isArmed())	//this.saveFile();

		if(cl.isArmed())	System.out.println("Close is selected");
		if(cp.isArmed())	System.out.println("Copy is selected");
		if(pt.isArmed())	System.out.println("Paste is selected");

		if(pr.getModel().isSelected())	System.out.println("Printing on...");
		else	System.out.println("Printing off...");

		if(f1.isArmed())	System.out.println("Arial Font is selected");
		if(f2.isArmed())	System.out.println("Times New Roman is selected");
	}
	void openFile()
	{
		JFileChooser fc = new JFileChooser();
		int i = fc.showOpenDialog(this);

		if(i == JFileChooser.APPROVE_OPTION)
		{
			File f = fc.getSelectedFile();

			String fname = f.getPath();

		OpenFrame of = new OpenFrame(fname);

			of.setSize(500, 400);
			of.setVisible(true);
		}
	}
	public static void main(String[] args) 
	{
		MyMenu mm = new MyMenu();

		mm.setTitle("JMenu Demo");
		mm.setSize(500, 400);
		mm.setVisible(true);	
	}
}
class OpenFrame extends JFrame
{
	OpenFrame(String fname)
	{
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		TextArea ta = new TextArea(22, 60);
		c.add(ta);

		String str = "";
		String str1 = "";

		try
		{
			BufferedReader br = new BufferedReader(new FileReader(fname));

			while((str = br.readLine()) != null)
				str1 += str+"\n";

			ta.setText(str1);

			br.close();
		}catch(Exception e){}
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//Menu creation
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
class MyMenu extends JFrame implements ActionListener
{
	JMenuBar mb;
	JMenu file, edit, font;
	JMenuItem op, sa, cl, cp, pt, f1, f2;
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
		file.add(cp);
		file.add(pt);

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
		//cl.addActionListener(this);
		cp.addActionListener(this);
		pt.addActionListener(this);
		pr.addActionListener(this);
		f1.addActionListener(this);
		f2.addActionListener(this);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(op.isArmed())	this.openFile();
		if(sa.isArmed())	//this.saveFile();

		if(cl.isArmed())	System.out.println("Close is selected");
		if(cp.isArmed())	System.out.println("Copy is selected");
		if(pt.isArmed())	System.out.println("Paste is selected");

		if(pr.getModel().isSelected())	System.out.println("Printing on...");
		else	System.out.println("Printing off...");

		if(f1.isArmed())	System.out.println("Arial Font is selected");
		if(f2.isArmed())	System.out.println("Times New Roman is selected");
	}
	void openFile()
	{
		JFileChooser fc = new JFileChooser();
		int i = fc.showOpenDialog(this);

		if(i == JFileChooser.APPROVE_OPTION)
		{
			File f = fc.getSelectedFile();

			String fname = f.getPath();

		OpenFrame of = new OpenFrame(fname);

			of.setSize(500, 400);
			of.setVisible(true);
		}
	}
	public static void main(String[] args) 
	{
		MyMenu mm = new MyMenu();

		mm.setTitle("JMenu Demo");
		mm.setSize(500, 400);
		mm.setVisible(true);	
	}
}
class OpenFrame extends JFrame
{
	OpenFrame(String fname)
	{
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		TextArea ta = new TextArea(22, 60);
		c.add(ta);

		String str = "";
		String str1 = "";

		try
		{
			BufferedReader br = new BufferedReader(new FileReader(fname));

			while((str = br.readLine()) != null)
				str1 += str+"\n";

			ta.setText(str1);

			br.close();
		}catch(Exception e){}
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}