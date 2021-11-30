//Final method
class Test
{
	static final int x = 100;
	final void show()
	{
		System.out.println("Hello...!!");
	}
}
class Demo extends Test
{
	/*void show()
	{
		System.out.println("Java is simple...");
	}*/
	public static void main(String[] args) 
	{
		//x++;		//error
		System.out.println(x);

		Demo d = new Demo();
		d.show();
		System.out.println(d.x);
	}
}