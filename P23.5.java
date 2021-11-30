//ArrayList with String objects
import java.util.*;
class ArrayListDemo
{
	public static void main(String[] args) 
	{
		ArrayList<String> arl = new ArrayList<>();

		arl.add("Apple");
		arl.add("Mango");
		arl.add("Grapes");
		arl.add("Guava");

		System.out.println("Contents: "+arl);

		arl.remove(3);
		arl.remove("Apple");

		System.out.println("Contents after removing: "+arl);

		System.out.println("Size of ArrayList: "+arl.size());

		System.out.println("Extracting using Iterator: ");

		Iterator it = arl.iterator();

		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}