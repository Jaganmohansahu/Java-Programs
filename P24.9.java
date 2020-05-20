<<<<<<< HEAD
<<<<<<< HEAD
//Comparing a file using a DeflaterOutputStream
import java.io.*;
import java.util.zip.*;
class Zip
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream fis = new FileInputStream("file1.txt");

		FileOutputStream fos = new FileOutputStream("file3.txt");

		DeflaterOutputStream dos = new DeflaterOutputStream(fos);

		int data;
		while((data=fis.read()) != -1)
			dos.write(data);

			fis.close();
			dos.close();
	}
=======
//Comparing a file using a DeflaterOutputStream
import java.io.*;
import java.util.zip.*;
class Zip
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream fis = new FileInputStream("file1.txt");

		FileOutputStream fos = new FileOutputStream("file3.txt");

		DeflaterOutputStream dos = new DeflaterOutputStream(fos);

		int data;
		while((data=fis.read()) != -1)
			dos.write(data);

			fis.close();
			dos.close();
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//Comparing a file using a DeflaterOutputStream
import java.io.*;
import java.util.zip.*;
class Zip
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream fis = new FileInputStream("file1.txt");

		FileOutputStream fos = new FileOutputStream("file3.txt");

		DeflaterOutputStream dos = new DeflaterOutputStream(fos);

		int data;
		while((data=fis.read()) != -1)
			dos.write(data);

			fis.close();
			dos.close();
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}