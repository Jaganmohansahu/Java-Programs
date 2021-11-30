/** Program to simulate the probability of head/ tail by trails. 
	We will generate a random boolean number.
	If its value is true Head is tossed otherwise Tail is tossed.
	We will experiment with 1, 10, 100, 1000..... and display the probabilities.
	*/

import java.util.Random;
class Head_Tail
{
	public static void main(String[] args)
	{
		Random coin = new Random();

		int ntrials[] = {1, 10, 100, 1000, 10000, 100000, 1000000};
		System.out.println("Number of Trails\t" + "Head Probability\t" + "Tail Probability");	

		for(int j=0; j<ntrials[j]; j++)
		{
			int count=0;
			for(int i=0; i<ntrials[j]; i++)
			{
				boolean n = coin.nextBoolean();

				if(n==true)	count++;
			}
			double head = (double)count/ntrials[j];
			System.out.println(ntrials[j] + "\t\t" + head + "\t\t" + (1-head));
		}
	}
}