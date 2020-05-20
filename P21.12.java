<<<<<<< HEAD
<<<<<<< HEAD
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
=======
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
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
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
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}