//Hash set 
import java.util.*;
class HS
{
	public static void main(String[] args) 
	{
		HashSet<String> hs = new HashSet<>();

		hs.add("India");
		hs.add("America");
		hs.add("Japan");
		hs.add("China");
		hs.add("America");

		System.out.println("Hash set= "+hs);

		Iterator it = hs.iterator();

		System.out.println("Elements using iterator: ");
		while(it.hasNext())
		{
			String s = (String)it.next();
			System.out.println(s);
		}
	}
}