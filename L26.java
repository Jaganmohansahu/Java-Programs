<<<<<<< HEAD
<<<<<<< HEAD
//Private constructor, Factory method and Singleton class
class Test
{
	int x = 123;
	static Test obj;

	private Test()
	{
		System.out.println("Private constructor....");
	}
	public static Test getObject()		//Factory method
	{
		if(obj == null)		//Singleton class
		obj = new Test();
		return obj;
	}
}
class Demo
{
	public static void main(String[] args) 
	{
		Test obj = Test.getObject();
		System.out.println(obj.x);

		Test ob1 = Test.getObject();
		Test ob2 = Test.getObject();
		System.out.println(ob1+"\t"+ob2+"\t"+obj);
	}
=======
//Private constructor, Factory method and Singleton class
class Test
{
	int x = 123;
	static Test obj;

	private Test()
	{
		System.out.println("Private constructor....");
	}
	public static Test getObject()		//Factory method
	{
		if(obj == null)		//Singleton class
		obj = new Test();
		return obj;
	}
}
class Demo
{
	public static void main(String[] args) 
	{
		Test obj = Test.getObject();
		System.out.println(obj.x);

		Test ob1 = Test.getObject();
		Test ob2 = Test.getObject();
		System.out.println(ob1+"\t"+ob2+"\t"+obj);
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//Private constructor, Factory method and Singleton class
class Test
{
	int x = 123;
	static Test obj;

	private Test()
	{
		System.out.println("Private constructor....");
	}
	public static Test getObject()		//Factory method
	{
		if(obj == null)		//Singleton class
		obj = new Test();
		return obj;
	}
}
class Demo
{
	public static void main(String[] args) 
	{
		Test obj = Test.getObject();
		System.out.println(obj.x);

		Test ob1 = Test.getObject();
		Test ob2 = Test.getObject();
		System.out.println(ob1+"\t"+ob2+"\t"+obj);
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}