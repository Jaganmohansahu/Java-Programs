//Button with an image, colors, border, tool tp text and shortcut key
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
class ButtonDemo extends JFrame
{
	JButton b;
	ButtonDemo()
	{
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		ImageIcon ii = new ImageIcon("Zombatar_1.jpg");

		b = new JButton("Click me",ii);

		b.setBackground(Color.yellow);
		b.setForeground(Color.red);

		b.setFont(new Font("Arial", Font.BOLD, 30));

		Border bd = BorderFactory.createBevelBorder(BevelBorder.RAISED, Color.green, Color.pink);
		b.setBorder(bd);
		b.setToolTipText("This is a Button");
		b.setMnemonic('C');
		c.add(b);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) 
	{
		ButtonDemo obj = new ButtonDemo();

		obj.setTitle("My Button");
		obj.setSize(500, 400);
		obj.setVisible(true);	
	}
}