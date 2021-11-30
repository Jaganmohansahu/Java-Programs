//Hash Table
import java.util.Hashtable;

class Example
{
	public static void main(String[] args) 
	{
		HashTable ht = new Hashtable();

		ht.put(100,"Raja");
		ht.put(10,"A");
		ht.put(200,"C")	;
		ht.put(100,"D");

		System.out.println(ht);
		System.out.println(ht.size());
		ht.remove(10);
		System.out.println(ht);
	}
}