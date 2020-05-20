<<<<<<< HEAD
<<<<<<< HEAD
//Storing strings into a file 	//Not working
import java.io.*;
class CreateFile2
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str;
		FileWriter fw = new FileWriter("stringfiled");

		System.out.println("Enter data: ");
		while(!(str = br.readLine()).equals("exit"))

			fw.close();
	}
=======
//Storing strings into a file 	//Not working
import java.io.*;
class CreateFile2
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str;
		FileWriter fw = new FileWriter("stringfiled");

		System.out.println("Enter data: ");
		while(!(str = br.readLine()).equals("exit"))

			fw.close();
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//Storing strings into a file 	//Not working
import java.io.*;
class CreateFile2
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str;
		FileWriter fw = new FileWriter("stringfiled");

		System.out.println("Enter data: ");
		while(!(str = br.readLine()).equals("exit"))

			fw.close();
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}