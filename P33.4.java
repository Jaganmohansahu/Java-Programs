<<<<<<< HEAD
<<<<<<< HEAD
//retriving enumeration constants and values
enum Planets
{
	Mercury(57910, 3.30e23), Venus(108200, 4.87e24), earth(149600, 5.98e24), Mars(227940, 6.42e23);

	private long distance;
	private double mass;

	Planets(long x, double y)
	{
		distance = x;
		mass = y;
	}

	long getDistance()
	{
		return distance;
	}

	double getMass()
	{
		return mass;
	}
}
class DisplayEnum1
{
	public static void main(String args[])
	{
		System.out.println("PLANET"+"\t\t"+"DISTANCE(km)"+"\t"+"MASS(kg)");

		for(Planets p: Planets.Values())
		{
			System.out.print(p+"\t\t");
			System.out.print(p.getDistance()+"\t\t");
			System.out.print(p.getMass()+"\n");
		}
	}
=======
//retriving enumeration constants and values
enum Planets
{
	Mercury(57910, 3.30e23), Venus(108200, 4.87e24), earth(149600, 5.98e24), Mars(227940, 6.42e23);

	private long distance;
	private double mass;

	Planets(long x, double y)
	{
		distance = x;
		mass = y;
	}

	long getDistance()
	{
		return distance;
	}

	double getMass()
	{
		return mass;
	}
}
class DisplayEnum1
{
	public static void main(String args[])
	{
		System.out.println("PLANET"+"\t\t"+"DISTANCE(km)"+"\t"+"MASS(kg)");

		for(Planets p: Planets.Values())
		{
			System.out.print(p+"\t\t");
			System.out.print(p.getDistance()+"\t\t");
			System.out.print(p.getMass()+"\n");
		}
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//retriving enumeration constants and values
enum Planets
{
	Mercury(57910, 3.30e23), Venus(108200, 4.87e24), earth(149600, 5.98e24), Mars(227940, 6.42e23);

	private long distance;
	private double mass;

	Planets(long x, double y)
	{
		distance = x;
		mass = y;
	}

	long getDistance()
	{
		return distance;
	}

	double getMass()
	{
		return mass;
	}
}
class DisplayEnum1
{
	public static void main(String args[])
	{
		System.out.println("PLANET"+"\t\t"+"DISTANCE(km)"+"\t"+"MASS(kg)");

		for(Planets p: Planets.Values())
		{
			System.out.print(p+"\t\t");
			System.out.print(p.getDistance()+"\t\t");
			System.out.print(p.getMass()+"\n");
		}
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}