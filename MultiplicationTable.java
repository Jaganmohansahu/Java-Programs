<<<<<<< HEAD
<<<<<<< HEAD
import java.io.*;
class Multiplication
{
	public static void main(String[] args) throws IOException
	{
		int i, j;

		//Prints out labels for each column of multiplication table
		System.out.println("Multiplication Table");
		System.out.printf("%5s"," ");

		for(i=1; i<=10; i++)
			System.out.printf("%5d", i);	//Prints out the rest of the table
		System.out.println();

		for(i=1; i<=10; i++)
		{
			System.out.printf("%5d", i);
			//Prints the ith row of the Table
			for(j=1; j<=10; j++)
				System.out.printf("%5d", (i*j));
			System.out.println();
		}
	}
=======
import java.io.*;
class Multiplication
{
	public static void main(String[] args) throws IOException
	{
		int i, j;

		//Prints out labels for each column of multiplication table
		System.out.println("Multiplication Table");
		System.out.printf("%5s"," ");

		for(i=1; i<=10; i++)
			System.out.printf("%5d", i);	//Prints out the rest of the table
		System.out.println();

		for(i=1; i<=10; i++)
		{
			System.out.printf("%5d", i);
			//Prints the ith row of the Table
			for(j=1; j<=10; j++)
				System.out.printf("%5d", (i*j));
			System.out.println();
		}
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
import java.io.*;
class Multiplication
{
	public static void main(String[] args) throws IOException
	{
		int i, j;

		//Prints out labels for each column of multiplication table
		System.out.println("Multiplication Table");
		System.out.printf("%5s"," ");

		for(i=1; i<=10; i++)
			System.out.printf("%5d", i);	//Prints out the rest of the table
		System.out.println();

		for(i=1; i<=10; i++)
		{
			System.out.printf("%5d", i);
			//Prints the ith row of the Table
			for(j=1; j<=10; j++)
				System.out.printf("%5d", (i*j));
			System.out.println();
		}
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}