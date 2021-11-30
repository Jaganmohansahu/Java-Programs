//Program generates a series of Beep sounds.
import java.awt.Toolkit;
class Beep
{
	public static void main(String[] args) 
	{
		for(int i=0; i<100000; i++)	

			Toolkit.getDefaultToolkit().beep();
	}
}