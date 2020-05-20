<<<<<<< HEAD
<<<<<<< HEAD
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
=======
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
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
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
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}