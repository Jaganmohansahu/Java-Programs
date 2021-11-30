//Understanding the borders
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
class BorderDemo extends JFrame
{
	JButton b1, b2, b3, b4, b5, b6, b7, b8;
	BorderDemo()
	{
		Container c = getContentPane();

		c.setLayout(new FlowLayout());
		c.setBackground(Color.pink);

		b1 = new JButton("Raised Bevel Border");
		b2 = new JButton("Lowered Bevel Border");
		b3 = new JButton("Raised Etched Border");
		b4 = new JButton("Lowered Etched Border");
		b5 = new JButton("Line Border");
		b6 = new JButton("Matte Border");
		b7 = new JButton("Compund Border");
		b8 = new JButton("Empty Border");

		Border bd = BorderFactory.createBevelBorder(BevelBorder.RAISED, Color.red, Color.green);
		b1.setBorder(bd);

		bd = BorderFactory.createBevelBorder(BevelBorder.LOWERED, Color.red, Color.green);
		b2.setBorder(bd);

		bd = BorderFactory.createEtchedBorder(EtchedBorder.RAISED, Color.red, Color.green);
		b3.setBorder(bd);

		bd = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED, Color.red, Color.green);
		b4.setBorder(bd);

		bd = BorderFactory.createLineBorder(Color.red, 5);
		b5.setBorder(bd);

		bd = BorderFactory.createMatteBorder(5, 10, 15, 20, Color.red);
		b6.setBorder(bd);

		bd = BorderFactory.createCompoundBorder();
		b7.setBorder(bd);

		bd = BorderFactory.createEmptyBorder(5, 10, 15, 20);
		b8.setBorder(bd);

		c.add(b1);
		c.add(b2);
		c.add(b3);
		c.add(b4);
		c.add(b5);
		c.add(b6);
		c.add(b7);
		c.add(b8);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) 
	{
		BorderDemo obj = new BorderDemo();

		obj.setTitle("Borders");
		obj.setSize(500, 400);
		obj.setVisible(true);	
	}
}