//Local variable
class Test
{
	//not local area
	public static void main(String[] args) 
	{
		int x=10, y;
		System.out.println(x);
		//System.out.println(y);	//error
		{
			{
				int z=50;
				System.out.println(z);
			}
			//System.out.println(z);	//error
		}
	}
}