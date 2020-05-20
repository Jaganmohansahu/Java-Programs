<<<<<<< HEAD
<<<<<<< HEAD
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
=======
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
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
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
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}