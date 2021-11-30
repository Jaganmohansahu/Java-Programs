//Runtime Polymorphism
class Vehicle
{
	public void run()
	{
		System.out.println("Vehicle is running with speed 50");
	}
}
class Cycle extends Vehicle
{
	public void run()
	{
		System.out.println("Cycle is running with speed 5");
	}
}
class Test
{
	public static void main(String[] args)
	{
		Cycle c = new Cycle();
		c.run();
	}
}