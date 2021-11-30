//Creating a text file using BuferedReaderOutputStream
import java.io.*;
class CreateFile
{
	public static void main(String[] args) throws IOException
	{
		DataInputStream dis = new DataInputStream(System.in);

		FileOutputStream fout = new FileOutputStream("myjagu.txt",true);

		BufferedOutputStream bout = new BufferedOutputStream(fout,1024);
		System.out.println("Enter '@' at the end...");

		char ch;
		while((ch=(char)dis.read()) != '@')
			bout.write(ch);
		bout.close();
	}
}