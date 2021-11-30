//this keyword
class Test
{
	Test()
	{
		System.out.println("Constructor without arguments");
	}
	Test(int x)
	{
		this("Hello");		
		System.out.println("Constructor with Integer arguments");
	}
	Test(String s)
	{
		this();
		System.out.println("Constructor with String arguments");
	}
	public static void main(String[] args) 
	{
		new Test("Hello");
	}
}