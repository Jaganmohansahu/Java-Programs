//Stack overflow
class Test
{
	Test t1 = new Test();

	Test()
	{
		System.out.println("Test constructor....");
	}
	public static void main(String[] args) 
	{
		System.out.println("main()...");
		Test obj1 = new Test();
		System.out.println(obj1);
	}
}