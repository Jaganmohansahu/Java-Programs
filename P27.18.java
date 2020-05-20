<<<<<<< HEAD
<<<<<<< HEAD
//TextFields with a Labels
import java.awt.*;
import java.awt.event.*;
class MyText extends Frame implements ActionListener
{
	TextField name, pass;

	MyText()
	{
		setLayout(new FlowLayout()); 

		Label n = new Label("Name: ", Label.LEFT);
		Label p = new Label("Password: ", Label.LEFT);

		name = new TextField(20);
		pass = new TextField(20);
		pass.setEchoChar('*');

		name.setBackground(Color.yellow);
		name.setForeground(Color.red);
		Font f = new Font("Arial", Font.PLAIN, 25);

		add(n);
		add(name);
		add(p);
		add(pass);

		name.addActionListener(this);
		pass.addActionListener(this);

		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}
	public void actionPerformed(ActionEvent ae)
	{
		Graphics g = this.getGraphics();

		g.drawString("Name: "+name.getText(), 10, 200);
		g.drawString("Password: "+pass.getText(), 10, 240);
	}
	/* OR
	public void actionPerformed(ActionEvent ae)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString("Name: "+name.getText(), 10, 200);
		g.drawString("Password: "+pass.getText(), 10, 240);
	}*/
	
	public static void main(String[] args) 
	{
		MyText mt = new MyText();

		mt.setTitle("My Text Field");
		mt.setSize(300, 400);
		mt.setVisible(true);	
	}
=======
//TextFields with a Labels
import java.awt.*;
import java.awt.event.*;
class MyText extends Frame implements ActionListener
{
	TextField name, pass;

	MyText()
	{
		setLayout(new FlowLayout()); 

		Label n = new Label("Name: ", Label.LEFT);
		Label p = new Label("Password: ", Label.LEFT);

		name = new TextField(20);
		pass = new TextField(20);
		pass.setEchoChar('*');

		name.setBackground(Color.yellow);
		name.setForeground(Color.red);
		Font f = new Font("Arial", Font.PLAIN, 25);

		add(n);
		add(name);
		add(p);
		add(pass);

		name.addActionListener(this);
		pass.addActionListener(this);

		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}
	public void actionPerformed(ActionEvent ae)
	{
		Graphics g = this.getGraphics();

		g.drawString("Name: "+name.getText(), 10, 200);
		g.drawString("Password: "+pass.getText(), 10, 240);
	}
	/* OR
	public void actionPerformed(ActionEvent ae)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString("Name: "+name.getText(), 10, 200);
		g.drawString("Password: "+pass.getText(), 10, 240);
	}*/
	
	public static void main(String[] args) 
	{
		MyText mt = new MyText();

		mt.setTitle("My Text Field");
		mt.setSize(300, 400);
		mt.setVisible(true);	
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//TextFields with a Labels
import java.awt.*;
import java.awt.event.*;
class MyText extends Frame implements ActionListener
{
	TextField name, pass;

	MyText()
	{
		setLayout(new FlowLayout()); 

		Label n = new Label("Name: ", Label.LEFT);
		Label p = new Label("Password: ", Label.LEFT);

		name = new TextField(20);
		pass = new TextField(20);
		pass.setEchoChar('*');

		name.setBackground(Color.yellow);
		name.setForeground(Color.red);
		Font f = new Font("Arial", Font.PLAIN, 25);

		add(n);
		add(name);
		add(p);
		add(pass);

		name.addActionListener(this);
		pass.addActionListener(this);

		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}
	public void actionPerformed(ActionEvent ae)
	{
		Graphics g = this.getGraphics();

		g.drawString("Name: "+name.getText(), 10, 200);
		g.drawString("Password: "+pass.getText(), 10, 240);
	}
	/* OR
	public void actionPerformed(ActionEvent ae)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString("Name: "+name.getText(), 10, 200);
		g.drawString("Password: "+pass.getText(), 10, 240);
	}*/
	
	public static void main(String[] args) 
	{
		MyText mt = new MyText();

		mt.setTitle("My Text Field");
		mt.setSize(300, 400);
		mt.setVisible(true);	
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}