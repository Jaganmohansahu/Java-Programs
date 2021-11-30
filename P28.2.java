//A simple Frame
import javax.swing.*;
class FrameDemo extends JFrame
{
	public static void main(String[] args) 
	{
		FrameDemo obj = new FrameDemo();

		obj.setTitle("My Swing Frame");

		obj.setSize(200, 200);

		obj.setVisible(true);

		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
}