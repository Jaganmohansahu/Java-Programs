//A simple frame with background color and text
import javax.swing.*;
import java.awt.*;
class FrameDemo extends JFrame
{
	JLabel lbl;
	FrameDemo()
	{
		Container c = this.getContentPane();

		c.setLayout(new FlowLayout());

		c.setBackground(Color.green);

		lbl = new JLabel("Hello Learns!!");

		lbl.setFont(new Font("Helvetica", Font.BOLD, 34));

		lbl.setForeground(Color.red);

		c.add(lbl);
	}
	public static void main(String[] args) 
	{
		FrameDemo obj = new FrameDemo();

		obj.setTitle("My Swing Frame");
		obj.setSize(300, 300);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
}