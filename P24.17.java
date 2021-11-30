//Display the contents of a directory
import java.io.*;
class Contents
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter dirpath: ");
		String dirpath = br.readLine();
		System.out.print("Enter dirname: ");
		String dname = br.readLine();

		File f = new File(dirpath, dname);

		if(f.exists())
		{
			String arr[] = f.list();

			int n = arr.length;

			for(int i=0; i<n; i++)
			{
				System.out.print(arr[i]);
				/*File f1 = new File(arr[i]);
				if(f1.isFile())	
				System.out.println(" : is a file");
				if(f1.isDirectory())	
				System.out.println(" : is a directory");*/
			}
			System.out.println("\nNo. of entries in the directory: "+n);
		}
		else System.out.println("Directory does not exists");
	}
}