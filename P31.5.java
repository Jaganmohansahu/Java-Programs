//hashtable is rewritten using generic types in java 5 and later as Hashtable<K, V>
import java.util.*;
class HT2
{
	public static void main(String[] args) 
	{
		Hashtable<String, Integer> ht = new Hashtable<>();

		ht.put("Ajay", 50);
		ht.put("Sachin", 90);
		ht.put("Dhoni", 75);

		String s = "Sachin";
		Integer score = ht.get(s);
		System.out.println("Score = "+score);	
	}
}