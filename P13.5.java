<<<<<<< HEAD
<<<<<<< HEAD
//static method trying to access to access instance variable
class Test
{
 static int x;
	Test(int x)
	{
		this.x = x;
	}
	static void access()
	{
		System.out.println(x);
	}
}
class Demo
{
	public static void main(String[] args) 
	{
		Test obj = new Test(55);
		Test.access();	
	}
}
=======
//static method trying to access to access instance variable
class Test
{
 static int x;
	Test(int x)
	{
		this.x = x;
	}
	static void access()
	{
		System.out.println(x);
	}
}
class Demo
{
	public static void main(String[] args) 
	{
		Test obj = new Test(55);
		Test.access();	
	}
}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//static method trying to access to access instance variable
class Test
{
 static int x;
	Test(int x)
	{
		this.x = x;
	}
	static void access()
	{
		System.out.println(x);
	}
}
class Demo
{
	public static void main(String[] args) 
	{
		Test obj = new Test(55);
		Test.access();	
	}
}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
