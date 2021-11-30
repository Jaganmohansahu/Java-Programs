interface Tax
{
	double stateTax();
}
class AP implements Tax
{
	public double stateTax()
	{
		System.out.println("According to AP Govt rules");
		return 5000.50;
	}
}
class Karnataka implements Tax
{
	public double stateTax()
	{
		System.out.println("According to Karnataka Govt rules");
		return 2000.00;
	}
}
class TaxApp
{
	public static void main(String[] args) throws Exception
	{
		Class c = Class.forName(args[0]); 
		Tax ref = (Tax)c.newInstance();
		calculateTax(ref);	
	}
	static void calculateTax(Tax t)
	{
		double ct = 1000.00;
		double st = t.stateTax();
		System.out.println("Total tax= "+(ct+st));
	}
}