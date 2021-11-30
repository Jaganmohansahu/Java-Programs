class Demo
{
	void display()
	{
		System.out.println(this);
	}
}
class Test
{
	void show()
	{
		Demo d = new Demo();
		d.display();
		System.out.println(d);
		System.out.println(this);
	}
	public static void main(String[] args) 
	{
		Test t = new Test();
		t.show();
		System.out.println(t);

		Test t1 = new Test();
		t1.show();
		System.out.println(t1);
	}
}