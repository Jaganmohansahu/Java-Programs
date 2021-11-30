//non-static block  		//error
class Test
{
	Test
	{
		System.out.println("Inside constructor...");
	}
	{
		System.out.println("non-static block-1");
	}
	public static void main(String[] args) 
	{
		System.out.println("main()....");
		new Test;		
	}
	{
		System.out.println("non-static block-2");
	}
}