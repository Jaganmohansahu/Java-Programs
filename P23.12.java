//A string broken into pieces at spaces
import java.util.*;
class STDemo
{
	public static void main(String[] args) 
	{
		String str = "He is a gentle man";

		StringTokenizer st = new StringTokenizer(str," ");

		System.out.println("the tokens are: ");

		while(st.hasMoreTokens())
		{
			String one = st.nextToken();
			System.out.println(one);
		}
	}
}