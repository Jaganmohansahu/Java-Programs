class One
{
	int i;
	One(int i)
	{
		this.i = i;
	}
}
class Two extends One
{
	int i;
	Two(int a, int b)
	{
		super(a);
		i = b;
	}
	void show()
	{
		System.out.println("sub class i= "+i);
		System.out.println("super class i= "+super.i);
	}
}
class Super1
{
	public static void main(String[] args) 
	{
		Two t = new Two(11, 22);
		t.show();	
	}
}