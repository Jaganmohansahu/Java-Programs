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
}