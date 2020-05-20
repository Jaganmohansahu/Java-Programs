<<<<<<< HEAD
<<<<<<< HEAD
//digit ^ (no_of_digit)

class CheckArmstrong
{
	int countDigit(int num)
	{
		int count = 0;
		while(num >0)
		{
			count++;
			num = num/10;
		}
		return count;
	}
	protected int isArmstrong(int num)
	{
		int sum=0;
		int noofdigit = countDigit(num);
		while(num>0)
		{
			int rem = num%10;
			sum = sum+(int)Math.pow(rem,noofdigit);
			num = num/10;
		}
		return sum;
	}
	public static void main(String[] args)
	{
		int num = Integer.parseInt(args[0]);
		CheckArmstrong ca = new CheckArmstrong();
		int sum = ca.isArmstrong(num);
		if(sum == num)
			System.out.println("Yes Armstrong");
		else
			System.out.println("Not Armstrong");
	}
=======
//digit ^ (no_of_digit)

class CheckArmstrong
{
	int countDigit(int num)
	{
		int count = 0;
		while(num >0)
		{
			count++;
			num = num/10;
		}
		return count;
	}
	protected int isArmstrong(int num)
	{
		int sum=0;
		int noofdigit = countDigit(num);
		while(num>0)
		{
			int rem = num%10;
			sum = sum+(int)Math.pow(rem,noofdigit);
			num = num/10;
		}
		return sum;
	}
	public static void main(String[] args)
	{
		int num = Integer.parseInt(args[0]);
		CheckArmstrong ca = new CheckArmstrong();
		int sum = ca.isArmstrong(num);
		if(sum == num)
			System.out.println("Yes Armstrong");
		else
			System.out.println("Not Armstrong");
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//digit ^ (no_of_digit)

class CheckArmstrong
{
	int countDigit(int num)
	{
		int count = 0;
		while(num >0)
		{
			count++;
			num = num/10;
		}
		return count;
	}
	protected int isArmstrong(int num)
	{
		int sum=0;
		int noofdigit = countDigit(num);
		while(num>0)
		{
			int rem = num%10;
			sum = sum+(int)Math.pow(rem,noofdigit);
			num = num/10;
		}
		return sum;
	}
	public static void main(String[] args)
	{
		int num = Integer.parseInt(args[0]);
		CheckArmstrong ca = new CheckArmstrong();
		int sum = ca.isArmstrong(num);
		if(sum == num)
			System.out.println("Yes Armstrong");
		else
			System.out.println("Not Armstrong");
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}