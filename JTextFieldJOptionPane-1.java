//Another version of showInputDialog() method

import javax.swing.*;
class Inputdialog
{
	public static void main(String[] args) 
	{
		String code = JOptionPane.showInputDialog(null, "Enter the Secret code to continue (label)", "Secret code needed (title)", JOptionPane.WARNING_MESSAGE);

		//If the user presses cancel, this will be null
		//If the user presses Ok without entering anything then 
		//method returns nothing (remember it is not null)

		System.out.printf("The secret code is: %s.\n",code);	
		System.exit(0);
	}
}