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


}