//Push buttons - version 2
import java.awt.*;
import java.awt.event.*;
class Mybuttons extends Frame implements ActionListener
{
	Button b1, b2, b3;
	Mybuttons()
	{
		setLayout(new FlowLayout());

		b1 = new Button("Yellow");
		b2 = new Button("Blue");
		b3 = new Button("Pink");

		add(b1);
		add(b2);
		add(b3);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);

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
		if(ae.getSource() == b1)	setBackground(Color.yellow);
		if(ae.getSource() == b2)	setBackground(Color.blue);
		if(ae.getSource() == b3)	setBackground(Color.pink);
	}
	public static void main(String[] args) 
	{
		Mybuttons mb = new Mybuttons();

		mb.setSize(400, 400);
		mb.setTitle("My Buttons");
		mb.setVisible(true);	
	}
}