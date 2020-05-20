<<<<<<< HEAD
<<<<<<< HEAD
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
=======
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
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
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
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}