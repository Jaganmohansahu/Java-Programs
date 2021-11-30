//Employee class	\\ERROR
import java.io.*;
import java.util.*;
class Employee implements Serializable
{
	int id;
	String name;
	float sal;
	Calender doj;

	void displayData()
	{
		int yy = doj.get(Calender.YEAR);
		int mm = doj.get(Calender.MONTH);
		mm++;
		int dd = doj.get(Calender.DATE);

		System.out.print("%-10d %s %10.2f %2d-%2d-%4d\n", id, name, sal, dd, mm, yy);
	}
	void getData()	throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter Employee id: ");
		id = Integer.parseInt(br.readLine());
		System.out.print("Enter name: ");
		name = br.readLine();
		System.out.print("Enter salary: ");
		sal = Float.parseFloat(br.readLine());

		System.out.println("Enter date of joining: ");
		System.out.print("Enter day: ");
		int dd = Integer.parseInt(br.readLine());

		System.out.print("Enter month: ");
		int mm = Integer.parseInt(br.readLine());

		System.out.print("Enter year: ");
		int yy = Integer.parseInt(br.readLine());

		doj = Calender.getInstance();
		doj.set(yy,mm,dd);
	}
}