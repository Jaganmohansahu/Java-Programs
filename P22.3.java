<<<<<<< HEAD
<<<<<<< HEAD
//Convert int into binary, hexadecimal and octal format
import java.io.*;
class Convert
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter an integer: ");
		String str = br.readLine();

		int i = Integer.parseInt(str);
		System.out.println("In decimal: "+i);

		str = Integer.toBinaryString(i);
		System.out.println("In binary: "+str);

		str = Integer.toHexString(i);
		System.out.println("In hexadecimal: "+str);

		str = Integer.toOctalString(i);
		System.out.println("In octal: "+str);
	}
=======
//Convert int into binary, hexadecimal and octal format
import java.io.*;
class Convert
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter an integer: ");
		String str = br.readLine();

		int i = Integer.parseInt(str);
		System.out.println("In decimal: "+i);

		str = Integer.toBinaryString(i);
		System.out.println("In binary: "+str);

		str = Integer.toHexString(i);
		System.out.println("In hexadecimal: "+str);

		str = Integer.toOctalString(i);
		System.out.println("In octal: "+str);
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//Convert int into binary, hexadecimal and octal format
import java.io.*;
class Convert
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter an integer: ");
		String str = br.readLine();

		int i = Integer.parseInt(str);
		System.out.println("In decimal: "+i);

		str = Integer.toBinaryString(i);
		System.out.println("In binary: "+str);

		str = Integer.toHexString(i);
		System.out.println("In hexadecimal: "+str);

		str = Integer.toOctalString(i);
		System.out.println("In octal: "+str);
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}