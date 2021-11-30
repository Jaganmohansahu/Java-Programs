//To display System date and time
import java.util.*;
class CalendarDemo
{
	public static void main(String[] args) 
	{
		Calendar cl = Calendar.getInstance();

		System.out.print("Current date: ");	
		int dd = cl.get(Calendar.DATE);
		int mm = cl.get(Calendar.MONTH);
		++mm;
		int yy = cl.get(Calendar.YEAR);
		System.out.println(dd+"-"+mm+"-"+yy);

		System.out.print("Current time: ");
		int h = cl.get(Calendar.HOUR);
		int m = cl.get(Calendar.MINUTE);
		int s = cl.get(Calendar.SECOND);
		System.out.println(h+":"+m+":"+s);

		int x = cl.get(Calendar.AM_PM);
		if(x==0)	System.out.println("GOOD MORNING");
		else System.out.println("GOOD EVENING");
	}
}