// Widening in referenced data types
class One
{
	void show1()
	{
		System.out.println("Super class method");
	}
}
class Two extends One
{
	void show1()
	{
		System.out.println("Sub class method");
	}
}
class Cast
{
	public static void main(String[] args) {
		One o;
		o = (One)new Two();
		o.show1();
	}
}