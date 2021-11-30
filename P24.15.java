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
}