//A toggle button with start and stop images
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class JTButton extends JFrame implements ActionListener
{
	JToggleButton but;
	ImageIcon img1;

	JTButton()
	{
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		img1 = new ImageIcon("Zombatar_1.jpg");

		but = new JToggleButton("start/stop", img1);

		c.add(but);

		but.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		ImageIcon img2 = new ImageIcon("Naipaul.png");

		if(but.isSelected())
			but.setIcon(img2);
		else	but.setIcon(img1);
	}
	public static void main(String[] args) 
	{
		JTButton demo = new JTButton();

		demo.setSize(400, 400);
		demo.setVisible(true);
		demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
}