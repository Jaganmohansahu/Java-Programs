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
}