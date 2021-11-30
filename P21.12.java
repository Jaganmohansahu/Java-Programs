//Rethrowing an exception
class A
{
	void method1()
	{
		try 
		{
			String str = "Hello";

			char ch = str.charAt(5);
		}
		catch(StringIndexOutOfBoundsException sie)
		{
			System.out.println("Please see the index is within the range");
			throw sie;
		}
	}
}
class B
{
	public static void main(String[] args) 
	{
		A a = new A();
		try
		{
			a.method1();
		}	
		catch(StringIndexOutOfBoundsException sie)
		{
			System.out.println("I caught rethrown exception");
		}
	}
}