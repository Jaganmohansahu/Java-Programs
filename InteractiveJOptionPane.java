<<<<<<< HEAD
<<<<<<< HEAD
/** The The following example demonstrates the use of showConfirmDialog method which is useful
	in interactive GUI application development. It prompts user whether to play or not. 
	It returns an integer, if user selects YES it returns 0 else it returns 1.
	We are sending JOptionPane.TES_NO_OPTION as fourth argument to show COnfirmDialog method of JOptionPane.
	*/
// Pop up window will be displayed in the JFrame instead of desktop.
// In this case JFrame is sent as the first arguement instead of null.

import javax.swing.*;
class ConfirmDialog
{
	public static void main(String[] args) 
	{
		/*JFrame AA = new JFrame();
		AA.setVisible(true);
		AA.setSize(400, 400);*/

		int playAgain = JOptionPane.showConfirmDialog(null, "Choose one", "Do you want to Play again", JOptionPane.YES_NO_OPTION);
		//int playAgain = JOptionPane.showConfirmDialog(AA, "Choose one", "Do you want to Play again", JOptionPane.YES_NO_OPTION);

		if(playAgain==0)
		{
			JOptionPane.showMesssageDialog(null, "you have Selected to Play Again !!", JOptionPane.PLAIN_MESSAGE);
			//JOptionPane.showMesssageDialog(AA, "you have Selected to Play Again !!");
		}	
		else
		{
			JOptionPane.showMesssageDialog(null, "Exit", JOptionPane.PLAIN_MESSAGE);
			//JOptionPane.showMesssageDialog(AA, "Exit");
		}
	}
=======
/** The The following example demonstrates the use of showConfirmDialog method which is useful
	in interactive GUI application development. It prompts user whether to play or not. 
	It returns an integer, if user selects YES it returns 0 else it returns 1.
	We are sending JOptionPane.TES_NO_OPTION as fourth argument to show COnfirmDialog method of JOptionPane.
	*/
// Pop up window will be displayed in the JFrame instead of desktop.
// In this case JFrame is sent as the first arguement instead of null.

import javax.swing.*;
class ConfirmDialog
{
	public static void main(String[] args) 
	{
		/*JFrame AA = new JFrame();
		AA.setVisible(true);
		AA.setSize(400, 400);*/

		int playAgain = JOptionPane.showConfirmDialog(null, "Choose one", "Do you want to Play again", JOptionPane.YES_NO_OPTION);
		//int playAgain = JOptionPane.showConfirmDialog(AA, "Choose one", "Do you want to Play again", JOptionPane.YES_NO_OPTION);

		if(playAgain==0)
		{
			JOptionPane.showMesssageDialog(null, "you have Selected to Play Again !!", JOptionPane.PLAIN_MESSAGE);
			//JOptionPane.showMesssageDialog(AA, "you have Selected to Play Again !!");
		}	
		else
		{
			JOptionPane.showMesssageDialog(null, "Exit", JOptionPane.PLAIN_MESSAGE);
			//JOptionPane.showMesssageDialog(AA, "Exit");
		}
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
/** The The following example demonstrates the use of showConfirmDialog method which is useful
	in interactive GUI application development. It prompts user whether to play or not. 
	It returns an integer, if user selects YES it returns 0 else it returns 1.
	We are sending JOptionPane.TES_NO_OPTION as fourth argument to show COnfirmDialog method of JOptionPane.
	*/
// Pop up window will be displayed in the JFrame instead of desktop.
// In this case JFrame is sent as the first arguement instead of null.

import javax.swing.*;
class ConfirmDialog
{
	public static void main(String[] args) 
	{
		/*JFrame AA = new JFrame();
		AA.setVisible(true);
		AA.setSize(400, 400);*/

		int playAgain = JOptionPane.showConfirmDialog(null, "Choose one", "Do you want to Play again", JOptionPane.YES_NO_OPTION);
		//int playAgain = JOptionPane.showConfirmDialog(AA, "Choose one", "Do you want to Play again", JOptionPane.YES_NO_OPTION);

		if(playAgain==0)
		{
			JOptionPane.showMesssageDialog(null, "you have Selected to Play Again !!", JOptionPane.PLAIN_MESSAGE);
			//JOptionPane.showMesssageDialog(AA, "you have Selected to Play Again !!");
		}	
		else
		{
			JOptionPane.showMesssageDialog(null, "Exit", JOptionPane.PLAIN_MESSAGE);
			//JOptionPane.showMesssageDialog(AA, "Exit");
		}
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}