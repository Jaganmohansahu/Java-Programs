//Accepting different inputs in a line
import java.io.*;
import java.util.*;
class Different
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter name, age, salary");
		String str = br.readLine();

		StringTokenizer st = new StringTokenizer(str,",");

		String s1 = st.nextToken();
		String s2 = st.nextToken();
		String s3 = st.nextToken();

		s1 = s1.trim();
		s2 = s2.trim();
		s3 = s3.trim();


		String name = s1;
		int age = Integer.parseInt(s2);
		float sal = Float.parseFloat(s3);

		System.out.println("NAME: "+name);
		System.out.println("AGE: "+age);
		System.out.println("SALARY: "+sal);
	}
}