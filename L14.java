//Static and non-static method
class Test
{
	static int x = 10;
	int y = 20;
	void show()
	{
		System.out.println(y);		//directly
	}
	public static void main(String[] args) 
	{
		//System.out.println(y);	//error

		Test obj = new Test();
		obj.show();
	}
}