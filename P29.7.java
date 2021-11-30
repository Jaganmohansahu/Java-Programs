//BoxLayout demo
import java.awt.*;
import javax.swing.*;
class BoxLayoutDemo extends JFrame
{
	BoxLayoutDemo()
	{
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		MyPanel1 mp1 = new MyPanel1();
		c.add(mp1);

		MyPanel2 mp2 = new MyPanel2();
		c.add(mp2);
	}
	public static void main(String[] args) 
	{
		BoxLayoutDemo demo = new BoxLayoutDemo();
		demo.setSize(400, 400);
		demo.setTitle("Box Layout");
		demo.setVisible(true);
		demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
}
class MyPanel1 extends JPanel
{
	MyPanel1()
	{
		BoxLayout box1 = new BoxLayout(this, BoxLayout.X_AXIS);

		setLayout(box1);

		JButton b1, b2, b3;
		b1 = new JButton("Button1");
		b2 = new JButton("Button2");
		b3 = new JButton("Button3");

		add(b1);
		add(b2);
		add(b3);
	}
}
class MyPanel2 extends JPanel
{
	MyPanel2()
	{
		BoxLayout box2 = new BoxLayout(this, BoxLayout.Y_AXIS);

		setLayout(box2);

		JButton b1, b2, b3;
		b1 = new JButton("Button1");
		b2 = new JButton("Button2");
		b3 = new JButton("Button3");

		add(b1);
		add(b2);
		add(b3);
	}
}