//Hash map & Tree map
import java.util.HashMap;
import java.util.TreeMap;

class Example
{
	public static void main(String[] args) 
	{
		HashMap<Integer.String> map1 = new HashMap<Integer,String>();
		map1.put(100,"Raja");	
		map1.put(1,"B");
		map1.put(2,"Raja");
		map1.put(1,"C");
		map1.put(6,"D");
		System.out.println(map1);

		TreeMap<Integer,String> = new TressMap<Integer,String>();
		map2.put(100,"Raja");
		map2.put(1,"B");
		map2.put(2,"Raja");
		map2.put(1,"C");
		map2.put(6,"D");
		System.out.println(map2);

		System.out.println(map2.get(100));
		System.out.println(map2.keySet());
		System.out.println(map2.values());
		System.out.println(map2.firstEntry());
		System.out.println(map2.firstKey());
		System.out.println(map2.lastEntry());
		System.out.println(map2.lastKey());
		map2.clear();
		System.out.println(map2);
	}
}