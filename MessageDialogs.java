//various types of messages which can be generated from messageDialog() method of JOptionPane class

import javax.swing.JOptionPane;
class demoJOptionPane
{
	public static void main(String[] args) 
	{
		String x = "Hello";

		JOptionPane.showMessageDialog(null, x, "Error Message", JOptionPane.ERROR_MESSAGE);
		JOptionPane.showMessageDialog(null, x, "Information Message", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, x, "Question Message", JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null, x, "Warning Message", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, x, "Plain Message", JOptionPane.PLAIN_MESSAGE);
	}
}