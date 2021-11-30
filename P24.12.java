//Serialization -> to store Employee class objects into obj file 	\\ERROR
import java.io.*;
import java.util.*;
class StoreObj
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		FileOutputStream fos = new FileOutputStream("objfile");

		ObjectOutputStream oos = new ObjectOutputStream(fos);

		System.out.print("Enter the number of Employees: ");
		int n = Integer.parseInt(br.readLine());

		for(int i=0; i<n; i++)
		{
			Employee e = new Employee();

			e.getData();

			oos.writeObject(e);
		}
		oos.close();
	}
}