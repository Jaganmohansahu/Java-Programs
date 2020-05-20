<<<<<<< HEAD
<<<<<<< HEAD

/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test {
	public static void main(String[] args) {

		Set<String> ans = new HashSet<>();

		Set<String> checkDates = new HashSet<>();
		checkDates.add("10-01-2019");
		checkDates.add("11-01-2019");
		checkDates.add("11-01-2019");
		checkDates.add("21-01-2019");
		checkDates.add("13-09-2019");
		checkDates.add("25-12-2019");

		Set<Date> dates = new HashSet<>();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Date1 ");
		String date1 = s.next();
		System.out.println("Enter Date2 ");
		String date2 = s.next();
		s.close();

		Date startDate = null;
		Date endDate = null;

		DateFormat datef = new SimpleDateFormat("dd-MM-yyyy");
		try {

			startDate = datef.parse(date1);
			endDate = datef.parse(date2);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		long interval = 24 * 1000 * 60 * 60;
		long endTime = endDate.getTime();
		long curTime = startDate.getTime();

		while (curTime <= endTime) {
			dates.add(new Date(curTime));
			curTime += interval;
		}

		for (Date el: dates) {
			String elString = datef.format(el);
		      if (!checkDates.contains(elString)) {
		        ans.add(elString);
		      }
		    }

		ans.forEach(System.out::println);
	}
}
=======

/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test {
	public static void main(String[] args) {

		Set<String> ans = new HashSet<>();

		Set<String> checkDates = new HashSet<>();
		checkDates.add("10-01-2019");
		checkDates.add("11-01-2019");
		checkDates.add("11-01-2019");
		checkDates.add("21-01-2019");
		checkDates.add("13-09-2019");
		checkDates.add("25-12-2019");

		Set<Date> dates = new HashSet<>();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Date1 ");
		String date1 = s.next();
		System.out.println("Enter Date2 ");
		String date2 = s.next();
		s.close();

		Date startDate = null;
		Date endDate = null;

		DateFormat datef = new SimpleDateFormat("dd-MM-yyyy");
		try {

			startDate = datef.parse(date1);
			endDate = datef.parse(date2);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		long interval = 24 * 1000 * 60 * 60;
		long endTime = endDate.getTime();
		long curTime = startDate.getTime();

		while (curTime <= endTime) {
			dates.add(new Date(curTime));
			curTime += interval;
		}

		for (Date el: dates) {
			String elString = datef.format(el);
		      if (!checkDates.contains(elString)) {
		        ans.add(elString);
		      }
		    }

		ans.forEach(System.out::println);
	}
}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======

/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test {
	public static void main(String[] args) {

		Set<String> ans = new HashSet<>();

		Set<String> checkDates = new HashSet<>();
		checkDates.add("10-01-2019");
		checkDates.add("11-01-2019");
		checkDates.add("11-01-2019");
		checkDates.add("21-01-2019");
		checkDates.add("13-09-2019");
		checkDates.add("25-12-2019");

		Set<Date> dates = new HashSet<>();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Date1 ");
		String date1 = s.next();
		System.out.println("Enter Date2 ");
		String date2 = s.next();
		s.close();

		Date startDate = null;
		Date endDate = null;

		DateFormat datef = new SimpleDateFormat("dd-MM-yyyy");
		try {

			startDate = datef.parse(date1);
			endDate = datef.parse(date2);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		long interval = 24 * 1000 * 60 * 60;
		long endTime = endDate.getTime();
		long curTime = startDate.getTime();

		while (curTime <= endTime) {
			dates.add(new Date(curTime));
			curTime += interval;
		}

		for (Date el: dates) {
			String elString = datef.format(el);
		      if (!checkDates.contains(elString)) {
		        ans.add(elString);
		      }
		    }

		ans.forEach(System.out::println);
	}
}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
