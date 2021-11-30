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
}