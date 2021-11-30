//Generating random nos. between 0 and 10
class Random
{
	public static void main(String[] args) throws Exception
	{
		System.out.println("random nos. between 0 and 10: ");

		while(true)
		{
			double d = 10*Math.random();	//Doubt on 10
			int i = (int)d;
			System.out.println(i);

			Thread.sleep(1000);

			if(i==0)	System.exit(0);
		}
	}
}