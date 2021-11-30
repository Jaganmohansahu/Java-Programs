//instance variables
class Test
{
	int x = 10;
	void display()
	{
		System.out.println(x);
	}
}
class InstanceDemo
{
	public static void main(String[] args) 
	{
		Test obj1, obj2;

		obj1 = new Test();
		obj2 = new Test();

		++obj1.x;
		System.out.println("x in obj1: ");
		obj1.display();
		System.out.println("x in obj2: ");
		obj2.display();
	}
}