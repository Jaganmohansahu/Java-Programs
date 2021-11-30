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
}