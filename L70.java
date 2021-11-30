import java.util.*;
class Test
{
	public static void main(String[] args) 
	{
		StringBuffer sb1 = new StringBuffer("Hello");
		System.out.println(sb1.length());

		String s1 = new String("Java is simple");
		String w[] = s1.split(" ");
		for(String word:w)
		{
			System.out.println(new StringBuffer(word).reverse()+"\t"+word.length());
		}
		System.out.println();
		//How to convert char array to string
		char arr[] = s1.toCharArray();
		System.out.println(Arrays.toString(arr));

		String s = new String(arr);
		System.out.println(s);
	}
}