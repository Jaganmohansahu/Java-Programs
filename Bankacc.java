class Customer
{
	String Cname;
	long Acnumber;
	static double balance = 1000;
}
class Deposite extends Customer
{
	java.util.Scanner sc = new java.util.Scanner(System.in);
	void set()
	{
		System.out.println("Enter the customer details....");
		System.out.println("........................................");
		System.out.println("Enter the customer's name: ");
		Cname = sc.nextLine();
		System.out.println("Enter the customer's Account Number: ");
		Acnumber = sc.nextLong();
	}
	void get()
	{
		System.out.println("Customer's details is....");
		System.out.println("..........................................");
		System.out.println("Customer's name is: "+Cname);
		System.out.println("Customer's account number is: "+Acnumber);

	}
	void depositeAmount()
	{
		System.out.println("Enter amount to deposite");
		System.out.println("................................");
		double amount = sc.nextDouble();
		balance = balance + amount;
		System.out.println("Customer's current balance is: "+balance);
	}
}
class Withdraw extends Deposite
{
	void xyz(){
	double x;
	System.out.println("enter the amount to be withdrawn");
	x=sc.nextDouble();
	if(x>balance)
	{
		System.out.println("the money cannot be withdrawn");

	}
	else
	{
		balance=balance-x;
		System.out.println("The balance is"+balance);
	}

}
}
class MyAccount
{
	public static void main(String[] args)
	{
		Deposite d = new Deposite();
		d.set();
		d.get();
		d.depositeAmount();
		Withdraw p= new Withdraw();
		p.xyz();
	}
}