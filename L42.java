class Test
{
	String s = "Java";
	Test(String s)
	{
		System.out.println(s);		//Hello
		System.out.println(this.s);	//Java
	}
	public static void main(String[] args) 
	{
		new Test("Hello");
	}
}