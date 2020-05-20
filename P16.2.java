<<<<<<< HEAD
<<<<<<< HEAD
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
=======
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
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
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
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}