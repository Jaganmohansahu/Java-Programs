//To create obj of abstract class with the help of Inheritance
abstract class Test
{
	static int x = 10;
	int y =20;

	abstract void show();

	void display()
	{
		System.out.println("display()....");
	}
}
class Demo extends Test
{
	void show()
	{
		System.out.println("show()....");
	}
	public static void main(String[] args) 
	{
		//Test t = new Test();

		Demo d = new Demo();
		d.display();
		System.out.println(d.y);
		System.out.println(Test.x);
		d.show();
	}
}