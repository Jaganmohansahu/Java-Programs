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
}