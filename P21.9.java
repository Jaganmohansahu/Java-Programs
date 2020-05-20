<<<<<<< HEAD
<<<<<<< HEAD
//Not handling the exception - Using throws clause
import java.io.*;
class Sample
{
	private String name;
	void accept()	throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name: ");
		name = br.readLine();
	}
	void display()
	{
		System.out.println("Name: "+name);
	}
}
class Ex1
{
	public static void main(String[] args)	throws IOException
	{
		Sample s = new Sample();
		s.accept();
		s.display();
	}
=======
//Not handling the exception - Using throws clause
import java.io.*;
class Sample
{
	private String name;
	void accept()	throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name: ");
		name = br.readLine();
	}
	void display()
	{
		System.out.println("Name: "+name);
	}
}
class Ex1
{
	public static void main(String[] args)	throws IOException
	{
		Sample s = new Sample();
		s.accept();
		s.display();
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//Not handling the exception - Using throws clause
import java.io.*;
class Sample
{
	private String name;
	void accept()	throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name: ");
		name = br.readLine();
	}
	void display()
	{
		System.out.println("Name: "+name);
	}
}
class Ex1
{
	public static void main(String[] args)	throws IOException
	{
		Sample s = new Sample();
		s.accept();
		s.display();
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}