<<<<<<< HEAD
<<<<<<< HEAD
//Creating a text file using FileOutputStream
import java.io.*;
class CreateFile
{
	public static void main(String[] args) throws IOException
	{
		DataInputStream dis = new DataInputStream(System.in);

		FileOutputStream fout = new FileOutputStream("myjagu.txt");

		System.out.println("Enter '@' at the end...");

		char ch;
		while((ch=(char)dis.read()) != '@')
			fout.write(ch);

		fout.close();
	}
=======
//Creating a text file using FileOutputStream
import java.io.*;
class CreateFile
{
	public static void main(String[] args) throws IOException
	{
		DataInputStream dis = new DataInputStream(System.in);

		FileOutputStream fout = new FileOutputStream("myjagu.txt");

		System.out.println("Enter '@' at the end...");

		char ch;
		while((ch=(char)dis.read()) != '@')
			fout.write(ch);

		fout.close();
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//Creating a text file using FileOutputStream
import java.io.*;
class CreateFile
{
	public static void main(String[] args) throws IOException
	{
		DataInputStream dis = new DataInputStream(System.in);

		FileOutputStream fout = new FileOutputStream("myjagu.txt");

		System.out.println("Enter '@' at the end...");

		char ch;
		while((ch=(char)dis.read()) != '@')
			fout.write(ch);

		fout.close();
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}