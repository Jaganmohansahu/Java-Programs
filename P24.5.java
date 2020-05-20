<<<<<<< HEAD
<<<<<<< HEAD
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
=======
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
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
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
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
