<<<<<<< HEAD
<<<<<<< HEAD
//Sorting and searching an Array
import java.io.*;
import java.util.*;

class ArrayDemo
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int arr[] = new int[5];

		for(int i=0; i<5; i++)
		{
			System.out.print("Enter an integer: ");
			arr[i] = Integer.parseInt(br.readLine());
		}
		System.out.println("Contents of the array: ");
		display(arr);

		Arrays.sort(arr);

		System.out.println("The sorted array: ");
		display(arr);

		System.out.print("Enter an element to search: ");
		int element = Integer.parseInt(br.readLine());
		int index = Arrays.binarySearch(arr,element);
		if(index<0) System.out.println("Element not found");
		else System.out.println("Element found at location: "+(index+1));
	}
	static void display(int arr[])
	{  
		for (int i : arr) 
		System.out.println(i);
	}
=======
//Sorting and searching an Array
import java.io.*;
import java.util.*;

class ArrayDemo
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int arr[] = new int[5];

		for(int i=0; i<5; i++)
		{
			System.out.print("Enter an integer: ");
			arr[i] = Integer.parseInt(br.readLine());
		}
		System.out.println("Contents of the array: ");
		display(arr);

		Arrays.sort(arr);

		System.out.println("The sorted array: ");
		display(arr);

		System.out.print("Enter an element to search: ");
		int element = Integer.parseInt(br.readLine());
		int index = Arrays.binarySearch(arr,element);
		if(index<0) System.out.println("Element not found");
		else System.out.println("Element found at location: "+(index+1));
	}
	static void display(int arr[])
	{  
		for (int i : arr) 
		System.out.println(i);
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//Sorting and searching an Array
import java.io.*;
import java.util.*;

class ArrayDemo
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int arr[] = new int[5];

		for(int i=0; i<5; i++)
		{
			System.out.print("Enter an integer: ");
			arr[i] = Integer.parseInt(br.readLine());
		}
		System.out.println("Contents of the array: ");
		display(arr);

		Arrays.sort(arr);

		System.out.println("The sorted array: ");
		display(arr);

		System.out.print("Enter an element to search: ");
		int element = Integer.parseInt(br.readLine());
		int index = Arrays.binarySearch(arr,element);
		if(index<0) System.out.println("Element not found");
		else System.out.println("Element found at location: "+(index+1));
	}
	static void display(int arr[])
	{  
		for (int i : arr) 
		System.out.println(i);
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}