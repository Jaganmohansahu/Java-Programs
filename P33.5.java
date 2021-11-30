//Let us write a super class with a method inside it
class One
{
	void doSomething()
	{
		System.out.println("Hii");
	}
}
class Two extends One
{
	@Override
	void dosomething()
	{
		System.out.println("Hello");
	}
}
public class Test
{
	public static void main(String[] args) 
	{
		Two t = new Two();
		t.dosomething();	
	}
}