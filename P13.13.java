//this keyword
class Sample
{
	private int x;
	Sample()
	{
		this(55);
		this.access();
	}
	Sample(int x)
	{
		this.x = x;
	}
	void access()
	{
		System.out.println("x= "+x);
	}
}
class ThisDemo
{
	public static void main(String[] args) 
	{
	Sample s = new Sample();
	}
}