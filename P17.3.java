// Narrowing using super class object
// ERROR: One cannot be cast to Two
class One
{
	void show1()
	{
		System.out.println("Super class method");
	}
}
class Two extends One
{
	void show2()
	{
		System.out.println("Sub class method");
	}
}
class Cast
{
	public static void main(String[] args) {
		Two t;
		t = (Two) new One();
		t.show1();
	}
}