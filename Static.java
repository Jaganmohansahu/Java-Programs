public class Static
{
	Static int x = 10;
	int y = 20;
}

class Demo
{
	public static void main(String[] args) 
	{
		//System.out.println(x);	//possible for same class
		//System.out.println(y);	//error

		System.out.println(Static.x);	//call by class name
		//System.out.println(Static.y);

		Static obj = new Static();
		System.out.println(obj.x);	//call by object
		System.out.println(obj.y);
	}
}