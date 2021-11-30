//Create obj of abstract class with the help of Anonymous class
abstract class Test
{
	int x = 90;
	abstract void display();
	public static void main(String[] args) 
	{
		//Test t1 = new Test();		//error

		Test t1 = new Test()
		{
			void display()
			{
				System.out.println("display()...");
			}
		};
		t1.display();
		Test t2 = new Test()
		{
			void display()
			{
				System.out.println("Java is Simple...");
			}
		};
		t2.display();
	}
}