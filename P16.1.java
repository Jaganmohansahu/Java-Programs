// Dynamic polymorphism
class Simple
{
	void add(int a, int b)
	{
		System.out.println("Sum of two= " + (a+b));
	}
	void add(int a, int b, int c)
	{
		System.out.println("Sum of three= " + (a+b+c));
	}
}

class Poly
{
	public static void main(String[] args) {
		Simple s = new Simple();
		s.add(10, 15);
		s.add(10, 15, 20);
	}
}