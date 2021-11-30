//User defined exception
//to throw whenever balance amount is below Rs.1000
class MyException extends Exception 
{
	private static int acno[] = {1001, 1002, 1003, 1004, 1005};

	private static String name[] = {"Raja Rao", "Rama Rao", "Subba Rao", "Appa Rao", "Laxmi Devi"};

	private static double bal[] = {10000.00, 12000.00, 5600.50, 999.00, 1100.55};

	MyException()
	{

	}
	MyException(String str)
	{
		super(str);
	}
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("ACNO"+"\t"+"CUSTOMER"+"\t"+"BALANCE");

			for(int i=0; i<5; i++)
			{
				System.out.println(acno[i]+"\t"+name[i]+"\t"+bal[i]);

				if(bal[i] < 1000)
				{
					MyException me = new MyException("Balance amount is less");
					throw me;
				}
			}
		}	
		catch(MyException me)
		{
			me.printStackTrace();
		}
	}
}