//Constructor
class Test
{
	Test (float x)
	{
		System.out.println("Constructor....");
	}

	static void Test()
	{
		System.out.println("Test method....");
	}
	
	public static void main(String[] args) 
	{
		Test obj = new Test(1.0f);

		Test();			//Directly
		Test.Test();	//Class name
		obj.Test();		//Object name
	}
}