//Total marks and percentage
import java.io.*;
class Arr2
{
	public static void main(String[] args) throws IOException
	{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter the number of Subjects: ");
			int n = Integer.parseInt(br.readLine());

			int[] marks = new int[n];

			for(int i=0; i<n; i++)
			{
				System.out.println("Enter marks: ");
				marks[i] = Integer.parseInt(br.readLine());
			}
			float tot = 0;
			for(int i=0; i<n; i++)
				tot +=marks[i];

			System.out.println("Total marks = "+tot);

			float percent = tot/n;
			System.out.println("Percentage = "+percent);
	}
}