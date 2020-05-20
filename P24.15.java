<<<<<<< HEAD
<<<<<<< HEAD
//Copying a file contents as another file
import java.io.*;
class CopyFile
{
	public static void main(String[] args) throws IOException
	{
		int ch;

		try(FileInputStream fin = new FileInputStream(args[0]);
			FileOutputStream fout = new FileOutputStream(args[1]))
		{
			while((ch=fin.read()) != -1)
				fout.write(ch);
		}
		System.out.println("1 file copied");
	}
=======
//Copying a file contents as another file
import java.io.*;
class CopyFile
{
	public static void main(String[] args) throws IOException
	{
		int ch;

		try(FileInputStream fin = new FileInputStream(args[0]);
			FileOutputStream fout = new FileOutputStream(args[1]))
		{
			while((ch=fin.read()) != -1)
				fout.write(ch);
		}
		System.out.println("1 file copied");
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//Copying a file contents as another file
import java.io.*;
class CopyFile
{
	public static void main(String[] args) throws IOException
	{
		int ch;

		try(FileInputStream fin = new FileInputStream(args[0]);
			FileOutputStream fout = new FileOutputStream(args[1]))
		{
			while((ch=fin.read()) != -1)
				fout.write(ch);
		}
		System.out.println("1 file copied");
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}