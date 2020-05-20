<<<<<<< HEAD
<<<<<<< HEAD
class Demo
{
	int x = 10;
	Demo(Test t)
	{
		System.out.println(x);	//10
		System.out.println(this.x);	//10
		System.out.println(t.x);	//20
	}
	void display(Test t1, int x)
	{
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(t1.x);
	}
}
class Test
{
	int x = 20;
	void show()
	{
		int x = 30;	//Local
		new Demo(this).display(this,this.x);
	}
	public static void main(String[] args) 
	{
		new Test().show();
	}
=======
class Demo
{
	int x = 10;
	Demo(Test t)
	{
		System.out.println(x);	//10
		System.out.println(this.x);	//10
		System.out.println(t.x);	//20
	}
	void display(Test t1, int x)
	{
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(t1.x);
	}
}
class Test
{
	int x = 20;
	void show()
	{
		int x = 30;	//Local
		new Demo(this).display(this,this.x);
	}
	public static void main(String[] args) 
	{
		new Test().show();
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
class Demo
{
	int x = 10;
	Demo(Test t)
	{
		System.out.println(x);	//10
		System.out.println(this.x);	//10
		System.out.println(t.x);	//20
	}
	void display(Test t1, int x)
	{
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(t1.x);
	}
}
class Test
{
	int x = 20;
	void show()
	{
		int x = 30;	//Local
		new Demo(this).display(this,this.x);
	}
	public static void main(String[] args) 
	{
		new Test().show();
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}