//Button which displays image when clicked
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
class ButtonDemo1 extends JFrame implements ActionListener
{
	JButton b;
	JLabel lbl;

	ButtonDemo1()
	{
		Container c = getContentPane();

		c.setLayout(new FlowLayout());

		ImageIcon ii = new ImageIcon("Zombatar_1.jpg");

		b = new JButton("Click me", ii);

		b.setBackground(Color.yellow);
		b.setForeground(Color.red);

		b.setFont(new Font("Arial", Font.BOLD, 30));

		Border bd = BorderFactory.createBevelBorder(BevelBorder.RAISED);
		b.setBorder(bd);

		b.setToolTipText("This is a Button");

		b.setMnemonic('C');

		c.add(b);

		b.addActionListener(this);

		lbl = new JLabel();
		c.add(lbl);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae)
	{
		ImageIcon ii = new ImageIcon("Zombatar_1.jpg");
		lbl.setIcon(ii);
	}
	public static void main(String[] args) 
	{
		ButtonDemo1 obj = new ButtonDemo1();

		obj.setTitle("My Button");
		obj.setSize(500, 400);
		obj.setVisible(true);	
	}
}