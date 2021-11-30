//A generic method - to read and display any type of array elements
class MyClass
{
	static <T>void display(T[] arr)
	{
		for(T i: arr)
			System.out.println(i);
	}
}
class Gen2
{
	public static void main(String[] args) 
	{
		Integer arr1[] = {1, 2, 3, 4, 5, 6};
		System.out.println("Reading Integer objects: ");	
		MyClass.display(arr1);

		Double arr2[] = {1.1, 2.2, 3.3, 4.5};
		System.out.println("Reading Double objects: ");
		MyClass.display(arr2);

		String arr3[] = {"Raju", "Rani", "Ravi", "Kiran"};
		System.out.println("Reading string objects: ");
		MyClass.display(arr3);
	}
}