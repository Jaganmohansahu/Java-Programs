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
}