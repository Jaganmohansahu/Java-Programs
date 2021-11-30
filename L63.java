//Hash set and Hash set
import java.util.Arrays;
import java.util.Hashset;
import java.util.TreeSet

class Example
{
	public static void main(String[] args) 
	{
		int arr[] = new int[] {11,1,33,11,3,2,1,3};
		System.out.println(Arrays.toSrtring(arr));	

		Hashset<Integer> set1 = new HashSet<Integer>();
		TreeSet<Integer> set2 = new TreeSet<Integer>();

		for(int ele:arr)
		{
			set1.add(ele);
			set2.add(ele);
		}
		System.out.println(set1);
		System.out.println(set2);

		set1.remove(11);	//obeys rule give prirority on value not on index
		System.out.println(set1);
	}
}