<<<<<<< HEAD
<<<<<<< HEAD
// clculating electricity bills for commercial and domestic plans
abstract class Plan
{
	protected double rate;

	abstract void getRate();

	void calculateBill(int units)
	{
		System.out.print("Bill amount for " + units + " Units: ");
		System.out.println(rate*units);
	}
}

class CommercialPlan extends Plan 
{
	void getRate()
	{
		rate = 5;
	}
}

class DomesticPlan extends Plan 
{
	void getRate()
	{
		rate = 2.60;
	}
}

class Calculate
{
	public static void main(String[] args) {
		Plan p;

		System.out.println("Commercial Plan");
		p = new CommercialPlan();
		p.getRate();
		p.calculateBill(250);

		System.out.println("Domestic Connection");
		p = new DomesticPlan();
		p.getRate();
		p.calculateBill(150);
	}
=======
// clculating electricity bills for commercial and domestic plans
abstract class Plan
{
	protected double rate;

	abstract void getRate();

	void calculateBill(int units)
	{
		System.out.print("Bill amount for " + units + " Units: ");
		System.out.println(rate*units);
	}
}

class CommercialPlan extends Plan 
{
	void getRate()
	{
		rate = 5;
	}
}

class DomesticPlan extends Plan 
{
	void getRate()
	{
		rate = 2.60;
	}
}

class Calculate
{
	public static void main(String[] args) {
		Plan p;

		System.out.println("Commercial Plan");
		p = new CommercialPlan();
		p.getRate();
		p.calculateBill(250);

		System.out.println("Domestic Connection");
		p = new DomesticPlan();
		p.getRate();
		p.calculateBill(150);
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
// clculating electricity bills for commercial and domestic plans
abstract class Plan
{
	protected double rate;

	abstract void getRate();

	void calculateBill(int units)
	{
		System.out.print("Bill amount for " + units + " Units: ");
		System.out.println(rate*units);
	}
}

class CommercialPlan extends Plan 
{
	void getRate()
	{
		rate = 5;
	}
}

class DomesticPlan extends Plan 
{
	void getRate()
	{
		rate = 2.60;
	}
}

class Calculate
{
	public static void main(String[] args) {
		Plan p;

		System.out.println("Commercial Plan");
		p = new CommercialPlan();
		p.getRate();
		p.calculateBill(250);

		System.out.println("Domestic Connection");
		p = new DomesticPlan();
		p.getRate();
		p.calculateBill(150);
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}