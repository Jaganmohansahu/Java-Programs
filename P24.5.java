//Creating a text file using FileWriter
import java.io.*;
class CreateFile1
{
	public static void main(String[] args) throws IOException
	{
		String str = "This is a book on Java." + "\nI am a lerner of Java.";

		FileWriter fw = new FileWriter("text");

		for(int i=0; i<str.length(); i++)
			fw.write(str.charAt(i));

		fw.close();
	}
}