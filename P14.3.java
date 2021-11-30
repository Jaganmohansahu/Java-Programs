//Inner class Example
import java.io.*;
class BankAcnt
{
	private double bal;
	BankAcnt(double b)
	{
		bal = b;
	}
	void contact(double r) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter password: ");
		String pswd = br.readLine();
		if(pswd.equals("qwe123"))
		{
			Interest in = new Interest(r);
			in.calculateInterest();
		}
		else
		{
			System.out.println("Sorry, you are not a authorized person");
			return;
		}
	}
	private class Interest
	{
		private double rate;
		Interest(double r)
		{
			rate = r;
		}
		void calculateInterest()
		{
			double interest = BankAcnt.this.bal*this.rate/100;
			BankAcnt.this.bal += interest;
			System.out.println("Updated balance= "+bal);
		}
	}
}
class InnerClass
{
	public static void main(String[] args) throws IOException
	{
		BankAcnt account = new BankAcnt(100000);
		account.contact(9.5);	
	}
}