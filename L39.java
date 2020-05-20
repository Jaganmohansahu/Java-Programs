<<<<<<< HEAD
<<<<<<< HEAD
//Method overloading
class Test
{
	public static void main(String[] args) 
	{
		System.out.println("Hello");
		main("Hi");
		new Test().area((byte)3);
		new Test().area(10);
	}
	public static void main(String args) 
	{
		System.out.println("Hi");
	}
	final void area(int x)
	{
		System.out.println("Circle area is: "+(3.14*x*x));
	}
	final void area(byte x)
	{
		System.out.println("Square area is: "+(x*x));
	}
=======
//Method overloading
class Test
{
	public static void main(String[] args) 
	{
		System.out.println("Hello");
		main("Hi");
		new Test().area((byte)3);
		new Test().area(10);
	}
	public static void main(String args) 
	{
		System.out.println("Hi");
	}
	final void area(int x)
	{
		System.out.println("Circle area is: "+(3.14*x*x));
	}
	final void area(byte x)
	{
		System.out.println("Square area is: "+(x*x));
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//Method overloading
class Test
{
	public static void main(String[] args) 
	{
		System.out.println("Hello");
		main("Hi");
		new Test().area((byte)3);
		new Test().area(10);
	}
	public static void main(String args) 
	{
		System.out.println("Hi");
	}
	final void area(int x)
	{
		System.out.println("Circle area is: "+(3.14*x*x));
	}
	final void area(byte x)
	{
		System.out.println("Square area is: "+(x*x));
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}