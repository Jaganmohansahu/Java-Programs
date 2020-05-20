<<<<<<< HEAD
<<<<<<< HEAD
//Uncompressing a file using a InfaterInputStream
import java.io.*;
import java.util.zip.*;
class Unzip
{
	public static void main(String[] args) throws Exception
	{
		FileInputStream fis = new FileInputStream("file2.txt");

		FileOutputStream fos = new FileOutputStream("file3.txt");

		InflaterInputStream iis = new InflaterInputStream(fis);

		int data;
		while((data=iis.read()) != -1)
			fos.write(data);

		fos.close();
		iis.close();
	}
=======
//Uncompressing a file using a InfaterInputStream
import java.io.*;
import java.util.zip.*;
class Unzip
{
	public static void main(String[] args) throws Exception
	{
		FileInputStream fis = new FileInputStream("file2.txt");

		FileOutputStream fos = new FileOutputStream("file3.txt");

		InflaterInputStream iis = new InflaterInputStream(fis);

		int data;
		while((data=iis.read()) != -1)
			fos.write(data);

		fos.close();
		iis.close();
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//Uncompressing a file using a InfaterInputStream
import java.io.*;
import java.util.zip.*;
class Unzip
{
	public static void main(String[] args) throws Exception
	{
		FileInputStream fis = new FileInputStream("file2.txt");

		FileOutputStream fos = new FileOutputStream("file3.txt");

		InflaterInputStream iis = new InflaterInputStream(fis);

		int data;
		while((data=iis.read()) != -1)
			fos.write(data);

		fos.close();
		iis.close();
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}