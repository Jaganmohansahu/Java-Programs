//Widening using referenced data types
class One
{
	void show1()
	{
		System.out.println("Super class Method");
	}
}
class Two extends One
{
	void show2()
	{
		System.out.println("Sub class Method");
	}
}
class Cast
{
	public static void main(String[] args) 
	{
		One o;
		o = (One)new Two();
		o.show1();	
	}
}