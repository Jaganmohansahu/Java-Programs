//Another use of showInputDialog() method. It displays a combo box.
/** First we have taken items names of the comboBox in a String array.
	This string array is sent as 6th argument and its first element as 7th argument to showInputDialog method. 
	As we want Apple as the default item to be displayed, we have sent first element of the string array 
	as 7th argument.*/

import javax.swing.*;
class ComboBoxshowInputDialog
{
	public static final String[] Fruits = {"Apple", "Banana", "Grapes", "Orange"};
	public static void main(String[] args) 
	{
		String favouriteFruit = (String)JOptionPane.showInputDialog(null, "What is your favourite fruit??", "Favourite Fruit", JOptionPane.QUESTION_MESSAGE, null, Fruits, Fruits[0]);
		//String favouriteFruit = (String)JOptionPane.showInputDialog(null, "What is your favourite fruit??", "Favourite Fruit", JOptionPane.QUESTION_MESSAGE, new ImageIcon("fruits.png"), Fruits, Fruits[0]);
		
		//favourite will be null if the user clicks Cancel
		System.out.printf("Favourite fruit is: %s. \n", favouriteFruit);
		System.exit(0);	
	}
} 