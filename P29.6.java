//GridBagLayout demo
import java.awt.*;
import javax.swing.*;
class GridBagLayoutDemo extends JFrame
{
	GridBagLayout gbag;
	GridBagConstraints cons;

	GridBagLayoutDemo()
	{
		Container c = getContentPane();

		gbag = new GridBagLayout();

		c.setLayout(gbag);

		cons = new GridBagConstraints();

		JButton b1 = new JButton("Button1");
		JButton b2 = new JButton("Button2");
		JButton b3 = new JButton("Button3");
		JButton b4 = new JButton("Button4");
		JButton b5 = new JButton("Button5");

		cons.fill = GridBagConstraints.HORIZONTAL;

		cons.gridx = 0;
		cons.gridy = 0;

		cons.weightx = 0.7;
		cons.weighty = 0.7;

		gbag.setConstraints(b1, cons);
		c.add(b1);

		cons.gridx = 1;
		cons.gridy = 0;

		gbag.setConstraints(b2, cons);
		c.add(b2);

		cons.gridx = 2;
		cons.gridy = 0;

		gbag.setConstraints(b3, cons);
		c.add(b3);

		cons.gridx = 0;
		cons.gridy = 1;

		cons.ipady = 100;

		cons.gridwidth = 3;

		gbag.setConstraints(b4, cons);
		c.add(b4);

		cons.gridx = 1;
		cons.gridy = 2;

		cons.ipady = 0;

		cons.weighty = 0.8;

		cons.anchor = GridBagConstraints.PAGE_END;

		cons.insets = new Insets(0, 0, 50, 0);

		cons.gridwidth = 2;

		gbag.setConstraints(b5, cons);
		c.add(b5);
	}
	public static void main(String[] args) 
	{
		GridBagLayoutDemo demo = new GridBagLayoutDemo();

		demo.setSize(400, 400);
		demo.setTitle("GridBag Layout");
		demo.setVisible(true);
		demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
}