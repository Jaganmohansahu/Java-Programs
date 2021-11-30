class Maruti extends Car 
{
	Maruti(int regno)
	{
		super(regno);
	}

	void steering(int direction, int angle)
	{
		System.out.println("Take a turn");
		System.out.println("This is a ordinary steering");
	}

	void braking(int force)
	{
		System.out.println("Brakes applied");
		System.out.println("These are hydraulic brakes");
	}
}