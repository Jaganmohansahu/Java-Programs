//Calendar example
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.*;

class CalendarExample
{
	private static void prt(String s)
	{
		System.out.println(s);
	}
	private static void prt()
	{
		System.out.println();
	}

	/** Calendar getTime() method returns a Date object
	   * this can then be passed to println() to print today's date (and time) 
	   * in the traditional (but non-localized format)
	   */
	private static void docalendarTimeExample()
	{
		prt("CURRENT DATE/TIME");
		prt("===========================================================================");
		Date now = Calendar.getInstance().getTime();
		prt("Calendar.getInstance().getTime(): " + now);
		prt();
	}

	/** Simple Date Format from java.text package
	  */
	private static void doSimpleDateFormat()
	{
		prt("SIMPLE DATE FORMAT");
		prt("===========================================================================");

		//Get today's date
		Calendar now = Calendar.getInstance();
		SimpleDateFormat formatter = new SimpleDateFormat("E yyy.MM.dd 'at' hh:mm:ss a zzz");
		prt("   It is now: " + formatter.format(now.getTime()));
		prt();
	}

	/** Date Arithmatic function. Adds the specified (signed) amount of time to 
	  * the given time field based on calendar's rules
	  * the following example
	  * -Subtracts 2 years from the current time of calendar
	  * -Adds 5 days from the current time of the calendar 
	  */
	private static void doAdd()
	{
		prt("ADD / SUBTRACT CALENDAR / DATEs");
		prt("===========================================================================");

		//Get todays date
		Calendar now = Calendar.getInstance();
		Calendar working;
		SimpleDateFormat formatter = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

		working = (Calendar)now.clone();
		working.add(Calendar.DAY_OF_YEAR, + 5);
		prt("In five days it will be: " + formatter.format(working.getTime()));
		prt();
	}
	private static void doDateDifference()
	{
		prt("DIFFERENCE BETWEEN TWO DATES");
		prt("===========================================================================");
		Date startDate1 = new GregorianCalendar(1994, 02, 14, 14, 00).getTime();
		Date endDate1 = new Date();

		long diff = endDate1.getTime() - startDate1.getTime();

		prt(" Difference between " + endDate1);
		prt(" and " + startDate1 + " is " + (diff/(1000L*60L*60L*24L))+"days.");
		prt();
	}

	private static void doGetMethods()
	{
		prt("CALENDAR GET METHODS");
		prt("===========================================================================");
			Calendar c = Calendar.getInstance();

			prt("	YEAR  : " + c.get(Calendar.YEAR));
			prt("	MONTH : " + c.get(Calendar.MONTH));
			prt("	DAY_OF_MONTH : " + c.get(Calendar.DAY_OF_MONTH));
			prt("	DAY_OF_WEEK : " + c.get(Calendar.DAY_OF_WEEK));
			prt("	DAY_OF_YEAR : " + c.get(Calendar.DAY_OF_YEAR));
			prt("	WEEK_OF_MONTH : " + c.get(Calendar.WEEK_OF_MONTH));
			prt("	DAY_OF_WEEK_IN_MONTH : " + c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
			prt("	HOUR : " + c.get(Calendar.HOUR));
			prt("	AM_PM : " + c.get(Calendar.AM_PM));
			prt("	HOUR_OF_DAY (24-hour) : " + c.get(Calendar.HOUR_OF_DAY));
			prt("	MINUTE : " + c.get(Calendar.MINUTE));
			prt("	SECOND : " + c.get(Calendar.SECOND));
			prt();
	}

	public static void main(String[] args) 
	{
		prt();
		docalendarTimeExample();
		doSimpleDateFormat();
		doAdd();
		doDateDifference();
		doGetMethods();
	}
}