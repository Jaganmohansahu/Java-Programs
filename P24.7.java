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
}