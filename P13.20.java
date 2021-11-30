//factorial without recursion
class Recursion
{
	static long factorial(int num)
	{
		long fact = 1;
		while(num>0)
			fact *= num--;
		return fact;
	}
	public static void main(String[] args) 
	{
		System.out.println("factorial of s: ");
		System.out.println(Recursion.factorial(5));	
	}
}