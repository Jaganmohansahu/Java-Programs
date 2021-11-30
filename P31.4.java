//Hashtable before java 5.0 - no generic concept
import java.util.*;
class HT1
{
	public static void main(String[] args) 
	{
		Hashtable ht = new Hashtable();

		ht.put("Ajay", new Integer(50));
		ht.put("Sachin", new Integer(90));
		ht.put("Dhoni", new Integer(75));

		String s = "Sachin";
		Integer score = (Integer)ht.get(s);
		System.out.println("Score = "+score);
	}
}