import java.util.*;
class Test
{
	static Scanner sc = new Scanner(System.in);	//Globally declared

	public static void main(String[] args) 
	{
		System.out.println("Enter the size: ");
		int size = sc.nextInt();

		int arr[] = new int[SIZE];

		input(arr);
		display(arr);
		Arrays.Sort(arr);
		display(arr);

		int index = Arrays.binarySearch(arr,11);
		if(index>0)
			System.out.println("Found at "+index);
		else
			System.out.println("Not found");

		int brr[] = Arrays.copyOf(arr,2);
		int crr[] = Arrays.copyOfRange(arr,1,4);
		display(brr);
		display(crr);

		System.out.println(Arrays.equals(arr,brr));
		Arrays.fill(arr,11111);
		display(arr);

		System.out.println(Arrays.hashCode(arr));
		System.out.println(Arrays.toString(arr));

		static void input(int arr[])
		{
			System.out.println("Enter the elements: ");
			for(int i=0; i<arr.length; i++)
			{
				arr[i] = sc.nextInt();
			}
		}
		static void display(int arr[])
		{
			System.out.print("The array is: ");
			for(int i=0; i<arr.length; i++)
			{
				System.out.print(arr[i]+"\t");
			}
			System.out.println();
		}
	}
}