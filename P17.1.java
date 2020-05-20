<<<<<<< HEAD
<<<<<<< HEAD
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
=======
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
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
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
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}