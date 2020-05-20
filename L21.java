<<<<<<< HEAD
<<<<<<< HEAD
//Reference and Object
class Test
{
	static int a = 11;		//not a part of object
	int x=10, y=20;

	Test(int x)
	{
		System.out.println("Constructor with args....");
	}
	public static void main(String[] args) 
	{
		int b = 77;
		//new Test();		//error

		Test obj = new Test(123);

		System.out.println("First: "+obj.x+"\t"+obj.y);		//call by reference
		System.out.println("Second: "+new Test(10).x);		//call by anonymous object
		System.out.println("Second: "+new Test(10).y);
	}
=======
//Reference and Object
class Test
{
	static int a = 11;		//not a part of object
	int x=10, y=20;

	Test(int x)
	{
		System.out.println("Constructor with args....");
	}
	public static void main(String[] args) 
	{
		int b = 77;
		//new Test();		//error

		Test obj = new Test(123);

		System.out.println("First: "+obj.x+"\t"+obj.y);		//call by reference
		System.out.println("Second: "+new Test(10).x);		//call by anonymous object
		System.out.println("Second: "+new Test(10).y);
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//Reference and Object
class Test
{
	static int a = 11;		//not a part of object
	int x=10, y=20;

	Test(int x)
	{
		System.out.println("Constructor with args....");
	}
	public static void main(String[] args) 
	{
		int b = 77;
		//new Test();		//error

		Test obj = new Test(123);

		System.out.println("First: "+obj.x+"\t"+obj.y);		//call by reference
		System.out.println("Second: "+new Test(10).x);		//call by anonymous object
		System.out.println("Second: "+new Test(10).y);
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}