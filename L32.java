//Inheritance
class A
{
	int x = 10;
	A()
	{
		System.out.println("A class Constructor");
	}
}

class B extends A
{
	int y = 20;
	B()
	{
		System.out.println("B class Constructor");
	}
}

class Test extends B
{
	Test()
	{
		System.out.println("Test class Constructor");
	}
	public static void main(String[] args) 
	{
		Test t = new Test();
		System.out.println(t.y);
		System.out.println(t.x);
	}
}