//JTable demo
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.border.*;
import java.util.*;
class JTableDemo extends JFrame
{
	JTableDemo()
	{
		Vector<Vector> data = new Vector<Vector>();

		Vector<String> row = new Vector<String>();

		row.add("Jagu Sahu");
		row.add("Analyst");
		row.add("22, 000.00");

		data.add(row);

		row = new Vector<String>();
		row.add("Hari Sahu");
		row.add("Programmer");
		row.add("18, 000.50");

		data.add(row);

		Vector<String> cols = new Vector<String>();
		cols.add("Employee Name");
		cols.add("Designation");
		cols.add("Salary");

		JTable tab = new JTable(data, cols);

		tab.setBorder(BorderFactory.createLineBorder(Color.green, 2));

		tab.setFont(new Font("Arial", Font.BOLD, 20));

		tab.setRowHeight(30);

		tab.setGridColor(Color.red);

		JTableHeader head = tab.getTableHeader();

		Container c = getContentPane();

		c.setLayout(new BorderLayout());

		c.add("North", head);
		c.add("Center", tab);
	}
	public static void main(String[] args) 
	{
		JTableDemo demo = new JTableDemo();

		demo.setSize(500, 400);
		demo.setVisible(true);

		demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
}