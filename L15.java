<<<<<<< HEAD
<<<<<<< HEAD
class Test
{
	static void add_number(int...a)		//VA_LIST
	{
		int sum = 0;
		for(int x : a)
			sum = sum+x;
		System.out.println("After addition: "+sum);
	}
	public static void main(String[] args) 
	{
		add_number(11,22,33);
		add_number(10);
		add_number(1,2,3,4,5,6);

		int arr[] = {1,2,3,4,7};
		add_number(arr);
	}
=======
class Test
{
	static void add_number(int...a)		//VA_LIST
	{
		int sum = 0;
		for(int x : a)
			sum = sum+x;
		System.out.println("After addition: "+sum);
	}
	public static void main(String[] args) 
	{
		add_number(11,22,33);
		add_number(10);
		add_number(1,2,3,4,5,6);

		int arr[] = {1,2,3,4,7};
		add_number(arr);
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
class Test
{
	static void add_number(int...a)		//VA_LIST
	{
		int sum = 0;
		for(int x : a)
			sum = sum+x;
		System.out.println("After addition: "+sum);
	}
	public static void main(String[] args) 
	{
		add_number(11,22,33);
		add_number(10);
		add_number(1,2,3,4,5,6);

		int arr[] = {1,2,3,4,7};
		add_number(arr);
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}