//Accepting a single character and a string from keyboard
import java.io.*;
class Accept
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		System.out.println("Enter a character");	
		char ch = (char)br.read();
	
		System.out.println("You entered " + ch);

	}
}