//program to check prime
class CheckPrime
{
	static boolean isPrime(int num)
	{
		boolean value = false;
		int count = 0;
		for(int i=1 ; i<=num ; i++)
		{
			if(num % i ==0)
				count++;
		}
		if(count == 2)
			value = true;
		return value;
	}
	public static void main(String[] args)
	{
		int num = Integer.parseInt(args[0]);
		boolean result = CheckPrime.isPrime(num);
		if(result)
			System.out.println(num+" is a prime number");
		else
			System.out.println(num+" is not a prime number");
	}
}