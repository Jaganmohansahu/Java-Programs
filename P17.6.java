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
}