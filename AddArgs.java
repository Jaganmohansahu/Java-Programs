<<<<<<< HEAD
<<<<<<< HEAD
class AddArgs
{
	private float sumAllArgs(String ...x)
	{
		float sum = 0;
		for (String num : x)
		 {
			sum += Float.parseFloat(num);
		 }
		 return sum;
	}
	public static void main(String[] args)

	{
		AddArgs obj = new AddArgs();
		float sum = obj.sumAllArgs(args);
		System.out.println("After addition sum is: "+sum);
	}
=======
class AddArgs
{
	private float sumAllArgs(String ...x)
	{
		float sum = 0;
		for (String num : x)
		 {
			sum += Float.parseFloat(num);
		 }
		 return sum;
	}
	public static void main(String[] args)

	{
		AddArgs obj = new AddArgs();
		float sum = obj.sumAllArgs(args);
		System.out.println("After addition sum is: "+sum);
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
class AddArgs
{
	private float sumAllArgs(String ...x)
	{
		float sum = 0;
		for (String num : x)
		 {
			sum += Float.parseFloat(num);
		 }
		 return sum;
	}
	public static void main(String[] args)

	{
		AddArgs obj = new AddArgs();
		float sum = obj.sumAllArgs(args);
		System.out.println("After addition sum is: "+sum);
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}