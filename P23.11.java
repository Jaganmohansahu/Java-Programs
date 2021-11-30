//Sorting an Array with a group of Integer objects
import java.io.*;
import java.util.*;
class Ascend implements Comparator<Integer>
{
	public int compare(Integer i1, Integer i2)
	{
		return i1.compareTo(i2);
	}
}
class Descend implements Comparator<Integer>
{
	public int compare(Integer i1, Integer i2)
	{
		return i2.compareTo(i1);
	}
}
class Arrays1
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the number of elements: ");
		int size = Integer.parseInt(br.readLine());

		Integer arr[] = new Integer[size];

		for(int i=0; i<size; i++)
		{
			System.out.print("Enter int: ");
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr, new Ascend());

		System.out.println("\nSorted in Ascending order: ");
		display(arr);

		Arrays.sort(arr, new Descend());
		System.out.println("\nSorted in Descending order: ");
		display(arr);
	}
	static void display(Integer arr[])
	{
		for(Integer i : arr)
			System.out.print(i+"\t");
	}
}