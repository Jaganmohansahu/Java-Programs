import pack.Addition;
import pack.Subtraction;
class Use
{
	public static void main(String args[])
	{
		Addition obj = new Addition(10,15.5);
		//pack.Addition obj = new pack.Addition(10,15.5);
		obj.sum();

		double res = Subtraction.sub(10,15.5);
		System.out.println("Result= "+res);
	}
}