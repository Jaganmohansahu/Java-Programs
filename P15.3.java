class One
{
	int i = 10;
	void show()
	{
		System.out.println("Super class method:i "+i);
	}
}
class Two extends One
{
	int i = 20;
	void show()
	{
		System.out.println("Sub class method:i "+i);
	}
}
class Super1
{
	public static void main(String[] args) 
	{
		Two t = new Two();
		t.show();	
	}
}