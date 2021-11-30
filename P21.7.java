//handling multiple exceptions in the same catch block
class Ex1
{
	public static void main(String[] args) 	
	{
		try
		{
			System.out.println("Open files");

			int n = args.length;
			System.out.println("n= "+n);
			int a = 45/n;
			System.out.println("a= "+a);
			
			int b[] = {10, 20, 30};
			b[50] = 100;
		}	
		catch(ArithmeticException | ArrayIndexOutOfBoundsException ae)
		{
			System.out.println(ae);
		}
		finally
		{
			System.out.println("Close files");
		}
	}
}