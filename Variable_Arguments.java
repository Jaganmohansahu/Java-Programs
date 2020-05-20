// This program demonstrates the use of variable arguments in the methods.
	
class Vararg1	//ERROR
{
	public static int sum(int...x)
	{
		int s=0;
		for(int i=0; i<=x.length; i++)
		{
			s += x[i];
		}
		return s;
	}

	public static void main(String[] args) throws Exception
	{
		System.out.println(sum(10, 20, 30));	
		System.out.println(sum(10, 20));
		//System.out.println(sum(10, 20, 30, 40));
	}
}
