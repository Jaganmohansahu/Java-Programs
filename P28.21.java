//JToolBar
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class JToolBarDemo extends JFrame implements ActionListener
{
	String str;
	Container c;
	JToolBar tb;
	JButton b1, b2, b3;
	JLabel lbl;

	JToolBarDemo()
	{
		c = getContentPane();

		c.setLayout(new BorderLayout());

		tb = new JToolBar();

		tb.setBorder(BorderFactory.createEtchedBorder(Color.green, Color.black));

		ImageIcon img1, img2, img3;
		img1 = new ImageIcon("Zombatar_1.jpg");
		img2 = new ImageIcon("Naipaul.png");
		img3 = new ImageIcon("Jagan.jpg");

		b1 = new JButton(img1);
		b2 = new JButton(img2);
		b3 = new JButton(img3);

		tb.add(b1);
		tb.add(b2);
		tb.add(b3);

		c.add("North", tb);

		lbl = new JLabel();
		lbl.setFont(new Font("SansSerif", Font.PLAIN, 30));
		c.add("Center", lbl);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == b1)	str = "New clicked";
		if(ae.getSource() == b2)	str = "Open clicked";
		if(ae.getSource() == b3)	str = "Print clicked";

		lbl.setText(str);
	}
	public static void main(String[] args) 
	{
		JToolBarDemo tbd = new JToolBarDemo();

		tbd.setSize(400, 400);
		tbd.setVisible(true);
		tbd.setTitle("JToolBar Demo");
		tbd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
}