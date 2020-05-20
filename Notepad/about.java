
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class about 
{
	static JFrame window = new JFrame("About Notepad");
	notepad samp;
	JButton btn;

	public about(notepad ref)
	{
		samp = ref;
		Container c = window.getContentPane();
		JPanel p1 = new JPanel();
		p1.setLayout(new FlowLayout());

		String about = "<html>" + "<body>" + "Created by...<br><br>" +
		"Jagan Mohan Sahu <br>"+
		"IIIT BBSR <br>" +
		"Electrical and Electronics Engineering <br>" +
		"E-Mail: sahujaganmohan@gmail.com <br><br>" +
		"Version: 1.8 jdk <br>" +
		"Built Date: "+new java.util.Date()+
		"</body>" +
		"<html>";

		ImageIcon icon = new ImageIcon("IIITlogo.png");
		JLabel l = new JLabel();
		l.setText(about);
		l.setVerticalTextPosition(SwingConstants.TOP);
		l.setIconTextGap(20);
		p1.add(l);

		int w = 340;
		int h = 350;

		window.setSize(w, h);

		Point center = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
		window.setLocation(center.x -w/2, center.y/2);
		window.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		window.setVisible(false);
		window.add(p1);
	}
}