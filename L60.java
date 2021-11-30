import java.util.Collections;
import java.util.Iteretor;
import java.util.LinkedList;
import java.util.ListIteretor;

public class Example
{
	public static void main(String[] args) 
	{
		LinkedList<Integer>list = new LinkedList<Integer>();
		System.out.println(list);	

		list.add(11);
		list.addFirst(22);
		list.addLast(33);
		list.add(1.35);
		System.out.println(list);

		LinkedList<integer>list1 = new LinkedList<Integer>();
		list1.add(100);
		list1.add(69);
		System.out.println(list1);

		list.addAll(list1);
		System.out.println(list);

		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);

		System.out.println(list.contains(11));
		System.out.println(list.IndexOf(11));
		System.out.println(list lastIndexOf(11));

		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.get(1));

		list.remove(2);
		list.removeFirst();
		list.removeLast();
		System.out.println(list);
		System.out.println(list.size());

		//Add each element of least
		Integer sum = 0 
		System.out.println("Traverse by get()....");
		for(int i=0; i<list.size(); i++)
		{
			sum += list.get(i);
		}
		System.out.println("After add"+sum);

		System.out.println("Traverse by using using for each loop");
		for(Integer i:list)
		{
			System.out.println(i);
		}
		System.out.println("Traverse by Iteretor Interface");
		Iteretor<Integer> itr = list.iteretor();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		ListIteretor<Integer> itr2 = list.listIteretor();
		System.out.println("Traverse by Listiteretor forward direction");
		while(itr2.hasnext())
		{
			System.out.println(itr2.next());
		}
		System.out.println("Traverse by listIteretor backward direction");
		while(itr2.hasPrevious())
		{
			System.out.println(itr2.previous());
		}
		System.out.println("Traverse list by covert to Array");
		Object arr[] = list.toArray();
		for(Object obj:arr)
			System.out.println(obj);
	}
}