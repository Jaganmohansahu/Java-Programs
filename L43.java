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
}