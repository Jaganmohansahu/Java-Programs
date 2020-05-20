<<<<<<< HEAD
<<<<<<< HEAD
//Leap year
import java.io.*;
class Leap
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		System.out.println("Enter year no.");
		int year = Integer.parseInt(br.readLine());

		if(year%100==0 && year%400==0)
			System.out.println("It is a Leap Year");
		else if(year%100!=0 && year%400==0)
			System.out.println("It is a Leap Year");
		else 
			System.out.println("Not a Leap Year");
	}
=======
//Leap year
import java.io.*;
class Leap
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		System.out.println("Enter year no.");
		int year = Integer.parseInt(br.readLine());

		if(year%100==0 && year%400==0)
			System.out.println("It is a Leap Year");
		else if(year%100!=0 && year%400==0)
			System.out.println("It is a Leap Year");
		else 
			System.out.println("Not a Leap Year");
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//Leap year
import java.io.*;
class Leap
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		System.out.println("Enter year no.");
		int year = Integer.parseInt(br.readLine());

		if(year%100==0 && year%400==0)
			System.out.println("It is a Leap Year");
		else if(year%100!=0 && year%400==0)
			System.out.println("It is a Leap Year");
		else 
			System.out.println("Not a Leap Year");
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}