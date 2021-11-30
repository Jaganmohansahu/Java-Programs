//Creating Byte class objects and comparing them
import java.io.*;
class ByteDemo
{
	public static void main(String[] args) throws IOException
	{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("Enter a byte no: ");
			String s1 = br.readLine();

			Byte b1 = new Byte(s1);

			System.out.print("Enter a byte no: ");
			String s2 = br.readLine();

			Byte b2 = new Byte(s2);

			int n = b1.compareTo(b2);

			if(n==0)	System.out.println("Both bytes are same");
			else if(n<0)	System.out.println(b1+" is less");
			else System.out.println(b2+" is less");
	}
}