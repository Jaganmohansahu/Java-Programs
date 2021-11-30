// This is an abstract class
abstract class Car 
{
	int regno;

	Car(int r)
	{
		regno = r;
	}

	void openTank()
	{
		System.out.println("Fill the tank");
	}

	abstract void steering(int direction, int angle);

	abstract void braking(int force);
}