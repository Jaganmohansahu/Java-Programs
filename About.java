<<<<<<< HEAD
<<<<<<< HEAD


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class About
{
	static JFrame window = new JFrame("About Notepad");
	Notepad samp;
	JButton btn;

	public About(Notepad ref)
	{
		samp = ref;
		//Container c = window.getContentPane();
		JPanel p1 = new JPanel();
		p1.setLayout(new FlowLayout());

		String about = "<html>" + "<body>" + "Created by...<br>" +
		"Jagan Mohan Sahu <br>"+
		"IIIT BBSR <br>" +
		"Electrical and Electronics Engineering <br>" +
		"E-Mail: sahujaganmohan@gmail.com <br>" +
		"Version: 1.8 jdk <br>" +
		"Built Date: "+new java.util.Date()+"<br><br><br>" +
		"</body>" +
		"<html>";

		ImageIcon icon = new ImageIcon("Jagan.jpg");
		JLabel l = new JLabel();
		l.setText(about);
		//l.setVerticalTextPosition(SwingConstants.TOP);
		//l.setIconTextGap(20);
		p1.add(l);

		int w = 340;
		int h = 350;

		window.setSize(w, h);

		Point center = graphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
		window.setLocation(center.x -w/2, center.y/2);
		window.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		window.setVisible(false);
		window.add(p1);
	}
=======


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class About
{
	static JFrame window = new JFrame("About Notepad");
	Notepad samp;
	JButton btn;

	public About(Notepad ref)
	{
		samp = ref;
		//Container c = window.getContentPane();
		JPanel p1 = new JPanel();
		p1.setLayout(new FlowLayout());

		String about = "<html>" + "<body>" + "Created by...<br>" +
		"Jagan Mohan Sahu <br>"+
		"IIIT BBSR <br>" +
		"Electrical and Electronics Engineering <br>" +
		"E-Mail: sahujaganmohan@gmail.com <br>" +
		"Version: 1.8 jdk <br>" +
		"Built Date: "+new java.util.Date()+"<br><br><br>" +
		"</body>" +
		"<html>";

		ImageIcon icon = new ImageIcon("Jagan.jpg");
		JLabel l = new JLabel();
		l.setText(about);
		//l.setVerticalTextPosition(SwingConstants.TOP);
		//l.setIconTextGap(20);
		p1.add(l);

		int w = 340;
		int h = 350;

		window.setSize(w, h);

		Point center = graphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
		window.setLocation(center.x -w/2, center.y/2);
		window.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		window.setVisible(false);
		window.add(p1);
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class About
{
	static JFrame window = new JFrame("About Notepad");
	Notepad samp;
	JButton btn;

	public About(Notepad ref)
	{
		samp = ref;
		//Container c = window.getContentPane();
		JPanel p1 = new JPanel();
		p1.setLayout(new FlowLayout());

		String about = "<html>" + "<body>" + "Created by...<br>" +
		"Jagan Mohan Sahu <br>"+
		"IIIT BBSR <br>" +
		"Electrical and Electronics Engineering <br>" +
		"E-Mail: sahujaganmohan@gmail.com <br>" +
		"Version: 1.8 jdk <br>" +
		"Built Date: "+new java.util.Date()+"<br><br><br>" +
		"</body>" +
		"<html>";

		ImageIcon icon = new ImageIcon("Jagan.jpg");
		JLabel l = new JLabel();
		l.setText(about);
		//l.setVerticalTextPosition(SwingConstants.TOP);
		//l.setIconTextGap(20);
		p1.add(l);

		int w = 340;
		int h = 350;

		window.setSize(w, h);

		Point center = graphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
		window.setLocation(center.x -w/2, center.y/2);
		window.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		window.setVisible(false);
		window.add(p1);
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}