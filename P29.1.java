//FlowLayout demo
import java.awt.*;
import javax.swing.*;
class FlowLayoutDemo extends JFrame
{
	FlowLayoutDemo()
	{
		Container c = getContentPane();

		FlowLayout obj = new FlowLayout(FlowLayout.RIGHT, 10, 10);

		c.setLayout(obj);

		JButton b1, b2, b3, b4;
		b1 = new JButton("Button1");
		b2 = new JButton("Button2");
		b3 = new JButton("Button3");
		b4 = new JButton("Button4");

		c.add(b1);
		c.add(b2);
		c.add(b3);
		c.add(b4);
	}
	public static void main(String[] args) 
	{
		FlowLayoutDemo demo = new FlowLayoutDemo();

		demo.setVisible(true);
		demo.setSize(400, 400);
		demo.setTitle("Flow Layout");
		demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}