<<<<<<< HEAD
<<<<<<< HEAD
class Shape
{
	protected double l;
	Shape(double l)
	{
		this.l = l;
	}
}
class Square extends Shape
{
	Square (double l)
	{
		super(l);
	}
	void area()
	{
		System.out.println("Area of square "+(l*l));
	}
}
class Rectangle extends Shape
{
	private double b;
	Rectangle(double x, double y)
	{
		super(x);
		b = y;
	}
	void area()
	{
		System.out.println("Area of rectangle= "+(l*b));
	}
}
class Driver
{
	public static void main(String[] args) 
	{
		Square s = new Square(5.5);
		s.area();

		Rectangle r = new Rectangle(5.5, 6);
		r.area();	
	}
=======
class Shape
{
	protected double l;
	Shape(double l)
	{
		this.l = l;
	}
}
class Square extends Shape
{
	Square (double l)
	{
		super(l);
	}
	void area()
	{
		System.out.println("Area of square "+(l*l));
	}
}
class Rectangle extends Shape
{
	private double b;
	Rectangle(double x, double y)
	{
		super(x);
		b = y;
	}
	void area()
	{
		System.out.println("Area of rectangle= "+(l*b));
	}
}
class Driver
{
	public static void main(String[] args) 
	{
		Square s = new Square(5.5);
		s.area();

		Rectangle r = new Rectangle(5.5, 6);
		r.area();	
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
class Shape
{
	protected double l;
	Shape(double l)
	{
		this.l = l;
	}
}
class Square extends Shape
{
	Square (double l)
	{
		super(l);
	}
	void area()
	{
		System.out.println("Area of square "+(l*l));
	}
}
class Rectangle extends Shape
{
	private double b;
	Rectangle(double x, double y)
	{
		super(x);
		b = y;
	}
	void area()
	{
		System.out.println("Area of rectangle= "+(l*b));
	}
}
class Driver
{
	public static void main(String[] args) 
	{
		Square s = new Square(5.5);
		s.area();

		Rectangle r = new Rectangle(5.5, 6);
		r.area();	
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}