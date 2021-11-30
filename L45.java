class Demo
{
	int value = 90;
	public Demo display()
	{
		System.out.println(this);
		return this;
	}
}
class Test
{
	public static void main(String[] args) 
	{
		Demo d = new Demo().display();
		System.out.println(d);
		System.out.println(d.value);
	}
}