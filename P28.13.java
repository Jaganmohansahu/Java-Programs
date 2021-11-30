//Split pane with text area and button
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class JSplitPaneDemo extends JFrame implements ActionListener
{
	String str = "This is my text being displyed in the Text area"+
				" and this will be wrapped accordingly";
	JButton b;
	JTextArea ta;
	JSplitPane sp;

	JSplitPaneDemo()
	{
		Container c = getContentPane();

		c.setLayout(new BorderLayout());

		b = new JButton("My Button");
		ta = new JTextArea();

		ta.setLineWrap(true);

		sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, b, ta);

		sp.setDividerLocation(300);

		c.add("Center", sp);

		b.addActionListener(this);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae)
	{
		ta.setText(str);
	}
	public static void main(String[] args) 
	{
		JSplitPaneDemo spd = new JSplitPaneDemo();

		spd.setSize(500, 400);
		spd.setTitle("My SPLIT Pane");
		spd.setVisible(true);	
	}
}