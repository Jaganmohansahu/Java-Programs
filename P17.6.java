<<<<<<< HEAD
<<<<<<< HEAD
//using getClass() to know the class name
class Myclass
{
	int x;
	Myclass(int x)
	{
		this.x = x;
	}
}
class KnowName
{
	static void printName(Object obj)
	{
		Class c = obj.getClass();
		String name = c.getName();
		System.out.println("The class name= "+name);
	}
}
class Demo
{
	public static void main(String[] args) 
	{
		Myclass obj = new Myclass(10);
		KnowName.printName(obj);	
	}
=======
//using getClass() to know the class name
class Myclass
{
	int x;
	Myclass(int x)
	{
		this.x = x;
	}
}
class KnowName
{
	static void printName(Object obj)
	{
		Class c = obj.getClass();
		String name = c.getName();
		System.out.println("The class name= "+name);
	}
}
class Demo
{
	public static void main(String[] args) 
	{
		Myclass obj = new Myclass(10);
		KnowName.printName(obj);	
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//using getClass() to know the class name
class Myclass
{
	int x;
	Myclass(int x)
	{
		this.x = x;
	}
}
class KnowName
{
	static void printName(Object obj)
	{
		Class c = obj.getClass();
		String name = c.getName();
		System.out.println("The class name= "+name);
	}
}
class Demo
{
	public static void main(String[] args) 
	{
		Myclass obj = new Myclass(10);
		KnowName.printName(obj);	
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}