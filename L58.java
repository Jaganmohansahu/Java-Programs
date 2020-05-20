<<<<<<< HEAD
<<<<<<< HEAD
//Array of Objects
import java.util.*;
class Student
{
	int roll;
	String name;
	int age;
}
class Test
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Student s = new Student[3];
		for(int i=0; i<s.length; i++)
		{
			s[i] = new student();
			System.out.println("Enter the details of student "+(i+1));
			s[i].roll = sc.nextInt();
			s[i].name = sc.next();
			s[i].age = sc.nextInt();
		}
		System.out.println("All student details: ");
		System.out.println("Roll: \t Name: \t Age: ");
		for(int i=0; i<s.length; i++)
		{
			System.out.println(s[i].roll+ "\t" s[i].name+ "\t" +s[i].age "\t");
		}
	}
=======
//Array of Objects
import java.util.*;
class Student
{
	int roll;
	String name;
	int age;
}
class Test
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Student s = new Student[3];
		for(int i=0; i<s.length; i++)
		{
			s[i] = new student();
			System.out.println("Enter the details of student "+(i+1));
			s[i].roll = sc.nextInt();
			s[i].name = sc.next();
			s[i].age = sc.nextInt();
		}
		System.out.println("All student details: ");
		System.out.println("Roll: \t Name: \t Age: ");
		for(int i=0; i<s.length; i++)
		{
			System.out.println(s[i].roll+ "\t" s[i].name+ "\t" +s[i].age "\t");
		}
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//Array of Objects
import java.util.*;
class Student
{
	int roll;
	String name;
	int age;
}
class Test
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Student s = new Student[3];
		for(int i=0; i<s.length; i++)
		{
			s[i] = new student();
			System.out.println("Enter the details of student "+(i+1));
			s[i].roll = sc.nextInt();
			s[i].name = sc.next();
			s[i].age = sc.nextInt();
		}
		System.out.println("All student details: ");
		System.out.println("Roll: \t Name: \t Age: ");
		for(int i=0; i<s.length; i++)
		{
			System.out.println(s[i].roll+ "\t" s[i].name+ "\t" +s[i].age "\t");
		}
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}