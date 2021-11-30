//Example to understand deprecated annotation
class Myclass
{
	@Deprecated 
	void myMethod()
	{
		System.out.println("This method is deprecated");
	}
}
class DeprecatedTest
{
	public static void main(String[] args) 
	{
		Myclass obj = new Myclass();
		obj.myMethod();	
	}
}