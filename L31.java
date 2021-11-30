//Control structure : for each loop
class Test
{
	public static void main(String[] args) 
	{
		int arr[] = {11, 22, 33, 44};
		for (int x : arr) 
		{
			System.out.println(x);
		}
		for (String x : args) 
		{
			System.out.println(x);
		}
	}
}