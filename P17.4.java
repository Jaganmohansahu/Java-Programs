//Narrowing using sub class object
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
		o = new Two();
		Two t = (Two)o;

		t.show1();
		t.show2();
	}
}