<<<<<<< HEAD
<<<<<<< HEAD
//JProgressBar
import java.awt.*;
import javax.swing.*;
class ProgressDemo extends JFrame
{
	JProgressBar bar;

	ProgressDemo()
	{
		Container c = getContentPane();

		c.setLayout(new FlowLayout());

		bar = new JProgressBar(0, 2000);

		bar.setBackground(Color.pink);
		bar.setForeground(Color.green);

		bar.setStringPainted(true);

		c.add(bar);
	}
	void increase()
	{
		for(int i=0; i<2000; i+=10)
		{
			bar.setValue(i);
			try
			{
				Thread.sleep(20);
			}catch(InterruptedException ie){}
		}
	}
	public static void main(String[] args) 
	{
		ProgressDemo d = new ProgressDemo();

		d.setSize(400, 400);
		d.setTitle("ProgressBar");
		d.setVisible(true);
		d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		d.increase();
	}
=======
//JProgressBar
import java.awt.*;
import javax.swing.*;
class ProgressDemo extends JFrame
{
	JProgressBar bar;

	ProgressDemo()
	{
		Container c = getContentPane();

		c.setLayout(new FlowLayout());

		bar = new JProgressBar(0, 2000);

		bar.setBackground(Color.pink);
		bar.setForeground(Color.green);

		bar.setStringPainted(true);

		c.add(bar);
	}
	void increase()
	{
		for(int i=0; i<2000; i+=10)
		{
			bar.setValue(i);
			try
			{
				Thread.sleep(20);
			}catch(InterruptedException ie){}
		}
	}
	public static void main(String[] args) 
	{
		ProgressDemo d = new ProgressDemo();

		d.setSize(400, 400);
		d.setTitle("ProgressBar");
		d.setVisible(true);
		d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		d.increase();
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//JProgressBar
import java.awt.*;
import javax.swing.*;
class ProgressDemo extends JFrame
{
	JProgressBar bar;

	ProgressDemo()
	{
		Container c = getContentPane();

		c.setLayout(new FlowLayout());

		bar = new JProgressBar(0, 2000);

		bar.setBackground(Color.pink);
		bar.setForeground(Color.green);

		bar.setStringPainted(true);

		c.add(bar);
	}
	void increase()
	{
		for(int i=0; i<2000; i+=10)
		{
			bar.setValue(i);
			try
			{
				Thread.sleep(20);
			}catch(InterruptedException ie){}
		}
	}
	public static void main(String[] args) 
	{
		ProgressDemo d = new ProgressDemo();

		d.setSize(400, 400);
		d.setTitle("ProgressBar");
		d.setVisible(true);
		d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		d.increase();
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}