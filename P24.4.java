<<<<<<< HEAD
<<<<<<< HEAD
//Reading data from text file - version 2
import java.io.*;
class ReadFile
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter file name: ");
		String fname = br.readLine();

		FileInputStream fin = null;

		try
		{
			fin = new FileInputStream(fname);
		}
		catch(FileNotFoundException fe)
		{
			System.out.println("File not found");
			return;
		}
		BufferedInputStream bin = new BufferedInputStream(fin);

		System.out.println("File contents: ");

		int ch;
		while((ch=bin.read()) != -1)
			System.out.print((char)ch);

		bin.close();
	}
=======
//Reading data from text file - version 2
import java.io.*;
class ReadFile
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter file name: ");
		String fname = br.readLine();

		FileInputStream fin = null;

		try
		{
			fin = new FileInputStream(fname);
		}
		catch(FileNotFoundException fe)
		{
			System.out.println("File not found");
			return;
		}
		BufferedInputStream bin = new BufferedInputStream(fin);

		System.out.println("File contents: ");

		int ch;
		while((ch=bin.read()) != -1)
			System.out.print((char)ch);

		bin.close();
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//Reading data from text file - version 2
import java.io.*;
class ReadFile
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter file name: ");
		String fname = br.readLine();

		FileInputStream fin = null;

		try
		{
			fin = new FileInputStream(fname);
		}
		catch(FileNotFoundException fe)
		{
			System.out.println("File not found");
			return;
		}
		BufferedInputStream bin = new BufferedInputStream(fin);

		System.out.println("File contents: ");

		int ch;
		while((ch=bin.read()) != -1)
			System.out.print((char)ch);

		bin.close();
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}