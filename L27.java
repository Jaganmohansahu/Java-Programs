//Input from Keyboard
class Test
{
	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.print("Enter the Name: ");
		String name = sc.next();		//for string
		System.out.println("Name: "+name);

		System.out.print("enter the Roll no: ");
		int roll = sc.nextInt();		//for integer
		System.out.println("Roll: "+roll);
	}
}