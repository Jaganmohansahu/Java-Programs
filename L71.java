<<<<<<< HEAD
<<<<<<< HEAD
//PALINDROME
import java.util.*;
class Test
{
	public static void main(String[] args) 
	{
		//Methods (string palindrome)
		String s1 = new String("MADAM");
		StringBuffer sb1 = new StringBuffer(s1);
		sb1.reverse();
		String s2 = new String(sb1);
		if(s1.equals(s2))
		System.out.println("PALINDROME");	
	else
		System.out.println("Not Palindrome");

	System.out.println(sb1.append("Hi"));
	System.out.println(sb1.insert(0,"Hello"));
	System.out.println(sb1.replace(0.5,"LIT"));
	System.out.println(sb1.delete(0,2));
	}
=======
//PALINDROME
import java.util.*;
class Test
{
	public static void main(String[] args) 
	{
		//Methods (string palindrome)
		String s1 = new String("MADAM");
		StringBuffer sb1 = new StringBuffer(s1);
		sb1.reverse();
		String s2 = new String(sb1);
		if(s1.equals(s2))
		System.out.println("PALINDROME");	
	else
		System.out.println("Not Palindrome");

	System.out.println(sb1.append("Hi"));
	System.out.println(sb1.insert(0,"Hello"));
	System.out.println(sb1.replace(0.5,"LIT"));
	System.out.println(sb1.delete(0,2));
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
//PALINDROME
import java.util.*;
class Test
{
	public static void main(String[] args) 
	{
		//Methods (string palindrome)
		String s1 = new String("MADAM");
		StringBuffer sb1 = new StringBuffer(s1);
		sb1.reverse();
		String s2 = new String(sb1);
		if(s1.equals(s2))
		System.out.println("PALINDROME");	
	else
		System.out.println("Not Palindrome");

	System.out.println(sb1.append("Hi"));
	System.out.println(sb1.insert(0,"Hello"));
	System.out.println(sb1.replace(0.5,"LIT"));
	System.out.println(sb1.delete(0,2));
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}