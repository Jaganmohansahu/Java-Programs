<<<<<<< HEAD
<<<<<<< HEAD
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
=======
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
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
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
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}