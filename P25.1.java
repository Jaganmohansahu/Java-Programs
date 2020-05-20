<<<<<<< HEAD
<<<<<<< HEAD
//Knowing ip address of a website
import java.io.*;
import java.net.*;
class Address
{
	public static void main(String[] args) throws IOException
	{
			//accept name of website from keyboard
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter a website name: ");
			String site = br.readLine();

			try
			{
				InetAddress ip = InetAddress.getByName(site);
				System.out.print("The IP address is: "+ip);
			}
			catch(UnknownHostException ue)
			{
				System.out.println("Website not found");
			}
	}
=======
//Knowing ip address of a website
import java.io.*;
import java.net.*;
class Address
{
	public static void main(String[] args) throws IOException
	{
			//accept name of website from keyboard
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter a website name: ");
			String site = br.readLine();

			try
			{
				InetAddress ip = InetAddress.getByName(site);
				System.out.print("The IP address is: "+ip);
			}
			catch(UnknownHostException ue)
			{
				System.out.println("Website not found");
			}
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//Knowing ip address of a website
import java.io.*;
import java.net.*;
class Address
{
	public static void main(String[] args) throws IOException
	{
			//accept name of website from keyboard
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter a website name: ");
			String site = br.readLine();

			try
			{
				InetAddress ip = InetAddress.getByName(site);
				System.out.print("The IP address is: "+ip);
			}
			catch(UnknownHostException ue)
			{
				System.out.println("Website not found");
			}
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}