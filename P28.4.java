//A simple frame with background color and text
import javax.swing.*;
import java.awt.*;
class MyPanel extends JPanel
{
	MyPanel()
	{
		this.setBackground(Color.green);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setFont(new Font("Helvetica", Font.BOLD, 34));
		g.drawString("HELLO !!", 50, 100);
	}
}
class FrameDemo extends JFrame
{
	FrameDemo()
	{
		Container c = this.getContentPane();
		
		MyPanel mp = new MyPanel();
		c.add(mp);
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