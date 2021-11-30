package core.java;
import Student.*;
import p1.*;
import lit.*;
class AccessDemo
{
	public static void main(String[] args)
	{
		System.out.println("With respect to Sbc");
		new Student.Sbc().display();
		System.out.println("..........................");

		System.out.println("With respect to Ssc");
		new Student.Ssc().display();
		System.out.println("..........................");

		System.out.println("With respect to Sic");
		new Student.Sic().display();
		System.out.println("..........................");

		System.out.println("With respect to Osc");
		new Student.Osc().display();
		System.out.println("..........................");

		System.out.println("With respect to Oic");
		new Student.Oic().display();
		System.out.println("..........................");
	}
}