//Multiple Inheritance		//Impossible
class A
{
	void show()
	{
		System.out.println("Show() in class A...");
	}
}
class B
{
	void show()
	{
		System.out.println("Show() in class B...");
	}
}

class C extends A,B		//error
{
	public static void main(String[] args) 
	{
		new C ().show();
	}
}