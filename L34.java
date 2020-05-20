<<<<<<< HEAD
<<<<<<< HEAD
//Multilevel Inheritance
class B extends A
{
	public static void main(String[] args) 
	{
		B b1 = new B();
		System.out.println(b1.getClass());

		Class c = b1.getClass();
		System.out.println(c.getSuperclass());

		System.out.println(".....................");

		A a1 = new A();
		System.out.println(a1.getClass());
		c = a1.getClass();
		System.out.println(c.getSuperclass());
	}
}

class A
{

=======
//Multilevel Inheritance
class B extends A
{
	public static void main(String[] args) 
	{
		B b1 = new B();
		System.out.println(b1.getClass());

		Class c = b1.getClass();
		System.out.println(c.getSuperclass());

		System.out.println(".....................");

		A a1 = new A();
		System.out.println(a1.getClass());
		c = a1.getClass();
		System.out.println(c.getSuperclass());
	}
}

class A
{

>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//Multilevel Inheritance
class B extends A
{
	public static void main(String[] args) 
	{
		B b1 = new B();
		System.out.println(b1.getClass());

		Class c = b1.getClass();
		System.out.println(c.getSuperclass());

		System.out.println(".....................");

		A a1 = new A();
		System.out.println(a1.getClass());
		c = a1.getClass();
		System.out.println(c.getSuperclass());
	}
}

class A
{

>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}