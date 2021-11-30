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
}