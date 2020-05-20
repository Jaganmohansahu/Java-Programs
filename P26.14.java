<<<<<<< HEAD
<<<<<<< HEAD
//A client that recieves the messages from the server above
import java.io.*;
import java.net.*;
class MultiClient
{
	public static void main(String[] args) throws Exception
	{
		Socket s = new Socket("localhost", 999);

		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

		String str;
		while((str = br.readLine()) != null)
			System.out.println(str);

		br.close();
		s.close();
	}
=======
//A client that recieves the messages from the server above
import java.io.*;
import java.net.*;
class MultiClient
{
	public static void main(String[] args) throws Exception
	{
		Socket s = new Socket("localhost", 999);

		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

		String str;
		while((str = br.readLine()) != null)
			System.out.println(str);

		br.close();
		s.close();
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//A client that recieves the messages from the server above
import java.io.*;
import java.net.*;
class MultiClient
{
	public static void main(String[] args) throws Exception
	{
		Socket s = new Socket("localhost", 999);

		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

		String str;
		while((str = br.readLine()) != null)
			System.out.println(str);

		br.close();
		s.close();
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}