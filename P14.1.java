<<<<<<< HEAD
<<<<<<< HEAD
//Relating class Two with class One
class One
{
	int x;
	Two t;
	One(Two t)
	{
		this.t = t;
		x = 10;
	}
	void display()
	{
		System.out.println("one's x = "+x);
		t.display();
		System.out.println("Two's var = "+t.y);
	}
}
class Two
{
	int y;
	Two(int y)
	{
		this.y = y;
	}
	void display()
	{
		System.out.println("Two's y = "+y);
	}
}
class Relate
{
	public static void main(String[] args) 
	{
		Two obj2 = new Two(22);
		One obj1 = new One(obj2);
		obj1.display();	
	}
=======
//Relating class Two with class One
class One
{
	int x;
	Two t;
	One(Two t)
	{
		this.t = t;
		x = 10;
	}
	void display()
	{
		System.out.println("one's x = "+x);
		t.display();
		System.out.println("Two's var = "+t.y);
	}
}
class Two
{
	int y;
	Two(int y)
	{
		this.y = y;
	}
	void display()
	{
		System.out.println("Two's y = "+y);
	}
}
class Relate
{
	public static void main(String[] args) 
	{
		Two obj2 = new Two(22);
		One obj1 = new One(obj2);
		obj1.display();	
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//Relating class Two with class One
class One
{
	int x;
	Two t;
	One(Two t)
	{
		this.t = t;
		x = 10;
	}
	void display()
	{
		System.out.println("one's x = "+x);
		t.display();
		System.out.println("Two's var = "+t.y);
	}
}
class Two
{
	int y;
	Two(int y)
	{
		this.y = y;
	}
	void display()
	{
		System.out.println("Two's y = "+y);
	}
}
class Relate
{
	public static void main(String[] args) 
	{
		Two obj2 = new Two(22);
		One obj1 = new One(obj2);
		obj1.display();	
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}