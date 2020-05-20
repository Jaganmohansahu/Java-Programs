<<<<<<< HEAD
<<<<<<< HEAD
//i)Interface ii)Abstract class iii)enum iv)Complete class
//level of Abstraction
interface A 
{
	void show();
	void display();
}
abstract class B implements A
{
	public void show()
	{
		System.out.println("Show()....");
	}
}
class Test extends B
{
	public void display()
	{
		System.out.println("display()....");
	}
	public static void main(String[] args) 
	{
		Test obj = new Test();
		obj.show();
		obj.display();
	}
=======
//i)Interface ii)Abstract class iii)enum iv)Complete class
//level of Abstraction
interface A 
{
	void show();
	void display();
}
abstract class B implements A
{
	public void show()
	{
		System.out.println("Show()....");
	}
}
class Test extends B
{
	public void display()
	{
		System.out.println("display()....");
	}
	public static void main(String[] args) 
	{
		Test obj = new Test();
		obj.show();
		obj.display();
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//i)Interface ii)Abstract class iii)enum iv)Complete class
//level of Abstraction
interface A 
{
	void show();
	void display();
}
abstract class B implements A
{
	public void show()
	{
		System.out.println("Show()....");
	}
}
class Test extends B
{
	public void display()
	{
		System.out.println("display()....");
	}
	public static void main(String[] args) 
	{
		Test obj = new Test();
		obj.show();
		obj.display();
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}