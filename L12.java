//Static block
class Test
{
	static void show()			//not static block, static method
	{
		System.out.println("show...");
	}
	static
	{
		System.out.println("static block-1");
		Test.show();
	}
	public static void main(String[] args) 
	{
		System.out.println("main()....");
	}
	static
	{
		System.out.println("static block-2");
	}
}