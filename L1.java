public class L1
{
	static int x = 10;
	int y = 20;
}

class Demo
{
	public static void main(String[] args) 
	{
		//System.out.println(x);	//possible for same class
		//System.out.println(y);	//error

		System.out.println(L1.x);	//call by class name
		//System.out.println(L1.y);

		L1 obj = new L1();
		System.out.println(obj.x);	//call by object
		System.out.println(obj.y);
	}
}