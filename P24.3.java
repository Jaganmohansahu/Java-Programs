<<<<<<< HEAD
<<<<<<< HEAD
//Reading textfile using FileInputStream
import java.io.*;
class ReadFile
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream fin = new FileInputStream("Myfile.txt");

		int ch;
		while((ch=fin.read()) != -1)
			System.out.print((char)ch);

		fin.close();
	}
=======
//Reading textfile using FileInputStream
import java.io.*;
class ReadFile
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream fin = new FileInputStream("Myfile.txt");

		int ch;
		while((ch=fin.read()) != -1)
			System.out.print((char)ch);

		fin.close();
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//Reading textfile using FileInputStream
import java.io.*;
class ReadFile
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream fin = new FileInputStream("Myfile.txt");

		int ch;
		while((ch=fin.read()) != -1)
			System.out.print((char)ch);

		fin.close();
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}