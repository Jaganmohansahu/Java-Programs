//Fibonacci Number
import java.io.*;
class Fibo
{
	public static void main(String[] args) throws IOException
	{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

			System.out.println("Howmany fibonaccis");
			int n = Integer.parseInt(br.readLine());

			long f1=0, f2=1;
			System.out.println(f1);
			System.out.println(f2);

			long f = f1+f2;
			System.out.println(f);

			int count = 3;
			while(count<n)
			{
				f1=f2;
				f2=f;
				f=f1+f2;
				System.out.println(f);
				count++;
			}
	}
}