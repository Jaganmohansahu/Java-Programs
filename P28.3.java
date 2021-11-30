//A simple frame with background colour		//ERROR
import javax.swing.*;
import java.awt.*;
class FrameDemo extends JFrame
{
	public static void main(String[] args) 
	{
		FrameDemo obj = new FrameDemo();

		Container c = obj.getContentPane();

		c.setBackground(Color.green);

		obj.setTitle("My SWING Frame");

		obj.setSize(200, 200);

		obj.setVisible(true);

		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
}