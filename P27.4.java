//Creating a frame and closing it
import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame 
{
	public static void main(String[] args) 
	{
		MyFrame f = new MyFrame();

		f.setTitle("My AWT frame");
		f.setSize(300, 250);
		f.setVisible(true);
		f.addWindowListener(new MyClass());	
	}
}
class MyClass extends WindowAdapter
{
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
}