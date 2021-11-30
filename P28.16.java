//JComboBox demo
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
class JListDemo extends JFrame implements ListSelectionListener
{
	JList lst;
	JLabel lbl;
	Object arr[];
	String msg = "";

	JListDemo()
	{
		Container c = getContentPane();

		c.setLayout(null);

		String items[] = {"India", "America", "Germany", "Japan", "France"};

		lst = new JList(items);

		lst.setBounds(100, 50, 100, 100);
		c.add(lst);

		lbl = new JLabel();

		lbl.setBounds(50, 200, 400, 40);

		c.add(lbl);

		lst.addListSelectionListener(this);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void valueChanged(ListSelectionEvent le)
	{
		arr = lst.getSelectedValues();

		for(int i=0; i<arr.length; i++)
			msg += (String)arr[i];
		lbl.setText("selected: "+msg);
		msg = "";
	}
	public static void main(String[] args) 
	{
		JListDemo demo = new JListDemo();

		demo.setTitle("My combo list");
		demo.setSize(500, 400);
		demo.setVisible(true);	
	}
}