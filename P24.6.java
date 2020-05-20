<<<<<<< HEAD
<<<<<<< HEAD
//Reading data from a file using FileReader  
import java.io.*;
class ReadFile1
{
	public static void main(String[] args) throws IOException
	{
		int ch;

		FileReader fr = null;

		try
		{
			fr = new FileReader("file1.txt");
		}
		catch(FileNotFoundException fe)
		{
			System.out.println("File not found");
			return;
		}
		while((ch=fr.read()) != -1)
			System.out.print((char)ch);

		fr.close();
	}
=======
//Reading data from a file using FileReader  
import java.io.*;
class ReadFile1
{
	public static void main(String[] args) throws IOException
	{
		int ch;

		FileReader fr = null;

		try
		{
			fr = new FileReader("file1.txt");
		}
		catch(FileNotFoundException fe)
		{
			System.out.println("File not found");
			return;
		}
		while((ch=fr.read()) != -1)
			System.out.print((char)ch);

		fr.close();
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//Reading data from a file using FileReader  
import java.io.*;
class ReadFile1
{
	public static void main(String[] args) throws IOException
	{
		int ch;

		FileReader fr = null;

		try
		{
			fr = new FileReader("file1.txt");
		}
		catch(FileNotFoundException fe)
		{
			System.out.println("File not found");
			return;
		}
		while((ch=fr.read()) != -1)
			System.out.print((char)ch);

		fr.close();
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}