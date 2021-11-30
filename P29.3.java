//CardLayout demo
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class CardLayoutDemo extends JFrame implements ActionListener
{
	Container c;
	CardLayout card;
	JButton b1, b2, b3, b4;

	CardLayoutDemo()
	{
		c = getContentPane();

		card = new CardLayout(50, 10);

		c.setLayout(card);

		b1 = new JButton("Button1");
		b2 = new JButton("Button2");
		b3 = new JButton("Button3");
		b4 = new JButton("Button4");

		c.add("First card", b1);
		c.add("Second card", b2);
		c.add("Third card", b3);
		c.add("Fourth card", b4);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		
		card.next(c);
		//card.show(c, "Third card");

	}
	public static void main(String[] args) 
	{
		CardLayoutDemo demo = new CardLayoutDemo();

		demo.setSize(400, 400);
		demo.setTitle("Card Layout");
		demo.setVisible(true);
		demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
}