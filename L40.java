//Constructor overloading
class Test
{
	Test()
	{
		System.out.println("Constructor without arguments");
	}
	Test(int x)
	{
		System.out.println("Constructor with Integer arguments");
	}
	Test(String s)
	{
		System.out.println("Constructor with String arguments");
	}
	public static void main(String[] args) 
	{
		new Test();
		new Test(123);
		new Test("Hello");
	}
}