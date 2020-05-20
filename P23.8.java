<<<<<<< HEAD
<<<<<<< HEAD
//HashMap used as telephone book	//ERROR
import java.io.*;
import java.util.*;
class HashMap
{
	public static void main(String[] args) throws IOException
	{
		HashMap<String, Long> hm = new HashMap<>();

		String name, str;
		Long phno;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true)
		{
			System.out.println("1: Enter phone entries");
			System.out.println("2: Lookup in the book");
			System.out.println("4: EXIT");

			System.out.println("Enter your choice: ");
			int n = Integer.parseInt(br.readLine());

			switch(n)
			{
				case 1: System.out.print("Enter name: ");
						name = br.readLine();
						System.out.print("Enter phno: ");
						str = br.readLine();
						phno = new Long(str);
						hm.put(name,phno);
						break;

				case 2: System.out.print("Enter name: ");
						name = br.readLine();
						name = name.trim();
						phno = hm.get(name);
						System.out.println("Phno: "+phno);
						break;

				case 3: Set<String> set = new HashSet<String>();
						set = hm.keySet();
						System.out.println(set);
						break;

				case 4: return;
			}
		}

	}
=======
//HashMap used as telephone book	//ERROR
import java.io.*;
import java.util.*;
class HashMap
{
	public static void main(String[] args) throws IOException
	{
		HashMap<String, Long> hm = new HashMap<>();

		String name, str;
		Long phno;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true)
		{
			System.out.println("1: Enter phone entries");
			System.out.println("2: Lookup in the book");
			System.out.println("4: EXIT");

			System.out.println("Enter your choice: ");
			int n = Integer.parseInt(br.readLine());

			switch(n)
			{
				case 1: System.out.print("Enter name: ");
						name = br.readLine();
						System.out.print("Enter phno: ");
						str = br.readLine();
						phno = new Long(str);
						hm.put(name,phno);
						break;

				case 2: System.out.print("Enter name: ");
						name = br.readLine();
						name = name.trim();
						phno = hm.get(name);
						System.out.println("Phno: "+phno);
						break;

				case 3: Set<String> set = new HashSet<String>();
						set = hm.keySet();
						System.out.println(set);
						break;

				case 4: return;
			}
		}

	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//HashMap used as telephone book	//ERROR
import java.io.*;
import java.util.*;
class HashMap
{
	public static void main(String[] args) throws IOException
	{
		HashMap<String, Long> hm = new HashMap<>();

		String name, str;
		Long phno;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true)
		{
			System.out.println("1: Enter phone entries");
			System.out.println("2: Lookup in the book");
			System.out.println("4: EXIT");

			System.out.println("Enter your choice: ");
			int n = Integer.parseInt(br.readLine());

			switch(n)
			{
				case 1: System.out.print("Enter name: ");
						name = br.readLine();
						System.out.print("Enter phno: ");
						str = br.readLine();
						phno = new Long(str);
						hm.put(name,phno);
						break;

				case 2: System.out.print("Enter name: ");
						name = br.readLine();
						name = name.trim();
						phno = hm.get(name);
						System.out.println("Phno: "+phno);
						break;

				case 3: Set<String> set = new HashSet<String>();
						set = hm.keySet();
						System.out.println(set);
						break;

				case 4: return;
			}
		}

	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}