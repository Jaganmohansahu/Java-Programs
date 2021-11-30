//Console
class Test
{
	public static void main(String[] args) 
	{
		java.io.Console c = System.console();

		System.out.print("Enter the Name: ");
		String name = c.readLine();
		System.out.println("Name: "+name);

		System.out.print("Enter the Roll: ");
		int number = Integer.parseInt(c.readLine());
		System.out.println("Roll: "+number);
	}
}