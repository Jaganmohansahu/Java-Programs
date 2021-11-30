//Static variable
class Test
{
	static int x=10;
	static boolean y;
	public static void main(String[] args)
	{
		Test obj1 = new Test();
	 	Test obj2 = new Test();

	 	System.out.println(x);

	 	System.out.println(Test.x);
	 	System.out.println(obj1.x);

	 	x=90;

	 	System.out.println(x);
	 	System.out.println(Test.x);
	 	System.out.println(obj1.x);
	 	System.out.println(obj2.x);
	} 
}