<<<<<<< HEAD
<<<<<<< HEAD
import java.io.*;
enum Icecream
{
	Vanilla(20.00), Chocolate(22.50), Strawberry(23.00), Rasberry(25.00);

	private double price;

	Icecream(double p)
	{
		price = p;
	}

	static void getPrice(int i)
	{
		Icecream allicecreams[] = Icecream.values();
		System.out.println("Pay Rs. "+allicecreams[i].price);
	}
}
class GetEnum
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("AVAILABLE ICECREAMS");
		for(Icecream ice: Icecream.values())
		{
			int no = ice.ordinal();
			System.out.println(no+" "+ice);
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Your choice: ");
		int choice = Integer.parseInt(br.readLine());
		Icecream.getPrice(choice);
	}
=======
import java.io.*;
enum Icecream
{
	Vanilla(20.00), Chocolate(22.50), Strawberry(23.00), Rasberry(25.00);

	private double price;

	Icecream(double p)
	{
		price = p;
	}

	static void getPrice(int i)
	{
		Icecream allicecreams[] = Icecream.values();
		System.out.println("Pay Rs. "+allicecreams[i].price);
	}
}
class GetEnum
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("AVAILABLE ICECREAMS");
		for(Icecream ice: Icecream.values())
		{
			int no = ice.ordinal();
			System.out.println(no+" "+ice);
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Your choice: ");
		int choice = Integer.parseInt(br.readLine());
		Icecream.getPrice(choice);
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
import java.io.*;
enum Icecream
{
	Vanilla(20.00), Chocolate(22.50), Strawberry(23.00), Rasberry(25.00);

	private double price;

	Icecream(double p)
	{
		price = p;
	}

	static void getPrice(int i)
	{
		Icecream allicecreams[] = Icecream.values();
		System.out.println("Pay Rs. "+allicecreams[i].price);
	}
}
class GetEnum
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("AVAILABLE ICECREAMS");
		for(Icecream ice: Icecream.values())
		{
			int no = ice.ordinal();
			System.out.println(no+" "+ice);
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Your choice: ");
		int choice = Integer.parseInt(br.readLine());
		Icecream.getPrice(choice);
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}