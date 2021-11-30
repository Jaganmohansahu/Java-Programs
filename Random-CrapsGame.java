//Craps Game

import java.util.Random;
import javax.swing.*;
class Craps
{
	public static void main(String[] args) 
	{
		Random game = new Random();

		int ntrials=0;
		double rf = game.nextDouble();
		int rval = (int)(rf*200);

		int guess = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Guess (0-200)"));

		while(true)
		{
			if(guess==rval)
			{
				JOptionPane.showMessageDialog(null, "Congrats, You Won!! \n Points = " + (10-ntrials), "Craps Game", JOptionPane.PLAIN_MESSAGE);
				System.exit(0);
			}

			else if(++ntrials<10 && guess<rval) guess=Integer.parseInt(JOptionPane.showInputDialog("your Guess is Low. Enter Your Guess Again"));

			else if(++ntrials<10 && guess>rval) guess=Integer.parseInt(JOptionPane.showInputDialog("your Guess is High. Enter Your Guess Again"));

			else
			{
				JOptionPane.showMessageDialog(null, "Try Again :(" , "Craps Game", JOptionPane.PLAIN_MESSAGE);
				System.exit(0);
			}
		}
	}
}