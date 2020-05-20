<<<<<<< HEAD
<<<<<<< HEAD
//Multiple Inheritance by Interface
interface A
{
	int x = 123;
	void show();
	public static void display()
	{
		System.out.println("Display() in class A");
	}
}
interface B 
{
	int x = 200;
	void show();
	public static void display()
	{
		System.out.println("Display() in class B");
	}
}
class Demo implements A,B
{
	public void show()
	{
		System.out.println("Show()....");
	}
	public static void main(String[] args)
	{
		Demo t1 = new Demo();
		t1.show();
		//t1.display();
		A.display();
		B.display();

		System.out.println(A.x);
		System.out.println(B.x);
	}
=======
//Multiple Inheritance by Interface
interface A
{
	int x = 123;
	void show();
	public static void display()
	{
		System.out.println("Display() in class A");
	}
}
interface B 
{
	int x = 200;
	void show();
	public static void display()
	{
		System.out.println("Display() in class B");
	}
}
class Demo implements A,B
{
	public void show()
	{
		System.out.println("Show()....");
	}
	public static void main(String[] args)
	{
		Demo t1 = new Demo();
		t1.show();
		//t1.display();
		A.display();
		B.display();

		System.out.println(A.x);
		System.out.println(B.x);
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//Multiple Inheritance by Interface
interface A
{
	int x = 123;
	void show();
	public static void display()
	{
		System.out.println("Display() in class A");
	}
}
interface B 
{
	int x = 200;
	void show();
	public static void display()
	{
		System.out.println("Display() in class B");
	}
}
class Demo implements A,B
{
	public void show()
	{
		System.out.println("Show()....");
	}
	public static void main(String[] args)
	{
		Demo t1 = new Demo();
		t1.show();
		//t1.display();
		A.display();
		B.display();

		System.out.println(A.x);
		System.out.println(B.x);
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}