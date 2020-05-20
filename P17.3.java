<<<<<<< HEAD
<<<<<<< HEAD
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
=======
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
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
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
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}