//GridLayout demo
import java.awt.*;
import javax.swing.*;
class GridLayoutDemo extends JFrame
{
	GridLayoutDemo()
	{
		Container c = getContentPane();

		GridLayout grid = new GridLayout(2, 3, 50, 50);
		c.setLayout(grid);

		JButton b1 = new JButton("Button1");
		JButton b2 = new JButton("Button2");
		JButton b3 = new JButton("Button3");
		JButton b4 = new JButton("Button4");
		JButton b5 = new JButton("Button5");

		c.add(b1);
		c.add(b2);
		c.add(b3);
		c.add(b4);
		c.add(b5);
	}
	public static void main(String[] args) 
	{
		GridLayoutDemo demo = new GridLayoutDemo();

		demo.setSize(500, 400);
		demo.setTitle("Grid Layout");
		demo.setVisible(true);
		demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}