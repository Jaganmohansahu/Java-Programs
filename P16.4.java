class Commercial
{
	private String name;
	
	void setName(String name)
	{
		this.name = name;
	}
	String getName()
	{
		return name;
	}
	void calculateBill(int units)
	{
		System.out.println("Customer: "+getName());
		System.out.println("Bill amount: "+units*5.00);
	}
}
class Domestic extends Commercial
{
	void calculateBill(int units)
	{
		System.out.println("Customer: "+getName());
		System.out.println("Bill amount: "+units*2.50);
	}
}
class Electricity
{
	public static void main(String[] args) 
	{
		Commercial c = new Commercial();
		c.setName("Jagan Mohan Sahu");
		c.calculateBill(100);
		Domestic d = new Domestic();
		d.setName("Puja Rani");
		d.calculateBill(100);	
	}
}