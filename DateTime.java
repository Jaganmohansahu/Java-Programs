import java.util.*;
import java.text.*;

class DateTimeExample
{
	public static void main(String[] args) 
	{
		DateFormat dateFormate = new SimpleDateFormat("dd-mm-yy    hh:mm:ss");
		Date date = new Date();
		System.out.println(dateFormate.format(date));	

		Calendar cal = Calendar.getInstance();
		System.out.println(dateFormate.format(cal.getTime()));
	}
}