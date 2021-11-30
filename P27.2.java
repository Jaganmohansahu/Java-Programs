//Creating a frame - version 2
import java.awt.*;
class MyFrame extends Frame 
{
	MyFrame(String str)
	{
		super(str);
	}
	public static void main(String[] args) 
	{
		MyFrame f = new MyFrame("My AWT frame");	

		f.setSize(300, 250);
		f.setVisible(true);
	}
}