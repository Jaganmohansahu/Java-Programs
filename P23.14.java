//Display System date and time using date class
import java.util.*;
import java.text.*;
class MyDate
{
	public static void main(String[] args) 
	{
		while(true)
	   {
			Date d = new Date();

		   DateFormat fmt = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL, Locale.UK);

			String str = fmt.format(d);

			System.out.print(str);
			for(int i=0; i<=50; i++)
			{
				System.out.print("\b");	
			}
		}
	}
}