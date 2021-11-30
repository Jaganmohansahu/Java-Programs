//Abstract method
abstract class Test
{
	static int x = 10;
	int y = 20;
	
	abstract void show();

	void display()
	{
		System.out.println("Hi");
	}
	public static void main(String[] args) 
	{
		System.out.println(Test.x);

		//Test obj = new Test;		//eror //cannot create obj directly
	}
}