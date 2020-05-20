<<<<<<< HEAD
<<<<<<< HEAD
//Reading string wise from a File 	
import java.io.*;
class ReadFile2
{
	public static void main(String[] args) throws IOException
	{
		String str;

		FileReader fr = new FileReader("file1.txt");

		BufferedReader br = new BufferedReader(fr);

		while((str=br.readLine()) != null)
			System.out.println(str);

		fr.close();
	}
=======
//Reading string wise from a File 	
import java.io.*;
class ReadFile2
{
	public static void main(String[] args) throws IOException
	{
		String str;

		FileReader fr = new FileReader("file1.txt");

		BufferedReader br = new BufferedReader(fr);

		while((str=br.readLine()) != null)
			System.out.println(str);

		fr.close();
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//Reading string wise from a File 	
import java.io.*;
class ReadFile2
{
	public static void main(String[] args) throws IOException
	{
		String str;

		FileReader fr = new FileReader("file1.txt");

		BufferedReader br = new BufferedReader(fr);

		while((str=br.readLine()) != null)
			System.out.println(str);

		fr.close();
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}