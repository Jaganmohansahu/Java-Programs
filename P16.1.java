<<<<<<< HEAD
<<<<<<< HEAD
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
=======
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
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
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
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}