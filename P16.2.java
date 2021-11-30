// Dynamic Polymorphism
class One
{
	void calculate(double x)
	{
		System.out.println("Square value= " + (x*x));
	}
}

class Two extends One
{
	void calculate(double x)
	{
		System.out.println("Square root= " + Math.sqrt(x));
	}
}

class Poly
{
	public static void main(String[] args) {
		Two t = new Two();
		t.calculate(25);
	}
}