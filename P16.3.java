//static polymorphism
class One
{
	static void calculate(double x)
	{
		System.out.println("Square value= "+(x*x));
	}
}

class Poly
{
	public static void main(String[] args) 
	{
		One o = new One();
		o.calculate(25);	
	}
}